package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Jambs {
    int startX = 1450; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height

    public void jambs(double doorWidthDouble, double doorHeightDouble, String doorHeightString, String slAnswer, String color, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Stile Text
//        if (slAnswer.equals("No")) {
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth + doorWidthRatio) + recHeight, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
//        }

        if (color.equals("Bronze") || color.equals("Black")) {
            //Left Jamb
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Right Jamb
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else {
            //Left Jamb
            gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Right Jamb
            gc.strokeRect(startX + recWidth + doorWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        }
    }

    public void pairJambs(double doorWidthDouble, double doorHeightDouble, String doorHeightString, boolean slAnswer, String color, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Stile Text
        if (!slAnswer) {
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorHeightString, 1250, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        }

        if (color.equals("Bronze") || color.equals("Black")) {
            //Left Jamb
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Right Jamb
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX + recWidth + doorWidthRatio + 400, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else {
            //Left Jamb
            gc.strokeRect(startX - recHeight, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Right Jamb
            gc.strokeRect(startX + recWidth + doorWidthRatio + 400, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        }
    }
}
