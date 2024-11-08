package Controller;

import DrawingComponents.*;
import MathFormulas.FractionsAndDecimals;
import Messages.Drawing_Warning;
import ZoomOperator.AnimatedZoomOperator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javax.imageio.ImageIO;
import java.io.File;
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
    public ChoiceBox<String> hinging;
    public ChoiceBox<String> glassType;
    public ChoiceBox<String> hardware;
    public TextField quantity;
    public ChoiceBox<String> bottomRail;
    public ChoiceBox<String> stileSize;
    public ChoiceBox<String> color;
    public ChoiceBox<String> secondHardware;
    public Canvas previewCanvas;
    public CheckBox push;
    public ChoiceBox<String> pull;
    public TextField midRail;
    public TextField firstName;
    public TextField lastName;
    public TextField numOfOpenings;
    public TextField sfdNum;
    public TextField priorityLevel;
    public ChoiceBox<String> sideLightColor;
    public ChoiceBox<String> hand;
    public TextField pairOpeningHeight;
    public TextField pairOpeningWidth;
    public TextField pairFrameHeight;
    public TextField pairDoorHeight;
    public TextField pairWidth;
    public TextField pairMidRail;
    public ChoiceBox<String> pairHinging;
    public ChoiceBox<String> pairGlassType;
    public ChoiceBox<String> pairHardware1;
    public TextField pairQuantity;
    public ChoiceBox<String> pairBottomRail;
    public ChoiceBox<String> pairStileSize;
    public ChoiceBox<String> pairColor;
    public ChoiceBox<String> pairHardware2;
    public CheckBox pairPush;
    public ScrollPane scrollPane;
    public ChoiceBox<String> windowQuantity;
    public ChoiceBox<String> windowGlass;
    public ChoiceBox<String> windowPanelNum;
    public ChoiceBox<String> windowColor;
    public TextField windowMidRail;
    public TextField windowWidth;
    public TextField windowHeight;
    public TextField windowRoughWidth;
    public TextField windowRoughHeight;
    public ChoiceBox<String> singleSelection;
    public TextField singleHeight;
    public TextField singleWidth;
    public ChoiceBox<String> panicDevices;
    public ChoiceBox<String> singleSideLightQuestion;
    public ChoiceBox<String> pairPanicDevice;
    public ChoiceBox<String> pairPull;
    public ChoiceBox<String> pairHand;
    public ChoiceBox<String> pairSideLightQuestion;
    public TextField pairHeight;
    public ChoiceBox<String> pairSelection;
    public TextField pairDoorWidth;
    public TextField pairFrameWidth;
    public TextField sideLightRoughHeight;
    public TextField sideLightRoughWidth;
    public TextField sideLightHeight;
    public TextField sideLightWidth;
    public ChoiceBox<Integer> numOfPanelsSideLight;
    public ChoiceBox<String> sideLightGlassType;
    public ChoiceBox<Integer> sideLightQuantity;
    public ChoiceBox<Integer> leftOfDoorSideLight;
    public ChoiceBox<Integer> rightOfDoorSideLight;
    public TextField sideLightFrameHeight;
    public TextField sideLightFrameWidth;
    public ChoiceBox<String> sideLightSelection;
    public ChoiceBox<String> singleTransomQuestion;
    public ChoiceBox<String> pairTransomQuestion;
    public ChoiceBox<String> pairOrSingleQuestion;
    public TextArea noteField;
    public ChoiceBox<String> windowDimensionSelection;
    public TextArea pairNoteField;
    public ChoiceBox<Integer> hingingNum;

    Stiles stiles = new Stiles();
    Rails rails = new Rails();
    Jambs jambs = new Jambs();
    HeaderAndThreshold hAT = new HeaderAndThreshold();
    Glass glass = new Glass();
    Hardware hw = new Hardware();
    Handles handles = new Handles();
    HingeType hingeType = new HingeType();
    Windows windows = new Windows();
    SideLightsRight sideLightRight = new SideLightsRight();
    SideLightLeft sideLightLeft = new SideLightLeft();
    Transoms transoms = new Transoms();


    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Side Light
        pairOrSingleQuestion.getItems().add("Pair");
        pairOrSingleQuestion.getItems().add("Single");
        pairOrSingleQuestion.setValue("Single");

        //Single
        singleHeight.setText("86");
        singleWidth.setText("40");

        singleSelection.getItems().add("Rough Opening");
        singleSelection.getItems().add("Frame Opening");
        singleSelection.getItems().add("Door Opening");
        singleSelection.setValue("Rough Opening");

        singleSideLightQuestion.getItems().add("Yes");
        singleSideLightQuestion.getItems().add("No");
        singleSideLightQuestion.setValue("No");

        singleTransomQuestion.getItems().add("Yes");
        singleTransomQuestion.getItems().add("No");
        singleTransomQuestion.setValue("No");

        hand.getItems().add("Right");
        hand.getItems().add("Left");
        hand.setValue("Right");

        hinging.getItems().add("No Hinging");
        hinging.getItems().add("Continuous Hinge");
        hinging.getItems().add("Pivots");
        hinging.getItems().add("Butt Hinge");
        hinging.setValue("Pivots");

        glassType.getItems().add("No Glass");
        glassType.getItems().add("3/16 Clr");
        glassType.getItems().add("1/4 Clr");
        glassType.getItems().add("3/16 Tint");
        glassType.getItems().add("1/4 Tint");
        glassType.getItems().add("IG");
        glassType.getItems().add("Tinted IG");
        glassType.getItems().add("Pattern 62");
        glassType.getItems().add("Ribbed");
        glassType.getItems().add("Low E");
        glassType.getItems().add("Low E IG");
        glassType.setValue("3/16 Clr");

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
        hardware.getItems().add("Special Hardware");
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

        panicDevices.getItems().add("No Panic");
        panicDevices.getItems().add("RIM");
        panicDevices.getItems().add("CVR");
        panicDevices.setValue("No Panic");

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
        pull.getItems().add("12\" Chrome");
        pull.setValue("8\" In-house");

        quantity.setText("1");

        /////Windows
        windowColor.getItems().add("Bronze");
        windowColor.getItems().add("Clear");
        windowColor.getItems().add("PC White");
        windowColor.getItems().add("PC Black");
        windowColor.setValue("Bronze");

        for (int i = 1; i <= 30; i++) {
            windowQuantity.getItems().add(String.valueOf(i));
        }
        windowQuantity.setValue("1");
        for (int i = 1; i <= 10; i++) {
            windowPanelNum.getItems().add(String.valueOf(i));
        }
        windowPanelNum.setValue("1");

        windowGlass.getItems().add("No Glass");
        windowGlass.getItems().add("3/16 Clr");
        windowGlass.getItems().add("1/4 Clr");
        windowGlass.getItems().add("3/16 Tint");
        windowGlass.getItems().add("1/4 Tint");
        windowGlass.getItems().add("IG");
        windowGlass.getItems().add("Tinted IG");
        windowGlass.getItems().add("Pattern 62");
        windowGlass.getItems().add("Ribbed");
        windowGlass.getItems().add("Low E");
        windowGlass.setValue("3/16 Clr");

        windowDimensionSelection.getItems().add("R/O");
        windowDimensionSelection.getItems().add("F/O");
        windowDimensionSelection.setValue("R/O");

        //Pair
        pairSelection.getItems().add("Rough Opening");
        pairSelection.getItems().add("Frame Opening");
        pairSelection.getItems().add("Door Opening");
        pairSelection.setValue("Rough Opening");

        pairSideLightQuestion.getItems().add("Yes");
        pairSideLightQuestion.getItems().add("No");
        pairSideLightQuestion.setValue("No");

        pairTransomQuestion.getItems().add("Yes");
        pairTransomQuestion.getItems().add("No");
        pairTransomQuestion.setValue("No");

        pairHand.getItems().add("Right");
        pairHand.getItems().add("Left");
        pairHand.setValue("Right");

        pairHinging.getItems().add("No Hinging");
        pairHinging.getItems().add("Continuous Hinge");
        pairHinging.getItems().add("Pivots");
        pairHinging.getItems().add("Butt Hinge");
        pairHinging.setValue("Pivots");

        pairGlassType.getItems().add("No Glass");
        pairGlassType.getItems().add("3/16 Clr");
        pairGlassType.getItems().add("1/4 Clr");
        pairGlassType.getItems().add("3/16 Tint");
        pairGlassType.getItems().add("1/4 Tint");
        pairGlassType.getItems().add("IG");
        pairGlassType.getItems().add("Tinted IG");
        pairGlassType.getItems().add("Pattern 62");
        pairGlassType.getItems().add("Ribbed");
        pairGlassType.getItems().add("Low E");
        pairGlassType.setValue("3/16 Clr");

        pairHardware1.getItems().add("No Hardware");
        pairHardware1.getItems().add("Cylinder");
        pairHardware1.getItems().add("Deadbolt");
        pairHardware1.getItems().add("RIM");
        pairHardware1.getItems().add("CVR");
        pairHardware1.getItems().add("Thumb-turn");
        pairHardware1.getItems().add("Hook Bolt");
        pairHardware1.getItems().add("Lever Latch");
        pairHardware1.getItems().add("Electric Strike Surface Mount");
        pairHardware1.getItems().add("Electric Strike Integrated");
        pairHardware1.setValue("Deadbolt");

        pairHardware2.getItems().add("No Hardware");
        pairHardware2.getItems().add("Cylinder");
        pairHardware2.getItems().add("Deadbolt");
        pairHardware2.getItems().add("RIM");
        pairHardware2.getItems().add("CVR");
        pairHardware2.getItems().add("Thumb-turn");
        pairHardware2.getItems().add("Hook Bolt");
        pairHardware2.getItems().add("Lever Latch");
        pairHardware2.getItems().add("Electric Strike Surface Mount");
        pairHardware2.getItems().add("Electric Strike Integrated");
        pairHardware2.setValue("Cylinder");

        pairPanicDevice.getItems().add("No Panic");
        pairPanicDevice.getItems().add("RIM");
        pairPanicDevice.getItems().add("CVR");
        pairPanicDevice.setValue("No Panic");

        pairBottomRail.getItems().add("4");
        pairBottomRail.getItems().add("7 1/2");
        pairBottomRail.getItems().add("10");
        pairBottomRail.setValue("4");

        pairStileSize.getItems().add("Narrow");
        pairStileSize.getItems().add("Medium");
        pairStileSize.getItems().add("Wide");
        pairStileSize.setValue("Narrow");

        pairColor.getItems().add("Bronze");
        pairColor.getItems().add("Clear");
        pairColor.getItems().add("White");
        pairColor.getItems().add("Black");
        pairColor.setValue("Bronze");

        pairPull.getItems().add("8\" In-house");
        pairPull.getItems().add("8\" Chrome");
        pairPull.getItems().add("12\" Chrome");
        pairPull.setValue("8\" In-house");

        pairQuantity.setText("1");

        sideLightGlassType.getItems().add("No Glass");
        sideLightGlassType.getItems().add("3/16 Clr");
        sideLightGlassType.getItems().add("1/4 Clr");
        sideLightGlassType.getItems().add("3/16 Tint");
        sideLightGlassType.getItems().add("1/4 Tint");
        sideLightGlassType.getItems().add("IG");
        sideLightGlassType.getItems().add("Tinted IG");
        sideLightGlassType.getItems().add("Pattern 62");
        sideLightGlassType.getItems().add("Ribbed");
        sideLightGlassType.getItems().add("Low E");
        sideLightGlassType.setValue("3/16 Clr");

        sideLightColor.getItems().add("Bronze");
        sideLightColor.getItems().add("Clear");
        sideLightColor.getItems().add("Black");
        sideLightColor.getItems().add("White");
        sideLightColor.setValue("Bronze");

        for (int i = 1; i <= 30; i++) {
            sideLightQuantity.getItems().add(i);
        }
        sideLightQuantity.setValue(1);
        for (int i = 1; i <= 10; i++) {
            numOfPanelsSideLight.getItems().add(i);
        }
        numOfPanelsSideLight.setValue(1);

        for (int i = 0; i <= 10; i++) {
            rightOfDoorSideLight.getItems().add(i);
        }
        rightOfDoorSideLight.setValue(0);
        for (int i = 0; i <= 10; i++) {
            leftOfDoorSideLight.getItems().add(i);
        }
        leftOfDoorSideLight.setValue(0);

        sideLightSelection.getItems().add("Rough Opening");
        sideLightSelection.getItems().add("Frame Opening");
        sideLightSelection.setValue("Rough Opening");
    }

    public void clearJob(ActionEvent actionEvent) {
    }

    public void submitJob(ActionEvent actionEvent) {
        if (sfdNum.getLength() != 0) {
            GraphicsContext gc = previewCanvas.getGraphicsContext2D();
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
            gc.setFill(Color.BLACK);
            gc.fillText("SFD-" + sfdNumber, (previewCanvas.getWidth() / 2) - 150, 150);
            gc.setFont(new Font(12));
        } else {
            Drawing_Warning.sfdNotEntered();
        }
    }

    public void clearPair(ActionEvent actionEvent) {
    }

    public void submitPair(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        FractionsAndDecimals fTD = new FractionsAndDecimals();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
        pairDoorWidth.clear();
        pairDoorHeight.clear();
        pairFrameWidth.clear();
        pairFrameHeight.clear();
        pairOpeningWidth.clear();
        pairOpeningHeight.clear();

        if (sfdNum.getLength() != 0) {
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
            gc.setFill(Color.BLACK);
            gc.fillText("SFD-" + sfdNumber, (previewCanvas.getWidth() / 2) - 100, 150);
            gc.setFont(new Font(12));
        } else {
//            Drawing_Warning.sfdNotEntered();
        }

        try {
            String openingType = pairSelection.getValue();
            double pairWidthDouble = fTD.fractionToDecimal(pairWidth.getText());
            double pairHeightDouble = fTD.fractionToDecimal(pairHeight.getText());

            String pairDoorWidthString = pairWidth.getText();
            String pairDoorHeightString = pairHeight.getText();

            String pairFrameWidthString = pairWidth.getText();
            String pairFrameHeightString = pairHeight.getText();

            String pairRoughWidthString = pairOpeningWidth.getText();
            String pairRoughHeightString = pairOpeningHeight.getText();

            double pairDoorWidthDouble = fTD.fractionToDecimal(pairWidth.getText());
            double pairDoorHeightDouble = fTD.fractionToDecimal(pairHeight.getText());

            double pairFrameWidthDouble = fTD.fractionToDecimal(pairWidth.getText());
            double pairFrameHeightDouble = fTD.fractionToDecimal(pairHeight.getText());

            double pairRoughWidthDouble = fTD.fractionToDecimal(pairWidth.getText());
            double pairRoughHeightDouble = fTD.fractionToDecimal(pairHeight.getText());

            int numOfRightSL = rightOfDoorSideLight.getValue();
            int numOfLeftSL = leftOfDoorSideLight.getValue();

            boolean yesTransom;
            yesTransom = pairTransomQuestion.getValue().equals("Yes");

            boolean yesSL;
            yesSL = pairSideLightQuestion.getValue().equals("Yes");

            String transomHeightString = null;
            double transomHeightDouble = 0.0;

            String transomWidthString = null;
            double transomWidthDouble = 0.0;

            String pairHinge = pairHinging.getValue();


            switch (openingType) {
                case "Rough Opening":
                    double pairWidthFormula = (pairWidthDouble - 12.6875);
                    pairDoorWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthFormula / 2));

                    if (pairHinge.equals("Pivots") || pairHinge.equals("Butt Hinge") || pairHinge.equals("No Hinging")) {
                        pairDoorWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 44.4375));
                    } else {
                        pairDoorWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 44.6875));
                    }
                    if (!yesTransom) {
                        pairDoorHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble - 2.75));
                        pairDoorWidthString = fTD.convertDecimalToFraction(pairDoorWidthDouble);
                        pairDoorHeightString = fTD.convertDecimalToFraction(pairDoorHeightDouble);
                        pairDoorWidth.setText(pairDoorWidthString);
                        pairDoorHeight.setText(pairDoorHeightString);

                        pairFrameWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 4));
                        pairFrameHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble - 0.25));
                    } else {
                        pairDoorHeightDouble = fTD.fractionToDecimal(String.valueOf(83.25));
                        pairDoorWidthString = fTD.convertDecimalToFraction(pairDoorWidthDouble);
                        pairDoorHeightString = fTD.convertDecimalToFraction(pairDoorHeightDouble);
                        pairDoorWidth.setText(pairDoorWidthString);
                        pairDoorHeight.setText(pairDoorHeightString);

                        pairFrameWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 4));
                        pairFrameHeightDouble = fTD.fractionToDecimal(String.valueOf(85.75));

                        transomHeightDouble = pairRoughHeightDouble - 88.625;//0.25 R/O + 85.75 Frame + 0.125 H-Mullion + 2.5 125 top and bottom
                        transomHeightString = fTD.convertDecimalToFraction(transomHeightDouble);

                        transomWidthDouble = pairRoughWidthDouble - 0.50;
                        transomWidthString = fTD.convertDecimalToFraction(transomWidthDouble);
                    }
                    pairFrameWidthString = fTD.convertDecimalToFraction(pairFrameWidthDouble);
                    pairFrameHeightString = fTD.convertDecimalToFraction(pairFrameHeightDouble);
                    pairFrameWidth.setText(pairFrameWidthString);
                    pairFrameHeight.setText(pairFrameHeightString);
                    break;
                case "Frame Opening":
                    pairDoorWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 7.9375));
                    pairDoorHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble - 2.5));
                    pairDoorWidthString = fTD.convertDecimalToFraction(pairDoorWidthDouble);
                    pairDoorHeightString = fTD.convertDecimalToFraction(pairDoorHeightDouble);
                    pairDoorWidth.setText(pairDoorWidthString);
                    pairDoorHeight.setText(pairDoorHeightString);

                    pairFrameWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 3.5));
                    pairFrameHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble));
                    pairFrameWidthString = fTD.convertDecimalToFraction(pairWidthDouble);
                    pairFrameHeightString = fTD.convertDecimalToFraction(pairHeightDouble);
                    pairFrameWidth.setText(pairFrameWidthString);
                    pairFrameHeight.setText(pairFrameHeightString);

                    pairRoughWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble + 0.5));
                    pairRoughHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble + 0.25));
                    pairRoughWidthString = fTD.convertDecimalToFraction(pairRoughWidthDouble);
                    pairRoughHeightString = fTD.convertDecimalToFraction(pairRoughHeightDouble);
                    pairOpeningWidth.setText(pairRoughWidthString);
                    pairOpeningHeight.setText(pairRoughHeightString);
                    break;
                case "Door Opening":
                    pairFrameWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble));
                    pairFrameHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble + 1.75));
                    pairFrameWidthString = fTD.convertDecimalToFraction(pairFrameWidthDouble);
                    pairFrameHeightString = fTD.convertDecimalToFraction(pairFrameHeightDouble);
                    pairFrameWidth.setText(pairFrameWidthString);
                    pairFrameHeight.setText(pairFrameHeightString);

                    pairRoughWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble + 4));
                    pairRoughHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble + 2));
                    pairRoughWidthString = fTD.convertDecimalToFraction(pairRoughWidthDouble);
                    pairRoughHeightString = fTD.convertDecimalToFraction(pairRoughHeightDouble);
                    pairOpeningWidth.setText(pairRoughWidthString);
                    pairOpeningHeight.setText(pairRoughHeightString);

                    pairDoorWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 4.4375));
                    pairDoorHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble - 0.75));
                    pairDoorWidthString = fTD.convertDecimalToFraction(pairDoorWidthDouble);
                    pairDoorHeightString = fTD.convertDecimalToFraction(pairDoorHeightDouble);
                    pairDoorWidth.setText(pairDoorWidthString);
                    pairDoorHeight.setText(pairDoorHeightString);
                    break;
                default:
                    Drawing_Warning.pairOpeningNotEntered();
                    break;
            }

            String stile = pairStileSize.getValue();
            String type = pairGlassType.getValue();
            String doorColor = pairColor.getValue();
            String doorHand = pairHand.getValue();
            String doorQuantity = pairQuantity.getText();
            int qty = Integer.parseInt(doorQuantity);
            String hardware1 = pairHardware1.getValue();
            String hardware2 = pairHardware2.getValue();
            String panicHardware = pairPanicDevice.getValue();
            String pullHandle = pairPull.getValue();
            String bottomRailSize = pairBottomRail.getValue();
            String hingingPair = pairHinging.getValue();

            boolean hasPanic = panicHardware.equals("CVR");
            boolean hasPush = pairPush.isSelected();

            double slWidthDouble = 0;

            switch (stile) {
                case "Narrow":
                    stiles.narrowPairStile(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, doorColor, gc);
                    rails.narrowPairRails(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, doorColor, bottomRailSize, type, qty, gc);
                    handles.narrowSingleHandles(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, pullHandle, hasPanic, hasPush, gc);
                    handles.narrowPairHandles(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, pullHandle, hasPanic, hasPush, gc);
                    hw.narrowPairCylinders(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, hasPanic, gc);
                    hingeType.narrowSingleHinging(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, hingingPair, gc);
                    hingeType.narrowPairHinging(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, hingingPair, gc);
                    jambs.pairJambs(pairDoorWidthDouble, pairDoorHeightDouble, pairFrameHeightString, numOfRightSL, doorColor, gc);
                    hAT.pairHeadersAndThresholds(pairDoorWidthDouble, pairDoorHeightDouble, pairFrameWidthString, doorColor, gc);
                    if (yesTransom && yesSL) {
                        slWidthDouble = fTD.fractionToDecimal(sideLightWidth.getText());
                        transoms.pairTransom(transomWidthDouble, transomHeightDouble, pairDoorWidthDouble, pairDoorHeightDouble,
                                transomWidthString, transomHeightString, doorColor, numOfLeftSL, numOfRightSL, slWidthDouble, gc);
                    }
                    if (yesTransom && !yesSL) {
                        transoms.pairTransom(transomWidthDouble, transomHeightDouble, pairDoorWidthDouble, pairDoorHeightDouble,
                                transomWidthString, transomHeightString, doorColor, numOfLeftSL, numOfRightSL, slWidthDouble, gc);
                    }
                    break;
                case "Medium":
//                    if (bottomRailSize.equals("4"))
//                        Drawing_Warning.mediumStileBottom();
//                    stiles.mediumSingleStile(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, doorColor, gc);
//                    rails.mediumSingleRails(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, doorColor, bottomRailSize, type, qty, gc);
//                    hingeType.narrowSingleHinging(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, hingingPair, gc);
//                    jambs.jambs(pairDoorWidthDouble, pairDoorHeightDouble, pairFrameHeightString, yesSideLight, doorColor, gc);
//                    hAT.headersAndThresholds(pairDoorWidthDouble, pairDoorHeightDouble, pairFrameWidthString, doorColor, gc);
                    break;
                case "Wide":
//                    pairDoorWidthDouble = pairDoorWidthDouble - 5.75;
//                    pairDoorWidthString = fTD.convertDecimalToFraction(pairDoorWidthDouble);
//                    stiles.wideSingleStile(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, doorColor, gc);
//                    rails.wideSingleRails(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, doorColor, bottomRailSize, type, qty, gc);
//                    hingeType.wideHinging(pairDoorWidthDouble, pairDoorHeightDouble, doorHand, hingingPair, gc);
//                    jambs.jambs(pairDoorWidthDouble, pairDoorHeightDouble, pairFrameHeightString, slAnswer, doorColor, gc);
//                    hAT.headersAndThresholds(pairDoorWidthDouble, pairDoorHeightDouble, pairFrameWidthString, doorColor, gc);
                    break;
            }

            //Hardware Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Hardware", 200, 2200);
            gc.strokeLine(200, 2225, 850, 2225);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(hardware1, 200, 2275);
            gc.fillText(hardware2, 200, 2325);
            if (panicHardware.equals("No Panic")) {
                gc.fillText(" ", 200, 2375);
            } else {
                gc.fillText(panicHardware, 200, 2375);
            }

//            //Hand Label
//            gc.setFill(Color.BLACK);
//            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
//            gc.fillText("Hand", 2500, 2200);
//            gc.strokeLine(2500, 2225, 3250, 2225);
//            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
//            gc.fillText(doorHand, 2600, 2275);

            //Glass Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Glass Sizes", 2500, 2200);
            gc.strokeLine(2500, 2225, 3250, 2225);

            //Quantity Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Quantity", 2500, 1800);
            gc.strokeLine(2500, 1825, 3250, 1825);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorQuantity, 2500, 1875);

            //Color Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Color", 2500, 1600);
            gc.strokeLine(2500, 1625, 3250, 1625);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorColor, 2500, 1675);

            //Frame Label
            pairFrameWidthDouble += 3.5;
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Frame", 2500, 1400);
            gc.strokeLine(2500, 1425, 3250, 1425);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(fTD.convertDecimalToFraction(pairFrameWidthDouble) + " x " + pairFrameHeightString, 2500, 1475);

            //Notes Label
            String notes = pairNoteField.getText();
            if (!notes.equals("")) {
                gc.setFill(Color.BLACK);
                gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
                gc.fillText("Notes", 200, 1500);
                gc.strokeLine(200, 1525, 850, 1525);
                gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                gc.fillText(notes, 200, 1575);
            }

            //Hinging Type
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(pairHinge, 200, 2475);


        } catch (NumberFormatException e) {
            Drawing_Warning.singleOpeningNotEntered();
        }

    }

    //////////////////////////////////////Windows/////////////////////////////////////////////
    public void submitWindow(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        FractionsAndDecimals fTD = new FractionsAndDecimals();
        String openingType = windowDimensionSelection.getValue();

        String windowWidthString = windowWidth.getText();
        String windowHeightString = windowHeight.getText();

        String color = windowColor.getValue();

        int quantity = Integer.parseInt(windowQuantity.getValue());
        String type = windowGlass.getValue();

        double windowWidthDouble = fTD.fractionToDecimal(windowWidth.getText());
        double windowHeightDouble = fTD.fractionToDecimal(windowHeight.getText());

        int panels = Integer.parseInt(windowPanelNum.getValue());

        switch (openingType) {
            case "R/O":

                windowWidthDouble = fTD.fractionToDecimal(windowWidth.getText()) - 0.5;
                windowHeightDouble = fTD.fractionToDecimal(windowHeight.getText()) - 0.5;

                windowWidthString = fTD.convertDecimalToFraction(windowWidthDouble);
                windowHeightString = fTD.convertDecimalToFraction(windowHeightDouble);
                break;
            case "F/O":
                windowWidthDouble = fTD.fractionToDecimal(windowWidth.getText());
                windowHeightDouble = fTD.fractionToDecimal(windowHeight.getText());

                windowWidthString = windowWidth.getText();
                windowHeightString = windowHeight.getText();
        }

        //Glass Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
        gc.fillText("Glass Sizes", 2500, 2000);
        gc.strokeLine(2500, 2025, 3250, 2025);

        //Quantity Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
        gc.fillText("Quantity", 2500, 1800);
        gc.strokeLine(2500, 1825, 3250, 1825);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(String.valueOf(quantity), 2600, 1875);

        //Color Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
        gc.fillText("Color", 2500, 1600);
        gc.strokeLine(2500, 1625, 3250, 1625);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(color, 2600, 1675);

        //Frame Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
        gc.fillText("Frame", 2500, 1400);
        gc.strokeLine(2500, 1425, 3250, 1425);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(fTD.convertDecimalToFraction(windowWidthDouble) + " x " + fTD.convertDecimalToFraction(windowHeightDouble), 2600, 1475);


        if (color.equals("Bronze") || color.equals("PC Black")) {
            windows.windowsBronze(windowWidthDouble, windowHeightDouble, windowWidthString, windowHeightString, panels,
                    quantity, type, gc);
        } else {
            windows.windowsClear(windowWidthDouble, windowHeightDouble, windowWidthString, windowHeightString, panels, quantity, type, gc);
        }

    }

    public void clearWindow(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        windowWidth.clear();
        windowHeight.clear();
        windowRoughWidth.clear();
        windowRoughHeight.clear();
    }

    //////////////////////////////////////Single Door/////////////////////////////////////////
    public void submitSingle(ActionEvent actionEvent) {

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        FractionsAndDecimals fTD = new FractionsAndDecimals();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
        doorWidth.clear();
        doorHeight.clear();
        frameWidth.clear();
        frameHeight.clear();
        openingWidth.clear();
        openingHeight.clear();

        if (sfdNum.getLength() != 0) {
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
            gc.setFill(Color.BLACK);
            gc.fillText("SFD-" + sfdNumber, (previewCanvas.getWidth() / 2) - 100, 150);
            gc.setFont(new Font(12));
        } else {
            //Drawing_Warning.sfdNotEntered();
        }

        try {
            String openingType = singleSelection.getValue();
            double singleWidthDouble = fTD.fractionToDecimal(singleWidth.getText());
            double singleHeightDouble = fTD.fractionToDecimal(singleHeight.getText());

            String doorWidthString = singleWidth.getText();
            String doorHeightString = singleHeight.getText();

            String frameWidthString = singleWidth.getText();
            String frameHeightString = singleHeight.getText();

            String roughWidthString = openingWidth.getText();
            String roughHeightString = openingHeight.getText();

            double doorWidthDouble = fTD.fractionToDecimal(singleWidth.getText());
            double doorHeightDouble = fTD.fractionToDecimal(singleHeight.getText());

            double frameWidthDouble = fTD.fractionToDecimal(singleWidth.getText());
            double frameHeightDouble = fTD.fractionToDecimal(singleHeight.getText());

            double roughWidthDouble = fTD.fractionToDecimal(singleWidth.getText());
            double roughHeightDouble = fTD.fractionToDecimal(singleHeight.getText());

            int numOfRightSL = rightOfDoorSideLight.getValue();
            int numOfLeftSL = leftOfDoorSideLight.getValue();

            boolean yesTransom;
            yesTransom = singleTransomQuestion.getValue().equals("Yes");

            boolean yesSL;
            yesSL = singleSideLightQuestion.getValue().equals("Yes");

            String transomHeightString = null;
            double transomHeightDouble = 0.0;

            String transomWidthString = null;
            double transomWidthDouble = 0.0;

            String singleHinging = hinging.getValue();

            switch (openingType) {
                case "Rough Opening":
                    if (singleHinging.equals("Pivots") || singleHinging.equals("Butt Hinge") || singleHinging.equals("No Hinging")) {
                        doorWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 8.4375));
                    } else {
                        doorWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 8.6875));
                    }
                    if (!yesTransom) {
                        doorHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble - 2.75));
                        doorWidthString = fTD.convertDecimalToFraction(doorWidthDouble);
                        doorHeightString = fTD.convertDecimalToFraction(doorHeightDouble);
                        doorWidth.setText(doorWidthString);
                        doorHeight.setText(doorHeightString);

                        frameWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 4));
                        frameHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble - 0.25));
                    } else {
                        doorHeightDouble = fTD.fractionToDecimal(String.valueOf(83.25));
                        doorWidthString = fTD.convertDecimalToFraction(doorWidthDouble);
                        doorHeightString = fTD.convertDecimalToFraction(doorHeightDouble);
                        doorWidth.setText(doorWidthString);
                        doorHeight.setText(doorHeightString);

                        frameWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 4));
                        frameHeightDouble = fTD.fractionToDecimal(String.valueOf(85.75));

                        transomHeightDouble = roughHeightDouble - 88.625;//0.25 R/O + 85.75 Frame + 0.125 H-Mullion + 2.5 125 top and bottom
                        transomHeightString = fTD.convertDecimalToFraction(transomHeightDouble);

                        transomWidthDouble = roughWidthDouble - 0.50;
                        transomWidthString = fTD.convertDecimalToFraction(transomWidthDouble);
                    }
                    frameWidthString = fTD.convertDecimalToFraction(frameWidthDouble);
                    frameHeightString = fTD.convertDecimalToFraction(frameHeightDouble);
                    frameWidth.setText(frameWidthString);
                    frameHeight.setText(frameHeightString);
                    break;
                case "Frame Opening":
                    doorWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 7.9375));
                    doorHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble - 2.5));
                    doorWidthString = fTD.convertDecimalToFraction(doorWidthDouble);
                    doorHeightString = fTD.convertDecimalToFraction(doorHeightDouble);
                    doorWidth.setText(doorWidthString);
                    doorHeight.setText(doorHeightString);

                    frameWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 3.5));
                    frameHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble));
                    frameWidthString = fTD.convertDecimalToFraction(frameWidthDouble);
                    frameHeightString = fTD.convertDecimalToFraction(frameHeightDouble);
                    frameWidth.setText(frameWidthString);
                    frameHeight.setText(frameHeightString);

                    roughWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble + 0.5));
                    roughHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble + 0.25));
                    roughWidthString = fTD.convertDecimalToFraction(roughWidthDouble);
                    roughHeightString = fTD.convertDecimalToFraction(roughHeightDouble);
                    openingWidth.setText(roughWidthString);
                    openingHeight.setText(roughHeightString);
                    break;
                case "Door Opening":
                    frameWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble));
                    frameHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble + 1.75));
                    frameWidthString = fTD.convertDecimalToFraction(frameWidthDouble);
                    frameHeightString = fTD.convertDecimalToFraction(frameHeightDouble);
                    frameWidth.setText(frameWidthString);
                    frameHeight.setText(frameHeightString);

                    roughWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble + 4));
                    roughHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble + 2));
                    roughWidthString = fTD.convertDecimalToFraction(roughWidthDouble);
                    roughHeightString = fTD.convertDecimalToFraction(roughHeightDouble);
                    openingWidth.setText(roughWidthString);
                    openingHeight.setText(roughHeightString);

                    doorWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 4.4375));
                    doorHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble - 0.75));
                    doorWidthString = fTD.convertDecimalToFraction(doorWidthDouble);
                    doorHeightString = fTD.convertDecimalToFraction(doorHeightDouble);
                    doorWidth.setText(doorWidthString);
                    doorHeight.setText(doorHeightString);
                    break;
                default:
                    Drawing_Warning.singleOpeningNotEntered();
                    break;
            }

            //Side Light Questions
            int slAnswer = rightOfDoorSideLight.getValue();

            ////////////////////////////////Door Basics
            String bottomRailSize = bottomRail.getValue();
            String doorColor = color.getValue();
            String doorHand = hand.getValue();

            ///////////////////////////////Handles and panics
            String pullHandle = pull.getValue();
            String panicHardware = panicDevices.getValue();
            boolean hasPanic = panicHardware.equals("RIM");
            boolean hasPush = push.isSelected();

            //////////////////////////////Glass
            String type = glassType.getValue();

            //////////////////////////////Door Quantity
            String doorQuantity = quantity.getText();
            int qty = Integer.parseInt(doorQuantity);

            /////////////////////////////Hardware
            String hardware1 = hardware.getValue();
            String hardware2 = secondHardware.getValue();
            String cylinder = "Cylinder";
            String deadBolt = "Deadbolt";
            String rim = "RIM";
            String cvr = "CVR";
            String thumbTurn = "Thumb-turn";
            String hookBolt = "Hook Bolt";
            String leverLatch = "Lever Latch";
            String eSSurfaceMount = "Electric Strike Surface Mount";
            String eSIntegrated = "Electric Strike Integrated";
            String stile = stileSize.getValue();

            double slWidthDouble = 0;

            switch (stile) {
                case "Narrow":
                    stiles.narrowSingleStile(doorWidthDouble, doorHeightDouble, doorHeightString, doorColor, gc);
                    rails.narrowSingleRails(doorWidthDouble, doorHeightDouble, doorWidthString, doorColor, bottomRailSize, type, qty, gc);
                    handles.narrowSingleHandles(doorWidthDouble, doorHeightDouble, doorHand, pullHandle, hasPanic, hasPush, gc);
                    hw.narrowSingleCylinders(doorWidthDouble, doorHeightDouble, doorHand, hasPanic, gc);
                    hingeType.narrowSingleHinging(doorWidthDouble, doorHeightDouble, doorHand, singleHinging, gc);
                    jambs.jambs(doorWidthDouble, doorHeightDouble, frameHeightString, slAnswer, doorColor, gc);
                    hAT.headersAndThresholds(doorWidthDouble, doorHeightDouble, frameWidthString, doorColor, gc);
                    if (yesTransom && yesSL) {
                        slWidthDouble = fTD.fractionToDecimal(sideLightWidth.getText());
                        transoms.singleTransom(transomWidthDouble, transomHeightDouble, doorWidthDouble, doorHeightDouble,
                                transomWidthString, transomHeightString, doorColor, numOfLeftSL, numOfRightSL, slWidthDouble, gc);
                    }
                    if (yesTransom && !yesSL) {
                        transoms.singleTransom(transomWidthDouble, transomHeightDouble, doorWidthDouble, doorHeightDouble,
                                transomWidthString, transomHeightString, doorColor, numOfLeftSL, numOfRightSL, slWidthDouble, gc);
                    }
                    break;
                case "Medium":
                    if (bottomRailSize.equals("4"))
                        Drawing_Warning.mediumStileBottom();
                    stiles.mediumSingleStile(doorWidthDouble, doorHeightDouble, doorHeightString, doorColor, gc);
                    rails.mediumSingleRails(doorWidthDouble, doorHeightDouble, doorWidthString, doorColor, bottomRailSize, type, qty, gc);
                    hingeType.narrowSingleHinging(doorWidthDouble, doorHeightDouble, doorHand, singleHinging, gc);
                    jambs.jambs(doorWidthDouble, doorHeightDouble, frameHeightString, slAnswer, doorColor, gc);
                    hAT.headersAndThresholds(doorWidthDouble, doorHeightDouble, frameWidthString, doorColor, gc);
                    break;
                case "Wide":
                    doorWidthDouble = doorWidthDouble - 5.75;
                    doorWidthString = fTD.convertDecimalToFraction(doorWidthDouble);
                    stiles.wideSingleStile(doorWidthDouble, doorHeightDouble, doorHeightString, doorColor, gc);
                    rails.wideSingleRails(doorWidthDouble, doorHeightDouble, doorWidthString, doorColor, bottomRailSize, type, qty, gc);
                    hingeType.wideHinging(doorWidthDouble, doorHeightDouble, doorHand, singleHinging, gc);
                    jambs.jambs(doorWidthDouble, doorHeightDouble, frameHeightString, slAnswer, doorColor, gc);
                    hAT.headersAndThresholds(doorWidthDouble, doorHeightDouble, frameWidthString, doorColor, gc);
                    break;
            }

            //Hardware Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Hardware", 200, 2200);
            gc.strokeLine(200, 2225, 850, 2225);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(hardware1, 200, 2275);
            gc.fillText(hardware2, 200, 2325);
            if (panicHardware.equals("No Panic")) {
                gc.fillText(" ", 200, 2375);
            } else {
                gc.fillText(panicHardware, 200, 2375);
            }

            //Notes Label
            String notes = noteField.getText();
            if (!notes.equals("")) {
                gc.setFill(Color.BLACK);
                gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
                gc.fillText("Notes", 200, 1500);
                gc.strokeLine(200, 1525, 850, 1525);
                gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                gc.fillText(notes, 200, 1575);
            }

            //Hand Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Hand", 2500, 2000);
            gc.strokeLine(2500, 2025, 3250, 2025);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorHand, 2500, 2075);

            //Glass Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Glass Sizes", 2500, 2200);
            gc.strokeLine(2500, 2225, 3250, 2225);

            //Quantity Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Quantity", 2500, 1800);
            gc.strokeLine(2500, 1825, 3250, 1825);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorQuantity, 2500, 1875);

            //Color Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Color", 2500, 1600);
            gc.strokeLine(2500, 1625, 3250, 1625);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorColor, 2500, 1675);

            frameWidthDouble += 3.5;
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Frame", 2500, 1400);
            gc.strokeLine(2500, 1425, 3250, 1425);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(fTD.convertDecimalToFraction(frameWidthDouble) + " x " + frameHeightString, 2500, 1475);

            //Hinging Type
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(singleHinging, 200, 2475);

        } catch (NumberFormatException e) {
            Drawing_Warning.singleOpeningNotEntered();
        }
    }

    public void clearSingle(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        doorWidth.clear();
        doorHeight.clear();
        frameWidth.clear();
        frameHeight.clear();
        openingWidth.clear();
        openingHeight.clear();
    }

    ///////////////////////////////////////Side Lights////////////////////////////////////////
    public void submitSideLight(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
        FractionsAndDecimals fTD = new FractionsAndDecimals();

        String singleOrPair = pairOrSingleQuestion.getValue();

        String doorFrameWidthString;
        String doorFrameHeightString;

        double doorFrameWidth;
        double doorFrameHeight;


        try {
            if (singleOrPair.equals("Single")) {
                doorFrameWidthString = frameWidth.getText();
                doorFrameHeightString = frameHeight.getText();

                doorFrameWidth = fTD.fractionToDecimalWithDash(doorFrameWidthString);
                doorFrameHeight = fTD.fractionToDecimalWithDash(doorFrameHeightString);
                submitSingle(actionEvent);
            } else {
                doorFrameWidthString = pairFrameWidth.getText();
                doorFrameHeightString = pairFrameHeight.getText();

                doorFrameWidth = fTD.fractionToDecimalWithDash(doorFrameWidthString);
                doorFrameHeight = fTD.fractionToDecimalWithDash(doorFrameHeightString);
                submitPair(actionEvent);
            }

            double slWidthDouble = fTD.fractionToDecimal(sideLightWidth.getText());


            String selection = sideLightSelection.getValue();

            String slColor = sideLightColor.getValue();
            int qty = sideLightQuantity.getValue();
            int panels = numOfPanelsSideLight.getValue();
            int toLeft = leftOfDoorSideLight.getValue();
            int toRight = rightOfDoorSideLight.getValue();
            String type = sideLightGlassType.getValue();


            if (slColor.equals("Bronze") || slColor.equals("Black")) {
                if (toLeft > 0) {
                    sideLightLeft.bronzeSideLightVerticalLeft(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);
                    sideLightLeft.bronzeSideLightHorizontalsLeft(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, qty, type, panels, gc);
                }
                if (toRight > 0) {
                    sideLightRight.bronzeSideLightVerticalRight(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, singleOrPair, panels, gc);
                    sideLightRight.bronzeSideLightHorizontalsRight(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, qty, type, singleOrPair, panels, gc);
                }
            } else {
                if (toLeft > 0) {
                    sideLightLeft.clearSideLightVerticalLeft(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);
                    sideLightLeft.clearSideLightHorizontalsLeft(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, qty, type, panels, gc);
                }
                if (toRight > 0) {
                    sideLightRight.clearSideLightVerticalRight(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, singleOrPair, panels, gc);
                    sideLightRight.clearSideLightHorizontalsRight(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, qty, type, singleOrPair, panels, gc);
                }
            }
        } catch (Exception e) {
            Drawing_Warning.singlePairNotEnteredCorrectly();
        }
    }

    public void clearSideLight(ActionEvent actionEvent) {
    }

    public void savePDF(ActionEvent actionEvent) {
        String SFD = sfdNum.getText();
        WritableImage nodeShot = previewCanvas.snapshot(new SnapshotParameters(),
                null);
        File file = new File(SFD + ".png");
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(nodeShot, null), "png", file);
        } catch (IOException ignored) {

        }
        Drawing_Warning.saveSuccess();
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

    public void hingingNumChange(Event event) {

        String hingingSingle = hinging.getValue();
        hinging.setOnAction(event2 -> {
            switch (hingingSingle) {
                case "Butt Hinge":
                    hingingNum.setValue(1);
                    break;
                case "Pivots":
                    hingingNum.setValue(2);
                    break;
            }

        });
    }
}