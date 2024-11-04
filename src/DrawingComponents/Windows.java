package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Windows {
    FractionsAndDecimals fTD = new FractionsAndDecimals();
    Glass glass = new Glass();

    /////////////////////////////////////////Bronze
    public void windowsBronze(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String doorHeightString, int panels,
                              int quantity, String type, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 10);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 10);
        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);

        if(panels != 1) {
            //Overall Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
        }
        //Horizontal Text
        if(panels == 1){
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 2.5))), 1460, 550);
        }
        //Top 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(1451, 500, 350 + doorWidthRatio - 1, 12);
        gc.strokeRect(1450, 500, 350 + doorWidthRatio + 2, 12);
        gc.setStroke(Color.BLACK);
        //Bottom 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(1450 + 1, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio + 1, 12);
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio + 3, 12);
        gc.setStroke(Color.BLACK);

        if (panels == 2) {
            //White Rectangle
            gc.setFill(Color.WHITE);
            gc.fillRect(((double) (1438 + (1803 + doorWidthRatio)) / 2) - 2, 500, 15, 350 + doorHeightRatio + 12 + 15 + 350);
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 550);
        } else if (panels == 3) {
            //Second Vertical White
            gc.setFill(Color.WHITE);
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Third Vertical White
            gc.setFill(Color.WHITE);
            gc.fillRect((((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438, 500, 12, 727 + doorHeightRatio);
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 550);
        } else if (panels == 4) {
            //Second Vertical White
            gc.setFill(Color.WHITE);
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Third Vertical White
            gc.setFill(Color.WHITE);
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Fourth Vertical White
            gc.setFill(Color.WHITE);
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438), 500, 12, 727 + doorHeightRatio);
            //Fourth Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 550);
        }
    }

    /////////////////////////////////////Clear
    public void windowsClear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, String doorHeightString, int panels,
                             int quantity, String type, GraphicsContext gc) {
        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 10);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 10);
        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);

        if(panels != 1) {
            //Overall Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
        }
        //Horizontal Text
        if(panels == 1){
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 2.5))), 1460, 550);
        }
        //Top 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1451, 500, 350 + doorWidthRatio - 1, 12);
        gc.strokeRect(1450, 500, 350 + doorWidthRatio + 2, 12);
        gc.setStroke(Color.BLACK);
        //Bottom 125
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1450 + 1, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio + 1, 12);
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio + 3, 12);
        gc.setStroke(Color.BLACK);

        if (panels == 2) {
            //White Rectangle
            gc.strokeRect(((double) (1438 + (1803 + doorWidthRatio)) / 2) - 2, 500, 15, 350 + doorHeightRatio + 12 + 15 + 350);
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 550);
        } else if (panels == 3) {
            //Second Vertical White
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Third Vertical White
            gc.strokeRect((((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438, 500, 12, 727 + doorHeightRatio);
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 550);
        } else if (panels == 4) {
            //Second Vertical White
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Third Vertical White
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Fourth Vertical White
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438) - 2, 500, 15, 727 + doorHeightRatio);
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438), 500, 12, 727 + doorHeightRatio);
            //Fourth Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 550);
        }
    }
}