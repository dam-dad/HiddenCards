package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application  {

	private PrincipalController controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new PrincipalController();
		
		Scene scene = new Scene(controller.getRoot());
		
		primaryStage.setTitle("Hidden Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
