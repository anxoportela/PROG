package com.acarballeira.javaFX.ejemplo5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Ola Mundo!!!");
		// primaryStage.setWidth(600);
		// primaryStage.setHeight(200);
		// primaryStage.setResizable(false);

		// Label etiqueta = new Label("Ola Mundo!");
		// etiqueta.setAlignment(Pos.CENTER);

		HBox hbox = new HBox();
		VBox vbox1 = new VBox();

		for (int i = 0; i < 20; i++) {
			vbox1.getChildren().add(new Text("Texto " + i));
		}

		VBox vbox2 = new VBox();
		for (int i = 0; i < 20; i++) {
			vbox2.getChildren().add(new Text("Texto " + i));
		}

		hbox.getChildren().addAll(vbox1, vbox2);

		ScrollPane sp = new ScrollPane(hbox);

		Scene primaryScene = new Scene(sp, 200, 200);
		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch();
	}
}
