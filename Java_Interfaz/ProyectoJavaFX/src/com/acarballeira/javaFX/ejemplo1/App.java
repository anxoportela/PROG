package com.acarballeira.javaFX.ejemplo1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
	 @Override
	 public void start(Stage primaryStage) {

	 primaryStage.setTitle("Ola Mundo!!!");
	 primaryStage.setWidth(600);
	 primaryStage.setHeight(200);
	 primaryStage.setResizable(false);

	 Label etiqueta = new Label("Ola Mundo!");
	 etiqueta.setAlignment(Pos.CENTER);

	 Scene primaryScene = new Scene(etiqueta);
	 primaryStage.setScene(primaryScene);
	 primaryStage.show();

	 }
	 public static void main(String[] args) {
	 Application.launch();
	 }
	}
