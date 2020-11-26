package circleThatAutoCenters;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class ShowCircleCentered extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();

        Circle c1 = new Circle();
        c1.centerYProperty().bind(pane.heightProperty().divide(2));
        c1.centerXProperty().bind(pane.widthProperty().divide(2));
        c1.setRadius(50);
        c1.setFill(null);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(10);

        pane.getChildren().add(c1);

        Scene s1 = new Scene(pane, 200,200);
        primaryStage.setTitle("This is a circle that will stay in the center of the stage");
        primaryStage.setScene(s1);
        primaryStage.show();














    }
}
