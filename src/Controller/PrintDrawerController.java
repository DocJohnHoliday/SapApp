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

    Stiles stiles = new Stiles();
    Rails rails = new Rails();
    Jambs jambs = new Jambs();
    HeaderAndThreshold hAT = new HeaderAndThreshold();
    Glass glass = new Glass();
    Hardware hw = new Hardware();
    Handles handles = new Handles();
    HingeType hingeType = new HingeType();
    PanicDevices panics = new PanicDevices();
    Windows windows = new Windows();

    PairJambs pairJambs = new PairJambs();
    PairHeaderAndThreshold pairHaT = new PairHeaderAndThreshold();
    PairRails pairRails = new PairRails();
    PairStiles pairStiles = new PairStiles();


    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Single
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

        //Single
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
    }

    public void doorWidthChange(ActionEvent actionEvent) {

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
            gc.fillText("Hand", 2600, 2200);
            gc.strokeLine(2600, 2225, 3250, 2225);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorHand, 2600, 2275);

            //Glass Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Glass Sizes", 2600, 2000);
            gc.strokeLine(2600, 2025, 3250, 2025);

            //Quantity Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Quantity", 2600, 1800);
            gc.strokeLine(2600, 1825, 3250, 1825);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorQuantity, 2600, 1875);

            //Color Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Color", 2600, 1600);
            gc.strokeLine(2600, 1625, 3250, 1625);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorColor, 2600, 1675);

            //Frame Label
            pairFrameWidthDouble += 3.5;
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Frame", 2600, 1400);
            gc.strokeLine(2600, 1425, 3250, 1425);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(fTD.convertDecimalToFraction(pairFrameWidthDouble) + " x " + pairFrameHeightString, 2600, 1475);

            if (pairColor.getValue().equals("Bronze")) {
                if (pairStileSize.getValue().equals("Narrow")) {

                    if (yesSideLight && pairRoughWidthDouble == 68) {
                        pairFrameWidthDouble = 36;
                        pairFrameWidthString = "36";
                        pairDoorWidthDouble = 31.5625;
                        pairDoorWidthString = "31 9/16";
                        if(pairDoorHeightDouble >= 84) {
                            pairJambs.stilesGreaterThanOrEqual84SL28(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                            pairHaT.railsLessThan36SL28(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        } else {
                            pairJambs.stilesLessThan84SL28(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                            pairHaT.railsLessThan36SL28(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        }
                    }
                    if (yesSideLight && pairRoughWidthDouble == 52) {
                        pairFrameWidthDouble = 36;
                        pairFrameWidthString = "36";
                        pairDoorWidthDouble = 31.5625;
                        pairDoorWidthString = "31 9/16";
                        if(pairDoorHeightDouble >= 84) {
                            pairJambs.stilesGreaterThanOrEqual84SL12(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                            pairHaT.railsLessThan36SL12(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        } else {
                            pairJambs.stilesLessThan84SL12(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                            pairHaT.railsLessThan36SL12(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        }
                    }
                    if (pairDoorWidthDouble >= 36) {
                        if (pairDoorHeightDouble >= 84) {
                            //Rails and Glass
                            if (pairBottomRail.getValue().equals("4")) {
                                pairRails.railsGreaterThanOrEqual36(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                            }
                            if (pairBottomRail.getValue().equals("10")) {
                                pairRails.tenRailsGreaterThanOrEqual36(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            }
                            //Stile
                            pairStiles.stilesGreaterThanOrEqual84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                            //Jambs
                            pairJambs.stilesGreaterThanOrEqual84(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                            //Header and Threshold
                            pairHaT.railsGreaterThanOrEqual36(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        }
                        if (pairDoorHeightDouble < 84) {
                            //Rails and Glass
                            if (pairBottomRail.getValue().equals("4")) {
                                pairRails.railsGreaterThanOrEqual36StilesLessThan84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                            }
                            if (pairBottomRail.getValue().equals("10")) {
                                pairRails.tenRailsGreaterThanOrEqual36StilesLessThan84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            }
                            //Stiles
                            pairStiles.stilesLessThan84RailGreaterThan36(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                            //Jambs
                            pairJambs.stilesLessThan84RailGreaterThan36(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                            //Header and Threshold
                            pairHaT.railsGreaterThanOrEqual36StilesLessThan84(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        }
                    }
                    if (pairDoorWidthDouble < 36) {
                        if (pairDoorHeightDouble >= 84) {
                            //Rails and Glass
                            if (pairBottomRail.getValue().equals("4")) {
                                pairRails.railsLessThan36StilesGreaterThan84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                            }
                            if (pairBottomRail.getValue().equals("10")) {
                                pairRails.tenRailsLessThan36StilesGreaterThan84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            }
                            //Stiles
                            pairStiles.stilesGreaterThanOrEqual84RailsLessThan36(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                            //Jambs
                            pairJambs.stilesGreaterThanOrEqual84RailsLessThan36(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, slAnswer, gc);
                            //Header and Threshold
                            pairHaT.railsLessThan36StilesGreaterThan84(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        }
                        if (pairDoorHeightDouble < 84) {
                            //Rails and Glass
                            if (pairBottomRail.getValue().equals("4")) {
                                pairRails.railsLessThan36(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                            }
                            if (pairBottomRail.getValue().equals("10")) {
                                pairRails.tenRailsLessThan36(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                                glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            }
                            //Stiles
                            pairStiles.stilesLessThan84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                            //Jambs
                            pairJambs.stilesLessThan84(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, slAnswer ,gc);
                            //Header and Threshold
                            pairHaT.railsLessThan36StilesGreaterThan84(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
                        }
                    }
                }
            }

            if (pairColor.getValue().equals("Clear") &&
                    pairDoorWidthDouble < 36 &&
                    pairStileSize.getValue().equals("Narrow") &&
                    pairDoorHeightDouble < 84) {
                //Rails and Glass
                if (pairBottomRail.getValue().equals("4")) {
                    pairRails.railsLessThan36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                }
                if (pairBottomRail.getValue().equals("10")) {
                    pairRails.tenRailsLessThan36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                }
                //Stiles
                pairStiles.stilesLessThan84Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                //Jambs
                pairJambs.stilesLessThan84Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                //Header and Threshold
                pairHaT.railsLessThan36Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);

            } else if (pairColor.getValue().equals("Clear") &&
                    pairDoorWidthDouble >= 36 &&
                    pairStileSize.getValue().equals("Narrow") &&
                    pairDoorHeightDouble >= 84) {
                //Rails and Glass
                if (pairBottomRail.getValue().equals("4")) {
                    pairRails.railsLessThan36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                }
                if (pairBottomRail.getValue().equals("10")) {
                    pairRails.tenRailsLessThanOrEqual36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                }
                //Stiles
                pairStiles.stilesLessThanOrEqual84Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                //Jambs
                pairJambs.stilesLessThanOrEqual84Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                //Header and Threshold
                pairHaT.railsLessThanOrEqual36Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);

            } else if (pairColor.getValue().equals("Clear") &&
                    pairDoorWidthDouble >= 36 &&
                    pairStileSize.getValue().equals("Narrow") &&
                    pairDoorHeightDouble < 84) {
                //Rails and Glass
                if (pairBottomRail.getValue().equals("4")) {
                    pairRails.railsGreaterThanOrEqual36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                }
                if (pairBottomRail.getValue().equals("10")) {
                    pairRails.tenRailsGreaterThanOrEqual36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                }
                //Stiles
                pairStiles.stilesLessThan84RailGreaterThan36Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                //Jambs
                pairJambs.stilesLessThan84RailGreaterThan36Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                //Header and Threshold
                pairHaT.railsGreaterThanOrEqual36Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);
            } else if (pairColor.getValue().equals("Clear") &&
                    pairDoorWidthDouble < 36 &&
                    pairStileSize.getValue().equals("Narrow") &&
                    pairDoorHeightDouble >= 84) {
                //Rails and Glass
                if (pairBottomRail.getValue().equals("4")) {
                    pairRails.railsLessThan36ClearStileGreaterThanOrEqual84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm4BR(pairDoorWidthDouble, pairDoorHeightDouble, type, gc);
                }
                if (pairBottomRail.getValue().equals("10")) {
                    pairRails.tenRailsLessThan36ClearStileGreaterThanOrEqual84(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorWidthString, gc);
                    glass.doorGlass5mm10BR(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                }
                //Stiles
                pairStiles.stilesGreaterThanOrEqual84Clear(pairDoorWidthDouble, pairDoorHeightDouble, pairDoorHeightString, gc);
                //Jambs
                pairJambs.stilesGreaterThanOrEqual84Clear(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameHeightString, gc);
                //Header and Threshold
                pairHaT.railsLessThan36ClearStileGreaterThanOrEqual84(pairFrameWidthDouble, pairFrameHeightDouble, pairFrameWidthString, gc);

            }

            /////////////////////////////Hardware
            String cylinder = "Cylinder";
            String deadBolt = "Deadbolt";
            String rim = "RIM";
            String cvr = "CVR";
            String thumbTurn = "Thumb-turn";
            String hookBolt = "Hook Bolt";
            String leverLatch = "Lever Latch";
            String eSSurfaceMount = "Electric Strike Surface Mount";
            String eSIntegrated = "Electric Strike Integrated";

            String singleHinging = hinging.getValue();

            //Hinging Type
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(singleHinging, 200, 2475);

            boolean cylinderTrue = hardware1.equals("Cylinder") || hardware2.equals("Cylinder");
            boolean rimTrue = panicHardware.equals("RIM");

            if (doorColor.equals("Bronze") || doorColor.equals("Black")) {
                if (doorHand.equals("Left")) {
                    switch (singleHinging) {
                        case "Pivots":
                            if (pairDoorHeightDouble > 84)
                                hingeType.leftHandPivots(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.leftHandPivotsSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.leftHandContinuous(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.leftHandContinuousSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.leftHandButt(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.leftHandButtSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.leftHandPull(pairDoorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.leftHandPull8Chrome(pairDoorHeightDouble, gc);
                            break;
                        case "12\" Chrome":
                            handles.leftHandPull12(pairDoorHeightDouble, gc);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimLeftHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                        panics.rimLeftHandPull(pairDoorHeightDouble, gc);
                        hw.leftHandCylindersBronzeRIM(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.leftHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    } else {
                        gc.setFill(Color.BLACK);
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.leftHandCylindersBronze(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                } else {
                    ///////////////////Right Hand Hardware
                    switch (singleHinging) {
                        case "Pivots":
                            if (pairDoorHeightDouble > 84)
                                hingeType.rightHandPivots(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.rightHandPivotsSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.rightHandContinuous(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.rightHandContinuousSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.rightHandButt(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.rightHandButtSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.rightHandPull(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.rightHandPull8Chrome(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("8\" Chrome", 200, 2425);
                            break;
                        case "12\" Chrome":
                            handles.rightHandPull12(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("12\" Chrome", 200, 2425);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimRightHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                        panics.rimRightHandPull(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                        hw.rightHandCylindersBronzeRIM(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.rightHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    } else {
                        gc.setFill(Color.BLACK);
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.rightHandCylindersBronze(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                }
            } else {
                if (doorHand.equals("Left")) {
                    switch (singleHinging) {
                        case "Pivots":
                            if (pairDoorHeightDouble > 84)
                                hingeType.leftHandPivots(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.leftHandPivotsSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.leftHandContinuous(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.leftHandContinuousSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.leftHandButt(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.leftHandButtSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.leftHandPull(pairDoorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.leftHandPull8Chrome(pairDoorHeightDouble, gc);
                            break;
                        case "12\" Chrome":
                            handles.leftHandPull12(pairDoorHeightDouble, gc);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimLeftHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                        panics.rimLeftHandPull(pairDoorHeightDouble, gc);
                        hw.leftHandCylindersClearRIM(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.leftHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    } else {
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.leftHandCylindersClear(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                } else {
                    ///////////////////Right Hand Hardware
                    switch (singleHinging) {
                        case "Pivots":
                            if (pairDoorHeightDouble > 84)
                                hingeType.rightHandPivots(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.rightHandPivotsSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.rightHandContinuous(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.rightHandContinuousSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (pairDoorHeightDouble > 84)
                                hingeType.rightHandButt(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            if (pairDoorHeightDouble < 84)
                                hingeType.rightHandButtSmall(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.rightHandPull(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.rightHandPull8Chrome(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("8\" Chrome", 200, 2425);
                            break;
                        case "12\" Chrome":
                            handles.rightHandPull12(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("12\" Chrome", 200, 2425);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimRightHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                        panics.rimRightHandPull(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                        hw.rightHandCylindersClearRIM(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.rightHandPush(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    } else {
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.rightHandCylindersClear(pairDoorWidthDouble, pairDoorHeightDouble, gc);
                    }
                }
            }
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

        //Glass Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 75));
        gc.fillText("Glass Sizes", 2400, 2000);
        gc.strokeLine(2400, 2025, 3250, 2025);

        FractionsAndDecimals fTD = new FractionsAndDecimals();

        String windowWidthString = windowWidth.getText();
        String windowHeightString = windowHeight.getText();

        int quantity = Integer.parseInt(windowQuantity.getValue());
        String type = windowGlass.getValue();

//        try {
        double windowWidthDouble = fTD.fractionToDecimal(windowWidth.getText());
        double windowHeightDouble = fTD.fractionToDecimal(windowHeight.getText());

        int panels = Integer.parseInt(windowPanelNum.getValue());

        //Width > 36 and height >= 84
        if (windowColor.getValue().equals("Bronze") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble >= 84
        ) {
            //Horizontals
            windows.railsGreaterThanOrEqual36(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.greaterThanOrEqual84(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width less than 36 and height less than 84
        } else if (windowColor.getValue().equals("Bronze") &&
                windowWidthDouble < 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsLessThan36(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width less than 36 and height greater or equal to 84
        } else if (windowColor.getValue().equals("Bronze") &&
                windowWidthDouble < 36 &&
                windowHeightDouble >= 84) {
            //Horizontals
            windows.railsLessThan36StilesGreaterThan84(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.greaterThanOrEqual84RailsLessThan36(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width greater or equal 36 and height less than 84
        } else if (windowColor.getValue().equals("Bronze") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsGreaterThanOrEqual36StilesLessThan84(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84RailGreaterThan36(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

            //Width less than 36 and height less than 84
        } else if (windowColor.getValue().equals("Clear") &&
                windowWidthDouble < 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsLessThan36Clear(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        } else if (windowColor.getValue().equals("Clear") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble >= 84) {
            //Horizontals
            windows.railsLessThanOrEqual36Clear(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThanOrEqual84Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        } else if (windowColor.getValue().equals("Clear") &&
                windowWidthDouble >= 36 &&
                windowHeightDouble < 84) {
            //Horizontals
            windows.railsGreaterThanOrEqual36Clear(windowWidthDouble, windowHeightDouble, windowWidthString, quantity, type, panels, gc);
            //Verticals
            windows.lessThan84RailGreaterThan36Clear(windowWidthDouble, windowHeightDouble, windowHeightString, panels, gc);

        } else if (windowColor.getValue().equals("Clear") &&
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
//            Drawing_Warning.sfdNotEntered();
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

            boolean yesSideLight;
            yesSideLight = singleSideLightQuestion.getValue().equals("Yes");

            String slAnswer = singleSideLightQuestion.getValue();


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

            String type = glassType.getValue();
            String doorColor = color.getValue();
            String doorHand = hand.getValue();
            String doorQuantity = quantity.getText();
            String hardware1 = hardware.getValue();
            String hardware2 = secondHardware.getValue();
            String panicHardware = panicDevices.getValue();
            String pullHandle = pull.getValue();

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
            gc.fillText("Hand", 2600, 2200);
            gc.strokeLine(2600, 2225, 3250, 2225);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorHand, 2600, 2275);

            //Glass Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Glass Sizes", 2600, 2000);
            gc.strokeLine(2600, 2025, 3250, 2025);

            //Quantity Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Quantity", 2600, 1800);
            gc.strokeLine(2600, 1825, 3250, 1825);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorQuantity, 2600, 1875);

            //Color Label
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Color", 2600, 1600);
            gc.strokeLine(2600, 1625, 3250, 1625);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(doorColor, 2600, 1675);

            //Frame Label
            frameWidthDouble += 3.5;
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.EXTRA_BOLD, 75));
            gc.fillText("Frame", 2600, 1400);
            gc.strokeLine(2600, 1425, 3250, 1425);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(fTD.convertDecimalToFraction(frameWidthDouble) + " x " + frameHeightString, 2600, 1475);

            if (color.getValue().equals("Bronze")) {
                if (stileSize.getValue().equals("Narrow")) {

                    if (yesSideLight && roughWidthDouble == 68) {
                        frameWidthDouble = 36;
                        frameWidthString = "36";
                        doorWidthDouble = 31.5625;
                        doorWidthString = "31 9/16";
                        if(doorHeightDouble >= 84) {
                            jambs.stilesGreaterThanOrEqual84SL28(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
                            hAT.railsLessThan36SL28(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
                        } else {
                            jambs.stilesLessThan84SL28(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
                            hAT.railsLessThan36SL28(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
                        }
                    }
                    if (yesSideLight && roughWidthDouble == 52) {
                        frameWidthDouble = 36;
                        frameWidthString = "36";
                        doorWidthDouble = 31.5625;
                        doorWidthString = "31 9/16";
                        if(doorHeightDouble >= 84) {
                            jambs.stilesGreaterThanOrEqual84SL12(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
                            hAT.railsLessThan36SL12(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
                        } else {
                            jambs.stilesLessThan84SL12(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
                            hAT.railsLessThan36SL12(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
                        }
                    }
                    if (doorWidthDouble >= 36) {
                        if (doorHeightDouble >= 84) {
                            //Rails and Glass
                            if (bottomRail.getValue().equals("4")) {
                                rails.railsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
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
                        }
                        if (doorHeightDouble < 84) {
                            //Rails and Glass
                            if (bottomRail.getValue().equals("4")) {
                                rails.railsGreaterThanOrEqual36StilesLessThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
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
                        }
                    }
                    if (doorWidthDouble < 36) {
                        if (doorHeightDouble >= 84) {
                            //Rails and Glass
                            if (bottomRail.getValue().equals("4")) {
                                rails.railsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
                            }
                            if (bottomRail.getValue().equals("10")) {
                                rails.tenRailsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
                            }
                            //Stiles
                            stiles.stilesGreaterThanOrEqual84RailsLessThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
                            //Jambs
                            jambs.stilesGreaterThanOrEqual84RailsLessThan36(frameWidthDouble, frameHeightDouble, frameHeightString, slAnswer, gc);
                            //Header and Threshold
                            hAT.railsLessThan36StilesGreaterThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
                        }
                        if (doorHeightDouble < 84) {
                            //Rails and Glass
                            if (bottomRail.getValue().equals("4")) {
                                rails.railsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                                glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
                            }
                            if (bottomRail.getValue().equals("10")) {
                                rails.tenRailsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                                glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, gc);
                            }
                            //Stiles
                            stiles.stilesLessThan84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
                            //Jambs
                            jambs.stilesLessThan84(frameWidthDouble, frameHeightDouble, frameHeightString, slAnswer ,gc);
                            //Header and Threshold
                            hAT.railsLessThan36StilesGreaterThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);
                        }
                    }
                }
            }

            if (color.getValue().equals("Clear") &&
                    doorWidthDouble < 36 &&
                    stileSize.getValue().equals("Narrow") &&
                    doorHeightDouble < 84) {
                //Rails and Glass
                if (bottomRail.getValue().equals("4")) {
                    rails.railsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
                    glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
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
                    glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
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
                    glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
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
                    glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, type, gc);
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

            }

            /////////////////////////////Hardware
            String cylinder = "Cylinder";
            String deadBolt = "Deadbolt";
            String rim = "RIM";
            String cvr = "CVR";
            String thumbTurn = "Thumb-turn";
            String hookBolt = "Hook Bolt";
            String leverLatch = "Lever Latch";
            String eSSurfaceMount = "Electric Strike Surface Mount";
            String eSIntegrated = "Electric Strike Integrated";

            String singleHinging = hinging.getValue();

            //Hinging Type
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(singleHinging, 200, 2475);

            boolean cylinderTrue = hardware1.equals("Cylinder") || hardware2.equals("Cylinder") || hardware1.equals("Thumb-turn") || hardware2.equals("Thumb-turn");
            boolean rimTrue = panicHardware.equals("RIM");

            if (doorColor.equals("Bronze") || doorColor.equals("Black")) {
                if (doorHand.equals("Left")) {
                    switch (singleHinging) {
                        case "Pivots":
                            if (doorHeightDouble > 84)
                                hingeType.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.leftHandPivotsSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.leftHandContinuous(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.leftHandContinuousSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.leftHandButt(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.leftHandButtSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.leftHandPull(doorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.leftHandPull8Chrome(doorHeightDouble, gc);
                            break;
                        case "12\" Chrome":
                            handles.leftHandPull12(doorHeightDouble, gc);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimLeftHandPush(doorWidthDouble, doorHeightDouble, gc);
                        panics.rimLeftHandPull(doorHeightDouble, gc);
                        hw.leftHandCylindersBronzeRIM(doorWidthDouble, doorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
                    } else {
                        gc.setFill(Color.BLACK);
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.leftHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
                    }
                } else {
                    ///////////////////Right Hand Hardware
                    switch (singleHinging) {
                        case "Pivots":
                            if (doorHeightDouble > 84)
                                hingeType.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.rightHandPivotsSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.rightHandContinuous(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.rightHandContinuousSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.rightHandButt(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.rightHandButtSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.rightHandPull8Chrome(doorWidthDouble, doorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("8\" Chrome", 200, 2425);
                            break;
                        case "12\" Chrome":
                            handles.rightHandPull12(doorWidthDouble, doorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("12\" Chrome", 200, 2425);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimRightHandPush(doorWidthDouble, doorHeightDouble, gc);
                        panics.rimRightHandPull(doorWidthDouble, doorHeightDouble, gc);
                        hw.rightHandCylindersBronzeRIM(doorWidthDouble, doorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.rightHandPush(doorWidthDouble, doorHeightDouble, gc);
                    } else {
                        gc.setFill(Color.BLACK);
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.rightHandCylindersBronze(doorWidthDouble, doorHeightDouble, gc);
                    }
                }
            } else {
                if (doorHand.equals("Left")) {
                    switch (singleHinging) {
                        case "Pivots":
                            if (doorHeightDouble > 84)
                                hingeType.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.leftHandPivotsSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.leftHandContinuous(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.leftHandContinuousSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.leftHandButt(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.leftHandButtSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.leftHandPull(doorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.leftHandPull8Chrome(doorHeightDouble, gc);
                            break;
                        case "12\" Chrome":
                            handles.leftHandPull12(doorHeightDouble, gc);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimLeftHandPush(doorWidthDouble, doorHeightDouble, gc);
                        panics.rimLeftHandPull(doorHeightDouble, gc);
                        hw.leftHandCylindersClearRIM(doorWidthDouble, doorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
                    } else {
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.leftHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
                    }
                } else {
                    ///////////////////Right Hand Hardware
                    switch (singleHinging) {
                        case "Pivots":
                            if (doorHeightDouble > 84)
                                hingeType.rightHandPivots(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.rightHandPivotsSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Continuous Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.rightHandContinuous(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.rightHandContinuousSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "Butt Hinge":
                            if (doorHeightDouble > 84)
                                hingeType.rightHandButt(doorWidthDouble, doorHeightDouble, gc);
                            if (doorHeightDouble < 84)
                                hingeType.rightHandButtSmall(doorWidthDouble, doorHeightDouble, gc);
                            break;
                    }
                    switch (pullHandle) {
                        case "8\" In-house":
                            handles.rightHandPull(doorWidthDouble, doorHeightDouble, gc);
                            break;
                        case "8\" Chrome":
                            handles.rightHandPull8Chrome(doorWidthDouble, doorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("8\" Chrome", 200, 2425);
                            break;
                        case "12\" Chrome":
                            handles.rightHandPull12(doorWidthDouble, doorHeightDouble, gc);
                            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                            gc.fillText("12\" Chrome", 200, 2425);
                            break;
                    }
                    if (rimTrue) {
                        push.setSelected(false);
                        panics.rimRightHandPush(doorWidthDouble, doorHeightDouble, gc);
                        panics.rimRightHandPull(doorWidthDouble, doorHeightDouble, gc);
                        hw.rightHandCylindersClearRIM(doorWidthDouble, doorHeightDouble, gc);
                    }
                    if (push.isSelected() && !rimTrue) {
                        handles.rightHandPush(doorWidthDouble, doorHeightDouble, gc);
                    } else {
                        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
                        gc.fillText("No Push Bar", 200, 2425);
                    }
                    if (cylinderTrue && !rimTrue) {
                        hw.rightHandCylindersClear(doorWidthDouble, doorHeightDouble, gc);
                    }
                }
            }
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