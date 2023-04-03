package application;
import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogIn {
	public LogIn() {
		
	}

	@FXML
	public Button button;
	@FXML
	private Label wrongLogIn;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;

	public void userLogIn(ActionEvent event) throws IOException {
		checkLogin();
	}
	private void checkLogin() throws IOException {
		Main m = new Main();
		if(username.getText().toString().equals("yjkim") && password.getText().toString().equals("1234")) {
			wrongLogIn.setText("Success!");
			m.changeScene("afterLogin.fxml");
		} else if(username.getText().isEmpty() && password.getText().isEmpty()) {
			wrongLogIn.setText("Please enter your data.");
		} else {
			wrongLogIn.setText("Wrong username or password!");
		}
	}
}
