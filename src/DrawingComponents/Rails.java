package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Rails {

    int startX = 1450; //Start in X axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

    Glass glass = new Glass();

    public void narrowSingleRails(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, String bottomRail, String glassType, int qty, GraphicsContext gc) {
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
                    gc.fillRect(startX + 2, startX + recWidth + doorHeightRatio + 350, recWidth + doorWidthRatio - 4, recHeight + 15);
                    if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "7 1/2":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 2, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 4, recHeight + 15 + 30);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    gc.setFill(Color.BLACK);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "10":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 2, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 4, recHeight + 15 + 30);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    gc.setFill(Color.BLACK);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")){
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
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
                    if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm4BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "7 1/2":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "10":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")){
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
            }
        }
    }

    public void mediumSingleRails(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, String bottomRail, String glassType, int qty, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (color.equals("Bronze") || color.equals("Black")) {

            ///////////////////////////Top Rail
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(startX + 2, startX, recWidth + doorWidthRatio, recHeight + 15);
            gc.setFill(Color.WHITE);

            //Top Rail Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startX + (2 * recHeight) + 35);
            gc.setFont(Font.font("default", FontWeight.BOLD, 27));
            gc.fillText("4\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
            switch (bottomRail) {
                case "7 1/2":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 10, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 4, recHeight + 15 + 30);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    gc.setFill(Color.BLACK);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "10":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 10, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 4, recHeight + 15 + 45);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    gc.setFill(Color.BLACK);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")){
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
            }
        } else {
            //Top Rail
            gc.strokeRect(startX, startX, recWidth + doorWidthRatio, recHeight + 15);
            //Top Rail Text
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorWidthString, (startX - recHeight) + ((double) (recWidth + doorWidthRatio) / 2) - 15, startX + (2 * recHeight) + 35);

            switch (bottomRail) {
                case "7 1/2":
                    gc.strokeRect(startX + 30, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "10":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")){
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
            }
        }
    }

    public void wideSingleRails(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String color, String bottomRail, String glassType, int qty, GraphicsContext gc) {
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
                case "7 1/2":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 2, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 4, recHeight + 15 + 30);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    gc.setFill(Color.BLACK);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "10":
                    gc.setFill(Color.rgb(95, 87, 87));
                    gc.fillRect(startX + 2, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio - 4, recHeight + 15 + 30);
                    gc.setFill(Color.WHITE);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    gc.setFill(Color.BLACK);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")){
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
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
                case "7 1/2":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("7 1/2\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 10);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")) {
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm7BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
                case "10":
                    gc.strokeRect(startX, startX + recWidth + doorHeightRatio + 350 - 30, recWidth + doorWidthRatio, recHeight + 15 + 30);
                    gc.setFill(Color.BLACK);
                    gc.setFont(Font.font("default", FontWeight.BOLD, 27));
                    gc.fillText("10\" BR", startX - 50 + (double) ((recWidth + doorWidthRatio)) / 2, (startX + recWidth + doorHeightRatio + 350 - 30) + ((double) (recHeight + 15 + 30) / 2) + 15);
                    if (glassType.equals("IG")) {
                        glass.doorGlassIG10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    } else if (glassType.equals("No Glass")){
                        glass.noGlass(gc);
                    } else {
                        glass.doorGlass5mm10BR(doorWidthDouble, doorHeightDouble, glassType, qty, gc);
                    }
                    break;
            }
        }
    }
}
