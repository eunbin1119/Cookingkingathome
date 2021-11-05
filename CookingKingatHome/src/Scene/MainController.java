package Scene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	// 화면 전환 메소드
		public void changScene(String url, Button btn) {
			try {
				Parent main = FXMLLoader.load(getClass().getResource(url));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) btn.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 시작 => 메인2
		@FXML
		private Button Main2But;

		public void MAin2Scene() {
			changScene("/Scene/MainScene2.fxml", Main2But);
		}
}