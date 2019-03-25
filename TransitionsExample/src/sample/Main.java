package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    private final PathTransition pathTransition = new PathTransition();
    private final FadeTransition fadeTransition = new FadeTransition();
    private final RotateTransition rotateTransition = new RotateTransition();
    private final StrokeTransition strokeTransition = new StrokeTransition();
    private final FillTransition fillTransition = new FillTransition();
    private final SequentialTransition sequentialTransition = new SequentialTransition();

    @Override
    public void start(Stage primaryStage) throws Exception{
        // wire up buttons, each button will trigger one transition
        Button pathButton = new Button("Path");
        Button fadeButton = new Button("Fade");
        Button fillButton = new Button("Fill");
        Button rotateButton = new Button("Rotate");
        Button strokeButton = new Button("Stroke");
        Button seqButton = new Button("All");

        // create the text and the shapes to be animated
        Text text = new Text("ANimate me!");
        text.setFont(Font.font("Courier", 100));
        text.setFill(Paint.valueOf("Red"));
        text.setOpacity(0.5);
        Rectangle point = new Rectangle(0,0,10,10);

        // Path transition example
        pathTransition.setPath(text);
        pathTransition.setDuration(Duration.seconds(10));
        pathTransition.setNode(point);
        pathButton.setOnAction(e -> playTransition(pathTransition));

        // Fade Transition example
        fadeTransition.setNode(text);
        fadeTransition.setDuration(Duration.seconds(5));

        // this transition sets the opacity of the start and end points of the transition
        fadeTransition.setNode(text);
        fadeTransition.setDuration(Duration.seconds(5));
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        // Remember to reset the opacity to the initial value once the transition is done!
        fadeTransition.setOnFinished(e -> text.setOpacity(0.5));
        fadeButton.setOnAction(e->playTransition(fadeTransition));


        // Rotate Transition example
        rotateTransition.setNode(text);
        rotateTransition.setByAngle(360);
        rotateTransition.setDuration(Duration.seconds(5));
        rotateButton.setOnAction(e -> playTransition(rotateTransition));

        // Stroke Transition example
        strokeTransition.setShape(text);
        strokeTransition.setDuration(Duration.seconds(5));
        strokeTransition.setFromValue(Color.RED);
        strokeTransition.setToValue(Color.BLACK);
        strokeButton.setOnAction(e -> playTransition(strokeTransition));

        // Fill Transition Example
        fillTransition.setShape(text);
        fillTransition.setDuration(Duration.seconds(5));
        fillTransition.setFromValue(Color.LIGHTYELLOW);
        fillTransition.setToValue(Color.RED);
        fillButton.setOnAction(e -> playTransition(fillTransition));

        // Sequential Transition example

        // Sequential transitions are a bit tricky, because once animations become
        // part of a sequence, they can no longer be called individually; they can only
        // then be called as a part of the transition. This is true for both sequential and
        // parallel transitions.
        // So - in order to make all of these buttons work,  we add all transitions to the
        // sequence when the button for sequential transitions is clicked, then run the
        // sequential transition, and then remove all of the individual transitions.. That way,
        // the other buttons (for fill, stroke, path etc) will not throw errors.
        seqButton.setOnAction(e -> startSequentialTransition());
        sequentialTransition.setOnFinished(e -> stopSequentialTransition());


        // wiring up all the remining UI
        FlowPane flowPane = new FlowPane();
        Pane innerPane = new Pane();
        innerPane.getChildren().addAll(point, text);
        flowPane.getChildren().add(innerPane);
        VBox vBox = new VBox(new HBox(pathButton,fadeButton,rotateButton,strokeButton,fillButton,seqButton));
        vBox.setPrefHeight(200);

        BorderPane borderPane = new BorderPane();
        primaryStage.setTitle("Transition examples");
        primaryStage.setScene(new Scene(borderPane, 1200, 600));

        borderPane.setTop(vBox);
        BorderPane.setMargin(vBox, new Insets(12));
        borderPane.setCenter(flowPane);
        BorderPane.setMargin(flowPane, new Insets(12));

        primaryStage.show();
    }

    private void startSequentialTransition() {
        stopTransitions();
        sequentialTransition.getChildren().addAll(
          pathTransition,
                fadeTransition,
                fillTransition,
                rotateTransition,
                strokeTransition
        );
        sequentialTransition.play();
    }

    private void stopSequentialTransition() {
        sequentialTransition.getChildren().removeAll(
                pathTransition,fadeTransition,fillTransition,rotateTransition,strokeTransition
        );
    }


    private void stopTransitions() {
        // stop all transitions
        pathTransition.stop();
        fadeTransition.stop();
        fillTransition.stop();
        rotateTransition.stop();
        strokeTransition.stop();
        sequentialTransition.stop();
    }

    private void playTransition(Animation animation) {
        // to play a transition, first make sure all transitions are stopped
        // then play this particular transition
        stopTransitions();
        animation.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
