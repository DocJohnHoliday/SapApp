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
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlass5mm4BRPair(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 6.75 + 0.125);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlass5mm7BR(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 10.25 + 0.125);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlassIG7BR(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 10.25);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlass5mm10BR(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 12.25 + 0.125);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlass5mm10BRPair(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 12.25 + 0.125);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlassIG10BR(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 12.25);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlass5mm7BRWideStile(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 5 - 8);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void doorGlass5mm10BRWideStile(double doorWidthDouble, double doorHeightDouble, String glass, int quantity, GraphicsContext gc) {
        //Door glass
        String doorWidth = fTD.convertDecimalToFraction(doorWidthDouble - 0.5 + 0.0625);
        String doorHeight = fTD.convertDecimalToFraction(doorHeightDouble - 5 - 10);
        String glassSize = glass + "  (Qty " + quantity + ") " + doorWidth + " x " + doorHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2275);
    }

    public void slGlass5mm(double slWidthDouble, double slHeightDouble, int quantity, String glass, int panels, GraphicsContext gc) {
        //Door glass
        String slWidth = fTD.convertDecimalToFraction(slWidthDouble);
        String slHeight = fTD.convertDecimalToFraction(slHeightDouble);
        String glassSize =  glass + " (Qty " + (panels * quantity) + ") " + slWidth + " x " + slHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2350);
    }

    public void transomGlass5mm(double transomWidthDouble, double transomHeightDouble, int quantity, String glass, GraphicsContext gc) {
        //Door glass
        System.out.println(transomWidthDouble + " " + transomHeightDouble);
        String transomWidth = fTD.convertDecimalToFraction(transomWidthDouble - 3.0);
        String transomHeight = fTD.convertDecimalToFraction(transomHeightDouble - 0.5);
        String glassSize =  glass + " (Qty " + quantity + ") " + transomWidth + " x " + transomHeight;

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 40));
        gc.fillText(glassSize, 2500, 2375);
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
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("default", FontWeight.BOLD, 50));
        gc.fillText("No Glass", 2500, 2100);
    }
}
