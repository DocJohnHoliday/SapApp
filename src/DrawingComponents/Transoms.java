package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Transoms {
    int startX = 1450; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    Glass glass = new Glass();

    public void singleTransom(double transomWidthDouble, double transomHeightDouble, double doorWidthDouble, double doorHeightDouble, String doorWidthString, String doorHeightString, String color, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY - 200 - doorHeightRatio - 5);
        gc.fillText(doorHeightString, 1250 + 200, startY - 200 - doorHeightRatio + 100);
        glass.transomGlass5mm(transomWidthDouble, transomHeightDouble, 1, "3/16 Clr", gc);

        if (color.equals("Bronze") || color.equals("Black")) {
            gc.setFill(Color.rgb(95, 87, 87));
            //Top 125
            gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio  + 24, recHeight);
            //Bottom 125
            gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio  + 24, recHeight - 3);

            //Left 125
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            //Right 125
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX + recWidth + doorWidthRatio, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
        } else {
            //Top 125
            gc.strokeRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight);
            //Bottom 125
            gc.strokeRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight - 3);
            //Left 125
            gc.strokeRect(startX - recHeight, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            //Right 125
            gc.strokeRect(startX + recWidth + doorWidthRatio + 400, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
        }
    }

    public void pairTransom(double transomWidthDouble, double transomHeightDouble, double doorWidthDouble, double doorHeightDouble, String doorWidthString, String doorHeightString, String color, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);


        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) + 200, startY - 200 - doorHeightRatio - 5);
        gc.fillText(doorHeightString, 1250 + 200, startY - 200 - doorHeightRatio + 100);
        glass.transomGlass5mm(transomWidthDouble, transomHeightDouble, 1, "3/16 Clr", gc);


        if (color.equals("Bronze") || color.equals("Black")) {
            gc.setFill(Color.rgb(95, 87, 87));
            //Top 125
            gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight);
            //Bottom 125
            gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight - 3);

            //Left 125
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            //Right 125
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX + recWidth + doorWidthRatio + 400, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
        } else {
            //Top 125
            gc.strokeRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight);
            //Bottom 125
            gc.strokeRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight - 3);
            //Left 125
            gc.strokeRect(startX - recHeight, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            //Right 125
            gc.strokeRect(startX + recWidth + doorWidthRatio + 400, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
        }
    }
}
