package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Hardware {
    int startX = 1450; //Start in X axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

    ///////////////////////////Narrow Stile Cylinders/////////////////////////////
    public void narrowSingleCylinders(double doorWidthDouble, double doorHeightDouble, String hand, boolean panic, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (!panic) {
            gc.setFill(Color.WHITE);
            if (hand.equals("Left")) {
                gc.fillOval(startX - recHeight + 1, startX + recWidth + doorHeightRatio + recHeight + 15 + 100, 20, 20);
                gc.setStroke(Color.BLACK);
            } else if (hand.equals("Right")) {
                gc.fillOval(startX + recWidth + doorWidthRatio + 2, startX + recWidth + doorHeightRatio + recHeight + 15 + 100, 20, 20);
                gc.setStroke(Color.BLACK);
            }
        } else {
            /////////////////////////////////RIM Cylinders
            gc.setFill(Color.WHITE);
            if (hand.equals("Left")) {
                gc.fillOval(startX - recHeight + 1, startX + recWidth + doorHeightRatio + recHeight + 15 + 100 - 75, 20, 20);
                gc.setStroke(Color.BLACK);
            } else if (hand.equals("Right")) {
                gc.fillOval(startX + recWidth + doorWidthRatio + 2, startX + recWidth + doorHeightRatio + recHeight + 15 + 100 - 75, 20, 20);
                gc.setStroke(Color.BLACK);
            }
        }
    }
}
