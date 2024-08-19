package DrawingComponents;

import MathFormulas.FractionsAndDecimals;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Glass {

    FractionsAndDecimals fTD = new FractionsAndDecimals();

    // Glass for 3/16" Single doors
    public void doorGlass5mm4BR(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 6.75 + 0.125);
        String glassSize;
        glassSize = glass + "   " + doorWidth + " x " + doorHeight;
        String standardGlass = "Std 4\" BR Glass";

        if (glassSize.equals("3/16 Clr  31-1/8 x 76-5/8")) {
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(standardGlass, 2500, 2075);
        } else {
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(glassSize, 2500, 2075);
        }
    }

    public void doorGlass5mm10BR(double doorWidthDouble, double doorHeightDouble, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 12.25 + 0.125);
        String glassSize = doorWidth + " x " + doorHeight;
        String stdTenGlass = "Std 10\" BR Glass";

        if (glassSize.equals("3/16 Clr  31-1/8 x 71-1/8")) {
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(stdTenGlass, 2500, 2075);
        } else {
            gc.setFont(Font.font("default", FontWeight.BOLD, 40));
            gc.fillText(glassSize, 2500, 2075);
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
            gc.fillText(stdTenGlass, 2500, 2075);
        } else {
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        }
    }

    public void windowGlassIG(double windowWidthDouble, double windowHeightDouble, int quantity, String glass, int panels, GraphicsContext gc) {
        //Window glass
        String doorWidth;
        String doorHeight = fTD.convertDecimalToFraction(windowHeightDouble - 3.125);
        String glassSize;

        if (panels == 1) {
            doorWidth = fTD.convertDecimalToFraction(windowWidthDouble - 3.125);
            glassSize = glass + "  (Qty " + panels * quantity + ") " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        } else if (panels == 2) {
            doorWidth = fTD.convertDecimalToFraction(((windowWidthDouble - 3.875) / 2) - 0.5);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        } else if (panels == 3) {
            doorWidth = fTD.convertDecimalToFraction(((windowWidthDouble - 5) / 3) - 0.625);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        } else if (panels == 4) {
            doorWidth = fTD.convertDecimalToFraction(((windowWidthDouble - 6.25) / 4) - 0.625);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        }
    }

    // Glass for 3/16" Windows
    public void windowGlass5mm(double windowWidthDouble, double windowHeightDouble, int quantity, String glass, int panels, GraphicsContext gc) {

        String doorWidth;
        String doorHeight = fTD.convertDecimalToFraction(windowHeightDouble - 3.0);
        String glassSize;

        if (panels == 1) {
            doorWidth = fTD.convertDecimalToFraction(windowWidthDouble - 3.0);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        } else if (panels == 2) {
            doorWidth = fTD.convertDecimalToFraction(((windowWidthDouble - 3.75) / 2) - 0.5);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2500, 2075);
        } else if (panels == 3) {
            BigDecimal num1 = new BigDecimal(windowWidthDouble - 5.0);
            BigDecimal num2 = new BigDecimal(3);
            double x = num1.divide(num2, 2, RoundingMode.HALF_DOWN).doubleValue();
            doorWidth = fTD.convertDecimalToFraction(x - .5);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2450, 2075);
        } else if (panels == 4) {
            doorWidth = fTD.convertDecimalToFraction(((windowWidthDouble - 6.25) / 4) - 0.5);
            glassSize = glass + "  (Qty " + panels * quantity + ")  " + doorWidth + " x " + doorHeight;
            gc.setFont(Font.font("default", FontWeight.BOLD, 50));
            gc.fillText(glassSize, 2450, 2075);
        }
    }

    public void noGlass(GraphicsContext gc) {
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText("\"No Glass\"", 2500, 2100);
    }
}
