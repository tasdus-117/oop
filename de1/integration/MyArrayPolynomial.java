package hus.oop.de1.integration;

import java.util.Arrays;

public class MyArrayPolynomial extends MyAbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficients;
    private int length;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayPolynomial() {
        /* TODO */
        coefficients = new double[DEFAULT_CAPACITY];
        length = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return coefficients;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial append(double coefficient) {
        /* TODO */
        coefficients[length++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, length] thì không thêm được.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index > length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (length >= coefficients.length) {
            enlarge();
        }

        for (int i = this.length; i > index; i--) {
            coefficients[i] = coefficients[i - 1];
        }
        coefficients[index] = coefficient;
        length++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return this.length-1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0;
        int degree = degree();
        for (int i = 0; i <= degree; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public MyPolynomial derivative() {
        /* TODO */
        MyArrayPolynomial derivative = new MyArrayPolynomial();
        double derivativeCoeffs[] = differentiate();
        for (double coeff : derivativeCoeffs) {
            derivative.append(coeff);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial plus(MyArrayPolynomial another) {
        /* TODO */
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i <= maxDegree; i++) {
            double coeff = (i < length ? coefficients[i] : 0) +
                    (i < another.length ? another.coefficients[i] : 0);
            this.set(coeff, i);
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial minus(MyArrayPolynomial another) {
        /* TODO */
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i < maxDegree; i++) {
            double coeff = (i < length ? coefficients[i] : 0) -
                    (i < another.length ? another.coefficients[i] : 0);
            this.set(coeff, i);
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public MyArrayPolynomial multiply(MyArrayPolynomial another) {
        /* TODO */
        int newSize = length + another.length - 1;
        double[] tempCoefficients = Arrays.copyOf(coefficients, length);
        while (this.coefficients.length < newSize){
            enlarge();
        }
        for (int i = 0; i < newSize; i++) {
            double sum = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j < length && (i - j) < another.length) {
                    sum += tempCoefficients[j] * another.coefficients[i - j];
                }
            }
            set(sum, i);
        }
        length = newSize;
        return this;
    }

    /**
     * Tăng kích thước gấp đôi để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double newArray[] = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, newArray, 0, coefficients.length);
        coefficients = newArray;
    }
}
