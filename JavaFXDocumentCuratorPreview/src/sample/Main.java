package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    // Let's change these two HashMaps to ObservableMaps. What does that get us?
    // ObservableMaps will allow listeners to get updates when new key-value pairs
    // are added, or when existing pairs are removed. Unlike ObservableLists, ObservableMaps
    // will not let subscribers know when an existing key-value pair is changed. THis minor
    // inconvenience means that when we change a UrlInfo object (eg when the summary is updated)
    // we need to explicitly replace the key-value pair (even though all that really has changed
    // is the summary member variable inside the UrlInfo object)

    //private static Map<TreeItem,UrlInfo> urlInfoMap = new HashMap<>();
    //private static Map<String,TreeItem> treeNodeMap = new HashMap<>();

    private static ObservableMap<TreeItem,UrlInfo> urlInfoMap = FXCollections.observableHashMap();
    private static ObservableMap<String,TreeItem> treeNodeMap = FXCollections.observableHashMap();


    // As before, we use 2 maps to save state - one holds the mapping from TreeNode to UrlInfo,
    // and the other from Url to treeNode

    private static String currentUrl = "http://doxydonkey.blogspot.in";

    private final TextField urlTextField = new TextField(currentUrl);
    private final Button goButton = new Button("Go!");
    private final Text currentDisplayedUrlText = new Text(currentUrl);
    private final WebView browser = new WebView();
    private final TextArea summaryTextArea = new TextArea();
    private final TreeView treeView = new TreeView<>(new TreeItem<>("Urls"));

    // Add a new UI element that will display the preview. THis is a WebView exactly
    // like the browser, except that it will display the snippet preview in real-time
    private final WebView previewBrowser = new WebView();



    @Override
    public void start(Stage primaryStage) throws Exception{
        // As before - menu bar
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        menuBar.getMenus().add(fileMenu);

        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");
        fileMenu.getItems().add(saveMenuItem);
        fileMenu.getItems().add(exitMenuItem);


        // URL text area, go button, etc
        // let's make these member variables, easier that way
        urlTextField.setPrefColumnCount(30);

        HBox addressBarBox = new HBox(urlTextField,goButton,currentDisplayedUrlText);
        HBox.setMargin(urlTextField,new Insets(4));
        HBox.setMargin(goButton,new Insets(4));
        HBox.setMargin(currentDisplayedUrlText,new Insets(4));

        VBox browserBox = new VBox(addressBarBox,browser, summaryTextArea);

        // tree view
        treeView.setMinHeight(600);
        treeView.setMinWidth(200);
        treeView.setShowRoot(true);
        treeView.setEditable(true);
        treeView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        //summary text area
        summaryTextArea.setWrapText(true);

        //the border pane and remaining boiler-plate
        BorderPane rootPane = new BorderPane();
        rootPane.setTop(menuBar);
        rootPane.setCenter(browserBox);
        rootPane.setLeft(treeView);
        //let's add the preview pane to the bottom, where we have a vacant slot handy
        rootPane.setBottom(previewBrowser);

        Scene scene = new Scene(rootPane,1000,800);
        primaryStage.setScene(scene);
        primaryStage.show();



        // wiring up the listeners

        // preview pane listeners: we want the ObservableMap objects to send updates to
        // the preview pane, so that when those collections change, the preview pane changes too
        MapChangeListener<? super TreeItem, ? super UrlInfo> mapChangeListener1 =
                (e -> {
                //need to get HTML in real time [DONE]
                    previewBrowser.getEngine().
                            loadContent(HtmlWriter.getHtmlRepresentation(urlInfoMap.values()));
                    // let's parse this line above. Let's go from outside-in
                    // first ,we get the UrlInfo objects (the set of values in UrlInfoMap)
                    // then we get the HTML representation of this collection
                    // then we pass this HTML to the engine behind the preview browser WebView
                    // that method has a way to take in HTML and render it directly.
                    // this is different from setting the location property of the enginer,
                    // while sends the browser to a specific URL
                });
        MapChangeListener<? super String, ? super TreeItem> mapChangeListener2 =
                (e -> {
                    //need to get HTML in real time [DONE]
                    previewBrowser.getEngine().
                            loadContent(HtmlWriter.getHtmlRepresentation(urlInfoMap.values()));
                });
        urlInfoMap.addListener(mapChangeListener1);
        treeNodeMap.addListener(mapChangeListener2);


        // file menu listeners

        saveMenuItem.setOnAction(actionEvent -> {
            // get the file to save to, and write out state using the htmlwriter
            FileChooser  fileChooser = new FileChooser();
            fileChooser.setTitle("Save Snippet File");
            File selectedFile = fileChooser.showSaveDialog(primaryStage);
            if(selectedFile != null) {
                HtmlWriter.writeToHTML(selectedFile.getAbsolutePath(),urlInfoMap.values());
                // this line below, it makes a call to a method called 'go', that does not
                // exist yet (we are about to write it) that will update all of the UI to a
                // new URL. In this case below, the URL is that of the file we have just saved.
                go(selectedFile.toURI().toString());
            }
        });
        exitMenuItem.setOnAction(e -> Platform.exit());

        //address box listeners
        goButton.setOnAction(e -> go(urlTextField.getText()));
        // this line below is a bonus: it wires up the currentDisplayUrlText field to the
        // actual current URL that we are on (so, say we click on a link in a document loaded in
        // our WebView, the currentUrl member variable will not reflect the new URl we have gone,
        // but this text field will. Handy, and illustrates the enormous power of properties and bindings
        currentDisplayedUrlText.textProperty().bind(browser.getEngine().locationProperty());

        //treeview listeners
        // SO - for the treeview, we will need to write an entire class to make our tree
        // nodes editable. This is a rare instance of something that is more work in Java FX
        // than in Swing. Oh well. Let's write it, and then pick up here again.
        treeView.setOnEditCommit(new EventHandler<TreeView.EditEvent>() {
            @Override
            public void handle(TreeView.EditEvent event) {
                UrlInfo urlInfo = urlInfoMap.get(event.getTreeItem());
                urlInfo.setHeadline(event.getNewValue().toString());

                // OK-  now here we will need to explicitly replace the existing
                // UrlInfo for this key with a new UrlInfo object. Why? that's because
                // the ObservableMap will only fire updates on replacements, not on updates.

                // let's add to UrlInfo a 'Copy Constructor', which is a way to get
                // a new object exactly like another object passed in. [DONE]
                UrlInfo newUrlInfo = new UrlInfo(urlInfo);
                urlInfoMap.replace(event.getTreeItem(),urlInfo,newUrlInfo);

            }
        });


        treeView.setCellFactory(p -> new TextFieldTreeCell());

        // one last bit of tree-related wiring: when the user clicks on a tree, the entire UI
        // should shift to reflect that new node
        treeView.getSelectionModel().selectedItemProperty().addListener(
                (ObservableValue ov, Object oldValue, Object newValue) -> {
                    TreeItem treeItem = (TreeItem) newValue;
                    if(newValue != null && urlInfoMap.containsKey(newValue)) {
                        UrlInfo urlInfo = urlInfoMap.get(treeItem);
                        urlTextField.setText(urlInfo.getUrl());
                        summaryTextArea.setText(urlInfo.getSummary());
                        browser.getEngine().load(urlInfo.getUrl());
                    }
                }
        );

        //summarytext area listeners
        // as the user edits the summary text area, update the underlying UrlInfo object
        summaryTextArea.textProperty().addListener( e-> {
            currentUrl = urlTextField.getText();
            if(treeNodeMap.containsKey(currentUrl)) {
                UrlInfo urlInfo = urlInfoMap.get(treeNodeMap.get(currentUrl));
                urlInfo.setSummary(summaryTextArea.getText());

                // same as above:
                // OK-  now here we will need to explicitly replace the existing
                // UrlInfo for this key with a new UrlInfo object. Why? that's because
                // the ObservableMap will only fire updates on replacements, not on updates.
                UrlInfo newUrlInfo = new UrlInfo(urlInfo);
                urlInfoMap.replace(treeNodeMap.get(currentUrl), urlInfo, newUrlInfo);

            }

        });


    }

    private void go(String url) {
        // we need to update all of our state to point to the new URL.
        currentUrl = url;
        urlTextField.setText(currentUrl);
        browser.getEngine().load(currentUrl);
        TreeItem childNode = null;
        if(treeNodeMap.containsKey(currentUrl)) {
            // this url has been added to the tree before, simply select it now
            childNode = treeNodeMap.get(currentUrl);
        } else {
            // this node has not yet been added to the tree, so do so now
            childNode = new TreeItem<>(currentUrl);
            treeNodeMap.put(currentUrl,childNode);
            treeView.getRoot().getChildren().add(childNode);
        }
        if(!urlInfoMap.containsKey(childNode)) {
            urlInfoMap.put(childNode, new UrlInfo(currentUrl));
        }
        // by this point, the node definitely exists in the tree - now select it.
        treeView.getSelectionModel().select(childNode);
        summaryTextArea.setText(urlInfoMap.get(childNode).getSummary());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
