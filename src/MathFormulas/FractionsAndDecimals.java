package MathFormulas;

public class FractionsAndDecimals {

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
        try {
            String x = String.valueOf(decimal);

            String[] parts = x.split("\\.");
            String wholeNum = parts[0];
            String decimalFraction = parts[1];

//            if (check < 0.67 || check > 0.65)
//                decimalFraction = "625";
//
//            if (check < 0.34 || check > 0.32)
//                decimalFraction = "3125";
//
//            if (check < 0.17 || check > 0.15)
//                decimalFraction = "125";


            int a = decimalFraction.length();

            int y = Integer.parseInt(decimalFraction);

            if (y == 0) {
                return wholeNum;
            } else {

                if (a == 1) {
                    int greatestCommonFactor = gcd(y, 10);
                    return wholeNum + "-" + (y / greatestCommonFactor) + "/" + (10 / greatestCommonFactor);
                } else if (a == 2) {
                    int greatestCommonFactor = gcd(y, 100);
                    return wholeNum + "-" + (y / greatestCommonFactor) + "/" + (100 / greatestCommonFactor);
                } else if (a == 3) {
                    int greatestCommonFactor = gcd(y, 1000);
                    return wholeNum + "-" + (y / greatestCommonFactor) + "/" + (1000 / greatestCommonFactor);
                } else {
                    int greatestCommonFactor = gcd(y, 10000);
                    return wholeNum + "-" + (y / greatestCommonFactor) + "/" + (10000 / greatestCommonFactor);
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            return String.valueOf(decimal);
        }
    }

    public int gcd(int a, int b) {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
}
