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


    public void initialize(URL url, ResourceBundle resourceBundle) {

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
            Drawing_Warning.sfdNotEntered();
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
            if(panicHardware.equals("No Panic")) {
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
                            jambs.stilesGreaterThanOrEqual84RailsLessThan36(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
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
                            jambs.stilesLessThan84(frameWidthDouble, frameHeightDouble, frameHeightString, gc);
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

            boolean cylinderTrue = hardware1.equals("Cylinder") || hardware2.equals("Cylinder");
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
                    if (cylinderTrue  && !rimTrue) {
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
                    if (push.isSelected()  && !rimTrue) {
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