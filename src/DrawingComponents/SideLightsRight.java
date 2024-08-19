package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SideLightsRight {

    int startX = 1650 - 200; //Start in X axis
    int startY = 500; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 12; //Rectangle Height
    int j = 0;
    int i = 0;
    int m = 0;


    /////////////////////////////////////////Bronze
    public void stilesGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

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
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void stilesLessThan84(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        System.out.println(i);
        System.out.println((int) doorWidthDouble);
        int doorWidthRatio = (int) ((doorWidthDouble - 40) * 2);

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
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
    }

    public void stilesGreaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {


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
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);


    }

    public void stilesLessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;
        System.out.println(i);
        System.out.println((int) Math.ceil(doorWidthDouble));

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
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(startX + recWidth + slWidthRatio, startY, recHeight, recWidth + doorHeightRatio + recHeight + 15 + 350);
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

    public void railsGreaterThanOrEqual36(double doorWidthDouble, double doorHeightDouble, double slWidthDouble, String doorWidthString, GraphicsContext gc) {

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
