package hus.oop.de1.integration;

public class SimpsonMethod extends AbstractIntegrator {
    public SimpsonMethod(double precision, int maxIterations) {
        /* TODO */
        super(precision, maxIterations);
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng lặp vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n_0 tùy ý, sau đó tính I_n với n = n_0, 2n_0, 4n_0, ...
     * Việc tính toán dừng lại khi |I_2n - I_n|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(MyPolynomial polynomial, double lower, double upper) {
        /* TODO */
        int numOfSubIntervals = 2;
        double previousResult = integrate(polynomial, lower, upper, numOfSubIntervals);
        double currentResult = 0.0;

        for (int i = 1; i <= maxIterations; i++) {
            numOfSubIntervals *= 2;
            currentResult = integrate(polynomial, lower, upper, numOfSubIntervals);
            if (Math.abs(currentResult - previousResult) < precision) {
                return currentResult;
            }
            previousResult = currentResult;
        }
        return currentResult;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param polynomial
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(MyPolynomial polynomial, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double intervalLength = (upper - lower) / numOfSubIntervals;
        double sum = polynomial.evaluate(lower) + polynomial.evaluate(upper);

        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * intervalLength;
            if (i % 2 == 0) {
                sum += 2 * polynomial.evaluate(x);
            } else {
                sum += 4 * polynomial.evaluate(x);
            }
        }

        return (sum * intervalLength) / 3;
    }
}
