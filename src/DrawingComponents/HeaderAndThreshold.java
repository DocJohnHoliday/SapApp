package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HeaderAndThreshold {

    int startX = 1650  - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    int j = 0;

    int i = 0;
    //////////////////////////////Bronze

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

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
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        gc.strokeRect(startX - 1, startY, recWidth + doorWidthRatio + 1, recHeight);
        gc.setStroke(Color.BLACK);
        //Top Rail Text
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - 1, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio + 1, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;
        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;
        //Top Rail
        gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        //Top Rail Text
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {

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
        gc.setFont(new Font(25));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio + 2, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {
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
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    ////////////////////////////////////Clear

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {
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
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {
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
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {
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
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio, recHeight -3);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, GraphicsContext gc) {
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
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight));
        //Bottom Rail
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX, startY + recWidth + doorHeightRatio + 150 + 15, recWidth + doorWidthRatio, recHeight - 3);
        gc.setStroke(Color.BLACK);
    }
}
