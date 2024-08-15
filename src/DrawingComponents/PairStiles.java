package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PairStiles {
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

        //First Stile Inactive
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.fillRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.fillRect(1825 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.fillRect(2199 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);
    }

    public void stilesLessThan84RailGreaterThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile Inactive
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.fillRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.fillRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.fillRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }
    public void stilesGreaterThanOrEqual84(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j= j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile Inactive
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.fillRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.fillRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.fillRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }
    public void stilesGreaterThanOrEqual84RailsLessThan36(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile Inactive
        gc.setFill(Color.rgb(95, 87, 87));
        gc.fillRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.fillRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.fillRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.fillRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }

    /////////////////////////////////////Clear
    public void stilesLessThan84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile Inactive
        gc.strokeRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.strokeRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.strokeRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.strokeRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }

    public void stilesLessThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {

        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //First Stile Inactive
        gc.strokeRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.strokeRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.strokeRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.strokeRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }

    public void stilesLessThan84RailGreaterThan36Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {
        for (i = 35; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;
        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile Inactive
        gc.strokeRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.strokeRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.strokeRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.strokeRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }

    public void stilesGreaterThanOrEqual84Clear(double doorWidthDouble, double doorHeightDouble, String doorHeightString, GraphicsContext gc) {
        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorWidthRatio = (i - 40) * 2;
        int doorHeightRatio = (j - 84) * 2;
        //First Stile Inactive
        gc.strokeRect(1426, 1450, 24, 739 + doorHeightRatio);
        //Stile Text
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,1250, ((double) (739 + doorHeightRatio) / 2) + 1450);
        //Second Stile Inactive
        gc.strokeRect(1800 + doorWidthRatio, 1450, 24, 739 + doorHeightRatio);

        //First Stile Active
        gc.strokeRect(1800 + doorWidthRatio + 25, 1450, 24, 739 + doorHeightRatio);
        //Second Stile Active
        gc.strokeRect((1800 + doorWidthRatio + 25) + 374, 1450, 24, 739 + doorHeightRatio);
    }
}
