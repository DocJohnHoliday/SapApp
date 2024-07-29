package Controller;

import DrawingComponents.*;
import MathFormulas.FractionToDecimal;
import Messages.Drawing_Warning;
import Messages.Main_Warnings;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.print.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ScrollEvent;
import javafx.scene.text.Font;

import javax.imageio.ImageIO;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.SnapshotParameters;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.bouncycastle.jcajce.provider.drbg.DRBG;


public class PrintDrawerController implements Initializable {
    public TextField openingHeight;
    public TextField openingWidth;
    public TextField frameHeight;
    public TextField frameWidth;
    public TextField doorHeight;
    public TextField doorWidth;
    public ChoiceBox<String> hinging;
    public ChoiceBox<String> glass;
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
    public ChoiceBox<String> secondHardware3;
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

    public void initialize(URL url, ResourceBundle resourceBundle) {

        hand.getItems().add("Right");
        hand.getItems().add("Left");
        hand.setValue("Right");

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

        quantity.setText("0");
        doorWidth.setText("31 9/16");
        doorHeight.setText("83 1/4");

    }

    public void submitSingle(ActionEvent actionEvent) {

        String doorWidthString = doorWidth.getText();
        String doorHeightString = doorHeight.getText();

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        FractionToDecimal fTD = new FractionToDecimal();

        double doorWidthDouble = fTD.fractionToDecimal(doorWidth.getText());
        double doorHeightDouble = fTD.fractionToDecimal(doorHeight.getText());

        double frameWidthDouble = fTD.fractionToDecimal(doorWidth.getText()) + 4.4375;
        double frameHeightDouble = fTD.fractionToDecimal(doorHeight.getText()) + 2.5;

        String frameWidthString = fTD.convertDecimalToFraction(frameWidthDouble);
        String frameHeightString = fTD.convertDecimalToFraction(frameHeightDouble);

        if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsGreaterThanOrEqual36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stile
            stiles.stilesGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsLessThan36(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsLessThan36StilesGreaterThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesGreaterThanOrEqual84RailsLessThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84RailsLessThan36(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36StilesGreaterThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsGreaterThanOrEqual36StilesLessThan84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84RailGreaterThan36(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36StilesLessThan84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsLessThan36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84Clear(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsLessThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThanOrEqual84Clear(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThanOrEqual36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsGreaterThanOrEqual36Clear(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesLessThan84RailGreaterThan36Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesLessThan84RailGreaterThan36Clear(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsGreaterThanOrEqual36Clear(frameWidthDouble, frameHeightDouble, frameWidthString, gc);

        } else if (color.getValue().equals("Clear") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            Stiles stiles = new Stiles();
            Rails rails = new Rails();
            Jambs jambs = new Jambs();
            HeaderAndThreshold hAT = new HeaderAndThreshold();
            //Rails
            rails.railsLessThan36ClearStileGreaterThanOrEqual84(doorWidthDouble, doorHeightDouble, doorWidthString, gc);
            //Stiles
            stiles.stilesGreaterThanOrEqual84Clear(doorWidthDouble, doorHeightDouble, doorHeightString, gc);
            //Jambs
            jambs.stilesGreaterThanOrEqual84Clear(frameWidthDouble, frameHeightDouble,frameHeightString, gc);
            //Header and Threshold
            hAT.railsLessThan36ClearStileGreaterThanOrEqual84(frameWidthDouble, frameHeightDouble, frameWidthString, gc);




        } else {
            Main_Warnings.nothingWarning();
        }
        if (secondHardware.getValue().equals("Cylinder") && hand.getValue().equals("Left") && color.getValue().equals("Bronze")) {
            Hardware hw = new Hardware();
            Handles handles = new Handles();
            Pivots pivots = new Pivots();
            //Pull Bar Left Hand
            handles.leftHandPull(doorHeightDouble, gc);
            //Push Bar LH
            handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);
            //Left Hand Pivots
            pivots.leftHandPivots(doorWidthDouble, doorHeightDouble, gc);
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
            handles.leftHandPull(doorHeightDouble, gc);
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

    public void Zoom(ScrollEvent scrollEvent) {

        AnimatedZoomOperator zoomOperator = new AnimatedZoomOperator();
                double zoomFactor = 1.5;
                if (scrollEvent.getDeltaY() <= 0) {
                    // zoom out
                    zoomFactor = 1 / zoomFactor;
                }
                zoomOperator.zoom(previewCanvas, zoomFactor, scrollEvent.getSceneX(), scrollEvent.getSceneY());
    }


    public void print(ActionEvent actionEvent) throws PrinterException {

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();

        PrinterJob printerJob = PrinterJob.createPrinterJob();
        if (printerJob != null) {
            PageLayout pageLayout = printerJob.getPrinter().createPageLayout(Paper.NA_LETTER, PageOrientation.LANDSCAPE, 0, 0, 0, 0);

            boolean success = printerJob.printPage(pageLayout, gc.getCanvas());
            if (success) {
                printerJob.endJob();
            }
        }

    }

    public void clearJob(ActionEvent actionEvent) {
    }

    public void submitJob(ActionEvent actionEvent) {
        if(sfdNum.getLength() != 0) {
            GraphicsContext gc = previewCanvas.getGraphicsContext2D();
            String sfdNumber = sfdNum.getText();
            gc.setFont(new Font(100));
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

//        PDDocument doc = new PDDocument();
//        PDPage page = new PDPage();
//        PDImageXObject pdimage;
//        PDPageContentStream content;
//        try {
//            pdimage = PDImageXObject.createFromFile("pane.png",doc);
//            content = new PDPageContentStream(doc, page);
//            content.drawImage(pdimage,-50,300);
//            content.close();
//            doc.addPage(page);
//            doc.save("pdf_file.pdf");
//            doc.close();
//            file.delete();
//        } catch (IOException ex) {
//            //Logger.getLogger(NodeToPdf.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}