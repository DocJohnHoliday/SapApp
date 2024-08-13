package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PairHeaderAndThreshold {

    int startX = 1650  - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    int j = 0;
    int i = 0;

    FractionsAndDecimals ftd = new FractionsAndDecimals();
    //////////////////////////////Bronze

    public void railsLessThan36SL28(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        //Header
        gc.setFill(Color.rgb(95, 87,87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 241, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX + 240, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 35));
        gc.fillText("26 3/4", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) + 250, startY + (2 * recHeight) + 35 - 5);
        gc.fillText("28\" SL", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30 + 260, startY + (2 * recHeight) + 35 + 55);
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText("3/16   Clr 26 1/4 x " + ftd.convertDecimalToFraction(doorHeightDouble - 3.0), 2600, 2125);
        //Threshold
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX + 240, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 2, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36SL12(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        //Header
        gc.setFill(Color.rgb(95, 87,87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 141, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX + 140, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 35));
        gc.fillText("10 3/4", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) + 200, startY + (2 * recHeight) + 35 - 5);
        gc.fillText("12\" SL", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30 + 225, startY + (2 * recHeight) + 35 + 55);
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText("3/16   Clr 10 3/4 x " + ftd.convertDecimalToFraction(doorHeightDouble - 3.0), 2600, 2125);
        //Threshold
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX + 140, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 2, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        //Header
        gc.setFill(Color.rgb(95, 87,87));
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

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87,87));
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

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        //Header
        gc.setFill(Color.rgb(95, 87,87));
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

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    ////////////////////////////////////Clear

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;
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
}
