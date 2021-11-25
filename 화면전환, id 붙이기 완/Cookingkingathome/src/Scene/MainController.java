package Scene;





import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController {
	@FXML
	private Button JoinBtn1;
	@FXML
	private Button LogBtn;
	@FXML
	private Button joinBtn;
	@FXML
	private Button LogBtn2;
	@FXML
	private Button SearchBtn;
	@FXML
	private Button BlogBtn;
	@FXML
	private Button Mypage;
	@FXML
	private Button MyScenebtn2;
	@FXML
	private Button SearchBtn2;
	@FXML
	private Button Blogbtn2;
	@FXML
	private Button Helpbtn;
	@FXML
	private Button Helpbtn2;
	@FXML
	private Button Logbtn3;
	@FXML
	private TextField JoinId;
	@FXML
	private PasswordField JoinPassword;
	@FXML
	private TextField JoinPhoneNumber;	
    //�α��� ȭ�� -> ȸ������ ȭ��
	public void JoinScene1() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/JoinScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) JoinBtn1.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�α���ȭ�� -> ���� ȭ��
	public void LogScene() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) LogBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//ȸ������ ȭ�� -> �α��� ȭ��
	public void joinScene() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/LoginScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) joinBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}

}
	//ȭ������ ȭ�� -> �α���ȭ��
	public void LogScene2() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/LoginScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) LogBtn2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}

}
	//����ȭ�� -> �˻�ȭ��
	public void SearchScene() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/SearchScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) SearchBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	//����ȭ�� => ��α� ȭ��
	public void BlogScene() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainBlog.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) BlogBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   //���� ȭ�� => ���������� ȭ��
	public void MyScene() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MyScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Mypage.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   //���������� => ����ȭ��
	public void MyScene2() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) MyScenebtn2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   //�˻�ȭ�� => ����ȭ��
	public void SearchScene2() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) SearchBtn2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   // ��α�ȭ�� => ����ȭ��
	public void BlogScene2() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Blogbtn2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   // ����ȭ�� => ���� ȭ��
	public void HelpScene() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/HelpScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Helpbtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   // ����ȭ�� => ����ȭ��
	public void HelpScene2() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/MainScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Helpbtn2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}   //����ȭ�� => �α���ȭ��
	public void LogScene3() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/Scene/LoginScene.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) Logbtn3.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}

	