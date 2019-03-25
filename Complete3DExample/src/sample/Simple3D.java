package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Simple3D extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Sphere, DrawMode = LINE
        Sphere sphere1 = new Sphere(100);
        sphere1.setTranslateX(-400);
        sphere1.setTranslateY(0);
        sphere1.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        sphere1.setRotate(60);
        sphere1.setDrawMode(DrawMode.LINE);

        // SPhere, DrawMode = FILL
        Sphere sphere2 = new Sphere(100);
        sphere2.setTranslateX(-400);
        sphere2.setTranslateY(200);
        sphere2.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        sphere2.setRotate(60);
        sphere2.setDrawMode(DrawMode.FILL);

        // Sphere, Material = an Image
        Image diffuseMap = new Image("http://www.loonycorn.com/resources/loonycorn-logo.png");
        PhongMaterial loonyMaterial = new PhongMaterial();
        loonyMaterial.setDiffuseMap(diffuseMap);
        Sphere sphere3 = new Sphere(100);
        sphere3.setTranslateX(-400);
        sphere3.setTranslateY(400);
        sphere3.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        sphere3.setRotate(60);
        sphere3.setDrawMode(DrawMode.FILL);
        sphere3.setMaterial(loonyMaterial);


        // Cylinder, Rotate 60 degrees
        Cylinder cylinder1 = new Cylinder(50,200);
        cylinder1.setTranslateX(0);
        cylinder1.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        cylinder1.setRotate(60);

        // Cylinder, Rotate 180
        Cylinder cylinder2 = new Cylinder(50,200);
        cylinder2.setTranslateX(0);
        cylinder2.setTranslateY(200);
        cylinder2.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        cylinder2.setRotate(180);

        // Cylinder, Rotate 270
        Cylinder cylinder3 = new Cylinder(50,200);
        cylinder3.setTranslateX(0);
        cylinder3.setTranslateY(400);
        cylinder3.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        cylinder3.setRotate(270);


        // Box, CullFace = FRONT
        Box box1 = new Box(100,100,100);
        box1.setTranslateX(400);
        box1.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        box1.setRotate(60);
        box1.setCullFace(CullFace.FRONT);

        // Box, CullFace = BACK
        Box box2 = new Box(100,100,100);
        box2.setTranslateX(400);
        box2.setTranslateY(200);
        box2.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        box2.setRotate(60);
        box2.setCullFace(CullFace.BACK);


        // Box, CullFace = NONE
        Box box3 = new Box(100,100,100);
        box3.setTranslateX(400);
        box3.setTranslateY(400);
        box3.setRotationAxis(new Point3D(1.0d, 1.0d, 1.0d));
        box3.setRotate(60);
        box3.setCullFace(CullFace.NONE);



        Group root = new Group(
                sphere1,sphere2,sphere3,
                cylinder1, cylinder2,cylinder3,
                box1, box2, box3
        );

        BorderPane borderPane = new BorderPane();
        primaryStage.setTitle("3D introduction drill");
        primaryStage.setScene(new Scene(borderPane, 1200, 800));
        borderPane.setCenter(root);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
