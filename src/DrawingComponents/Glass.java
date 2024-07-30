package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Glass {

    FractionsAndDecimals fTD = new FractionsAndDecimals();

    // Glass for 3/16" Single doors
    public void doorGlass5mm4BR(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {
        //Glass Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 75));
        gc.fillText("Glass Sizes", 2800, 2000);
        gc.strokeLine(2800, 2025, 3250, 2025);
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 6.75 + 0.125);
        String glassSize = doorWidth + " x " + doorHeight;
        String standardGlass = "Std 4\" BR Glass";

        if (glassSize.equals("31-1/8 x 76-5/8")) {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(standardGlass, 2800, 2100);
        } else {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2800, 2100);
        }
    }

    public void doorGlass5mm10BR(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {
        //Glass Label
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 75));
        gc.fillText("Glass Sizes", 2800, 2000);
        gc.strokeLine(2800, 2025, 3250, 2025);
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 12.25 + 0.125);
        String glassSize = doorWidth + " x " + doorHeight;
        String stdTenGlass = "Std 10\" BR Glass";

        if (glassSize.equals("31-1/8 x 71-1/8")) {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(stdTenGlass, 2800, 2100);
        } else {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2800, 2100);
        }
    }
}
