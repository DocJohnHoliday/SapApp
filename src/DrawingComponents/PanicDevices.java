package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PanicDevices {

    int startX = 1650 - 200; //Start in X axis
    int startY = startX ; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

    int j = 0;

    int i = 0;


    public void rimLeftHandPull(double doorHeightDouble, GraphicsContext gc) {

        for (j = 83; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        double[] pullHandlePoly = new double[4];
        pullHandlePoly[0] = startX;                 //First X Point
        pullHandlePoly[1] = startX - recHeight + 30;//Second X point
        pullHandlePoly[2] = startX - recHeight + 30;//Third X point
        pullHandlePoly[3] = startX;                 //Fourth X point
        double[] pullHandlePoly1 = new double[4];
        pullHandlePoly1[0] = startY + recWidth + doorHeightRatio + recHeight + 110;     //First Y Point
        pullHandlePoly1[1] = startY + recWidth + doorHeightRatio + recHeight + 110;     //Second Y Point
        pullHandlePoly1[2] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Third Y Point
        pullHandlePoly1[3] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Fourth Y Point
        gc.setLineWidth(10.0);
        gc.setStroke(Color.rgb(173, 172, 172));
        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
        gc.setLineWidth(1.0);

    }

    public void rimLeftHandPush(double doorWidthDouble,double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        double[] pushBarPoly = new double[2];
        pushBarPoly[0] = startX + 20;
        pushBarPoly[1] = startX + recWidth + doorWidthRatio - 18;

        double[] pushBarPoly1 = new double[2];
        pushBarPoly1[0] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100 - 30;
        pushBarPoly1[1] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100 - 30;

        gc.setLineWidth(40.0);
        gc.setStroke(Color.rgb(173, 172, 172));
        gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
        gc.setLineWidth(1.0);

    }

    public void rimRightHandPull(double doorWidthDouble,double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        //Pull Handle RH
        double[] pullHandlePoly = new double[4];
        pullHandlePoly[0] = startX + 2 + recWidth + doorWidthRatio;     //First X Point
        pullHandlePoly[1] = startX + 2 + recWidth + doorWidthRatio - 20;//Second X point
        pullHandlePoly[2] = startX + 2 + recWidth + doorWidthRatio - 20;//Third X point
        pullHandlePoly[3] = startX + 2 + recWidth + doorWidthRatio;     //Fourth X point
        double[] pullHandlePoly1 = new double[4];
        pullHandlePoly1[0] = startY + recWidth + doorHeightRatio + recHeight + 110;     //First Y Point
        pullHandlePoly1[1] = startY + recWidth + doorHeightRatio + recHeight + 110;     //Second Y Point
        pullHandlePoly1[2] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Third Y Point
        pullHandlePoly1[3] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Fourth Y Point
        gc.setLineWidth(10.0);
        gc.setStroke(Color.rgb(173, 172, 172));
        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
        gc.setLineWidth(1.0);

    }

    public void rimRightHandPush(double doorWidthDouble,double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i=i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j=j;
        int doorHeightRatio = (j - 84) * 2;

        //Push Bar RH
        double[] pushBarPoly = new double[2];
        pushBarPoly[0] = startX + 20;
        pushBarPoly[1] = startX + recWidth + doorWidthRatio - 18;

        double[] pushBarPoly1 = new double[2];
        pushBarPoly1[0] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100;
        pushBarPoly1[1] = startY + recWidth + doorHeightRatio + recHeight - 50 + 100;

        gc.setLineWidth(40.0);
        gc.setStroke(Color.rgb(173, 172, 172));
        gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
        gc.setLineWidth(1.0);

    }
}

