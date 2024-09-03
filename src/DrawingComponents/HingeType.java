package DrawingComponents;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class HingeType {
    int startX = 1450; //Start in X axis
    int recWidth = 350; //Rectangle Width
    int recHeight = 24; //Rectangle Height

    public void narrowHinging(double doorWidthDouble, double doorHeightDouble, String hand, String hingingType, GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        if (hand.equals("Left")) {
            switch (hingingType) {
                case "Pivots":
                    //Top Pivot LH
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX, 14, 20);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX, 12, 18);
                    //Bottom Pivot LH
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);
                    break;
                case "Butt Hinge":
                    //Top Butt Hinge
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX + 50, 20, 40);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX + 50, 18, 38);
                    //Bottom Butt Hinge
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX + recWidth + doorHeightRatio + recHeight + 145 + 205 - 50, 20, 40);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX + recWidth + doorHeightRatio + recHeight + 145 + 205 - 50, 18, 38);
                    break;
                case "Continuous Hinge":
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX, 14, 739 + doorHeightRatio);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX + 5 + recWidth + doorWidthRatio, startX, 12, 739 + doorHeightRatio);
                    break;
            }
        } else if (hand.equals("Right")) {
            switch (hingingType) {
                case "Pivots":
                    //Top Pivot RH
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX - recHeight + 1, startX, 14, 20);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX - recHeight + 1, startX, 12, 18);

                    //Bottom Pivot RH
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX - recHeight + 1, startX + recWidth + doorHeightRatio + recHeight + 145 + 205, 14, 20);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX - recHeight + 1, startX + recWidth + doorHeightRatio + recHeight + 145 + 205, 12, 18);
                    break;
                case "Butt Hinge":
                    //Top Pivot RH
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX - recHeight + 1, startX + 50, 20, 40);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX - recHeight + 1, startX + 50, 18, 38);

                    //Bottom Pivot RH
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX - recHeight + 1, startX + recWidth + doorHeightRatio + recHeight + 145 + 205 - 50, 20, 40);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX - recHeight + 1, startX + recWidth + doorHeightRatio + recHeight + 145 + 205 - 50, 18, 38);
                    break;
                case "Continuous Hinge":
                    gc.setFill(Color.WHITE);
                    gc.fillRect(startX - recHeight + 1, startX, 14, 739 + doorHeightRatio);
                    gc.setFill(Color.rgb(173, 172, 172));
                    gc.fillRect(startX - recHeight + 1, startX, 12, 739 + doorHeightRatio);
                    break;
            }
        }
    }
}
