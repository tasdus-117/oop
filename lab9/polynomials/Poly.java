package hus.oop.lab9.polynomials;

public interface Poly {
    int degree();
    Poly derivative();
    double[] coefficients();
    double coefficient(int degree);

}
