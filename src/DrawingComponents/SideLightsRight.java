package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SideLightsRight {

    int startX = 1450; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    FractionsAndDecimals ftd = new FractionsAndDecimals();

    /////////////////////////////////////////Verticals
    /////////////////////////////////////////Bronze
    public void bronzeSideLightVerticalRight(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, String singleOrPair, int panels, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        int slWidthRatio = (int) ((Math.ceil(slWidthDouble) + 40) * 10);

        double rightJamb;
        if (singleOrPair.equals("Single")) {
            rightJamb = startX + recWidth + doorWidthRatio;
        } else {
            rightJamb = startX + recWidth + doorWidthRatio + 330;
        }

        double farRight125 = rightJamb + slWidthRatio - 400;

        //Far 125 Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, farRight125 + 15, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Far 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(farRight125, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

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

    public void clearSideLightVerticalRight(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, String singleOrPair, int panels, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        int slWidthRatio = (int) ((Math.ceil(slWidthDouble) + 40) * 10);

        double rightJamb;
        if (singleOrPair.equals("Single")) {
            rightJamb = startX + recWidth + doorWidthRatio;
        } else {
            rightJamb = startX + recWidth + doorWidthRatio + 330;
        }

        double farRight125 = rightJamb + slWidthRatio - 400;

        //Far 125 Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, farRight125 + 15, ((double) (recWidth + doorHeightRatio + recHeight + 15 + 350) / 2) + startY);
        //Far 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(farRight125, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        if (panels == 2) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 3) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) / 3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) / 3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb) - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect((((farRight125 - rightJamb) / 3) * 2 + rightJamb), startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 4) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) / 2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) / 2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 5) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 6) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.16) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.16) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.83) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.83) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 7) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.14) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.14) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.28) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.28) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.42) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.42) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.57) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.57) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.71) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.71) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.85) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.85) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 8) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.125) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.125) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.25) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.25) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.375) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.375) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.625) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.625) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.75) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.75) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.875) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.875) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
        } else if (panels == 9) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.11) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.11) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.22) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.22) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.33) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.33) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.44) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.44) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.55) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.55) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.66) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.66) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.77) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.77) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.88) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.88) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        } else if (panels == 10) {
            //First 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.1) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.1) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Second 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.2) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.2) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Third 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.3) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.3) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fourth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.4) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.4) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Fifth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.5) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.5) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Sixth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.6) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.6) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Seventh 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.7) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.7) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Eighth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.8) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.8) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
            //Ninth 125
            gc.setFill(Color.WHITE);
            gc.strokeRect(((farRight125 - rightJamb) * 0.9) + rightJamb - 1, startY, recHeight + 3, recWidth + doorHeightRatio + recHeight + 15 + 350);
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((farRight125 - rightJamb) * 0.9) + rightJamb, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);

        }
    }

    /////////////////////////////////////Clear

    //////////////////////////////////////Horizontals///////////////////////////////////////////////////////////////////
    //////////////////////////////Bronze

    public void bronzeSideLightHorizontalsRight(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, int quantity, String type,
                                                String singleOrPair, int panels, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        int slWidthRatio = (int) ((Math.ceil(slWidthDouble) + 40) * 10);

        double sideLightRailsDouble = slWidthDouble - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        double rightJamb;
        if (singleOrPair.equals("Single")) {
            rightJamb = startX + recWidth + doorWidthRatio;
        } else {
            rightJamb = startX + recWidth + doorWidthRatio + 330;
        }

        double farRight125 = rightJamb + slWidthRatio - 400;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(rightJamb + 7, startY, farRight125 - rightJamb - 9, recHeight);
        gc.setStroke(Color.BLACK);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(rightJamb + 7, startY + recWidth + doorHeightRatio + 350 + 15, farRight125 - rightJamb - 9, recHeight);
        gc.setStroke(Color.BLACK);


        if (panels == 1) {
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(sideLightRailString, rightJamb + 20, startY + (2 * recHeight) + 35);
        } else if (panels == 2) {
            String twoPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 1.25) / 2));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(twoPanel, rightJamb + 20, startY + (2 * recHeight) + 25);
        } else if (panels == 3) {
            String threePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 2.5) / 3));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(threePanel, rightJamb + 20, startY + (2 * recHeight) + 25);
        } else if (panels == 4) {
            String fourPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 3.75) / 4));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(fourPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 5) {
            String fivePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 5) / 5));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(fivePanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 6) {
            String sixPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 6.25) / 6));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(sixPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 7) {
            String sevenPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 7.5) / 7));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(sevenPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 8) {
            String eightPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 8.75) / 8));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(eightPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 9) {
            String ninePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 10) / 9));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(ninePanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 10) {
            String tenPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 11.25) / 10));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(tenPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        }
    }

    ////////////////////////////////////Clear

    public void clearSideLightHorizontalsRight(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, int quantity, String type,
                                               String singleOrPair, int panels, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        int slWidthRatio = (int) ((Math.ceil(slWidthDouble) + 40) * 10);

        double sideLightRailsDouble = slWidthDouble - 1.25;
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);

        double rightJamb;
        if (singleOrPair.equals("Single")) {
            rightJamb = startX + recWidth + doorWidthRatio;
        } else {
            rightJamb = startX + recWidth + doorWidthRatio + 330;
        }

        double farRight125 = rightJamb + slWidthRatio - 400;

        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.BLACK);
        gc.strokeRect(rightJamb + 7, startY, farRight125 - rightJamb - 9, recHeight);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(rightJamb + 7, startY + recWidth + doorHeightRatio + 350 + 15, farRight125 - rightJamb - 9, recHeight);
        gc.setStroke(Color.BLACK);


        if (panels == 1) {
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(sideLightRailString, rightJamb + 20, startY + (2 * recHeight) + 35);
        } else if (panels == 2) {
            String twoPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 1.25) / 2));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(twoPanel, rightJamb + 20, startY + (2 * recHeight) + 25);
        } else if (panels == 3) {
            String threePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 2.5) / 3));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 30));
            gc.fillText(threePanel, rightJamb + 20, startY + (2 * recHeight) + 25);
        } else if (panels == 4) {
            String fourPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 3.75) / 4));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(fourPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 5) {
            String fivePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 5) / 5));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(fivePanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 6) {
            String sixPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 6.25) / 6));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(sixPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 7) {
            String sevenPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 7.5) / 7));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(sevenPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 8) {
            String eightPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 8.75) / 8));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(eightPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 9) {
            String ninePanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 10) / 9));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(ninePanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        } else if (panels == 10) {
            String tenPanel = String.valueOf(ftd.convertDecimalToFraction((sideLightRailsDouble - 11.25) / 10));
            //Header Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 20));
            gc.fillText(tenPanel, rightJamb + 20, startY + (2 * recHeight) + 20);
        }
    }
}
