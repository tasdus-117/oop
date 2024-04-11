package hus.oop.lab9.polynomials;
import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;
    public ListPoly(double[] coefficient) {
        coefficients = new ArrayList<>();
        for (double coeff: coefficient) {
            coefficients.add(coeff);
        }
    }
    public int degree() {
        return coefficients.size()-1;
    }
    public Poly derivative() {
        double[] derivativeCoefficients = new double[degree()];
        for (int i = 1; i < coefficients.size(); i++) {
            derivativeCoefficients[i - 1] = coefficients.get(i) * i;
        }
        return new ArrayPoly(derivativeCoefficients);
    }
    public double coefficient(int degree) {
        if (degree > 0 && degree < coefficients.size()) {
            return coefficients.get(degree);
        } else {
            return 0;
        }
    }

    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()-1];
        for (int i = 0; i < coeffsArray.length; i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }
}