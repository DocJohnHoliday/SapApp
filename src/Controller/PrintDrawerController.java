package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

import java.awt.*;
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

    public void initialize(URL url, ResourceBundle resourceBundle) {


        type.getItems().add("Custom Single RH");
        type.getItems().add("Custom Single LH");
        type.getItems().add("Custom Pair");

        hinging.getItems().add("No Hinging");
        hinging.getItems().add("Continuous Hinge");
        hinging.getItems().add("Pivots");
        hinging.getItems().add("Butt Hinge");

        glass.getItems().add("No Glass");
        glass.getItems().add("3/16 Clear");
        glass.getItems().add("1/4 Clear");
        glass.getItems().add("3/16 Bronze");
        glass.getItems().add("1/4 Bronze");
        glass.getItems().add("3/16 Grey");
        glass.getItems().add("1/4 Grey");
        glass.getItems().add("IG");
        glass.getItems().add("Low E");

        hardware.getItems().add("No Hardware");
        hardware.getItems().add("Cylinder");
        hardware.getItems().add("RIM");
        hardware.getItems().add("CVR");
        hardware.getItems().add("Thumb-turn");
        hardware.getItems().add("Hook Bolt");
        hardware.getItems().add("Lever Latch");
        hardware.getItems().add("Electric Strike Surface Mount");
        hardware.getItems().add("Electric Strike Integrated");

        secondHardware.getItems().add("No Hardware");
        secondHardware.getItems().add("Cylinder");
        secondHardware.getItems().add("RIM");
        secondHardware.getItems().add("CVR");
        secondHardware.getItems().add("Thumb-turn");
        secondHardware.getItems().add("Hook Bolt");
        secondHardware.getItems().add("Lever Latch");
        secondHardware.getItems().add("Electric Strike Surface Mount");
        secondHardware.getItems().add("Electric Strike Integrated");

        bottomRail.getItems().add("4");
        bottomRail.getItems().add("7 1/2");
        bottomRail.getItems().add("10");

        stileSize.getItems().add("Narrow");
        stileSize.getItems().add("Medium");
        stileSize.getItems().add("Wide");

        color.getItems().add("Bronze");
        color.getItems().add("Clear");
        color.getItems().add("White");
        color.getItems().add("Black");

        pull.getItems().add("8\" In-house");
        pull.getItems().add("8\" Chrome");
        pull.getItems().add("10\" Chrome");

        hardwareUneven.getItems().add("No Hardware");
        hardwareUneven.getItems().add("Cylinder");
        hardwareUneven.getItems().add("RIM");
        hardwareUneven.getItems().add("CVR");
        hardwareUneven.getItems().add("Thumb-turn");
        hardwareUneven.getItems().add("Hook Bolt");
        hardwareUneven.getItems().add("Lever Latch");
        hardwareUneven.getItems().add("Electric Strike Surface Mount");
        hardwareUneven.getItems().add("Electric Strike Integrated");


    }

    public void clear(ActionEvent actionEvent) {

        clearCanvas(previewCanvas.getGraphicsContext2D());

    }

    public void submit(ActionEvent actionEvent) {
        drawShapes(previewCanvas.getGraphicsContext2D());
        drawShapes(doorCanvas.getGraphicsContext2D());
    }

    public void mainMenu(ActionEvent actionEvent) {
    }

    private void clearCanvas(GraphicsContext gc) {
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
    }

    private void drawShapes(GraphicsContext gc) {

        try {

            String doorXString = doorHeight.getText();
            int doorX = Integer.parseInt(String.valueOf(doorXString));

            if (doorX > 20) {
                gc.setStroke(Color.CHOCOLATE);
                gc.setLineWidth(10);
                gc.strokeLine(100, 100, 100, 100);
                gc.setFill(Color.CHOCOLATE);
            } else {
                gc.setStroke(Color.BLUE);
                gc.setLineWidth(10);
                gc.strokeLine(200, 200, 200, 200);
                gc.setFill(Color.BLUE);
            }
        } catch (NumberFormatException e) {
            System.out.println("Shit");
        }

//        gc.fillOval(10, 60, 30, 30);
//        gc.strokeOval(60, 60, 30, 30);
//        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
//        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
//        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
//        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
//        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
//        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
//        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
//        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
//        gc.fillPolygon(new double[]{10, 40, 10, 40},
//                new double[]{210, 210, 240, 240}, 4);
//        gc.strokePolygon(new double[]{60, 90, 60, 90},
//                new double[]{210, 210, 240, 240}, 4);
//        gc.strokePolyline(new double[]{110, 140, 110, 140},
//                new double[]{210, 210, 240, 240}, 4);
    }
    private void moveCanvas(int x, int y) {
        previewCanvas.setTranslateX(x);
        previewCanvas.setTranslateY(y);
    }
}
