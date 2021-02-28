package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {//fixme do an alert intro here
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Welcome to Memory!");
        alert.setHeaderText(null);
        alert.setContentText("When you start, choose the matching tiles until they've all been selected");

        alert.showAndWait();

        Parent root = FXMLLoader.load(getClass().getResource("/files/MemoryMain.fxml"));
        primaryStage.setTitle("Memory");
        primaryStage.setScene(new Scene(root, 600, 490));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
       // primaryStage.getIcons().add(new Image("/pictures/icon.png"));
        primaryStage.setOnCloseRequest(e -> {
            Platform.exit();
            try {
                stop();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
