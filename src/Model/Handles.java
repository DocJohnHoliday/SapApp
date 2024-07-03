package Model;

import Controller.PrintDrawerController;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Handles extends PrintDrawerController {

    int startX = 300; //Start in X axis
    int startY = 50; //Start in Y axis
    int recWidth = 300; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    int j = 0;

    int i = 0;


    public void leftHandPull(double doorWidthDouble,double doorHeightDouble, GraphicsContext gc) {

        int startX = 300; //Start in X axis
        int startY = 50; //Start in Y axis
        int recWidth = 300; //Rectangle Width
        int recHeight = 12; //Rectangle Height

        int j = 0;

        int i = 0;

        for (i = 35; i < doorWidthDouble; i++)
            System.out.println(i);
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            System.out.println(j);
        int doorHeightRatio = (j - 84) * 10;

        double[] pullHandlePoly = new double[4];
        pullHandlePoly[0] = startX;                 //First X Point
        pullHandlePoly[1] = startX - recHeight + 30;//Second X point
        pullHandlePoly[2] = startX - recHeight + 30;//Third X point
        pullHandlePoly[3] = startX;                 //Fourth X point
        double[] pullHandlePoly1 = new double[4];
        pullHandlePoly1[0] = recWidth + doorHeightRatio + recHeight;     //First Y Point
        pullHandlePoly1[1] = recWidth + doorHeightRatio + recHeight;     //Second Y Point
        pullHandlePoly1[2] = recWidth + doorHeightRatio + recHeight - 50;//Third Y Point
        pullHandlePoly1[3] = recWidth + doorHeightRatio + recHeight - 50;//Fourth Y Point
        gc.setLineWidth(5.0);
        gc.setStroke(Color.rgb(173, 172, 172));
        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
        gc.setLineWidth(1.0);

    }
}
