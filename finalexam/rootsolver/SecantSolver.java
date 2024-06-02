package hus.oop.finalexam.rootsolver;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     *
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     *
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double res = 0;
        for (int i = 0; i < maxIterations; i++) {
            double flower = function.evaluate(lower);
            double fupper = function.evaluate(upper);
            double mean = upper - fupper * (upper - lower) / (fupper - flower);
            if (Math.abs(mean - upper) < tolerance) {
                res = mean;
                break;
            }
            lower = upper;
            upper = mean;
        }
        return res;
    }
}
