package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Hardware {

    int startX = 300; //Start in X axis
    int startY = 50; //Start in Y axis
    int recWidth = 300; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    int j = 0;

    int i = 0;

///////////////////////////Bronze
    public void leftHandCylindersBronze(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        gc.setFill(Color.WHITE);
        gc.fillOval(startX - recHeight + 1, recWidth + doorHeightRatio + recHeight + 15, 10, 10);

        gc.setStroke(Color.BLACK);
    }

    public void rightHandCylindersBronze(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        gc.setFill(Color.WHITE);
        gc.fillOval(startX + recWidth + doorWidthRatio + 2, recWidth + doorHeightRatio + recHeight + 15, 10, 10);

        gc.setStroke(Color.BLACK);
    }

    //////////////////////////Clear
    public void leftHandCylindersClear(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillOval(startX - recHeight + 1, recWidth + doorHeightRatio + recHeight + 15, 10, 10);

        gc.setStroke(Color.BLACK);
    }

    public void rightHandCylindersClear(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        int i = 0;
        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        int j = 0;
        for (j = 0; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillOval(startX + recWidth + doorWidthRatio + 2, recWidth + doorHeightRatio + recHeight + 15, 10, 10);

        gc.setStroke(Color.BLACK);
    }
}
