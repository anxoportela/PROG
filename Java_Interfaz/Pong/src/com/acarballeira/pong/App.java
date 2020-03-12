package com.acarballeira.pong;

import java.io.InputStream;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application{
	
	private static Pane panel;
	private static Scene escena;
	private static final int ANCHO = 600;
	private static final int ALTO = 400;
	private static final int DESFASE_PALA = 20;
	private static Circle bola;
	private static Rectangle pala;
	private static int velocidadBolaX = 3;
	private static int velocidadBolaY = 3;
	private static AnimationTimer bolaAnimada;
	private static int posicionBolaX = 10;
	private static int posicionBolaY = 20;
	private static int velocidadPala = 0;
	private static int posicionPalaY = 0; 
	
	
	
	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Pong");
		primaryStage.setResizable(false);
		
		InputStream iconStream = App.class.getResourceAsStream("/com/acarballeira/pong/recursos/project.png");
		primaryStage.getIcons().add(new Image(iconStream));
		panel = new Pane();
		escena = new Scene(panel, ANCHO, ALTO);
		escena.setFill(Color.web("#000", 1));
		primaryStage.setScene(escena);
		primaryStage.show();
		
		crearBola();
		crearPala();
		crearRed();
		
		configuraAnimacion();
		configurarIteracionPala();
		
		comenzarPartida();
		
		
	}
	
	private static void configurarIteracionPala() {
		
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				switch (event.getCode()) {
				case UP:
					velocidadPala = -6;
					break;
					
				case DOWN:
					velocidadPala = 6;
					break;

				}				
			}			
		});
		
		escena.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
					velocidadPala = 0;

				}			
		});		
	}

	private static void crearRed() {
		
		Line linea;
		
		for (int i = 0; i < ALTO; i+= 20) {
			linea = new Line((ANCHO-DESFASE_PALA) /2, i, (ANCHO-DESFASE_PALA) /2, i + 10);
			linea.setStroke(Color.RED);
			panel.getChildren().add(linea);
		}
		
		
		
	}

	private static void posicionPala(int x, int y) {
		pala.setX(x);
		pala.setY(y);
		
	}

	private static void comenzarPartida() {
		posicionBola(10,20);
		bolaAnimada.start();
		posicionPalaY = (int)(ALTO - pala.getHeight())/2;
		posicionPala(ANCHO-DESFASE_PALA, posicionPalaY);
	}

	private static void configuraAnimacion() {
		
		bolaAnimada = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				
				posicionBolaX += velocidadBolaX;
				posicionBolaY += velocidadBolaY;
				
				posicionBola(posicionBolaX, posicionBolaY);
				
				posicionPalaY += velocidadPala;
				posicionPala(ANCHO - DESFASE_PALA, posicionPalaY);
				
				if (posicionPalaY<0) {
					posicionPalaY = 0;
				} else if (posicionPalaY>ALTO-pala.getHeight() - 2) {
					posicionPalaY=(int) (ALTO - pala.getHeight() - 2);
				}
				
			}
		};
		
	}

	private static void crearBola() {
		
		bola = new Circle();
		bola.setCenterX(10);;
		bola.setCenterY(10);
		bola.setRadius(9);
		bola.setFill(Color.RED);
		
		panel.getChildren().add(bola);
		
	}
	
	private static void posicionBola(int x, int y) {
		bola.setCenterX(x);
		bola.setCenterY(y);
	}
	
	private static void crearPala() {
		
		pala = new Rectangle(0,0,7,50);
		pala.setFill(Color.RED);
		
		panel.getChildren().add(pala);
		
	}

	
}
