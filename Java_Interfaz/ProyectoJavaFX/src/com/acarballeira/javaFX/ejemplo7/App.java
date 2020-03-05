package com.acarballeira.javaFX.ejemplo7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Ola Mundo!!!");

		Pane root = new Pane();
		
		Rectangle rect = new Rectangle(25,25,50,50);
		rect.setFill(Color.BLACK);
		
		Line line = new Line(90, 40, 230, 40);
		line.setFill(Color.AZURE);
		
		root.getChildren().addAll(rect,line);

		Scene primaryScene = new Scene(root, 400, 400);
		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch();
	}
}
