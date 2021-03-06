package com.acarballeira.javaFX.ejemplo9;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
	
	static int numVeces = 0;
	
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Ola Mundo!!!");
		// primaryStage.setWidth(600);
		// primaryStage.setHeight(200);
		// primaryStage.setResizable(false);

		// Label etiqueta = new Label("Ola Mundo!");
		// etiqueta.setAlignment(Pos.CENTER);

		Pane root = new Pane();
		Label nombreLabel = new Label("Nombre: ");
		nombreLabel.relocate(10, 13);
		TextField nombreField = new TextField();
		nombreField.relocate(54, 10);

		Label passLabel = new Label("Contraseņa: ");
		passLabel.relocate(200, 13);
		TextField passField = new TextField();
		passField.relocate(262, 10);

		Button loginButton = new Button("Login");
		loginButton.relocate(10, 50);

		Label textnumVeces = new Label(String.valueOf(numVeces));
		textnumVeces.relocate(105, 55);
		textnumVeces.setVisible(false);

		root.getChildren().addAll(nombreLabel, nombreField, passLabel, passField, loginButton, textnumVeces);
				
		// Eventos
		loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, 
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						textnumVeces.setText(" " + ++numVeces);
						textnumVeces.setVisible(true);
					}			
		});
		
		DropShadow shadow = new DropShadow();
		
		loginButton.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						loginButton.setEffect(shadow);
					}
			
		});
		
		loginButton.addEventHandler(MouseEvent.MOUSE_EXITED, 
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						loginButton.setEffect(null);
					}
			
		});

		Scene primaryScene = new Scene(root, 500, 200);
		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch();
	}

}
