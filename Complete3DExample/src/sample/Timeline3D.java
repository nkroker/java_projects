package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by vitthalsrinivasan on 11/10/15.
 */
public class Timeline3D extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image diffuseMap = new Image("http://www.loonycorn.com/resources/loonycorn-logo.png");
        PhongMaterial loonyMaterial = new PhongMaterial();
        loonyMaterial.setDiffuseMap(diffuseMap);

        Cylinder cylinder2 = new Cylinder(50,200);
        cylinder2.setTranslateX(0);
        cylinder2.setTranslateY(200);
        cylinder2.setDrawMode(DrawMode.LINE);
        cylinder2.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        cylinder2.setRotate(180);
        cylinder2.setHeight(200);

        Timeline timeline1 = new Timeline(
         new KeyFrame(Duration.seconds(0),new KeyValue(cylinder2.rotateProperty(),60)),
                new KeyFrame(Duration.seconds(2),new KeyValue(cylinder2.rotateProperty(),270)),
                new KeyFrame(Duration.seconds(2),new KeyValue(cylinder2.rotateProperty(),120))
        );
        timeline1.setCycleCount(Animation.INDEFINITE);
        timeline1.play();

        Cylinder cylinder3 = new Cylinder(50,200);
        cylinder3.setTranslateX(0);
        cylinder3.setTranslateY(400);
        cylinder3.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        cylinder3.setRotate(270);
        cylinder3.setMaterial(loonyMaterial);

        Group root = new Group(cylinder2,cylinder3);

        BorderPane borderPane = new BorderPane();
        primaryStage.setTitle("3D timeline drill");
        primaryStage.setScene(new Scene(borderPane,1200,800));
        borderPane.setCenter(root);

        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);}
}
