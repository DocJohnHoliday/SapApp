package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PairRails {

    int startX = 1650 - 200; //Start in X axis
    int startY = startX; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height
    int j = 0;
    int i = 0;
    //////////////////////////////Bronze 4" Bottom Rails

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
    }

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio - 1, recHeight + 15);
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio + 2, recHeight + 15);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio - 1, recHeight + 15);
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio + 2, recHeight + 15);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
    }

    ////////////////////////////////////Clear 4" Bottom Rails

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
    }

    //////////////////////// Bronze 10" Bottom Rails
    public void tenRailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;


        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //10" Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 1, recHeight + 15 + 30);
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio + 2, recHeight + 15 + 30);
        gc.setStroke(Color.BLACK);
        //10" Bottom Rail Text
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }

    public void tenRailsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
        //10" Bottom Rail Text
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }

    public void tenRailsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY, recWidth + doorWidthRatio - 1, recHeight);
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio + 2, recHeight);
        gc.setStroke(Color.BLACK);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + 1, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 1, recHeight + 15 + 30);;
        gc.setStroke(Color.BLACK);
        //10" Bottom Rail Text
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }
    public void tenRailsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
        //10" Bottom Rail Text
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }

    ////////////////////////////////////Clear 10" Bottom Rails

    public void tenRailsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
        //10" Bottom Rail Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }

    public void tenRailsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
        //10" Bottom Rail Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }

    public void tenRailsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
        //10" Bottom Rail Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }

    public void tenRailsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Top Rail
        gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        //Bottom Rail
        gc.strokeRect(startX, startY + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
        //10" Bottom Rail Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 27));
        gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startY + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
        gc.setFill(Color.BLACK);
    }
}

