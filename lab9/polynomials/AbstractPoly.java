package hus.oop.lab9.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public double[] derive() {
        double[] coefficients1 = coefficients();
        double[] res = new double[coefficients1.length - 1];
        for (int i = 1; i < coefficients1.length; i++) {
            res[i - 1] = coefficients1[i] * i;
        }
        return res;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractPoly)) {
        }
        AbstractPoly that = (AbstractPoly) o;
        double[] thisCoefficients = this.coefficients();
        double[] thatCoefficients = that.coefficients();
        if (thisCoefficients.length != thatCoefficients.length) {
            return false;
        }
        for (int i = 0; i < thisCoefficients.length; i++) {
            if (thisCoefficients[i] != thatCoefficients[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        double coefficients[] = coefficients();
        int degree = degree();

        for (int i = degree-1; i >= 0; i--) {
            double coef = coefficients[i];

            if (i == 0) {
                stringBuilder.append(coef);
            } else {
                stringBuilder.append(coef + "*x^" + i + " + ");
            }
        }

        return String.valueOf(stringBuilder);
    }
}
