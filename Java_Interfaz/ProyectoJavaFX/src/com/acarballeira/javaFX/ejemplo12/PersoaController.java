package com.acarballeira.javaFX.ejemplo12;

import java.net.URL;
import java.util.ResourceBundle;

import com.acarballeira.javaFX.ejemplo12.modelo.Persona;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class PersoaController implements Initializable {
	
	@FXML
	private Button btnAgregar;
	
	@FXML
	private TextField txtNombre;
	
	@FXML
	private TextField txtApellidos;
	
	@FXML
	private TextField txtEdad;

	@FXML
	private TableView<Persona> tblPersonas;
	
	@FXML
	private TableColumn colNombre;
	
	@FXML
	private TableColumn colApellidos;
	
	@FXML
	private TableColumn colEdad;
	
	private ObservableList<Persona> personas;
	
	@FXML
	private void agregarPersona(ActionEvent event) {
		
		try {
			Persona p = new Persona(this.txtNombre.getText(), this.txtApellidos.getText(), Integer.parseInt(this.txtEdad.getText()));
			this.personas.add(p);
			this.tblPersonas.setItems(this.personas);
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Alg�n dato con formato incorrecto");
			alert.showAndWait();
		}

	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		this.personas = FXCollections.observableArrayList();
		
		colNombre.setCellValueFactory(new PropertyValueFactory("nombreString"));
		colApellidos.setCellValueFactory(new PropertyValueFactory("apellidoString"));
		colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
		
	}

}
