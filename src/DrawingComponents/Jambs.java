package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Jambs {

    int startX = 1650 - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    int j = 0;

    int i = 0;

    /////////////////////////////////////////Bronze
    public void stilesGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        int i = 0;
        for (i = 35; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 83; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        //Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    public void stilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        //Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX + 1 + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    public void stilesGreaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;
        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;
        //First Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    public void stilesLessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        int i = 0;
        for (i = 35; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        //Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    /////////////////////////////////////Clear
    public void stilesLessThan84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    public void stilesLessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        int i = 0;
        for (i = 35; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 83; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    public void stilesLessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {
        int i = 0;
        for (i = 35; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;
        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;
        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }

    public void stilesGreaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {
        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;
        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;
        //First Stile
        gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
        //Stile Text
        gc.fillText(doorHeightString,(startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 150) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 150);
    }
}
