package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by vitthalsrinivasan on 11/10/15.
 */
public class Camera3D extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        primaryStage.setTitle("Moving camera");
        Scene scene = new Scene(borderPane,1200,800);
        primaryStage.setScene(scene);

        // set up a shape
        Cylinder cylinder = new Cylinder(5,20);
        cylinder.setRotationAxis(new Point3D(1.0d,1.0d,1.0d));
        cylinder.setRotate(60);

        // create a camera
        PerspectiveCamera camera = new PerspectiveCamera(true); // always use TRUE for this constructor
        // set the camera for this scene
        scene.setCamera(camera);

        //Define the transforms that will move and rotate the camera
        Rotate rotateX = new Rotate(-20, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(-20,Rotate.Y_AXIS);
        Rotate rotateZ = new Rotate(-20,Rotate.Z_AXIS);
        Translate translateZ = new Translate(0,0,-100);

        camera.getTransforms().addAll(rotateX, rotateY, rotateZ, translateZ);

        // set up the camera movements on a timeline animation
        Timeline timeline = new Timeline(
              new KeyFrame( Duration.seconds(0),
                      new KeyValue(translateZ.zProperty(),-20),
                      new KeyValue(rotateX.angleProperty(),90),
                      new KeyValue(rotateY.angleProperty(),90),
                      new KeyValue(rotateZ.angleProperty(),90)

              ),
                new KeyFrame(
                        Duration.seconds(5),
                        new KeyValue(translateZ.zProperty(),-80),
                        new KeyValue(rotateX.angleProperty(),-90),
                        new KeyValue(rotateY.angleProperty(),-90),
                        new KeyValue(rotateZ.angleProperty(),-90)
                )
        );

        // play the timeline
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        Group group = new Group(cylinder,camera);
        borderPane.setCenter(group);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
