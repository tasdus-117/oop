package hus.oop.lab9.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;
    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }
    public int degree() {
        return coefficients.length;
    }
    public Poly derivative() {
        double[] derivativeCoefficients = new double[degree()-1];
        for (int i = 1; i < coefficients.length; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }
        return new ArrayPoly(derivativeCoefficients);
    }
    public double coefficient(int degree) {
        if (degree > 0 && degree < coefficients.length) {
            return coefficients[degree];
        } else {
            return 0;
        }
    }
    public double[] coefficients() {
        return coefficients.clone();
    }
}
