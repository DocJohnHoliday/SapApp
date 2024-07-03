package Model;

import Controller.PrintDrawerController;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Handles extends PrintDrawerController {

    public static TextField doorHeight;
    public static TextField doorWidth;

    static double doorWidthDouble;
    static double doorHeightDouble;

    static int startX = 300; //Start in X axis
    static int startY = 50; //Start in Y axis
    static int recWidth = 300; //Rectangle Width
    static int recHeight = 12; //Rectangle Height

    static int j = 0;

    static int i = 0;


    GraphicsContext gc = previewCanvas.getGraphicsContext2D();

    public void leftHandPull(double doorWidth, double doorHeight) {

        double doorWidthDouble = doorWidth;
        double doorHeightDouble = doorHeight;

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
