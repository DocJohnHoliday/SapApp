package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SideLightLeft {

    int startX = 1650 - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    int j = 0;
    int i = 0;
    int m = 0;


    /////////////////////////////////////////Bronze
    public void stilesGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, int panels, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 35; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = (i - 40) * 10;

        double leftJamb = startX - recHeight;
        double farLeft125 = startX - recHeight - slWidthRatio;

        //Far 125 Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Far 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(farLeft125, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        if (panels == 2) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) / 2) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) / 2) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 3) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) / 3) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) / 3) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect((((farLeft125 - leftJamb) / 3) * 2 + leftJamb) - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((((farLeft125 - leftJamb) / 3) * 2 + leftJamb), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 4) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.25) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.25) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) / 2) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) / 2) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.75) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.75) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 5) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.2) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.2) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.4) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.4) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.6) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.6) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.8) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.8) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 6) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.16) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.16) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.33) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.33) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.5) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.5) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.66) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.66) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.83) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.83) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 7) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.14) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.14) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.28) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.28) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.42) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.42) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.57) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.57) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.71) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.71) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.85) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.85) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 8) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.125) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.125) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.25) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.25) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.375) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.375) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.5) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.5) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.625) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.625) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.75) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.75) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.875) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.875) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else if (panels == 9) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.11) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.11) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.22) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.22) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.33) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.33) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.44) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.44) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.55) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.55) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.66) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.66) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.77) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.77) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.88) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.88) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 10) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.1) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.1) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.2) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.2) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.3) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.3) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.4) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.4) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.5) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.5) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.6) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.6) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.7) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.7) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.8) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.8) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Ninth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farLeft125 - leftJamb) * 0.9) + leftJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farLeft125 - leftJamb) * 0.9) + leftJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        }
    }

    public void stilesLessThan84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, int panels, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (int) ((doorWidthDouble - 40) * 2);

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 0; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = ((i - 40) * 10);

        double rightJamb = startX + 1 + recWidth + doorWidthRatio;
        double farRight125 = startX + recWidth + slWidthRatio;

        //Far 125 Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Far 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX - recHeight - slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        if (panels == 2) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 3) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb) - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 4) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 5) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 6) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.16) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.16) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.83) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.83) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 7) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.14) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.14) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.28) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.28) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.42) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.42) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.57) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.57) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.71) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.71) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.85) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.85) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 8) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.125) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.125) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.375) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.375) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.625) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.625) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.875) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.875) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else if (panels == 9) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.11) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.11) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.22) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.22) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.44) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.44) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.55) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.55) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.77) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.77) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.88) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.88) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 10) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.1) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.1) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.7) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.7) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Ninth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.9) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.9) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        }
    }

    public void stilesGreaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, int panels, GraphicsContext gc) {


        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 0; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = ((i - 40) * 10);
        double rightJamb = startX + 1 + recWidth + doorWidthRatio;
        double farRight125 = startX + recWidth + slWidthRatio;

        //Far 125 Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Far 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        if (panels == 2) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 3) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb) - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 4) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 5) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 6) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.16) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.16) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.83) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.83) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 7) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.14) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.14) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.28) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.28) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.42) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.42) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.57) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.57) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.71) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.71) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.85) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.85) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 8) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.125) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.125) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.375) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.375) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.625) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.625) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.875) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.875) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else if (panels == 9) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.11) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.11) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.22) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.22) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.44) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.44) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.55) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.55) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.77) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.77) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.88) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.88) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 10) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.1) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.1) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.7) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.7) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Ninth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.9) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.9) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        }


    }

    public void stilesLessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, int panels, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 35; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = (i - 40) * 10;

        double rightJamb = startX + 1 + recWidth + doorWidthRatio;
        double farRight125 = startX + recWidth + slWidthRatio;

        //Far 125 Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Far 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        if (panels == 2) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 3) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb) - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 4) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 5) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 6) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.16) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.16) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.83) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.83) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 7) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.14) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.14) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.28) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.28) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.42) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.42) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.57) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.57) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.71) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.71) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.85) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.85) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 8) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.125) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.125) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.375) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.375) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.625) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.625) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.875) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.875) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else if (panels == 9) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.11) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.11) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.22) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.22) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.44) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.44) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.55) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.55) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.77) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.77) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.88) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.88) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 10) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.1) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.1) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.7) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.7) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Ninth 125
            gc.setFill(Color.WHITE);
            gc.fillRect(((farRight125 - rightJamb) * 0.9) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((farRight125 - rightJamb) * 0.9) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        }

    }

    /////////////////////////////////////Clear
    public void stilesLessThan84Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 0; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = ((i - 40) * 10);

        //Stile Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void stilesLessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 35; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = (i - 40) * 10;

        //Stile Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void stilesLessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 35; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = (i - 40) * 10;

        //Stile Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void stilesGreaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (i = 0; i < slWidthDouble; i++)
            i = i;
        int slWidthRatio = ((i - 40) * 10);

        //Stile Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (startX + 1 + recWidth) + recHeight + slWidthRatio, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Second Stile
        gc.strokeRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    //////////////////////////////////////Horizontals///////////////////////////////////////////////////////////////////

    FractionsAndDecimals ftd = new FractionsAndDecimals();
    //////////////////////////////Bronze

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, int panels, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 35; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        double leftJamb = startX - recHeight;
        double farLeft125 = startX - recHeight - slWidthRatio;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(farLeft125 + 15, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(farLeft125 + 15, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);


        if (panels == 1) {
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(sideLightRailString, farLeft125 + 20, startY + (2 * recHeight) + 35);
        } else if (panels == 2) {
            String twoPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 1.25) / 2));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(twoPanel, farLeft125 + 20, startY + (2 * recHeight) + 25);
        } else if (panels == 3) {
            String threePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 2.5) / 3));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(threePanel, farLeft125 + 20, startY + (2 * recHeight) + 25);
        } else if (panels == 4) {
            String fourPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 3.75) / 4));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(fourPanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 5) {
            String fivePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 5) / 5));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(fivePanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 6) {
            String sixPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 6.25) / 6));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(sixPanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 7) {
            String sevenPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 7.5) / 7));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(sevenPanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 8) {
            String eightPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 8.75) / 8));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(eightPanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 9) {
            String ninePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 10) / 9));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(ninePanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 10) {
            String tenPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 11.25) / 10));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(tenPanel, farLeft125 + 20, startY + (2 * recHeight) + 20);
        }
    }

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 0; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 0; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        for (m = 35; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }

    ////////////////////////////////////Clear

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 0; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 0; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 0; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        for (m = 0; m < slWidthDouble; m++)
            m = m;
        int slWidthRatio = ((m - 40) * 10);

        double sideLightRailsDouble = slWidthDouble - (doorWidthDouble + 3.5) - 0.5 - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        //Header
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(sideLightRailString, ((double) ((startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio)) / 2) + startX + recWidth + doorWidthRatio - 15, startY + (2 * recHeight) + 35);
        //Threshold
        gc.strokeRect(startX + recWidth + doorWidthRatio + recHeight + 10, startY + recWidth + doorHeightRatio + 350 + 15, (startX + recWidth + slWidthRatio) - (startX + recWidth + doorWidthRatio) - 25, recHeight);
        gc.setStroke(Color.BLACK);
    }
}
