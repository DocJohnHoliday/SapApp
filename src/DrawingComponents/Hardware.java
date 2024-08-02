package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Hardware {

    int startX = 1650  - 200; //Start in X axis
    int startY = startX; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

    int j = 0;

    int i = 0;

///////////////////////////Bronze
    public void leftHandCylindersBronze(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.WHITE);
        gc.fillOval(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 15 + 100, 20, 20);
        gc.setStroke(Color.BLACK);
    }

    public void rightHandCylindersBronze(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.WHITE);
        gc.fillOval(startX + recWidth + doorWidthRatio + 2, startY + recWidth + doorHeightRatio + recHeight + 15 + 100, 20, 20);
        gc.setStroke(Color.BLACK);
    }

    //////////////////////////Clear
    public void leftHandCylindersClear(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillOval(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 15 + 100, 20, 20);
        gc.setStroke(Color.BLACK);
    }

    public void rightHandCylindersClear(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillOval(startX + recWidth + doorWidthRatio + 2, startY + recWidth + doorHeightRatio + recHeight + 15 + 100, 20, 20);
        gc.setStroke(Color.BLACK);
    }
}