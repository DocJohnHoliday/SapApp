package Model;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pivots {

    int startX = 300; //Start in X axis
    int startY = 50; //Start in Y axis
    int recWidth = 300; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    int j = 0;

    int i = 0;

    public void leftHandPivots(double doorWidthDouble,double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

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

    }

    public void rightHandPivots(double doorWidthDouble,double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

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
}
