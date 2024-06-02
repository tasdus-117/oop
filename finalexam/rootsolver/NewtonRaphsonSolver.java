package hus.oop.finalexam.rootsolver;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double res = 0;
        for (int iteration = 0; iteration < maxIterations; iteration++) {
            double fLower = function.evaluate(lower);
            double fUpper = function.evaluate(upper);
            double derivative = (fUpper - fLower) / (upper - lower); // Đạo hàm xấp xỉ
            double xNew = upper - fUpper / derivative; // Công thức cập nhật Newton-Raphson
            if (Math.abs(xNew - upper) < tolerance) {
                res = xNew;
                break;
            }
            // Cập nhật lại giá trị upper
            upper = xNew;
        }
        return res;
    }
}
