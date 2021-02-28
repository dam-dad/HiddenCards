package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class facilAPP extends Application {
	
	private FacilController facil;

	@Override
	public void start(Stage primaryStage) throws Exception {
		facil = new FacilController();
		
		Scene scene = new Scene(facil.getRoot());
		
		primaryStage.setTitle("Hidden Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
