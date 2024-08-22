package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Rails {

    int startX = 1450; //Start in X axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

    public void narrowSingleRails(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, String bottomRail,GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (color.equals("Bronze") || color.equals("Black")) {

            ///////////////////////////Top Rail
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX, startX, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startX + (2 * recHeight) + 35);

            switch (bottomRail) {
                case "4":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX, startX + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
                    break;
                case "7 1/2":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 20);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    gc.setFill(Color.BLACK);
                    break;
                case "10":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 1, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 1, recHeight + 15 + 30);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    gc.setFill(Color.BLACK);
                    break;
            }
        } else {
            //Top Rail
            gc.strokeRect(startX, startX, recWidth + doorWidthRatio, recHeight);
            //Top Rail Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startX + (2 * recHeight) + 35);

            switch (bottomRail) {
                case "4":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
                    break;
                case "7 1/2":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 20);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    break;
                case "10":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    break;
            }
        }
    }
}
