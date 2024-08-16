package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SideLightsRight {

    int startX = 1650 - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    int j = 0;
    int i = 0;


    //////////////////////////////Horizontals
    //////////////////////////////Bronze

    public void slGreaterThanOrEqual36Right(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        gc.strokeRect(startX - 1, startY, recWidth + doorWidthRatio + 1, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - 1, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 1, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void slLessThan36StilesGreaterThan84Right(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void slLessThan36Right(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 2, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void slGreaterThanOrEqual36StilesLessThan84Right(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    ////////////////////////////////////Clear

    public void slLessThan36ClearRight(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void slLessThanOrEqual36ClearRight(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void slGreaterThanOrEqual36ClearRight(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void slLessThan36ClearStileGreaterThanOrEqual84Right(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    //////////////////////////////////////////////////Verticals
    /////////////////////////////////////////Bronze
    public void slGreaterThanOrEqual84Right(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + 5 + recWidth + (doorWidthRatio * 5), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void slLessThan84Right(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;
        System.out.println(doorWidthRatio);


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + 5 + recWidth + (doorWidthRatio * -5 ), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        System.out.println("Here too");
    }

    public void slGreaterThanOrEqual84RailsLessThan36Right(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + 1 + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void slLessThan84RailGreaterThan36Right(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + 1 + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    /////////////////////////////////////Clear
    public void slLessThan84ClearRight(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + 1 + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void slLessThanOrEqual84ClearRight(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;


        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;

        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void slLessThan84RailGreaterThan36ClearRight(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void slGreaterThanOrEqual84ClearRight(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 5;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 5;
        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }
}