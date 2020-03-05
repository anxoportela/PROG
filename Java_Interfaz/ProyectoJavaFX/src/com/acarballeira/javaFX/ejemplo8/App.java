package com.acarballeira.javaFX.ejemplo8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	 public void start(Stage primaryStage) {

	 primaryStage.setTitle("Ola Mundo!!!");

	 BorderPane bp = new BorderPane();
	 HBox hbox =  (HBox) crearHbox();
	 //VBox vbox = crearVbox();
	 
	 bp.setTop(hbox);

	 Scene primaryScene = new Scene(bp,400,400,Color.AQUA);
	 primaryStage.setScene(primaryScene);
	 primaryStage.show();

	 }

	private Pane crearHbox() {
		HBox hbox = new HBox();
		Button btn1 = new Button("Ver proyectos");
		Button btn2 = new Button("A�adir proyecto");
		hbox.setPadding(new Insets(15, 15, 15, 15));
		hbox.setSpacing(15);
		hbox.setStyle("-fx-background-color: #995500");
		btn1.setPrefSize(100, 25);
		btn2.setPrefSize(100, 25);		
		hbox.getChildren().addAll(btn1,btn2);
		return hbox;
	}

	private Pane crearVbox() {
		VBox vbox = new VBox();
		return vbox;
	}

	public static void main(String[] args) {
		Application.launch();
	}
}
