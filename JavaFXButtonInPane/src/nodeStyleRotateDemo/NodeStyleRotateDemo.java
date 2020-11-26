package nodeStyleRotateDemo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


public class NodeStyleRotateDemo extends Application{

    @Override
    public void start(Stage primaryStage){

        StackPane pane = new StackPane();
        Button btOK = new Button("OK");

        btOK.setStyle("-fx-border-color: blue");
        pane.getChildren().add(btOK);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200,250);
        primaryStage.setTitle("This is the Titel");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
