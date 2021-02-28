package mains;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class PrincipalController implements Initializable {

	public PrincipalController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InicioView.fxml"));
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
