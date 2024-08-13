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

    public static void stringEmptyEntered() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Incomplete");
        alert.setContentText("You must enter a window size.");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }

    public static void singleOpeningNotEntered() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Incomplete");
        alert.setContentText("You must enter an opening size. Please select the appropriate measuring device. Rough Opening, Frame Opening, or Door Opening." +
                " If a side light is needed please clear the single door field and reenter the opening in the side light tab.");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }

    public static void pairOpeningNotEntered() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Incomplete");
        alert.setContentText("You must enter an opening size.");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }

    private static void clearDialogOptionSelections() {
    }
}
