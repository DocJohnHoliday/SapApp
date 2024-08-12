package DrawingComponents;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class HingeType {

    int startX = 1650 - 200; //Start in X axis
    int startY = startX; //Start in Y axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height
    int j = 0;
    int i = 0;

    ///////////////////////////////Pivots
    public void leftHandPivots(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 12, 18);

        //Bottom Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    public void leftHandPivotsSmall(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 12, 18);

        //Bottom Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    public void rightHandPivots(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY, 12, 18);

        //Bottom Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    public void rightHandPivotsSmall(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY, 12, 18);

        //Bottom Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    ////////////////////////////////////Continuous Hinge
    public void leftHandContinuous(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 14, 739 + doorHeightRatio);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 12, 739 + doorHeightRatio);

    }

    public void leftHandContinuousSmall(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 14, 739 + doorHeightRatio);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 12, 739 + doorHeightRatio);

    }

    public void rightHandContinuous(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY, 14, 739 + doorHeightRatio);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY, 12, 739 + doorHeightRatio);

    }

    public void rightHandContinuousSmall(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY, 14, 739 + doorHeightRatio);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY, 12, 739 + doorHeightRatio);
    }

    /////////////////////////////Butt Hinge
    public void leftHandButt(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 12, 18);

        //Bottom Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    public void leftHandButtSmall(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY, 12, 18);

        //Bottom Pivot LH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    public void rightHandButt(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 83; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY, 12, 18);

        //Bottom Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }

    public void rightHandButtSmall(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {

        for (i = 0; i < doorWidthDouble; i++)
            i = i;
        int doorWidthRatio = (i - 40) * 2;

        for (j = 0; j < doorHeightDouble; j++)
            j = j;
        int doorHeightRatio = (j - 84) * 2;

        //Top Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY, 12, 18);

        //Bottom Pivot RH
        gc.setFill(Color.WHITE);
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
        gc.setFill(Color.rgb(173, 172, 172));
        gc.fillRect(startX - recHeight + 1, startY + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);

    }
}
