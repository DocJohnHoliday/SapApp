package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Glass {

    FractionsAndDecimals fTD = new FractionsAndDecimals();

    // Glass for 3/16" Single doors
    public void doorGlass5mm4BR(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {
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

    public void doorGlassIG10BR(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 12.25);
        String glassSize = doorWidth + " x " + doorHeight;
        String stdTenGlass = "IG 10\" BR Glass";

        if (glassSize.equals("31-1/16 x 71")) {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(stdTenGlass, 2800, 2100);
        } else {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2800, 2100);
        }
    }

    // Glass for 3/16" Windows
    public void windowGlass5mm(double windowWidthDouble, double windowHeightDouble, int panels, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(windowWidthDouble - 0.5);
        String doorHeight = fTD.convertDecimalToFraction(windowHeightDouble - 3.0);
        String glassSize = "Qty " + panels + " "+ doorWidth + " x " + doorHeight;
        String standardGlass = "Std 4\" BR Glass";

        if (glassSize.equals("31-1/8 x 76-5/8")) {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(standardGlass, 2800, 2100);
        } else {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2800, 2100);
        }
    }
}
