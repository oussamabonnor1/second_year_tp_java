package Nombre_Mysterieux;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Oussama on 08/01/2017.
 */
public class Main extends Application implements EventHandler {

    Stage stage;
    Scene scene;
    StackPane layout;

    TextField textField;
    Label title;
    Label power;
    Label statement;
    Label result;

    Button b;

    int i;
    int count = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        i = Randomise();

        layout = new StackPane();
        layout.setBackground(new Background(new BackgroundFill(Paint.valueOf("000000"), null, null)));

        b = new Button("click");
        b.setTranslateX(0);
        b.setTranslateY(100);
        b.setOnAction(this);

        textField = new TextField();
        textField.setTranslateX(0);
        textField.setTranslateY(150);
        textField.setPromptText("Entrer votre nombre:");


        title = new Label("Jeu du Nombre Mysterieux...");
        title.setTranslateX(0);
        title.setTranslateY(-250);
        title.setFont(Font.font("Ariale", FontWeight.BOLD, 40));
        title.setTextFill(Paint.valueOf("FFFFFF"));

        power = new Label("powered by @JetLight studio");
        power.setTranslateX(0);
        power.setTranslateY(270);
        power.setFont(Font.font("Ariale", FontWeight.BOLD, 20));
        power.setTextFill(Paint.valueOf("FFFFFF"));

        statement = new Label("Tirez votre numero de chance !");
        statement.setTranslateX(0);
        statement.setTranslateY(50);
        statement.setFont(Font.font("Ariale", FontWeight.BOLD, 30));
        statement.setTextFill(Paint.valueOf("FFFFFF"));

        result = new Label("Essai: "+ (count+1));
        result.setTranslateX(0);
        result.setTranslateY(-200);
        result.setFont(Font.font("Ariale", FontWeight.BOLD, 30));
        result.setTextFill(Paint.valueOf("FFFFFF"));


        layout.getChildren().addAll(textField, power, result, statement, title , b);

        scene = new Scene(layout, 600, 600);

        stage.setScene(scene);
        stage.setTitle("Nombre Mysterieux");
        stage.show();
    }

    @Override
    public void handle(Event event) {
        if (event.getSource() == b) {
            result.setText("clicked");

            if (count < 3) {
                if (textField.getText().equals("")) {
                    result.setText("Enter une valeur");
                } else {
                    if (Integer.valueOf(textField.getText()) == i) {
                        result.setText("Eassai: "+ count+ " Vous etes correct! ");
                    } else if (Integer.valueOf(textField.getText()) > i) {
                        result.setText("Eassai: "+ count+ " Chiffre trop grand");
                    } else if (Integer.valueOf(textField.getText()) < i) {
                        result.setText("Eassai: "+ count+ " Chiffre trop petit");
                    }
                    count++;
                }
            } else {
                result.setText("Votre partie est terminé! ");
            }
        }
    }

    int Randomise() {
        Random r = new Random();
        int i = r.nextInt(10);
        return i;
    }
}
