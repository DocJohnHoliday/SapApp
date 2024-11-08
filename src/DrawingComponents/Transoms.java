package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
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
    FractionsAndDecimals ftd = new FractionsAndDecimals();

    public void singleTransom(double transomWidthDouble, double transomHeightDouble, double doorWidthDouble, double doorHeightDouble, String transomWidthString, String transomHeightString,
                              String color, int left, int right, double slWidthDouble, GraphicsContext gc) {
//        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
//        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);
//
//        //Header Text
//        gc.setFill(Color.BLACK);
//        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
//        gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY - 200 - doorHeightRatio - 5);
//        gc.fillText(doorHeightString, 1250 + 200, startY - 200 - doorHeightRatio + 100);
//        glass.transomGlass5mm(transomWidthDouble, transomHeightDouble, 1, "3/16 Clr", gc);
//
//        if (color.equals("Bronze") || color.equals("Black")) {
//            gc.setFill(Color.rgb(95, 87, 87));
//            //Top 125
//            gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 24, recHeight);
//            //Bottom 125
//            gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 24, recHeight - 3);
//
//            //Left 125
//            gc.setFill(Color.rgb(95, 87, 87));
//            gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
//            //Right 125
//            gc.setFill(Color.rgb(95, 87, 87));
//            gc.fillRect(startX + recWidth + doorWidthRatio, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
//        } else {
//            //Top 125
//            gc.strokeRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight);
//            //Bottom 125
//            gc.strokeRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 24, recHeight - 3);
//            //Left 125
//            gc.strokeRect(startX - recHeight, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
//            //Right 125
//            gc.strokeRect(startX + recWidth + doorWidthRatio + 400, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
//        }

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Side Light Math
        int slWidthRatio = (int) ((Math.ceil(slWidthDouble) + 40) * 10);
        double sideLightRailsDouble = (slWidthDouble - 1.25);
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);
        double leftJamb = startX - recHeight;
        double farLeft125 = leftJamb - slWidthRatio + 400;
        double rightJamb = startX + recWidth + doorWidthRatio + 330;
        double farRight125 = rightJamb + slWidthRatio - 800;

        String internalTransomSize = ftd.convertDecimalToFraction(transomWidthDouble - 2.5);


        //Header Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 30));
        gc.fillText(transomHeightString, 1250 + 200, startY - 200 - doorHeightRatio + 100);
        //Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(internalTransomSize, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY - 200 - doorHeightRatio - 5 + 55);
        glass.transomGlass5mm(transomWidthDouble, transomHeightDouble, 1, "3/16 Clr", gc);


        if (color.equals("Bronze") || color.equals("Black")) {
            gc.setFill(Color.rgb(95, 87, 87));

            if (left > 0) {
                //Top 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight);
                //Bottom 125
                gc.fillRect(farLeft125, startY - 15 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight - 3);
                //Left Side Light Transom
                //Far Left 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            } else if (right > 0) {
                //Top 125
                gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight);
                //Bottom 125
                gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight - 3);
                //Far Right 125
                gc.fillRect(farRight125 + 80, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            } else if (left == 0 && right == 0) {
                gc.setFill(Color.rgb(95, 87, 87));
                //Top 125
                gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 24, recHeight);
                //Bottom 125
                gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 24, recHeight - 3);
                //Text
                gc.setFont(Font.font("default", FontWeight.BOLD, 50));
                gc.fillText(transomWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2), startY - 200 - doorHeightRatio - 5);
                gc.fillText(transomHeightString, 1250 + 200, startY - 200 - doorHeightRatio + 100);
            }

            if (left > 0 && 0 < right) {
                //Top 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio, ((leftJamb - farLeft125) - 17) + recWidth + doorWidthRatio + 175, recHeight);
                //Bottom 125
                gc.fillRect(farLeft125, startY - 15 - doorHeightRatio, ((leftJamb - farLeft125) - 17) + recWidth + doorWidthRatio + 175, recHeight - 3);
                //Left Side Light Transom
                //Far Left 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
                //Top 125
                gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 175, recHeight);
                //Bottom 125
                gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 175, recHeight - 3);
                //Far Right 125
                gc.fillRect(farRight125 + 80, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
                //Text
                gc.setFont(Font.font("default", FontWeight.BOLD, 50));
                gc.fillText(internalTransomSize, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 30, startY - 200 - doorHeightRatio - 5 + 55);
            }

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

    public void pairTransom(double transomWidthDouble, double transomHeightDouble, double doorWidthDouble, double doorHeightDouble, String transomWidthString, String transomHeightString,
                            String color, int left, int right, double slWidthDouble, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Side Light Math
        int slWidthRatio = (int) ((Math.ceil(slWidthDouble) + 40) * 10);
        double sideLightRailsDouble = (slWidthDouble - 1.25);
        String sideLightRailString = ftd.convertDecimalToFraction(sideLightRailsDouble);
        double leftJamb = startX - recHeight;
        double farLeft125 = leftJamb - slWidthRatio + 400;
        double rightJamb = startX + recWidth + doorWidthRatio + 330;
        double farRight125 = rightJamb + slWidthRatio - 400;

        String internalTransomSize = ftd.convertDecimalToFraction(transomWidthDouble - 2.5);


        //Header Text
        gc.setFill(Color.BLACK);
        gc.fillText(transomHeightString, 1250 + 200, startY - 200 - doorHeightRatio + 100);
        glass.transomGlass5mm(transomWidthDouble, transomHeightDouble, 1, "3/16 Clr", gc);


        if (color.equals("Bronze") || color.equals("Black")) {
            gc.setFill(Color.rgb(95, 87, 87));

            if (left > 0) {
                //Top 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio, ((leftJamb - farLeft125) - 17) + recWidth + doorWidthRatio + 400 + 40, recHeight);
                //Bottom 125
                gc.fillRect(farLeft125, startY - 15 - doorHeightRatio, ((leftJamb - farLeft125) - 17) + recWidth + doorWidthRatio + 400 + 40, recHeight - 3);
                //Left Side Light Transom
                //Far Left 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            } else if (right > 0) {
                //Top 125
                gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight);
                //Bottom 125
                gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight - 3);
                //Far Right 125
                gc.fillRect(farRight125 + 80, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
            } else if (left == 0 && right == 0) {
                //Top 125
                gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 26, recHeight);
                //Bottom 125
                gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, recWidth + doorWidthRatio + 400 + 26, recHeight - 3);
                //Text
                gc.setFont(Font.font("default", FontWeight.BOLD, 50));
                gc.fillText(transomWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) + 200, startY - 200 - doorHeightRatio - 5);
            }

            if (left > 0 && 0 < right) {
                //Top 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio, ((leftJamb - farLeft125) - 17) + recWidth + doorWidthRatio + 400 + 40, recHeight);
                //Bottom 125
                gc.fillRect(farLeft125, startY - 15 - doorHeightRatio, ((leftJamb - farLeft125) - 17) + recWidth + doorWidthRatio + 400 + 40, recHeight - 3);
                //Left Side Light Transom
                //Far Left 125
                gc.fillRect(farLeft125, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
                //Top 125
                gc.fillRect(startX - recHeight, startY - 200 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight);
                //Bottom 125
                gc.fillRect(startX - recHeight, startY - 15 - doorHeightRatio, ((farRight125 - rightJamb) - 17) + recWidth + doorWidthRatio + 400 + 50, recHeight - 3);
                //Far Right 125
                gc.fillRect(farRight125 + 80, startY - 200 - doorHeightRatio + recHeight + 3, recHeight, doorHeightRatio + 168);
                //Text
                gc.setFont(Font.font("default", FontWeight.BOLD, 50));
                gc.fillText(internalTransomSize, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) + 200, startY - 200 - doorHeightRatio - 5 + 55);
            }

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
