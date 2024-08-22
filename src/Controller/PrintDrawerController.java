package Controller;

import DrawingComponents.*;
import MathFormulas.FractionsAndDecimals;
import Messages.Drawing_Warning;
import ZoomOperator.AnimatedZoomOperator;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ScrollEvent;
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

    Stiles stiles = new Stiles();
    Rails rails = new Rails();
    Jambs jambs = new Jambs();
    HeaderAndThreshold hAT = new HeaderAndThreshold();
    Glass glass = new Glass();
    Hardware hw = new Hardware();
    Handles handles = new Handles();
    HingeType hingeType = new HingeType();
    Windows windows = new Windows();
    PairJambs pairJambs = new PairJambs();
    PairHeaderAndThreshold pairHaT = new PairHeaderAndThreshold();
    PairRails pairRails = new PairRails();
    PairStiles pairStiles = new PairStiles();
    SideLightsRight sideLightsRight = new SideLightsRight();
    SideLightLeft sideLightLeft = new SideLightLeft();


    public void initialize(URL url, ResourceBundle resourceBundle) {

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

        //Pair
        pairSelection.getItems().add("Rough Opening");
        pairSelection.getItems().add("Frame Opening");
        pairSelection.getItems().add("Door Opening");
        pairSelection.setValue("Rough Opening");

        pairSideLightQuestion.getItems().add("Yes");
        pairSideLightQuestion.getItems().add("No");
        pairSideLightQuestion.setValue("No");

        pairHand.getItems().add("Right");
        pairHand.getItems().add("Left");
        pairHand.setValue("Left");

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

        for (int i = 1; i <= 10; i++) {
            rightOfDoorSideLight.getItems().add(1);
        }
        rightOfDoorSideLight.setValue(1);
        for (int i = 1; i <= 10; i++) {
            leftOfDoorSideLight.getItems().add(1);
        }
        leftOfDoorSideLight.setValue(1);

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

            boolean yesSideLight;
            yesSideLight = pairSideLightQuestion.getValue().equals("Yes");

            String slAnswer = pairSideLightQuestion.getValue();


            switch (openingType) {
                case "Rough Opening":
                    pairDoorWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 8.4375));
                    pairDoorHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble - 2.75));
                    pairDoorWidthString = fTD.convertDecimalToFraction(pairDoorWidthDouble);
                    pairDoorHeightString = fTD.convertDecimalToFraction(pairDoorHeightDouble);
                    pairDoorWidth.setText(pairDoorWidthString);
                    pairDoorHeight.setText(pairDoorHeightString);

                    pairFrameWidthDouble = fTD.fractionToDecimal(String.valueOf(pairWidthDouble - 4));
                    pairFrameHeightDouble = fTD.fractionToDecimal(String.valueOf(pairHeightDouble - 0.25));
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

            String type = pairGlassType.getValue();
            String doorColor = pairColor.getValue();
            String doorHand = pairHand.getValue();
            String doorQuantity = pairQuantity.getText();
            int qty = Integer.parseInt(doorQuantity);
            String hardware1 = pairHardware1.getValue();
            String hardware2 = pairHardware2.getValue();
            String panicHardware = pairPanicDevice.getValue();
            String pullHandle = pairPull.getValue();

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

            //Hand Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Hand", 2500, 2200);
            gc.strokeLine(2500, 2225, 3250, 2225);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorHand, 2600, 2275);

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
            gc.fillText(doorQuantity, 2600, 1875);

            //Color Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Color", 2500, 1600);
            gc.strokeLine(2500, 1625, 3250, 1625);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorColor, 2600, 1675);

            //Frame Label
            pairFrameWidthDouble += 3.5;
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Frame", 2500, 1400);
            gc.strokeLine(2500, 1425, 3250, 1425);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(fTD.convertDecimalToFraction(pairFrameWidthDouble) + " x " + pairFrameHeightString, 2600, 1475);
        } catch (NumberFormatException e) {
            Drawing_Warning.singleOpeningNotEntered();
        }

    }

    public void clearSliders(ActionEvent actionEvent) {
    }

    public void submitSliders(ActionEvent actionEvent) {
    }

    //////////////////////////////////////Windows/////////////////////////////////////////////
    public void submitWindow(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());


        FractionsAndDecimals fTD = new FractionsAndDecimals();

        String windowWidthString = windowWidth.getText();
        String windowHeightString = windowHeight.getText();

        String color = windowColor.getValue();

        int quantity = Integer.parseInt(windowQuantity.getValue());
        String type = windowGlass.getValue();

//        try {
        double windowWidthDouble = fTD.fractionToDecimal(windowWidth.getText());
        double windowHeightDouble = fTD.fractionToDecimal(windowHeight.getText());

        int panels = Integer.parseInt(windowPanelNum.getValue());

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

        //Width > 36 and height >= 84
        if (windowColor.getValue().equals("Bronze") || windowColor.getValue().equals("PC Black") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble >= 84
        ) {
            //Horizontals
            windows.railsGreaterThanOrEqual36(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.greaterThanOrEqual84(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width less than 36 and height less than 84
        } else if (windowColor.getValue().equals("Bronze") || windowColor.getValue().equals("PC Black") &&
                windowWidthDouble < 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsLessThan36(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width less than 36 and height greater or equal to 84
        } else if (windowColor.getValue().equals("Bronze") || windowColor.getValue().equals("PC Black") &&
                windowWidthDouble < 36 &&
                windowHeightDouble >= 84) {
            //Horizontals
            windows.railsLessThan36StilesGreaterThan84(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.greaterThanOrEqual84RailsLessThan36(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width greater or equal 36 and height less than 84
        } else if (windowColor.getValue().equals("Bronze") || windowColor.getValue().equals("PC Black") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsGreaterThanOrEqual36StilesLessThan84(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84RailGreaterThan36(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width less than 36 and height less than 84
        } else if (windowColor.getValue().equals("Clear") || windowColor.getValue().equals("PC White") &&
                windowWidthDouble < 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsLessThan36Clear(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        } else if (windowColor.getValue().equals("Clear") || windowColor.getValue().equals("PC White") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble >= 84) {
            //Horizontals
            windows.railsLessThanOrEqual36Clear(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThanOrEqual84Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        } else if (windowColor.getValue().equals("Clear") || windowColor.getValue().equals("PC White") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsGreaterThanOrEqual36Clear(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84RailGreaterThan36Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        } else if (windowColor.getValue().equals("Clear") || windowColor.getValue().equals("PC White") &&
                windowWidthDouble < 36 &&
                windowHeightDouble >= 84) {
            //Horizontals
            windows.railsLessThan36ClearStileGreaterThanOrEqual84(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.greaterThanOrEqual84Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        }
//        } catch (NumberFormatException e) {
//            Drawing_Warning.stringEmptyEntered();
//        }
    }

    public void clearWindow(ActionEvent actionEvent) {
        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        windowWidth.clear();
        windowHeight.clear();
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

            switch (openingType) {
                case "Rough Opening":
                    doorWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 8.4375));
                    doorHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble - 2.75));
                    doorWidthString = fTD.convertDecimalToFraction(doorWidthDouble);
                    doorHeightString = fTD.convertDecimalToFraction(doorHeightDouble);
                    doorWidth.setText(doorWidthString);
                    doorHeight.setText(doorHeightString);

                    frameWidthDouble = fTD.fractionToDecimal(String.valueOf(singleWidthDouble - 4));
                    frameHeightDouble = fTD.fractionToDecimal(String.valueOf(singleHeightDouble - 0.25));
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
            String slAnswer = singleSideLightQuestion.getValue();
            sideLightHeight.setText(singleHeight.getText());

            ////////////////////////////////Door Basics
            String bottomRailSize = bottomRail.getValue();
            String singleHinging = hinging.getValue();
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

            stiles.narrowSingleStile(doorWidthDouble, doorHeightDouble, doorHeightString, doorColor, gc);
            rails.narrowSingleRails(doorWidthDouble, doorHeightDouble, doorWidthString, doorColor, bottomRailSize,  gc);
            handles.narrowSingleHandles(doorWidthDouble, doorHeightDouble, doorHand, pullHandle, hasPanic, hasPush, gc);
            hw.narrowSingleCylinders(doorWidthDouble, doorHeightDouble, doorHand, hasPanic, gc);
            hingeType.narrowHinging(doorWidthDouble, doorHeightDouble, doorHand, singleHinging, gc);
            jambs.jambs(doorWidthDouble, doorHeightDouble, frameHeightString, slAnswer, doorColor, gc);
            hAT.headersAndThresholds(doorWidthDouble, doorHeightDouble, frameWidthString, doorColor, gc);

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

            //Hand Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Hand", 2500, 2200);
            gc.strokeLine(2500, 2225, 3250, 2225);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorHand, 2500, 2275);

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
            gc.fillText(doorQuantity, 2500, 1875);

            //Color Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Color", 2500, 1600);
            gc.strokeLine(2500, 1625, 3250, 1625);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorColor, 2500, 1675);

            //Frame Label
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
        submitSingle(actionEvent);
        FractionsAndDecimals fTD = new FractionsAndDecimals();

        sideLightRoughHeight.clear();
        sideLightRoughWidth.clear();
        sideLightFrameHeight.clear();
        sideLightFrameWidth.clear();

        String doorFrameWidthString = frameWidth.getText();
        String doorFrameHeightString = frameHeight.getText();

        double doorFrameWidth = fTD.fractionToDecimalWithDash(doorFrameWidthString);
        double doorFrameHeight = fTD.fractionToDecimalWithDash(doorFrameHeightString);

        double slWidthDouble = fTD.fractionToDecimal(sideLightWidth.getText());

        String slROHeightString = sideLightHeight.getText();
        String slROWidthString = sideLightWidth.getText();

        String slFrameHeightString = sideLightHeight.getText();
        String slFrameWidthString = sideLightWidth.getText();

        String slHeight = sideLightHeight.getText();
        String slWidth = sideLightWidth.getText();

        double slROHeightDouble = fTD.fractionToDecimal(sideLightHeight.getText());
        double slROWidthDouble = fTD.fractionToDecimal(sideLightWidth.getText());

        double slFrameHeightDouble = fTD.fractionToDecimal(sideLightHeight.getText());
        double slFrameWidthDouble = fTD.fractionToDecimal(sideLightWidth.getText());


        String slHorizontalsString;
        Double slHorizontalsDouble;

        String selection = sideLightSelection.getValue();

        String slColor = sideLightColor.getValue();
        int qty = sideLightQuantity.getValue();
        int panels = numOfPanelsSideLight.getValue();
        int toLeft = leftOfDoorSideLight.getValue();
        int toRight = rightOfDoorSideLight.getValue();
        String type = sideLightGlassType.getValue();

        switch (selection) {
            case "Rough Opening":
                slFrameHeightDouble = fTD.fractionToDecimal(String.valueOf(doorFrameHeight - 0.25));
                slFrameWidthDouble = fTD.fractionToDecimal(String.valueOf(slWidthDouble - 0.5));
                slFrameHeightString = fTD.convertDecimalToFraction(slFrameHeightDouble);
                slFrameWidthString = fTD.convertDecimalToFraction(slFrameWidthDouble);
                sideLightFrameHeight.setText(slFrameHeightString);
                sideLightFrameWidth.setText(slFrameWidthString);

                break;
            case "Frame Opening":
                slROHeightDouble = fTD.fractionToDecimal(String.valueOf(slFrameHeightDouble + 0.25));
                slROWidthDouble = fTD.fractionToDecimal(String.valueOf(slFrameWidthDouble + 0.5));
                slROHeightString = fTD.convertDecimalToFraction(slROHeightDouble);
                slROWidthString = fTD.convertDecimalToFraction(slROWidthDouble);
                sideLightRoughHeight.setText(slROHeightString);
                sideLightRoughWidth.setText(slROWidthString);

                break;
            default:
                Drawing_Warning.singleOpeningNotEntered();
                break;
        }

        //Width > 36 and height >= 84
        if (slColor.equals("Bronze") &&
                slFrameWidthDouble >= 36 &&
                slFrameHeightDouble >= 84
        ) {
            //Horizontals
            sideLightsRight.railsGreaterThanOrEqual36(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, panels, gc);
            sideLightLeft.railsGreaterThanOrEqual36(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, panels, gc);
            //Verticals
            sideLightsRight.stilesGreaterThanOrEqual84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);
            sideLightLeft.stilesGreaterThanOrEqual84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);

            //Width less than 36 and height less than 84
        } else if (slColor.equals("Bronze") &&
                slFrameWidthDouble < 36 &&
                slFrameHeightDouble < 84) {
            //Horizontals
            sideLightsRight.railsLessThan36(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            sideLightLeft.railsLessThan36(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesLessThan84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);
            sideLightLeft.stilesLessThan84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);

            //Width less than 36 and height greater or equal to 84
        } else if (slColor.equals("Bronze") &&
                slFrameWidthDouble < 36 &&
                slFrameHeightDouble >= 84) {
            //Horizontals
            sideLightsRight.railsLessThan36StilesGreaterThan84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesGreaterThanOrEqual84RailsLessThan36(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);

            //Width greater or equal 36 and height less than 84
        } else if (slColor.equals("Bronze") &&
                slFrameWidthDouble >= 36 &&
                slFrameHeightDouble < 84) {
            //Horizontals
            sideLightsRight.railsGreaterThanOrEqual36StilesLessThan84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesLessThan84RailGreaterThan36(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, panels, gc);

            //Width less than 36 and height less than 84
        } else if (slColor.equals("Clear") &&
                slFrameWidthDouble < 36 &&
                slFrameHeightDouble < 84) {
            //Horizontals
            sideLightsRight.railsLessThan36Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesLessThan84Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, gc);

        } else if (slColor.equals("Clear") &&
                slFrameWidthDouble >= 36 &&
                slFrameHeightDouble >= 84) {
            //Horizontals
            sideLightsRight.railsLessThanOrEqual36Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesLessThanOrEqual84Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, gc);

        } else if (slColor.equals("Clear") &&
                slFrameWidthDouble >= 36 &&
                slFrameHeightDouble < 84) {
            //Horizontals
            sideLightsRight.railsGreaterThanOrEqual36Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesLessThan84RailGreaterThan36Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, gc);

        } else if (slColor.equals("Clear") &&
                slFrameWidthDouble < 36 &&
                slFrameHeightDouble >= 84) {
            //Horizontals
            sideLightsRight.railsLessThan36ClearStileGreaterThanOrEqual84(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameWidthString, gc);
            //Verticals
            sideLightsRight.stilesGreaterThanOrEqual84Clear(doorFrameWidth, doorFrameHeight, slWidthDouble, doorFrameHeightString, gc);

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
}