package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //1. Get (from the web - thanks to a kind soul!) a bit of code
        //that creates an animated GIF from a series of images.
        //http://elliot.kroo.net/software/java/GifSequenceWriter/GifSequenceWriter.java


        // create a simple UI to display a string in a given font when a button is clicked
        FlowPane flowPane = new FlowPane();
        ScrollPane scrollPane = new ScrollPane(flowPane);
        flowPane.setPrefWidth(500);
        primaryStage.setTitle("Hello world");
        primaryStage.setScene(new Scene(scrollPane,800,500));

        Button goButton = new Button("Go!");
        Button saveButton = new Button("Save");
        VBox vBox = new VBox(goButton,saveButton);
        flowPane.getChildren().add(vBox);
        final List<String> fileNames = new ArrayList<>();

        // On the button click, walk through every font in the system, and display the text
        // with that font

        goButton.setOnAction(e -> {
            for (String fontName : Font.getFontNames()) {
                Text text = new Text();
                text.setText("The quick brown fox jumps over the lazy dog.");
                text.setFont(Font.font(fontName, 12));
                vBox.getChildren().add(text);

                // now write this text element to file, but be careful to do this
                // using Platform.runLater
                Runnable runnable = () -> {
                    String textPngName = "/Users/vitthalsrinivasan/Downloads/text_"
                            + fontName + ".png";
                    writeNodeToFile(text, textPngName);
                    fileNames.add(textPngName);
                };
                Platform.runLater(runnable);
            }
        });

        saveButton.setOnAction( e -> {
            FileChooser fileChooser = new FileChooser();
            File outputFile = fileChooser.showSaveDialog(primaryStage);
            if (outputFile != null) {
                Callable callable = () -> {
                    createGIFs(fileNames,outputFile.getAbsolutePath());
                    return outputFile.getAbsolutePath();
                };
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> task = executor.submit(callable);

                // now the line above merely submits a task for execution (on some other
                // thread, which is not the Java FX thread). All of this is fine - but if we
                // tried to explicitly read the result of this call, we get a Javafx threading
                // exception. That's fine, because we don't really need this return value,
                // all we care about is that the GIF file be written successfully.
                // System.out.println(task.get())  <-- this line would throw an exception

            }
        });

        // oops! we forgot to show our stage
        primaryStage.show();

        // The text is a Node, which means that we can save it to an image file - do so.
        // Be careful to do this using Platform.runLater, else the UI will go limp.
        // When performing very intensive tasks, particularly those involving File IO,
        // or internet access, use Platform.runLater, else the Java FX UI will become
        // unresponsive.

        // at end, pass the list of all such image files to our animated GIF creator.
        // THis GIF Creation is also quite resource-intensive, so we ideally ought to
        // use Platform.runLater. However, that won't help - Platform.runLater will still
        // schedule it on the Java FX thread, and this operation is so heavy, that the java fx
        // thread will go limp even with Platform.runLater. So - we cheat, and use a different
        // thread altogether. Technically, no operations using the UI should be done on a different
        // thread than the Java FX thread - but here we merely save the GIF from this thread - we
        // don't open or view it in our app. So we can take this route. Note that if we had tried
        // to actually open the GIF in our UI, an exception would have resulted saying that UI
        // updates must be on the JavaFX thread.
    }

    private void writeNodeToFile(Node text, String textPngName) {
        // this method will take a Node, and save it to a png file
        WritableImage snapImage = text.snapshot(new SnapshotParameters(),null);
        ImageView imageView = new ImageView();
        imageView.setImage(snapImage);
        File outputFile = new File(textPngName);
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(snapImage,null),"png",outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // don't get too hung up on understanding each line of this bit of code -
        // as with a lot of File IO code, that can obscure the big picture.
        // What's important to remember is this: it is possible to take a snapshot
        // of a given javafx node, and its also possible to save that snapshot to a file.
        // If you remember this much, googling 'save javafx node to image' will always
        // lead you back to this code, or code like it.
    }

    private void createGIFs(List<String> fileNames, String outputFileName) {
        // we use our animated GIF widget to create a GIF sequence, with the type of the
        // first image, with duration of each frame = 1 second, and set to loop infinitely
        GifSequenceWriter writer = null;
        try {
            BufferedImage firstImage = ImageIO.read(new File(fileNames.get(0)));
            ImageOutputStream output = new FileImageOutputStream(new File(outputFileName));
            writer = new GifSequenceWriter
                    (output,firstImage.getType(),1,false);
            for(String fileName : fileNames) {
                BufferedImage image = ImageIO.read(new File(fileName));
                writer.writeToSequence(image);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // as with all FIle IO operations, especially writes, be sure to close the file
            // once done.
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }









    public static void main(String[] args) {
        launch(args);
    }
}
