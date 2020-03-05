package com.acarballeira.javaFX.ejemplo3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	 @Override
	 public void start(Stage primaryStage) {

	 primaryStage.setTitle("Ola Mundo!!!");
	 primaryStage.setWidth(600);
	 primaryStage.setHeight(200);
	 primaryStage.setResizable(false);
	 
	 HBox hbox = new HBox();
	 hbox.setSpacing(10);
	 Button btn1 = new Button("1");
	 Button btn2 = new Button("2");
	 Button btn3 = new Button("3");
	 Button btn4 = new Button("4");
	 hbox.getChildren().addAll(btn1, btn2, btn3, btn4);


	 Label etiqueta = new Label("Ola Mundo!");
	 etiqueta.setAlignment(Pos.CENTER);

	 Scene primaryScene = new Scene(hbox);
	 primaryStage.setScene(primaryScene);
	 primaryStage.show();

	 }
	 public static void main(String[] args) {
	 Application.launch();
	 }
	}
