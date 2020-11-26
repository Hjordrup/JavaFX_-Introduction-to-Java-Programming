package fontDemo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;

public class FontDemo extends Application {

    @Override
    public void start(Stage primaryStage){


        Pane p1 = new StackPane();

        Circle c1 = new Circle();
        c1.setRadius(50);
        c1.setStroke(Color.BLACK);
        c1.setFill(new Color(0.5,0.5,0.5,0.1));

        p1.getChildren().add(c1);


        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR,20));
        p1.getChildren().add(label);

        Scene s1 = new Scene(p1);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(s1);
        primaryStage.show();








    }







}
