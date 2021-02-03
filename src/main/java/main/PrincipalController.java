package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
//
//		if (facilRadio.isSelected()) {
//
//		} else if (medioRadio.isSelected()) {
//
//		} else if (dificilRadio.isSelected()) {
//
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
	

}
