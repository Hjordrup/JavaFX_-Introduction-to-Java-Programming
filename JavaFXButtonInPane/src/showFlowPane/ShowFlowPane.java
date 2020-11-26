package showFlowPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application{

    public void start(Stage primaryStage){

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name: "), new TextField(), new Label("MI:"));
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMI,new Label("Last Name"), new TextField());


        Scene s1 = new Scene(pane, 200 , 250);
        primaryStage.setTitle("Titel");
        primaryStage.setScene(s1);
        primaryStage.show();






    }








}
