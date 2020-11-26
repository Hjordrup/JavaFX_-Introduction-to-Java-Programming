package showText;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
public class ShowText extends Application{

    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        Text text1 = new Text(20,20,"Programming is fun ");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));

        pane.getChildren().add(text1);

        Text text2 = new Text(60,60,"Programming is fin \n Display text");
        pane.getChildren().add(text2);



        Text text3 = new Text(10,100,"Programming is fun \n Display text ");
        text3.setFill(Color.RED);

        text3.setUnderline(true);
        text3.setStrikethrough(true);
        pane.getChildren().add(text3);
        Scene s1 = new Scene(pane);
        primaryStage.setScene(s1);
        primaryStage.setTitle("Hej");
        primaryStage.show();



    }



}
