package com.example.todotask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
        String css = this.getClass().getResource("/style.css").toExternalForm();

        Scene scene = new Scene(root);
        scene.getStylesheets().add(css); //CSS
        stage.setTitle("To-Do App");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.setWidth(800);
        stage.setHeight(500);
        stage.centerOnScreen();    }
    public static void main(String[] args) {
        launch();
    }
}




