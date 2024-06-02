package hus.oop.de1.integration;

import hus.oop.lab12.integration.ListPolynomial;

import java.util.ArrayList;
import java.util.List;

public class MyListPolynomial extends MyAbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyListPolynomial() {
        /* TODO */
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     *
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     *
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] res = coefficients();
        return res;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     *
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public MyListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, coefficients.length()] thì không thêm được.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyListPolynomial insert(double coefficient, int index) {
        /* TODO */
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public MyListPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     *
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     *
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double res = 0;
        int degree = degree();
        for (int i = 0; i < degree; i++) {
            res += coefficient(i) * Math.pow(x, i);
        }
        return res;
    }

    /**
     * Lấy đạo hàm của đa thức.
     *
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public MyPolynomial derivative() {
        /* TODO */
        MyListPolynomial res = new MyListPolynomial();
        double deriCoeff[] = differentiate();
        for (double coeff : deriCoeff) {
            res.append(coeff);
        }
        return res;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyListPolynomial plus(MyListPolynomial another) {
        /* TODO */
        int maxSize = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxSize; i++) {
            double coeff = (i <= this.degree() ? this.coefficient(i) : 0) +
                    (i <= another.degree() ? another.coefficient(i) : 0);
            this.set(coeff, i);
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyListPolynomial minus(MyListPolynomial another) {
        /* TODO */
        int maxSize = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxSize; i++) {
            double coeff = (i < coefficients.size() ? coefficients.get(i) : 0) -
                    (i < another.coefficients.size() ? another.coefficients.get(i) : 0);
            this.set(coeff, i);
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     *
     * @param another
     * @return đa thức hiện tại.
     */
    public MyListPolynomial multiply(MyListPolynomial another) {
        // Initialize the result polynomial with the appropriate size
        MyListPolynomial result = new MyListPolynomial();
        int newSize = this.coefficients.size() + another.coefficients.size() - 1;
        for (int i = 0; i < newSize; i++) {
            result.coefficients.add(0.0);
        }

        // Multiply each coefficient of the current polynomial with each coefficient of the another polynomial
        for (int i = 0; i < this.coefficients.size(); i++) {
            for (int j = 0; j < another.coefficients.size(); j++) {
                int index = i + j;
                double value = this.coefficients.get(i) * another.coefficients.get(j);
                result.coefficients.set(index, result.coefficients.get(index) + value);
            }
        }

        // Ensure the current polynomial has the same number of coefficients as the result
        while (this.coefficients.size() < result.coefficients.size()) {
            this.coefficients.add(0.0);
        }

        // Copy the result back into the current polynomial
        for (int i = 0; i < result.coefficients.size(); i++) {
            this.coefficients.set(i, result.coefficients.get(i));
        }

        return this;
    }


}