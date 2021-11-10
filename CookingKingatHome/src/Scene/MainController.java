package Scene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController {	
		@FXML
		private Button btn1;
		@FXML
		private Button btn2;
		@FXML
		private Button loginbtn;
		@FXML
		private TextField id;
		@FXML
		private TextField Password;
		@FXML
		private TextField phoneNumber;

		public void changeScene1(String url, Button btn) {
			try {
				Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene2.fxml"));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) btn1.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void changScene2() {
			try {
				Parent main = FXMLLoader.load(getClass().getResource("/Scene/JoinScene.fxml"));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) btn2.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void changScene3() {
			try {
				Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) loginbtn.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}