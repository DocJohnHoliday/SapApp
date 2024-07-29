package MathFormulas;

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
        try {

            String x = String.valueOf(decimal);

            String[] parts = x.split("\\.");
            String wholeNum = parts[0];
            String decimalFraction = parts[1];

            int a = decimalFraction.length();

            int y = Integer.parseInt(decimalFraction);

            if(y == 0) {
                return wholeNum;
            } else {

                if(a == 2) {
                    int greatestCommonFactor = gcd(y, 100);
                    return wholeNum + " " + (y / greatestCommonFactor) + "/" + (100 / greatestCommonFactor);
                } else if(a == 3) {
                    int greatestCommonFactor = gcd(y, 1000);
                    return wholeNum + " " + (y / greatestCommonFactor) + "/" + (1000 / greatestCommonFactor);
                } else {
                    int greatestCommonFactor = gcd(y, 10000);
                    return wholeNum + " " + (y / greatestCommonFactor) + "/" + (10000 / greatestCommonFactor);
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

        // take a loop iterating through smaller number to 1
        for (i = i; i > 1; i--) {

            // check if the current value of i divides both
            // numbers with remainder 0 if yes, then i is
            // the GCD of a and b
            if (a % i == 0 && b % i == 0)
                return i;
        }

        // if there are no common factors for a and b other
        // than 1, then GCD of a and b is 1
        return 1;
    }
}
