package Controller;

import Messages.Main_Warnings;
import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class PrintDrawerController implements Initializable {
    public TextField openingHeight;
    public TextField openingWidth;
    public TextField frameHeight;
    public TextField frameWidth;
    public TextField doorHeight;
    public TextField doorWidth;
    public TextField leftHeight;
    public TextField leftWidth;
    public TextField rightHeight;
    public TextField rightWidth;
    public ChoiceBox<String> hardwareUneven;
    public ChoiceBox<String> type;
    public ChoiceBox<String> hinging;
    public ChoiceBox<String> glass;
    public ChoiceBox<String> hardware;
    public TextField quantity;
    public ChoiceBox<String> bottomRail;
    public ChoiceBox<String> stileSize;
    public ChoiceBox<String> color;
    public ChoiceBox<String> secondHardware;
    public TextArea notes;
    public Canvas previewCanvas;
    public CheckBox push;
    public ChoiceBox<String> pull;
    public Canvas doorCanvas;
    public Canvas windowCanvas;
    public TextField midRail;
    public ComboBox hand;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        hand.getItems().add("Right");
        hand.getItems().add("Left");

        type.getItems().add("Custom Single RH");
        type.getItems().add("Custom Single LH");
        type.getItems().add("Custom Pair");
        type.setValue("Custom Single LH");

        hinging.getItems().add("No Hinging");
        hinging.getItems().add("Continuous Hinge");
        hinging.getItems().add("Pivots");
        hinging.getItems().add("Butt Hinge");
        hinging.setValue("Pivots");

        glass.getItems().add("No Glass");
        glass.getItems().add("3/16 Clear");
        glass.getItems().add("1/4 Clear");
        glass.getItems().add("3/16 Bronze");
        glass.getItems().add("1/4 Bronze");
        glass.getItems().add("3/16 Grey");
        glass.getItems().add("1/4 Grey");
        glass.getItems().add("IG");
        glass.getItems().add("Low E");
        glass.setValue("3/16 Clear");

        hardware.getItems().add("No Hardware");
        hardware.getItems().add("Cylinder");
        hardware.getItems().add("Deadbolt");
        hardware.getItems().add("RIM");
        hardware.getItems().add("CVR");
        hardware.getItems().add("Thumb-turn");
        hardware.getItems().add("Hook Bolt");
        hardware.getItems().add("Lever Latch");
        hardware.getItems().add("Electric Strike Surface Mount");
        hardware.getItems().add("Electric Strike Integrated");
        hardware.setValue("Deadbolt");

        secondHardware.getItems().add("No Hardware");
        secondHardware.getItems().add("Cylinder");
        secondHardware.getItems().add("Deadbolt");
        secondHardware.getItems().add("RIM");
        secondHardware.getItems().add("CVR");
        secondHardware.getItems().add("Thumb-turn");
        secondHardware.getItems().add("Hook Bolt");
        secondHardware.getItems().add("Lever Latch");
        secondHardware.getItems().add("Electric Strike Surface Mount");
        secondHardware.getItems().add("Electric Strike Integrated");
        secondHardware.setValue("Cylinder");

        bottomRail.getItems().add("4");
        bottomRail.getItems().add("7 1/2");
        bottomRail.getItems().add("10");
        bottomRail.setValue("4");

        stileSize.getItems().add("Narrow");
        stileSize.getItems().add("Medium");
        stileSize.getItems().add("Wide");
        stileSize.setValue("Narrow");

        color.getItems().add("Bronze");
        color.getItems().add("Clear");
        color.getItems().add("White");
        color.getItems().add("Black");
        color.setValue("Bronze");

        pull.getItems().add("8\" In-house");
        pull.getItems().add("8\" Chrome");
        pull.getItems().add("10\" Chrome");
        pull.setValue("8\" In-house");

        hardwareUneven.getItems().add("No Hardware");
        hardwareUneven.getItems().add("Cylinder");
        hardwareUneven.getItems().add("RIM");
        hardwareUneven.getItems().add("CVR");
        hardwareUneven.getItems().add("Thumb-turn");
        hardwareUneven.getItems().add("Hook Bolt");
        hardwareUneven.getItems().add("Lever Latch");
        hardwareUneven.getItems().add("Electric Strike Surface Mount");
        hardwareUneven.getItems().add("Electric Strike Integrated");

        quantity.setText("0");
        doorWidth.setText("31 9/16");
        doorHeight.setText("83 1/4");

    }

    public void submit(ActionEvent actionEvent) {

        String doorWidthString = doorWidth.getText();
        String doorHeightString = doorHeight.getText();

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        double doorWidthDouble = fractionToDecimalWidth(doorWidth.getText());
        double doorHeightDouble = fractionToDecimalHeight(doorHeight.getText());

        if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stile
            stiles.stilesGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles()
                    ;
            Rails rails = new Rails();
            //Rails
            rails.railsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble,doorWidthString, gc);
            //Stiles
            stiles.stilesGreaterThanOrEqual84RailsLessThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsGreaterThanOrEqual36StilesLessThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsLessThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsGreaterThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);

        }  else if (color.getValue().equals("Clear") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            //Rails
            rails.railsLessThan36ClearStileGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesGreaterThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
        } else {
            Main_Warnings.nothingWarning();
        }
        if(secondHardware.getValue().equals("Cylinder") && hand.getValue().equals("Left") && color.getValue().equals("Bronze")) {
            Hardware hw = new Hardware();
            Handles handles = new Handles();
            Pivots pivots = new Pivots();
            //Pull Bar Left Hand
            handles.leftHandPull( doorWidthDouble, doorHeightDouble, gc );
            //Push Bar LH
            handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Pivots
            pivots.leftHandPivots( doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.leftHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
        } else if (secondHardware.getValue().equals("Cylinder") && hand.getValue().equals("Right") && color.getValue().equals("Bronze")) {
            Hardware hw = new Hardware();
            Handles handles = new Handles();
            Pivots pivots = new Pivots();
            //Right Hand Pull
            handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Push
            handles.RightHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Pivots
            pivots.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.rightHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
        } else if (secondHardware.getValue().equals("Cylinder") && hand.getValue().equals("Left") && color.getValue().equals("Clear")) {
            Hardware hw = new Hardware();
            Handles handles = new Handles();
            Pivots pivots = new Pivots();
            //Pull Bar Left Hand
            handles.leftHandPull(doorWidthDouble, doorHeightDouble, gc);
            //Push Bar LH
            handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Pivots
            pivots.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.leftHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
        } else if (secondHardware.getValue().equals("Cylinder") && hand.getValue().equals("Right") && color.getValue().equals("Clear")) {
            Hardware hw = new Hardware();
            Handles handles = new Handles();
            Pivots pivots = new Pivots();
            //Right Hand Pull
            handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Push
            handles.RightHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Pivots
            pivots.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.rightHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
        }
    }

    public void doorWidthChange(ActionEvent actionEvent) {

    }

    public void mainMenu(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Print_Drawer.fxml"));
        loader.load();

        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();
    }

    public double fractionToDecimalWidth(String x) {
        String width = doorWidth.getText();

        try {
            String[] split = width.trim().split("\\s+");
            String fraction = split[1];
            String[] splitFraction = fraction.split("/");
            double y = Double.parseDouble(splitFraction[0]);
            double z = Double.parseDouble(splitFraction[1]);
            String whole = split[0];
            double wholeNum = Double.parseDouble(whole);

            return wholeNum + (y / z);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Double.parseDouble(width);
        }
    }

    public double fractionToDecimalHeight(String x) {
        String height = doorHeight.getText();

        try {
            String[] split = height.trim().split("\\s+");
            String fraction = split[1];
            String[] splitFraction = fraction.split("/");
            double y = Double.parseDouble(splitFraction[0]);
            double z = Double.parseDouble(splitFraction[1]);
            String whole = split[0];
            double wholeNum = Double.parseDouble(whole);

            return wholeNum + (y / z);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Double.parseDouble(height);
        }
    }


    public void clear(ActionEvent actionEvent) {

        GraphicsContext clearCanvas = previewCanvas.getGraphicsContext2D();
        clearCanvas.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
    }

    public void Zoom(ScrollEvent scrollEvent) {
    }

    public void print(ActionEvent actionEvent) throws PrinterException {

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        PrinterJob job = PrinterJob.getPrinterJob();

    }
}
