package circle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {


@Override
    public void start(Stage primaryStage){


    Circle c1 = new Circle();
    c1.setCenterX(100);
    c1.setCenterY(100);
    c1.setRadius(50);
    c1.setStroke(Color.BLACK);
    c1.setFill(null);


    Pane pane = new Pane();
    pane.getChildren().add(c1);

    Scene s1 = new Scene(pane,200,200);
    primaryStage.setTitle("This is the Circle");
    primaryStage.setScene(s1);
    primaryStage.show();





    }
}
