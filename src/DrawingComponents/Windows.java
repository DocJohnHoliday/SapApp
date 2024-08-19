package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Windows {
    int j = 0;
    int i = 0;
    FractionsAndDecimals fTD = new FractionsAndDecimals();
    Glass glass = new Glass();

    /////////////////////////////////////////Verticals
    /////////////////////////////////////////Bronze
    public void lessThan84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = ((i - 40) * 10);

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = ((j - 84) * 10);

        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);

        if (panels == 2) {
            //White Rectangle
            gc.setFill(Color.WHITE);
            gc.fillRect(((double) (1438 + (1803 + doorWidthRatio)) / 2) - 2, 500, 15, 350 + doorHeightRatio + 12 + 15 + 350);
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
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
        }
    }

    public void greaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //White Rectangle
            gc.setFill(Color.WHITE);
            gc.fillRect(((double) (1438 + (1803 + doorWidthRatio)) / 2) - 2, 500, 15, 350 + doorHeightRatio + 12 + 15 + 350);
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
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
        }
    }

    public void greaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = ((j - 84) * 10);
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //White Rectangle
            gc.setFill(Color.WHITE);
            gc.fillRect(((double) (1438 + (1803 + doorWidthRatio)) / 2) - 2, 500, 15, 350 + doorHeightRatio + 12 + 15 + 350);
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
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
        }
    }

    public void lessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = ((j - 84) * 10);
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //White Rectangle
            gc.setFill(Color.WHITE);
            gc.fillRect(((double) (1438 + (1803 + doorWidthRatio)) / 2) - 2, 500, 15, 350 + doorHeightRatio + 12 + 15 + 350);
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
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
        }
    }

    /////////////////////////////////////Clear
    public void lessThan84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        } else if (panels == 3) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438, 500, 12, 727 + doorHeightRatio);
        } else if (panels == 4) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438), 500, 12, 727 + doorHeightRatio);
            //Fourth Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
        }
    }

    public void lessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        } else if (panels == 3) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438, 500, 12, 727 + doorHeightRatio);
        } else if (panels == 4) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438), 500, 12, 727 + doorHeightRatio);
            //Fourth Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
        }
    }

    public void lessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        } else if (panels == 3) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438, 500, 12, 727 + doorHeightRatio);
        } else if (panels == 4) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438), 500, 12, 727 + doorHeightRatio);
            //Fourth Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
        }
    }

    public void greaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;
        //Far Left Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1438, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Far Right Vertical
        gc.setFill(Color.rgb(95, 87, 87));
        gc.strokeRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        if (panels == 2) {
            //Middle Vertical for 2 Panel
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect((double) (1438 + (1803 + doorWidthRatio)) / 2, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        } else if (panels == 3) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) + ((((1803 + doorWidthRatio) - 1438) * (double) 1 / 3) + 1438) - 1438, 500, 12, 727 + doorHeightRatio);
        } else if (panels == 4) {
            //Second Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
            //Third Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 1 / 2) + 1438), 500, 12, 727 + doorHeightRatio);
            //Fourth Vertical
            gc.setFill(Color.rgb(95, 87, 87));
            gc.strokeRect(((((1803 + doorWidthRatio) - 1438) * (double) 3 / 4) + 1438), 500, 12, 727 + doorHeightRatio);
        }
    }

    //////////////////////////////Horizontals

    //////////////////////////////Bronze

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                          int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Overall Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
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
    }

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                                   int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Overall Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
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
    }

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            BigDecimal num1 = new BigDecimal(doorWidthDouble - 5.0);
            BigDecimal num2 = new BigDecimal(3);
            double x = num1.divide(num2, 2, RoundingMode.HALF_DOWN).doubleValue();
            gc.fillText(fTD.convertDecimalToFraction(x), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }

        //Overall Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
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
    }

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                                          int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Overall Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
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
    }

    ////////////////////////////////////Clear

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                     int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
        //Threshold
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                            int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
        //Threshold
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                               int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;

        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
        //Threshold
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString,
                                                              int quantity, String type, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 10;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 10;
        //Glass
        if (type.equals("3/16 Clr") || type.equals("1/4 Clr") || type.equals("3/16 Tint") || type.equals("Pattern 62")
                || type.equals("Ribbed") || type.equals("1/4 Tint"))
            glass.windowGlass5mm(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("IG") || type.equals("Tinted IG") || type.equals("Low E"))
            glass.windowGlassIG(doorWidthDouble, doorHeightDouble, quantity, type, panels, gc);
        if (type.equals("No Glass"))
            glass.noGlass(gc);

        if (panels == 1) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction(doorWidthDouble - 2.5)), 1460, 540);
        }
        if (panels == 2) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 3.75) / 2)), 1460, 540);
        } else if (panels == 3) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 5.0) / 3)), 1460, 540);
        } else if (panels == 4) {
            //Horizontal Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 45));
            gc.fillText(String.valueOf(fTD.convertDecimalToFraction((doorWidthDouble - 6.25) / 4)), 1460, 540);
        }
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500);
        //Threshold
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }
}