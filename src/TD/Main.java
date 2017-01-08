package TD;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Oussama on 13/12/2016.
 */
public class Main extends Application implements EventHandler{

    Stage convertiseur;
    Scene scene;
    VBox layout;

    Button one,two,three,four,five,six,seven,eight,nice,point,C;


    @Override
    public void start(Stage primaryStage) throws Exception {
        convertiseur = primaryStage;

        one = new Button("one");
        two = new Button("one");
        three = new Button("one");
        four = new Button("one");
        five = new Button("one");
        six = new Button("one");
        seven = new Button("one");
        eight = new Button("one");
        nice = new Button("one");
        C = new Button("one");


        scene = new Scene(layout,800,800);

        convertiseur.setScene(scene);
        convertiseur.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {

    }
}
