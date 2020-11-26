package showArc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowArc extends Application {

    @Override
    public void start(Stage primaryStage){

        Arc arc1 = new Arc(150,100,80,80,30,35);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(150,100,80,80,30+90,35);
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);


        Arc arc3 = new Arc(150,100,80,80,30+180,35);
        arc3.setFill(Color.WHITE);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);

        Arc arc4 = new Arc(150,100,80,80,30+270,35);
        arc4.setStroke(Color.BLACK);
        arc4.setType(ArcType.CHORD);
        arc4.setFill(Color.GREEN);

        Group group = new Group();
        group.getChildren().addAll(new Text(210,40,"arc1 round"),arc1,
                new Text(20,40,"arc2 Open"),arc2,
                new Text(20,170,"arc3 chord"),arc3,
                new Text(210,170,"arc4 chord"),arc4);



        Scene s1 = new Scene(new BorderPane(group),300,200);

        primaryStage.setTitle("Hej");
        primaryStage.setScene(s1);
        primaryStage.show();









    }
}
