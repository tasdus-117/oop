package hus.oop.finalexam.rootsolver;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
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
            double rootCandidate = (lower + upper) / 2; // Chọn điểm giữa
            double fRoot = function.evaluate(rootCandidate);
            if (Math.abs(fRoot) < tolerance) {
                res = rootCandidate;
                break;
            }
            // Xác định khoảng tiếp theo
            if (fRoot * fLower < 0) {
                upper = rootCandidate;
            } else {
                lower = rootCandidate;
            }
        }
        return res;
    }
}
