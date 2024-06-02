package hus.oop.finalexam.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        /* TODO */
        return x * new MyMath().ln(x)-3;
    }
}
