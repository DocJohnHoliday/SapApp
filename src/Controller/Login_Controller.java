package Controller;

import DBAccess.DB_Users;
import Messages.Login_Warnings;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.util.Date;
import java.util.EventObject;
import java.util.Locale;
import java.util.ResourceBundle;

/**This class is used as a controller for the login page*/
public class Login_Controller implements Initializable {
public Button newUserButton;
public Button forgotButton;
        Stage stage;

public Button logIn;

public Label SigninLabel;
public Label UsernameLabel;
public Label PasswordLabel;
public Label LocationLabel;
public Label ZoneLabel;

public TextField Name;
public TextField Password;

/**The loginButton method compares user entered data to the data in the database.
 * The loginButton method checks for user credentials and logs login attempt to login_activity.txt.
 * @param actionEvent */
public void loginButton(ActionEvent actionEvent) throws IOException {

        String textName = Name.getText();
        String textPassword = Password.getText();
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        String filename = "login_activity.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));

        if (textName != null && textName.length() != 0 &&
        textPassword.length() != 0 && textPassword != null) {

        if (DB_Users.loginCheck(textName, textPassword)) {

        writer.append(("Successful Login attempt for " + textName + " at " + timestamp));
        writer.newLine();
        writer.flush();
        writer.close();

//                FXMLLoader loader = new FXMLLoader();
//                loader.setLocation(getClass().getResource("/View/Appointments.fxml"));
//                loader.load();
//
//                stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
//                Parent scene = loader.getRoot();
//                stage.setScene(new Scene(scene));
//                stage.show();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Which_Page.fxml"));
        loader.load();

        stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();

        } else {
        Login_Warnings.incorrectLogin();
        writer.append(("Failed Login attempt for " + textName + " at " + timestamp));
        writer.newLine();
        writer.flush();
        writer.close();
        }
        } else {
        Login_Warnings.nullLogin();
        }
        }
/**The initialize method checks for default language.
 * Lambda expression allows enter key to be pressed.
 * @param actionEvent Goes to next page. */
public void initialize(ActionEvent actionEvent) {

        logIn.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
        if (ev.getCode() == KeyCode.ENTER) {
        try {
        String textName = Name.getText();
        String textPassword = Password.getText();
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        String filename = "login_activity.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));

        if (textName != null && textName.length() != 0 &&
        textPassword.length() != 0 && textPassword != null) {

        if (DB_Users.loginCheck(textName, textPassword)) {

        writer.append(("Successful Login attempt for " + textName + " at " + timestamp));
        writer.newLine();
        writer.flush();
        writer.close();

//                            FXMLLoader loader = new FXMLLoader();
//                            loader.setLocation(getClass().getResource("/View/Appointments.fxml"));
//                            loader.load();
//
//                            stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
//                            Parent scene = loader.getRoot();
//                            stage.setScene(new Scene(scene));
//                            stage.show();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Weight_Check.fxml"));
        loader.load();

        stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();

        } else {
        Login_Warnings.incorrectLogin();
        writer.append(("Failed Login attempt for " + textName + " at " + timestamp));
        writer.newLine();
        writer.flush();
        writer.close();
        }
        } else {
        Login_Warnings.nullLogin();
        }
        } catch (IOException e) {
        e.printStackTrace();
        }
        }
        });

        }
/**The initialize method checks for default language.
 * If default language is set to french the login page and all error messages will be displayed in French.
 * @param url
 * @param resourceBundle*/
@Override
public void initialize(URL url, ResourceBundle resourceBundle) {

        //Locale.setDefault(Locale.FRENCH);

        ZoneId label = ZoneId.systemDefault();
        ZoneLabel.setText(label.toString());

        ResourceBundle rb = ResourceBundle.getBundle("languages/Nat", Locale.getDefault());

        if (Locale.getDefault().getLanguage().equals("fr")) {

        SigninLabel.setText(rb.getString("signin"));
        UsernameLabel.setText(rb.getString("username"));
        PasswordLabel.setText(rb.getString("password"));
        LocationLabel.setText(rb.getString("location"));
        logIn.setText(rb.getString("login"));

        }
        if (Locale.getDefault().getLanguage().equals("en")) {

        SigninLabel.setText(rb.getString("signin"));
        UsernameLabel.setText(rb.getString("username"));
        PasswordLabel.setText(rb.getString("password"));
        LocationLabel.setText(rb.getString("location"));
        logIn.setText(rb.getString("login"));

        }

        }

public void newUser(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/New_User.fxml"));
        loader.load();

        stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();
        }

public void forgot(ActionEvent actionEvent) {
        Login_Warnings.forgotWarning();
        }
        }
