package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Stiles {
    int j = 0;
    int i = 0;
    /////////////////////////////////////////Bronze
    public void stilesLessThan84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1825 + doorWidthRatio, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1801 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio );
    }

    public void stilesLessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,(1450 + 1 + 350 + doorWidthRatio) + 24, ((double) (350 + doorHeightRatio + 24 + 15 + 350) / 2) + 1450);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1450 + 350 + doorWidthRatio, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
    }
    public void stilesGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j= j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1426, 1450, 24, doorHeightRatio + 739);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString, 1825 + doorWidthRatio, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);
    }
    public void stilesGreaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,(1450 + 1 + 350 + doorWidthRatio) + 24, ((double) (350 + doorHeightRatio + 24 + 15 + 350) / 2) + 1450);
        //Second Stile
        gc.setFill(Color.rgb(95, 87,87));
        gc.fillRect(1450 + 1 + 350 + doorWidthRatio, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
    }

    /////////////////////////////////////Clear
    public void stilesLessThan84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile
        gc.strokeRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,(1450 + 1 + 350 + doorWidthRatio) + 24, ((double) (350 + doorHeightRatio + 24 + 15 + 350) / 2) + 1450);
        //Second Stile
        gc.strokeRect(1450 + 350 + doorWidthRatio, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
    }

    public void stilesLessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile
        gc.strokeRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,(1450 + 1 + 350 + doorWidthRatio) + 24, ((double) (350 + doorHeightRatio + 24 + 15 + 350) / 2) + 1450);
        //Second Stile
        gc.strokeRect(1450 + 350 + doorWidthRatio, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
    }

    public void stilesLessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;
        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,(1450 + 1 + 350 + doorWidthRatio) + 24, ((double) (350 + doorHeightRatio + 24 + 15 + 350) / 2) + 1450);
        //Second Stile
        gc.strokeRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);
    }

    public void stilesGreaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorWidthRatio = (i - 40) * 2;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile
        gc.strokeRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1825 + doorWidthRatio, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile
        gc.strokeRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);
    }
}
