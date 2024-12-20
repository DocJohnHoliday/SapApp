package Messages;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
/**This class shows all warning messages for the Main_Form controller also known as customer controller.
 * All methods in this class use a lambda expression.
 * These lambda expression allow for condensed and more legible code. */
public class Main_Warnings {
    /**This method shows warning dialog for null fields in main form controller.
     * lambda expression show alert and allow button OK to confirm*/
    public static void fieldsNullWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Incomplete");
        alert.setContentText("All text fields must be filled");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**This method shows warning dialog for null fields in main form controller.
     * lambda expression show alert and allow button OK to confirm*/
    public static void nullUpdate() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Make Selection");
        alert.setContentText("You must select a customer to update");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**This method shows warning dialog for null fields in main form controller.
     * lambda expression show alert and allow button OK to confirm*/
    public static void countryWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Make Selection");
        alert.setContentText("You must select a country");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**This method shows warning dialog for null fields in main form controller.
     * lambda expression show alert and allow button OK to confirm*/
    public static void divisionWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Make Selection");
        alert.setContentText("You must select a division");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**This method shows warning dialog for null fields in main form controller.
     * lambda expression show alert and allow button OK to confirm*/
    public static void selectionDeleteWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Make Selection");
        alert.setContentText("You must select a customer to delete");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**This method shows information dialog for customer deleted in main form controller.
     * lambda expression show alert and allow button OK to confirm*/
    public static void customerDeleted(int unluckyCustomerID, String unluckyCustomerName) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("DELETED");
        alert.setContentText("Customer [" + unluckyCustomerID + "] " + unluckyCustomerName + " has been deleted.");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**This method shows confirmation for deleting customer in main form controller.
     * If-else statement in lambda expression allows for confirmation of deleting customer, or cancel customer termination. */

    public static void numberWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Number Format");
        alert.setContentText("Only Numbers accepted and Fields cannot be left null");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }

    public static void confirmation() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Part Created");
        alert.setContentText("A part has been created successfully");
        alert.showAndWait().ifPresent((btnType) -> {
            clearDialogOptionSelections();
        });
    }
    /**An empty method for dialog boxes. */
    private static void clearDialogOptionSelections() {
    }
}

