package hus.oop.finalexam.rootsolver;

public class MyMath {
    private static final int TERM = 1000;
    public double sin(double x) {
        /* TODO */
        double res = x;
        double term = x;
        int sign = -1;
        for (int i = 1; i < TERM; i += 2) {
            term *= x * x / ((i + 1) * (i + 2));
            res += sign * term;
            sign *= -1;
        }
        return res;
    }

    public double cos(double x) {
        /* TODO */
        double res = 1; // First term in the series is 1
        double term = 1;
        int sign = -1;
        for (int i = 1; i < TERM; i += 2) {
            term *= x * x / (i * (i + 1));
            res += sign * term;
            sign *= -1;
        }
        return res;
    }

    public double exp(double x) {
        /* TODO */
        double res = 1; // First term in the series is 1
        double term = 1;
        for (int i = 1; i < TERM; i++) {
            term *= x / i;
            res += term;
        }
        return res;
    }

    public double ln(double x) {
        /* TODO */
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        double res = 0;
        double term = (x - 1) / x;
        for (int i = 1; i < TERM; i++) {
            res += term / i;
            term *= (x - 1) / x;
        }
        return res;
    }
}
