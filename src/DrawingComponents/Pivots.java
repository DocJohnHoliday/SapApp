package DrawingComponents;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pivots {

    int startX = 1650  - 200; //Start in X axis
    int startY = startX - 250; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

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
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 155, 7, 10);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 1550, 6, 9);

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
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 155, 7, 10);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 155, 6, 9);

    }
}
