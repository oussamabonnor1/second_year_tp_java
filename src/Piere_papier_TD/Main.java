package Piere_papier_TD;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Created by Oussama on 03/01/2017.
 */
public class Main extends Application implements EventHandler<ActionEvent> {

    Stage stage;
    Scene scene;
    StackPane layout;

    Button rock;
    Button paper;
    Button scisors;

    Label ordi;
    Label player;
    Label answer;
    Label jetlight;

    int scoreOrdi;
    int scorePlayer;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        layout = new StackPane();
        layout.setBackground(new Background(new BackgroundFill(Paint.valueOf("009864"), null, null)));

        rock = new Button("Rock");
        rock.setTranslateX(-150);
        rock.setTranslateY(-50);
        rock.setMaxSize(100, 30);
        rock.setOnAction(this);

        scisors = new Button("Scisors");
        scisors.setTranslateX(0);
        scisors.setTranslateY(-50);
        scisors.setMaxSize(100, 30);
        scisors.setOnAction(this);

        paper = new Button("Paper");
        paper.setTranslateX(150);
        paper.setTranslateY(-50);
        //paper.setBackground(new Background(new BackgroundImage(rockImage)));
        paper.setMaxSize(100, 30);
        paper.setOnAction(this);

        ordi = new Label("Ordis: " + scoreOrdi);
        ordi.setTranslateX(-100);
        ordi.setTranslateY(100);
        ordi.setFont(Font.font("ARIAL", FontWeight.BOLD, 30));
        ordi.setTextFill(Paint.valueOf("FFFFFF"));


        player = new Label("Player: " + scorePlayer);
        player.setTranslateX(100);
        player.setTranslateY(100);
        player.setFont(Font.font("ARIAL", FontWeight.BOLD, 30));
        player.setTextFill(Paint.valueOf("FFFFFF"));

        answer = new Label("");
        answer.setTranslateX(0);
        answer.setTranslateY(200);
        answer.setFont(Font.font("ARIAL", FontWeight.BOLD, 30));
        answer.setTextFill(Paint.valueOf("FFFFFF"));

        jetlight = new Label("Powered by @JetLight studio");
        jetlight.setTranslateX(0);
        jetlight.setTranslateY(270);
        jetlight.setFont(Font.font("ARIAL", FontWeight.BOLD, 20));
        jetlight.setTextFill(Paint.valueOf("FFFFFF"));

        layout.getChildren().addAll(jetlight, answer, ordi, player, paper, scisors, rock);

        scene = new Scene(layout, 600, 600);

        stage.setScene(scene);
        stage.setTitle("Piere Papier Sciseaux");
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == rock) {
            random("Rock");
        }
        if (event.getSource() == paper) {
            random("Paper");
        }
        if (event.getSource() == scisors) {
            random("Scisors");
        }

        player.setText("Player: " + scorePlayer);
        ordi.setText("Ordi: " + scoreOrdi);

    }

    void random(String input) {
        Random r = new Random();
        int i = r.nextInt(3);
        String result = "";

        if (i == 0) {
            result = "Rock";
        }
        if (i == 1) {
            result = "Paper";
        }
        if (i == 2) {
            result = "Scisors";
        }

        answer.setText(resultat(input, result));
    }

    String resultat(String input, String result) {
        String retour = "";
        if (input == "Rock") {
            if (result == "Rock") {
                retour = "Try Agin";
            }
            if (result == "Paper") {
                retour = "You lose";
                scoreOrdi++;
            }
            if (result == "Scisors") {
                retour = "You win";
                scorePlayer++;
            }
        }
        if (input == "Paper") {
            if (result == "Rock") {
                retour = "You win";
                scorePlayer++;
            }
            if (result == "Paper") {
                retour = "Try Agin";
            }
            if (result == "Scisors") {
                retour = "You lose";
                scoreOrdi++;
            }
        }
        if (input == "Scisors") {
            if (result == "Rock") {
                retour = "You lose";
                scoreOrdi++;
            }
            if (result == "Paper") {
                retour = "You win";
                scorePlayer++;
            }
            if (result == "Scisors") {
                retour = "Try Agin";
            }
        }
        return retour;
    }
}


