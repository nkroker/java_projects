package javafx01;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class JavaFX01 extends Application {
    
    @Override
    public void start(Stage str) {
                
        
        
//         str = new Stage();

        Pane pn1 = new Pane();
        Circle crcl = new Circle();
        crcl.centerXProperty().bind(pn1.widthProperty().divide(2));
        crcl.centerYProperty().bind(pn1.heightProperty().divide(2));
        crcl.radiusProperty().bind(pn1.widthProperty().divide(8));
        crcl.setStroke(Color.GAINSBORO);
        crcl.setFill(Color.AQUA);
        pn1.getChildren().add(crcl);
        Scene scnn = new Scene(pn1,500,500);
        str.setScene(scnn);
        str.show();
        
        
        
        
        
        
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
