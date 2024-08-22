package DrawingComponents;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Stiles {
    int j = 0;
    int i = 0;
    /////////////////////////////////////////Bronze

    public void narrowSingleStile(double doorWidthDouble, double doorHeightDouble, String doorHeightString, String color,  GraphicsContext gc) {

        int doorWidthRatio = (int) ((Math.ceil(doorWidthDouble) - 40) * 2);
        int doorHeightRatio = (int) ((Math.ceil(doorHeightDouble) - 84) * 2);

        //Stile Text
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(doorHeightString,(1450 + 1 + 350 + doorWidthRatio) + 24, ((double) (350 + doorHeightRatio + 24 + 15 + 350) / 2) + 1450);

        if(color.equals("Bronze") || color.equals("Black")) {
            //Left Stile
            gc.setFill(Color.rgb(95, 87, 87));
            gc.fillRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
            //Right Stile
            gc.setFill(Color.rgb(95, 87,87));
            gc.fillRect(1450 + 1 + 350 + doorWidthRatio, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        } else {
            //Left Stile
            gc.strokeRect(1450 - 24, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
            //Right Stile
            gc.strokeRect(1450 + 350 + doorWidthRatio, 1450, 24, 350 + doorHeightRatio + 24 + 15 + 350);
        }
    }
}
