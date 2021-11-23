package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {


@Override
public void start(Stage primaryStage) {
	try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Scene/LoginScene.fxml"));
		AnchorPane root = (AnchorPane)loader.load();
		Scene scene = new Scene(root,600,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("CookingkingatHome" + "");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	launch(args);
}
}