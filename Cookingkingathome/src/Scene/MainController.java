package Scene;




import javafx.collections.FXCollections;
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
	private Button joinbtn;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btn10;
	
	

	public void changeScene1() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/JoinScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn1.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void changeScene2() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changScene3() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/LoginScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) joinbtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}

}
	public void channgScene4() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/SearchScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn3.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void channgScene5() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainBlog.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn4.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void changScene6() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MyScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn5.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void channgScene7() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn6.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void channgScene8() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn7.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void channgScene9() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn8.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void channgScene10() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/HelpScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn9.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	public void channgScene11() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btn10.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}

	