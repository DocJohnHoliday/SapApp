package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HeaderAndThreshold {

    int startX = 1450; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    public void headersAndThresholds(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY + (2 * recHeight) + 35);
        gc.fillText("Frame", (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY + (2 * recHeight) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - 1, startY + recWidth + doorHeightRatio + 350 + 15, recWidth + doorWidthRatio + 1, recHeight - 3);
        gc.setStroke(Color.BLACK);

        if (color.equals("Bronze") || color.equals("Black")) {
            //Header
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        } else {
            //Header
            gc.strokeRect(startX, startY, recWidth + doorWidthRatio, recHeight);
        }
    }
}
