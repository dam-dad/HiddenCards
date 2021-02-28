package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class PrincipalController implements Initializable {

	public PrincipalController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/InicioView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@FXML
	private VBox root;

	@FXML
	private Button jugarButton;

	@FXML
	private RadioButton facilRadio;

	@FXML
	private RadioButton medioRadio;

	@FXML
	private RadioButton dificilRadio;

	
	FacilController facil = new FacilController();
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// Grupo para que solo puedas seleccionar un RadioButton
		ToggleGroup dificultadGroup = new ToggleGroup();
		dificultadGroup.getToggles().addAll(facilRadio, medioRadio, dificilRadio);
		//acciones de los botones 
		jugarButton.setOnAction(e -> onjugarButton(e));

	}

	/**
	 * Boton jugar Abre las ventanas segun la dificultad
	 * 
	 * @param e
	 */

	private void onjugarButton(ActionEvent e) {

//		if (facilRadio.isSelected()) {
//			try {
//				FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/CardsFacilView.fxml"));
//				loader.setController(this);
//				loader.load();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//			System.out.println("facil");
//
//		} else if (medioRadio.isSelected()) {
//			System.out.println("Medio");
//
//		} else if (dificilRadio.isSelected()) {
//			System.out.println("dificil");
//
//		}else{
//			Alert alert = new Alert(AlertType.WARNING);
//			alert.setHeaderText("Algo ha salido mal");
//			alert.setContentText("Fallo al iniciar el juego ");
//			alert.showAndWait();
//		}

	}

	public VBox getRoot() {
		return root;
	}

	public void setRoot(VBox root) {
		this.root = root;
	}

	public Button getJugarButton() {
		return jugarButton;
	}

	public void setJugarButton(Button jugarButton) {
		this.jugarButton = jugarButton;
	}

	public RadioButton getFacilRadio() {
		return facilRadio;
	}

	public void setFacilRadio(RadioButton facilRadio) {
		this.facilRadio = facilRadio;
	}

	public RadioButton getMedioRadio() {
		return medioRadio;
	}

	public void setMedioRadio(RadioButton medioRadio) {
		this.medioRadio = medioRadio;
	}

	public RadioButton getDificilRadio() {
		return dificilRadio;
	}

	public void setDificilRadio(RadioButton dificilRadio) {
		this.dificilRadio = dificilRadio;
	}
	

}
