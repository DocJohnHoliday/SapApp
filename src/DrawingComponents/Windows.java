package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Windows {
    int j = 0;
    int i = 0;

    /////////////////////////////////////////Verticals
    /////////////////////////////////////////Bronze
    public void greaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        
        if(panels == 0) {
            //Verticals
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
            //Verticals Text
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
            //Second Verticals
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        } else if (panels == 1) {
            
        }
    }

    public void lessThan84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Verticals
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 3 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 3 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    public void greaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    public void lessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Verticals
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    /////////////////////////////////////Clear
    public void lessThan84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.strokeRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    public void lessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.strokeRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    public void lessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.strokeRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    public void greaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(1450 - 12, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
        //Verticals Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, (1450 + 1 + 350 + doorWidthRatio) + 12, ((double) (350 + doorHeightRatio + 12 + 15 + 350) / 2) + 500);
        //Second Verticals
        gc.strokeRect(1450 + 350 + doorWidthRatio, 500, 12, 350 + doorHeightRatio + 12 + 15 + 350);
    }

    //////////////////////////////Horizontals

    //////////////////////////////Bronze

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(1450, 500, 350 + doorWidthRatio, 12);
        gc.strokeRect(1450 - 1, 500, 350 + doorWidthRatio + 1, 12);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450 - 1, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio + 1, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36StilesGreaterThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        gc.fillText("Frame", (1450 - 12) + ((double) (350 + doorWidthRatio) / 2) - 30, 500 + (2 * 12) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(1450 + 1, 500, 350 + doorWidthRatio - 1, 12);
        gc.strokeRect(1450, 500, 350 + doorWidthRatio + 2, 12);
        gc.setStroke(Color.BLACK);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        //Threshold
        gc.setFill(Color.rgb(95, 87, 87));
        gc.setStroke(Color.WHITE);
        gc.fillRect(1450 + 1, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio + 1, 12);
        gc.strokeRect(1450, 500 + 350 + doorHeightRatio + 350 + 15, 350 + doorWidthRatio + 3, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36StilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        gc.fillText("Frame", (1450 - 12) + ((double) (350 + doorWidthRatio) / 2) - 30, 500 + (2 * 12) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    ////////////////////////////////////Clear

    public void railsLessThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        gc.fillText("Frame", (1450 - 12) + ((double) (350 + doorWidthRatio) / 2) - 30, 500 + (2 * 12) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        gc.fillText("Frame", (1450 - 12) + ((double) (350 + doorWidthRatio) / 2) - 30, 500 + (2 * 12) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsGreaterThanOrEqual36Clear(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        gc.fillText("Frame", (1450 - 12) + ((double) (350 + doorWidthRatio) / 2) - 30, 500 + (2 * 12) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }

    public void railsLessThan36ClearStileGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorWidthString, int panels, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //Header
        gc.strokeRect(1450, 500, 350 + doorWidthRatio, 12);
        //Header Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorWidthString, (1450 - 12) + ((double) (350 + doorWidthRatio) / 2), 500 + (2 * 12) + 35);
        gc.fillText("Frame", (1450 - 12) + ((double) (350 + doorWidthRatio) / 2) - 30, 500 + (2 * 12) + 35 + 55);
        //Threshold
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(1450, 500 + 350 + doorHeightRatio + 350 + 18, 350 + doorWidthRatio, 12);
        gc.setStroke(Color.BLACK);
    }
}