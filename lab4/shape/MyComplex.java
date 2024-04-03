package hus.oop.lab4.shape;

import javax.swing.plaf.PanelUI;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;
    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }
    public boolean isReal() {
        return (imag == 0);
    }
    public boolean isImaginary() {
        return (real == 0);
    }
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    public boolean aquals(MyComplex another) {
        return (another.equals(this.real, this.imag));
    }
    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument() {
        return Math.atan2(imag, real);
    }
    public MyComplex addInto(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        double resReal = this.real + right.real;
        double resImag = this.imag + right.imag;
        return new MyComplex(resReal, resImag);
    }
    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        double resReal = this.real - right.real;
        double resImag = this.imag - right.imag;
        return new MyComplex(resReal, resImag);
    }
    public MyComplex multiply(MyComplex right) {
        double resReal = this.real*right.real - this.imag*right.imag;
        double resImag = this.real* right.imag + this.imag*right.real;
        return new MyComplex(resReal, resImag);
    }
    public MyComplex divide(MyComplex right) {
        double a = this.real;
        double b = this.imag;

        double c = right.real;
        double d = right.imag;

        double denominator = c * c + d * d;

        double realPart = (a * c + b * d) / denominator;
        double imagPart = (b * c - a * d) / denominator;
        return new MyComplex(realPart, imagPart);
    }
    public MyComplex conjugate() {
        double resImag = -imag;
        return new MyComplex(real, resImag);
    }
}
