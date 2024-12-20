package Main;

import Helper.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**This class creates an appointment management app.*/
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Print_Drawer.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();
    }
    /**This is the main method.
     This launches the program.
     @param args args*/
    public static void main(String[] args) {

        /* Test for French */
        //Locale.setDefault(new Locale("fr"));

        JDBC.openConnection();

        launch(args);

        JDBC.closeConnection();
    }
}