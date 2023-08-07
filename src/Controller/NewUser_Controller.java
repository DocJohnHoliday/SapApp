package Controller;

import DBAccess.DB_Users;
import Messages.Login_Warnings;
import Messages.Main_Warnings;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class NewUser_Controller {
    public TextField nameField;
    public TextField passwordField;
    public TextField confirmPasswordField;
    public Button requestButton;
    public Button cancelButton;

    public void request(ActionEvent actionEvent) {

        String requestName = nameField.getText();
        String requestPassword = passwordField.getText();
        String requestConfirm = confirmPasswordField.getText();

        if(requestName == null || requestName.length() == 0 || requestPassword == null || requestPassword.length() == 0 || requestConfirm == null || requestName.length() == 0) {
            Main_Warnings.fieldsNullWarning();
        }  else if (!requestPassword.equals(requestConfirm)) {
            Login_Warnings.noMatchWarning();
        } else {
            DB_Users.createUser(requestName, requestPassword);
            nameField.clear();
            passwordField.clear();
            confirmPasswordField.clear();
            Login_Warnings.userCreatedWarning();
        }
    }

    public void cancel(ActionEvent actionEvent) throws IOException {
        nameField.clear();
        passwordField.clear();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Login.fxml"));
        loader.load();

        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();
    }
}
