package Main;

import Helper.JDBC;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**This class creates an appointment management app.*/
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Print_Drawer.fxml"));
        stage.setTitle("");
        stage.setScene(new Scene(root, 800, 600));
        stage.setMaximized(true);
        stage.show();
    }
    /**This is the main method.
     This launches the program.
     @param args args*/
    public static void main(String[] args) {

//        JDBC.openConnection();
        launch(args);
//        JDBC.closeConnection();
    }
}