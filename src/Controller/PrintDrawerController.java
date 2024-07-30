package Controller;

import DrawingComponents.*;
import MathFormulas.FractionsAndDecimals;
import Messages.Drawing_Warning;
import Messages.Main_Warnings;
import ZoomOperator.AnimatedZoomOperator;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.SnapshotParameters;

public class PrintDrawerController implements Initializable {
    public TextField openingHeight;
    public TextField openingWidth;
    public TextField frameHeight;
    public TextField frameWidth;
    public TextField doorHeight;
    public TextField doorWidth;
    public ChoiceBox<String> hinging;
    public ChoiceBox<String> glassType;
    public ChoiceBox<String> hardware;
    public TextField quantity;
    public ChoiceBox<String> bottomRail;
    public ChoiceBox<String> stileSize;
    public ChoiceBox<String> color;
    public ChoiceBox<String> secondHardware;
    public ChoiceBox<String> thirdHardware;
    public Canvas previewCanvas;
    public CheckBox push;
    public ChoiceBox<String> pull;
    public TextField midRail;
    public TextField firstName;
    public TextField lastName;
    public TextField numOfOpenings;
    public TextField sfdNum;
    public TextField priorityLevel;
    public TextField rightSLHeight;
    public TextField rightSLWidth;
    public TextField leftSLHeight;
    public TextField leftSLWidth;
    public ChoiceBox<String> rightSLQuestion;
    public ChoiceBox<String> leftSLQuestion;
    public ChoiceBox<String> sideLightGlass;
    public ChoiceBox<String> midRailQuestion;
    public TextField midRailDistance;
    public ChoiceBox<String> sideLightColor;
    public ChoiceBox<String> oneTwentyFiveQuestion;
    public ChoiceBox<String> hand;
    public TextField pairOpeningHeight;
    public TextField pairOpeningWidth;
    public TextField pairFrameHeight;
    public TextField pairFrameWidth;
    public TextField pairDoorHeight;
    public TextField pairWidth;
    public TextField pairMidRail;
    public ChoiceBox<String> operableSLQuestion;
    public ChoiceBox<String> pairHinging;
    public ChoiceBox<String> pairGlass;
    public ChoiceBox<String> pairHardware1;
    public TextField pairQuantity;
    public ChoiceBox<String> pairBottomRail;
    public ChoiceBox<String> pairStileSize;
    public ChoiceBox<String> pairColor;
    public ChoiceBox<String> pairHardware2;
    public CheckBox pairPush;
    public ChoiceBox<String> pairPullHandles;
    public TextField unevenPairLeftHeight;
    public TextField unevenPairLeftWidth;
    public TextField unevenPairRightHeight;
    public TextField unevenPairRightWidth;
    public ChoiceBox<String> unevenPairHardware;
    public ChoiceBox<String> unevenPairActiveQuestion;
    public ScrollPane scrollPane;

    Stiles stiles = new Stiles();
    Rails rails = new Rails();
    Jambs jambs = new Jambs();
    HeaderAndThreshold hAT = new HeaderAndThreshold();
    Glass glass = new Glass();
    Hardware hw = new Hardware();
    Handles handles = new Handles();
    Pivots pivots = new Pivots();
    PanicDevices panics = new PanicDevices();


    public void initialize(URL url, ResourceBundle resourceBundle) {

        hand.getItems().add("Right");
        hand.getItems().add("Left");
        hand.setValue("Right");

        hinging.getItems().add("No Hinging");
        hinging.getItems().add("Continuous Hinge");
        hinging.getItems().add("Pivots");
        hinging.getItems().add("Butt Hinge");
        hinging.setValue("Pivots");

        glassType.getItems().add("No Glass");
        glassType.getItems().add("3/16 Clear");
        glassType.getItems().add("1/4 Clear");
        glassType.getItems().add("3/16 Bronze");
        glassType.getItems().add("1/4 Bronze");
        glassType.getItems().add("3/16 Grey");
        glassType.getItems().add("1/4 Grey");
        glassType.getItems().add("IG");
        glassType.getItems().add("Low E");
        glassType.setValue("3/16 Clear");

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

        thirdHardware.getItems().add("No Hardware");
        thirdHardware.getItems().add("Cylinder");
        thirdHardware.getItems().add("Deadbolt");
        thirdHardware.getItems().add("RIM");
        thirdHardware.getItems().add("CVR");
        thirdHardware.getItems().add("Thumb-turn");
        thirdHardware.getItems().add("Hook Bolt");
        thirdHardware.getItems().add("Lever Latch");
        thirdHardware.getItems().add("Electric Strike Surface Mount");
        thirdHardware.getItems().add("Electric Strike Integrated");
        thirdHardware.setValue("Cylinder");

        bottomRail.getItems().add("4");
        bottomRail.getItems().add("7 1/2");
        bottomRail.getItems().add("10");

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

        quantity.setText("0");
        doorWidth.setText("31 9/16");
        doorHeight.setText("83 1/4");

    }

    public void submitSingle(ActionEvent actionEvent) {

        String doorWidthString = doorWidth.getText();
        String doorHeightString = doorHeight.getText();

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        if (sfdNum.getLength() != 0) {
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
            gc.setFill(Color.BLACK);
            gc.fillText("SFD-" + sfdNumber, (previewCanvas.getWidth() / 2) - 100, 150);
            gc.setFont(new Font(12));
        } else {
            Drawing_Warning.sfdNotEntered();
        }

        FractionsAndDecimals fTD = new FractionsAndDecimals();

        double doorWidthDouble = fTD.fractionToDecimal(doorWidth.getText());
        double doorHeightDouble = fTD.fractionToDecimal(doorHeight.getText());

        double frameWidthDouble = fTD.fractionToDecimal(doorWidth.getText()) + 4.4375;
        double frameHeightDouble = fTD.fractionToDecimal(doorHeight.getText()) + 2.5;

        String frameWidthString = fTD.convertDecimalToFraction(frameWidthDouble);
        String frameHeightString = fTD.convertDecimalToFraction(frameHeightDouble);

        if (color.getValue().equals("Bronze") &&
                doorWidthDouble >= 36 &&             //Width >= 36
                doorHeightDouble >= 84 &&            //Height >= 84
                stileSize.getValue().equals("Narrow")
        ) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stile
            stiles.stilesGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Bronze") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesLessThan84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Bronze") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble >= 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesGreaterThanOrEqual84RailsLessThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84RailsLessThan36(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36StilesGreaterThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Bronze") &&
                doorWidthDouble >= 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsGreaterThanOrEqual36StilesLessThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsGreaterThanOrEqual36StilesLessThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84RailGreaterThan36(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36StilesLessThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesLessThan84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble >= 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble >= 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsLessThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesLessThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThanOrEqual84Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThanOrEqual36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble >= 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsGreaterThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsGreaterThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84RailGreaterThan36Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble >= 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsLessThan36ClearStileGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsLessThan36ClearStileGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesGreaterThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36ClearStileGreaterThanOrEqual84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else {
            Main_Warnings.nothingWarning();
        }
        if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Left") &&
                color.getValue().equals("Bronze")) {
            //Left Hand Push
            if(thirdHardware.getValue().equals("RIM")) {
                panics.rimLeftHandPush(doorWidthDouble, doorHeightDouble, gc);
                panics.rimLeftHandPull(doorHeightDouble, gc);
            } else {
                handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
                handles.leftHandPull(doorHeightDouble, gc);
                //Left Hand Cylinder
                hw.leftHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
            }
            //Left Hand Pivots
            pivots.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);

        } else if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Right") &&
                color.getValue().equals("Bronze")) {
            //Right Hand Pull
            //Right Hand Push
            if(thirdHardware.getValue().equals("RIM")) {
                panics.rimRightHandPush(doorWidthDouble, doorHeightDouble, gc);
                panics.rimRightHandPull(doorWidthDouble, doorHeightDouble, gc);
            } else {
                handles.rightHandPush(doorWidthDouble, doorHeightDouble, gc);
                handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
                //Left Hand Cylinder
                hw.rightHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
            }
            //Right Hand Pivots
            pivots.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);

        } else if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Left") &&
                color.getValue().equals("Clear")) {
            if(thirdHardware.getValue().equals("RIM")) {
                panics.rimLeftHandPush(doorWidthDouble, doorHeightDouble, gc);
                panics.rimLeftHandPull(doorHeightDouble, gc);
            } else {
                handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
                handles.leftHandPull(doorHeightDouble, gc);
                //Left Hand Cylinder
                hw.leftHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
            }
            //Left Hand Pivots
            pivots.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);

        } else if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Right") &&
                color.getValue().equals("Clear")) {
            if(thirdHardware.getValue().equals("RIM")) {
                panics.rimRightHandPush(doorWidthDouble, doorHeightDouble, gc);
                panics.rimRightHandPull(doorWidthDouble, doorHeightDouble, gc);
            } else {
                handles.rightHandPush(doorWidthDouble, doorHeightDouble, gc);
                handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);

                //Left Hand Cylinder
                hw.rightHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
            }
            //Right Hand Pivots
            pivots.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
        }
    }

    public void doorWidthChange(ActionEvent actionEvent) {

    }

    public void Zoom(ScrollEvent scrollEvent) {

        AnimatedZoomOperator zoomOperator = new AnimatedZoomOperator();
        double zoomFactor = 1.5;
        if (scrollEvent.getDeltaY() <= 0) {
            // zoom out
            zoomFactor = 1 / zoomFactor;
        }
        zoomOperator.zoom(previewCanvas, zoomFactor, scrollEvent.getSceneX(), scrollEvent.getSceneY());
    }

    public void clearJob(ActionEvent actionEvent) {
    }

    public void submitJob(ActionEvent actionEvent) {
        if (sfdNum.getLength() != 0) {
            GraphicsContext gc = previewCanvas.getGraphicsContext2D();
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
            gc.setFill(Color.BLACK);
            gc.fillText("SFD-" + sfdNumber, (previewCanvas.getWidth() / 2) - 100, 150);
            gc.setFont(new Font(12));
        } else {
            Drawing_Warning.sfdNotEntered();
        }
    }

    public void clearSingle(ActionEvent actionEvent) {
    }

    public void clearPair(ActionEvent actionEvent) {
    }

    public void submitPair(ActionEvent actionEvent) {
        String doorWidthString = doorWidth.getText();
        String doorHeightString = doorHeight.getText();

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        if (sfdNum.getLength() != 0) {
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
            gc.setFill(Color.BLACK);
            gc.fillText("SFD-" + sfdNumber, (previewCanvas.getWidth() / 2) - 100, 150);
            gc.setFont(new Font(12));
        } else {
            Drawing_Warning.sfdNotEntered();
        }

        FractionsAndDecimals fTD = new FractionsAndDecimals();

        double doorWidthDouble = fTD.fractionToDecimal(doorWidth.getText());
        double doorHeightDouble = fTD.fractionToDecimal(doorHeight.getText());

        double frameWidthDouble = fTD.fractionToDecimal(doorWidth.getText()) + 4.4375;
        double frameHeightDouble = fTD.fractionToDecimal(doorHeight.getText()) + 2.5;

        String frameWidthString = fTD.convertDecimalToFraction(frameWidthDouble);
        String frameHeightString = fTD.convertDecimalToFraction(frameHeightDouble);

        //Width > 36 and height >= 84
        if (color.getValue().equals("Bronze") &&
                doorWidthDouble >= 36 &&
                doorHeightDouble >= 84 &&
                stileSize.getValue().equals("Narrow")
        ) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stile
            stiles.stilesGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

            //Width less than 36 and height less than 84
        } else if (color.getValue().equals("Bronze") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails and Glass
            if (bottomRail.getValue().equals("4")) {
                rails.railsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);
            }
            if (bottomRail.getValue().equals("10")) {
                rails.tenRailsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
            }
            //Stiles
            stiles.stilesLessThan84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

            //Width less than 36 and height greater or equal to 84
        } else if (color.getValue().equals("Bronze") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble >= 84) {
            //Rails
            rails.railsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesGreaterThanOrEqual84RailsLessThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84RailsLessThan36(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36StilesGreaterThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
            //Glass
            glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);

            //Width greater or equal 36 and height less than 84
        } else if (color.getValue().equals("Bronze") &&
                doorWidthDouble >= 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails
            rails.railsGreaterThanOrEqual36StilesLessThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84RailGreaterThan36(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36StilesLessThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
            //Glass
            glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);

            //Width less than 36 and height less than 84
        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails
            rails.railsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
            //Glass
            glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);

        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble >= 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble >= 84) {
            //Rails
            rails.railsLessThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThanOrEqual84Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThanOrEqual36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
            //Glass
            glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);

        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble >= 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble < 84) {
            //Rails
            rails.railsGreaterThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84RailGreaterThan36Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
            //Glass
            glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);

        } else if (color.getValue().equals("Clear") &&
                doorWidthDouble < 36 &&
                stileSize.getValue().equals("Narrow") &&
                doorHeightDouble >= 84) {
            //Rails
            rails.railsLessThan36ClearStileGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesGreaterThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84Clear(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36ClearStileGreaterThanOrEqual84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
            //Glass
            glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, gc);

        } else {
            Main_Warnings.nothingWarning();
        }
        if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Left") &&
                color.getValue().equals("Bronze")) {
            //Pull Bar Left Hand
            handles.leftHandPull(doorHeightDouble, gc);
            //Push Bar LH
            handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Pivots
            pivots.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.leftHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
        } else if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Right") &&
                color.getValue().equals("Bronze")) {
            //Right Hand Pull
            handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Push
            handles.rightHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Pivots
            pivots.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.rightHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
        } else if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Left") &&
                color.getValue().equals("Clear")) {
            //Pull Bar Left Hand
            handles.leftHandPull(doorHeightDouble, gc);
            //Push Bar LH
            handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Pivots
            pivots.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.leftHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
        } else if (secondHardware.getValue().equals("Cylinder") &&
                hand.getValue().equals("Right") &&
                color.getValue().equals("Clear")) {
            //Right Hand Pull
            handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Push
            handles.rightHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Right Hand Pivots
            pivots.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Cylinder
            hw.rightHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
        }
    }

    public void clearSideLight(ActionEvent actionEvent) {
    }

    public void submitSideLight(ActionEvent actionEvent) {
    }

    public void clearWindows(ActionEvent actionEvent) {
    }

    public void submitWindows(ActionEvent actionEvent) {
    }

    public void clearSliders(ActionEvent actionEvent) {
    }

    public void submitSliders(ActionEvent actionEvent) {
    }

    public void savePDF(ActionEvent actionEvent) {

        String SFD = sfdNum.getText();
        WritableImage nodeshot = previewCanvas.snapshot(new SnapshotParameters(),
                null);
        File file = new File(SFD + ".png");

        try {
            ImageIO.write(SwingFXUtils.fromFXImage(nodeshot, null), "png", file);
        } catch (IOException e) {

        }
    }
}