package com.acarballeira.javaFX.ejemplo6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Ola Mundo!!!");

		AnchorPane root = new AnchorPane();
		Button btnOk = new Button("Ok");
		Button btnClose = new Button("Cerrar");
		HBox hbox = new HBox();
		hbox.getChildren().addAll(btnOk, btnClose);
		hbox.setSpacing(10);

		AnchorPane.setRightAnchor(hbox, 5d);
		AnchorPane.setBottomAnchor(hbox, 5d);

		root.getChildren().add(hbox);

		Scene primaryScene = new Scene(root, 400, 400);
		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch();
	}
}
