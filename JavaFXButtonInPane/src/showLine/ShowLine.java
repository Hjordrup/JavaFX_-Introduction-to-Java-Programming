package showLine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ShowLine extends Application {


    @Override
    public void start(Stage primaryStage){
        Scene s1 = new Scene(new LinePane(),200,200);

        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(s1);
        primaryStage.show();

    }
}



class LinePane extends Pane{

    public LinePane(){
        Line line1 = new Line(10,10,10,10);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStroke(Color.GREEN);
        line1.setStrokeWidth(5);
        getChildren().add(line1);

        Line line2 = new Line(10,10,10,10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);




    }



}