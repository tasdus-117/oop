package hus.oop.de1.integration;

public abstract class MyAbstractPolynomial implements MyPolynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder polynomial = new StringBuilder();
        int degree = degree();
        for (int i = degree; i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0) {
                if (polynomial.length() > 0 && coeff > 0) {
                    polynomial.append(" + ");
                } else {
                    polynomial.append(" ");
                }
                if (i == 0) {
                    polynomial.append(coeff);
                } else {
                    if (coeff != 1) {
                        polynomial.append(coeff);
                    }
                    polynomial.append("x");
                    if (i > 1) {
                        polynomial.append("^").append(i);
                    }
                }
            }
        }
        return polynomial.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        int degree = degree();
        double[] coeff = coefficients();
        double[] res = new double[degree];
        for (int i = 1; i <= degree; i++) {
            res[i-1] = coeff[i] * i;
        }
        return res;
    }
}
