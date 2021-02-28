package mains;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Muestra las ventanas
 * 
 * @author Hidden cards
 * 
 */
public class App extends Application {
	private PrincipalController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new PrincipalController();

		Scene scene = new Scene(controller.getRoot());

		primaryStage.setTitle("Hidden Cards");
		primaryStage.setScene(scene);
		primaryStage.show();

		controller.getJugarButton().setOnAction(e -> onjugarButton(e));

	}

	/**
	 * abre la ventana al pulsar un boton
	 * 
	 * @param e
	 */
	private void onjugarButton(ActionEvent e) {
		if (controller.getFacilRadio().isSelected()) {
			try {
				Stage primaryStage = new Stage();

				Alert alert = new Alert(Alert.AlertType.INFORMATION);

				Parent root = FXMLLoader.load(getClass().getResource("/fxml/MemoryMain.fxml"));
				primaryStage.setTitle("Memory");
				primaryStage.setScene(new Scene(root, 600, 490));
				primaryStage.setResizable(false);
				primaryStage.centerOnScreen();
				primaryStage.getIcons().add(new Image("/imagenes/icon.png"));
				primaryStage.setOnCloseRequest(e2 -> {
					Platform.exit();
					try {
						stop();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				});
				primaryStage.show();

			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else if (controller.getMedioRadio().isSelected()) {
			try {
				Stage primaryStage = new Stage();

				Alert alert = new Alert(Alert.AlertType.INFORMATION);

				Parent root = FXMLLoader.load(getClass().getResource("/fxml/MemoryMain2.fxml"));
				primaryStage.setTitle("Memory");
				primaryStage.setScene(new Scene(root, 600, 490));
				primaryStage.setResizable(false);
				primaryStage.centerOnScreen();
				primaryStage.getIcons().add(new Image("/imagenes/icon.png"));
				primaryStage.setOnCloseRequest(e2 -> {
					Platform.exit();
					try {
						stop();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				});
				primaryStage.show();

			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else if (controller.getDificilRadio().isSelected()) {
			try {
				Stage primaryStage = new Stage();

				Alert alert = new Alert(Alert.AlertType.INFORMATION);

				Parent root = FXMLLoader.load(getClass().getResource("/fxml/MemoryMain3.fxml"));
				primaryStage.setTitle("Memory");
				primaryStage.setScene(new Scene(root, 600, 490));
				primaryStage.setResizable(false);
				primaryStage.centerOnScreen();
				primaryStage.getIcons().add(new Image("/imagenes/icon.png"));
				primaryStage.setOnCloseRequest(e2 -> {
					Platform.exit();
					try {
						stop();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				});
				primaryStage.show();

			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setHeaderText("Algo ha salido mal");
			alert.setContentText("Fallo al iniciar el juego ");
			alert.showAndWait();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
