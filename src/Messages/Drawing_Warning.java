package Messages;

import javafx.scene.control.Alert;

public class Drawing_Warning {

    public static void sfdNotEntered() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Incomplete");
        alert.setContentText("A job must have a SFD number. After entering number please press submit in the Job tab.");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }

    private static void clearDialogOptionSelections() {
    }
}
