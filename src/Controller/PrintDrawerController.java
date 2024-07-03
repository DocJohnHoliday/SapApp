package Controller;

import Model.Handles;
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
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
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

        int startX = 300; //Start in X axis
        int startY = 50; //Start in Y axis
        int recWidth = 300; //Rectangle Width
        int recHeight = 12; //Rectangle Height

        String doorWidthString = doorWidth.getText();
        String doorHeightString = doorHeight.getText();

        GraphicsContext gc = previewCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        double doorWidthDouble = fractionToDecimalWidth(doorWidth.getText());
        double doorHeightDouble = fractionToDecimalHeight(doorHeight.getText());


        if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {

            int i = 0;
            for (i = 35; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 83; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
            //Bottom Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);
            //Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            int i = 0;
            for (i = 0; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 0; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.setStroke(Color.WHITE);
            gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
            gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
            gc.setStroke(Color.BLACK);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
            //Bottom Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.setStroke(Color.WHITE);
            gc.fillRect(startX + 1, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio - 1, recHeight + 15);
            gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio + 2, recHeight + 15);
            gc.setStroke(Color.BLACK);
            //Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX + 1 + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);


            if(secondHardware.getValue().equals("Cylinder") && hand.getValue().equals("Left")) {
                gc.setFill(Color.WHITE);
                gc.fillOval(startX - recHeight + 1, recWidth + doorHeightRatio + recHeight + 15, 10, 10);

                //Pull Bar Left Hand
                Handles handles = new Handles();
                handles.leftHandPull( doorWidthDouble, doorHeightDouble, gc );

                //Push Bar LH
                handles.leftHandPush(doorWidthDouble, doorHeightDouble, gc);

                //Top Pivot LH
                gc.setFill(Color.WHITE);
                gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 7, 10);
                gc.setFill(Color.rgb(173, 172, 172));
                gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 6, 9);

                //Bottom Pivot LH
                gc.setFill(Color.WHITE);
                gc.fillRect(startX + 5 + recWidth + doorWidthRatio, recWidth + doorHeightRatio + recHeight + 15 + 190, 7, 10);
                gc.setFill(Color.rgb(173, 172, 172));
                gc.fillRect(startX + 5 + recWidth + doorWidthRatio, recWidth + doorHeightRatio + recHeight + 15 + 190, 6, 9);

            } else {
                gc.setFill(Color.WHITE);
                gc.fillOval(startX + recWidth + doorWidthRatio + 2, recWidth + doorHeightRatio + recHeight + 15, 10, 10);

                //Pull Handle RH
                double[] pullHandlePoly = new double[4];
                pullHandlePoly[0] = startX + 2 + recWidth + doorWidthRatio;     //First X Point
                pullHandlePoly[1] = startX + 2 + recWidth + doorWidthRatio - 20;//Second X point
                pullHandlePoly[2] = startX + 2 + recWidth + doorWidthRatio - 20;//Third X point
                pullHandlePoly[3] = startX + 2 + recWidth + doorWidthRatio;     //Fourth X point
                double[] pullHandlePoly1 = new double[4];
                pullHandlePoly1[0] = recWidth + doorHeightRatio + recHeight;     //First Y Point
                pullHandlePoly1[1] = recWidth + doorHeightRatio + recHeight;     //Second Y Point
                pullHandlePoly1[2] = recWidth + doorHeightRatio + recHeight - 50;//Third Y Point
                pullHandlePoly1[3] = recWidth + doorHeightRatio + recHeight - 50;//Fourth Y Point
                gc.setLineWidth(5.0);
                gc.setStroke(Color.rgb(173, 172, 172));
                gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                gc.setLineWidth(1.0);

                //Push Bar RH
                double[] pushBarPoly = new double[2];
                pushBarPoly[0] = startX;
                pushBarPoly[1] = startX + recWidth + doorWidthRatio;

                double[] pushBarPoly1 = new double[2];
                pushBarPoly1[0] = recWidth + doorHeightRatio + recHeight - 50;
                pushBarPoly1[1] = recWidth + doorHeightRatio + recHeight - 50;

                gc.setLineWidth(5.0);
                gc.setStroke(Color.rgb(173, 172, 172));
                gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
                gc.setLineWidth(1.0);

                //Top Pivot RH
                gc.setFill(Color.WHITE);
                gc.fillRect(startX - recHeight + 1, startY, 7, 10);
                gc.setFill(Color.rgb(173, 172, 172));
                gc.fillRect(startX - recHeight + 1, startY, 6, 9);

                //Bottom Pivot RH
                gc.setFill(Color.WHITE);
                gc.fillRect(startX - recHeight + 1, recWidth + doorHeightRatio + recHeight + 15 + 190, 7, 10);
                gc.setFill(Color.rgb(173, 172, 172));
                gc.fillRect(startX - recHeight + 1, recWidth + doorHeightRatio + recHeight + 15 + 190, 6, 9);
            }

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
            int i = 0;
            for (i = 0; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 83; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
            //Bottom Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);
            //Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            int i = 0;
            for (i = 35; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 0; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
            //Bottom Rail
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);
            //Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);

        } else if (color.getValue().equals("Clear") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            int i = 0;
            for (i = 0; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 0; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));

            //Bottom Rail
            gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);

            //First Stile
            gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);

        } else if (color.getValue().equals("Clear") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {

            int i = 0;
            for (i = 35; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 83; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));

            //Bottom Rail
            gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);

            //First Stile
            gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);

        } else if (color.getValue().equals("Clear") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble < 84) {
            int i = 0;
            for (i = 35; i < doorWidthDouble; i++)
                System.out.println(i);
            int doorWidthRatio = (i - 40) * 10;

            int j = 0;
            for (j = 0; j < doorHeightDouble; j++)
                System.out.println(j);
            int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));

            //Bottom Rail
            gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);

            //First Stile
            gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);

        }  else if (color.getValue().equals("Clear") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84) {
        int i = 0;
        for (i = 35; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

            //Top Rail
            gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.strokeText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));

            //Bottom Rail
            gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 150, recWidth + doorWidthRatio, recHeight + 15);

            //First Stile
            gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
            //Stile Text
            gc.strokeText(doorHeightString, ((startX + recWidth + doorWidthRatio) + recHeight) + 2, (double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2);
            //Second Stile
            gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
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
}
