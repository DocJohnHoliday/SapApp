package MathFormulas;

import static org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions.gcd;

public class FractionToDecimal {

    public double fractionToDecimal(String x) {

        try {
            String[] split = x.trim().split("\\s+");
            String fraction = split[1];
            String[] splitFraction = fraction.split("/");
            double y = Double.parseDouble(splitFraction[0]);
            double z = Double.parseDouble(splitFraction[1]);
            String whole = split[0];
            double wholeNum = Double.parseDouble(whole);

            return wholeNum + (y / z);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Double.parseDouble(x);
        }
    }

    public String convertDecimalToFraction(double decimal) {
        String num = "Hang On";

//        String[]


        return num;
    }
}
