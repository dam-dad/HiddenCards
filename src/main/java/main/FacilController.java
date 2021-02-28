package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class FacilController implements Initializable {
	
	public FacilController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/InicioView.fxml"));
		loader.setController(this);
		loader.load();
	}
    @FXML
    private VBox root;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	public VBox getRoot() {
		return root;
	}

	public void setRoot(VBox root) {
		this.root = root;
	}

}
