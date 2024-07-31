package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Windows {

    int startX = 1650 - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    int j = 0;
    int i = 0;

    /////////////////////////////////////////Verticals
    /////////////////////////////////////////Bronze
    public void greaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void lessThan84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 3 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + 3 + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void greaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);


    }

    public void lessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    /////////////////////////////////////Clear
    public void lessThan84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void lessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {


        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void lessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void greaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    //////////////////////////////Horizontals

    //////////////////////////////Bronze

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        gc.strokeRect(startX - 1, startY, recWidth + doorWidthRatio + 1, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - 1, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio + 1, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
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
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 1, recHeight);
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 3, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio, recHeight);
        gc.setStroke(Color.BLACK);
    }

    ////////////////////////////////////Clear

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 + 18, recWidth + doorWidthRatio, recHeight);
        gc.setStroke(Color.BLACK);
    }
}