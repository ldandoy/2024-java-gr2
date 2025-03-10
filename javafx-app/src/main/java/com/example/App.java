package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
// import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Créer un label
        /*Label label = new Label("Bonjour, JavaFX !");
        label.getStyleClass().add("test");*/
        VBox root = FXMLLoader.load(getClass().getResource("/layouts/App.fxml"));

        Button button = (Button)root.lookup("#clickButton");
        Label label = (Label)root.lookup("#messageLabel");
        button.setOnAction(event -> {
            label.setText("New text !");
        });

        // Créer une scène avec le label
        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/styles/main.css").toExternalForm());

        // Configurer la fenêtre principale
        primaryStage.setTitle("Ma Première Application JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}