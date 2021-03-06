package com.acarballeira.javaFX.ejemplo2;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Ola Mundo!!!");
		primaryStage.setWidth(600);
		primaryStage.setHeight(200);

		try {
			InputStream iconStream = ClassLoader.getSystemResourceAsStream("com/acarballeira/javaFX/recursos/peligro-biologico.png");
			Image image = new Image(iconStream);
			primaryStage.getIcons().add(image);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		VBox vBox = new VBox(new Label("A JavaFX Label"));
		Label l2 = new Label("Ola Mundo!");
		vBox.getChildren().add(l2);
		Scene scene = new Scene(vBox);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch();
	}
}
