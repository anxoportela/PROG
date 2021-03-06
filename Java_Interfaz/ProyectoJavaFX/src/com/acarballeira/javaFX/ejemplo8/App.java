package com.acarballeira.javaFX.ejemplo8;

import java.io.InputStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Ola Mundo!!!");

		BorderPane bp = new BorderPane();
		HBox hbox = (HBox) crearHbox();
		VBox vbox = (VBox) crearVbox();
		StackPane sp = (StackPane) crearStackPane();
		GridPane gp = (GridPane) crearGridPane();

		bp.setTop(hbox);
		bp.setLeft(vbox);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(sp);
		bp.setCenter(gp);
		
		Scene primaryScene = new Scene(bp, 600, 300, Color.AQUA);
		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	private Pane crearGridPane() {
		GridPane grid = new GridPane();
		grid.setVgap(5);
		grid.setHgap(5);
		
		//Columna 2, Fila 1
		Text titulo = new Text("Nombre Proyecto: ");
		titulo.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
		grid.add(titulo, 1, 0);
		
		//Columna 3, Fila 1
		Text nomeProx = new Text("Probando Grid");
		nomeProx.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		nomeProx.setFill(Color.BLUE);
		grid.add(nomeProx, 2, 0);
		
		//Columna 2, Fila 2
		Text entradilla = new Text("Segunda prueba Grid");
		grid.add(entradilla, 1,1,2,1);
		
		//Columna 1, Filas 1-3
		ImageView imgView1 = new ImageView(new Image(App.class.getResourceAsStream("/com/acarballeira/javaFX/recursos/project_alargado.png")));
		grid.add(imgView1, 0,0,1,2);
		
		ImageView imgView2 = new ImageView(new Image(App.class.getResourceAsStream("/com/acarballeira/javaFX/recursos/golf_ii.png")));
		grid.add(imgView2, 1, 2, 2, 1);
		
		Text pequeno = new Text("Golfito G60");
		GridPane.setValignment(pequeno, VPos.BOTTOM);
		grid.add(pequeno, 0, 2);
		
		return grid;
	}

	private Pane crearStackPane() {
		StackPane stack = new StackPane();
		InputStream is = App.class.getResourceAsStream("/com/acarballeira/javaFX/recursos/icona_cartafol.png");
		Image img = new Image(is);
		ImageView imgV = new ImageView(img);
		imgV.setFitHeight(25);
		imgV.setFitWidth(25);
		
		Text ayuda = new Text("?");
		ayuda.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
		ayuda.setFill(Color.BLACK);
		ayuda.setStroke(Color.web("#9090C0"));
		//ayuda.setStrokeWidth(2.5);
		stack.setMargin(ayuda, new Insets(5,0,0,0));
		stack.getChildren().add(imgV);
		stack.getChildren().add(ayuda);
		return stack;
	}

	private Pane crearHbox() {
		HBox hbox = new HBox();
		Button btn1 = new Button("Ver proyectos");
		Button btn2 = new Button("A�adir proyecto");
		hbox.setPadding(new Insets(15, 15, 15, 15));
		hbox.setSpacing(15);
		hbox.setStyle("-fx-background-color: #995500");
		btn1.setPrefSize(130, 25);
		btn2.setPrefSize(130, 25);
		hbox.getChildren().addAll(btn1, btn2);
		return hbox;
	}

	private Pane crearVbox() {
		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(5));
		Text titulo = new Text("Men�");
		titulo.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		vbox.getChildren().add(titulo);
		
		Hyperlink [] opciones = new Hyperlink[] {
				new Hyperlink("Inicio"),
				new Hyperlink("Personal"),
				new Hyperlink("Compras"),
				new Hyperlink("Ventas"),
		};
		
		for (int i = 0; i < opciones.length; i++) {			
			VBox.setMargin(opciones[i], new Insets(0,0,0,10));
			vbox.getChildren().add(opciones[i]);
		}
		
		return vbox;
	}

	public static void main(String[] args) {
		Application.launch();
	}
}
