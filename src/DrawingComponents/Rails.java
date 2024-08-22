package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Rails {

    int startX = 1450; //Start in X axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height


    ////////////////////////////// 2 1/2" Top Rails/////////////////////////////////////////////
    public void twoTopRails(double doorWidthDouble, String doorWidthString, String color, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        if (color.equals("Bronze") || color.equals("Black")) {
            //Bronze or Black
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX, startX, recWidth + doorWidthRatio, recHeight);
        } else {
            //Clear or White
            gc.strokeRect(startX, startX, recWidth + doorWidthRatio, recHeight);
        }
        //Top Rail Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startX + (2 * recHeight) + 35);
    }

    ////////////////////////////// 4" Bottom Rails /////////////////////////////////////////////
    public void fourBottomRails(double doorWidthDouble, double doorHeightDouble, String color, String size, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (color.equals("Bronze") || color.equals("Black")) {
            //Bronze or Black
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX, startX + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
        } else {
            //Clear or White
            gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio, recHeight + 15);
        }
    }

    //////////////////////// Bronze 10" Bottom Rails ////////////////////////////////////////////
    public void tenBottomRails(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, String Size, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (color.equals("Bronze") || color.equals("Black")) {
            //Bronze or Black
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX + 1, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 1, recHeight + 15 + 30);
            //Text
            gc.setFill(Color.WHITE);
            gc.setFont(Font.font("default", FontWeight.BOLD, 27));
            gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
            gc.setFill(Color.BLACK);
        } else {
            //Clear or White
            gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
            //Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 27));
            gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
            gc.setFill(Color.BLACK);
        }
    }

    /////////////////////// Bronze 7 1/2" Bottom Rails
    public void sevenBottomRails(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, String size, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (color.equals("Bronze") || color.equals("Black")) {
            //Bronze or Black
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 20);
            //Text
            gc.setFill(Color.WHITE);
            gc.setFont(Font.font("default", FontWeight.BOLD, 27));
            gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
            gc.setFill(Color.BLACK);
        } else {
            //Clear or White
            gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 15 + 5);
            //Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 27));
            gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
            gc.setFill(Color.BLACK);
        }

    }
}
