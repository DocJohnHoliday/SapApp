package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Handles {
    int startX = 1450; //Start in X axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height


    public void narrowSingleHandles(double doorWidthDouble, double doorHeightDouble, String hand, String handleType, boolean panic, boolean push, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        double[] pullHandlePoly = new double[4];
        double[] pullHandlePoly1 = new double[4];

        double[] pushBarPoly = new double[2];
        double[] pushBarPoly1 = new double[2];

        if (hand.equals("Left")) {
            if (panic) {
                /////////////Panic Pull
                pullHandlePoly[0] = startX;                 //First X Point
                pullHandlePoly[1] = startX - recHeight + 30 + 10;//Second X point
                pullHandlePoly[2] = startX - recHeight + 30 + 10;//Third X point
                pullHandlePoly[3] = startX;                 //Fourth X point
                pullHandlePoly1[0] = startX + recWidth + doorHeightRatio + recHeight + 110;     //First Y Point
                pullHandlePoly1[1] = startX + recWidth + doorHeightRatio + recHeight + 110;     //Second Y Point
                pullHandlePoly1[2] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Third Y Point
                pullHandlePoly1[3] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;
                gc.setLineWidth(10.0);
                gc.setStroke(Color.rgb(173, 172, 172));
                gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                gc.setLineWidth(1.0);
                ////////////Panic Push
                pushBarPoly[0] = startX + 20;
                pushBarPoly[1] = startX + recWidth + doorWidthRatio - 18;
                pushBarPoly1[0] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                pushBarPoly1[1] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                gc.setLineWidth(40.0);
                gc.setStroke(Color.rgb(173, 172, 172));
                gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
                gc.setLineWidth(1.0);
                gc.setFill(Color.BLACK);
                gc.setFont(Font.font("default", FontWeight.BOLD, 30));
                gc.fillText("RIM", (double) ((startX + 20) + (startX + recWidth + doorWidthRatio - 18)) / 2, startX + recWidth + doorHeightRatio + recHeight - 50 + 100 + 7);
            } else {
                if (push) {
                    pushBarPoly[0] = startX;
                    pushBarPoly[1] = startX + recWidth + doorWidthRatio;
                    pushBarPoly1[0] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                    pushBarPoly1[1] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                    gc.setLineWidth(10.0);
                    gc.setStroke(Color.rgb(173, 172, 172));
                    gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
                    gc.setLineWidth(1.0);
                }
                switch (handleType) {
                    case "8\" In-house":
                    case "8\" Chrome":
                        pullHandlePoly[0] = startX;                 //First X Point
                        pullHandlePoly[1] = startX - recHeight + 30;//Second X point
                        pullHandlePoly[2] = startX - recHeight + 30;//Third X point
                        pullHandlePoly[3] = startX;                 //Fourth X point
                        pullHandlePoly1[0] = startX + recWidth + doorHeightRatio + recHeight + 100;     //First Y Point
                        pullHandlePoly1[1] = startX + recWidth + doorHeightRatio + recHeight + 100;     //Second Y Point
                        pullHandlePoly1[2] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Third Y Point
                        pullHandlePoly1[3] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Fourth Y Point
                        gc.setLineWidth(10.0);
                        gc.setStroke(Color.rgb(173, 172, 172));
                        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                        gc.setLineWidth(1.0);
                        break;
                    case "12\" Chrome":
                        pullHandlePoly[0] = startX;                 //First X Point
                        pullHandlePoly[1] = startX - recHeight + 30;//Second X point
                        pullHandlePoly[2] = startX - recHeight + 30;//Third X point
                        pullHandlePoly[3] = startX;                 //Fourth X point
                        pullHandlePoly1[0] = startX + recWidth + doorHeightRatio + recHeight + 100 + 20;     //First Y Point
                        pullHandlePoly1[1] = startX + recWidth + doorHeightRatio + recHeight + 100 + 20;     //Second Y Point
                        pullHandlePoly1[2] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Third Y Point
                        pullHandlePoly1[3] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Fourth Y Point
                        gc.setLineWidth(10.0);
                        gc.setStroke(Color.rgb(173, 172, 172));
                        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                        gc.setLineWidth(1.0);
                        break;
                }
            }
        } else {
            ///////////////////////////////////Right Handed////////////////////////
            if (panic) {
                //Panic Pull
                pullHandlePoly[0] = startX + 2 + recWidth + doorWidthRatio;     //First X Point
                pullHandlePoly[1] = startX + 2 + recWidth + doorWidthRatio - 20;//Second X point
                pullHandlePoly[2] = startX + 2 + recWidth + doorWidthRatio - 20;//Third X point
                pullHandlePoly[3] = startX + 2 + recWidth + doorWidthRatio;     //Fourth X point
                pullHandlePoly1[0] = startX + recWidth + doorHeightRatio + recHeight + 110;     //First Y Point
                pullHandlePoly1[1] = startX + recWidth + doorHeightRatio + recHeight + 110;     //Second Y Point
                pullHandlePoly1[2] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Third Y Point
                pullHandlePoly1[3] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100 - 40;//Fourth Y Point
                gc.setLineWidth(10.0);
                gc.setStroke(Color.rgb(173, 172, 172));
                gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                gc.setLineWidth(1.0);
                //Panic Push
                pushBarPoly[0] = startX + 20;
                pushBarPoly[1] = startX + recWidth + doorWidthRatio - 18;
                pushBarPoly1[0] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                pushBarPoly1[1] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;

                gc.setLineWidth(40.0);
                gc.setStroke(Color.rgb(173, 172, 172));
                gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
                gc.setLineWidth(1.0);

                gc.setFill(Color.BLACK);
                gc.setFont(Font.font("default", FontWeight.BOLD, 30));
                gc.fillText("RIM", (double) ((startX + 20) + (startX + recWidth + doorWidthRatio - 18)) / 2, startX + recWidth + doorHeightRatio + recHeight - 50 + 100 + 7);
            } else {
                if (push) {
                    pushBarPoly[0] = startX;
                    pushBarPoly[1] = startX + recWidth + doorWidthRatio;
                    pushBarPoly1[0] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                    pushBarPoly1[1] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;
                    gc.setLineWidth(10.0);
                    gc.setStroke(Color.rgb(173, 172, 172));
                    gc.strokePolyline(pushBarPoly, pushBarPoly1, 2);
                    gc.setLineWidth(1.0);
                }
                switch (handleType) {
                    case "8\" In-house":
                    case "8\" Chrome":
                        pullHandlePoly[0] = startX + 2 + recWidth + doorWidthRatio;     //First X Point
                        pullHandlePoly[1] = startX + 2 + recWidth + doorWidthRatio - 20;//Second X point
                        pullHandlePoly[2] = startX + 2 + recWidth + doorWidthRatio - 20;//Third X point
                        pullHandlePoly[3] = startX + 2 + recWidth + doorWidthRatio;     //Fourth X point
                        pullHandlePoly1[0] = startX + recWidth + doorHeightRatio + recHeight + 100;     //First Y Point
                        pullHandlePoly1[1] = startX + recWidth + doorHeightRatio + recHeight + 100;     //Second Y Point
                        pullHandlePoly1[2] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Third Y Point
                        pullHandlePoly1[3] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Fourth Y Point
                        gc.setLineWidth(10.0);
                        gc.setStroke(Color.rgb(173, 172, 172));
                        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                        gc.setLineWidth(1.0);
                        break;
                    case "12\" Chrome":
                        pullHandlePoly[0] = startX + 2 + recWidth + doorWidthRatio;     //First X Point
                        pullHandlePoly[1] = startX + 2 + recWidth + doorWidthRatio - 20;//Second X point
                        pullHandlePoly[2] = startX + 2 + recWidth + doorWidthRatio - 20;//Third X point
                        pullHandlePoly[3] = startX + 2 + recWidth + doorWidthRatio;     //Fourth X point
                        pullHandlePoly1[0] = startX + recWidth + doorHeightRatio + recHeight + 100 + 20;     //First Y Point
                        pullHandlePoly1[1] = startX + recWidth + doorHeightRatio + recHeight + 100 + 20;     //Second Y Point
                        pullHandlePoly1[2] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Third Y Point
                        pullHandlePoly1[3] = startX + recWidth + doorHeightRatio + recHeight - 50 + 100;//Fourth Y Point
                        gc.setLineWidth(10.0);
                        gc.setStroke(Color.rgb(173, 172, 172));
                        gc.strokePolyline(pullHandlePoly, pullHandlePoly1, 4);
                        gc.setLineWidth(1.0);
                        break;
                }
            }
        }
    }
}
