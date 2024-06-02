package hus.oop.de1.integration;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
public class IntegrationCalculatorTestDrive {
    public static Random rand = new Random();
    public static void main(String[] args) {
        /*
           - Chạy demo các hàm test.
           - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
             (ví dụ, NguyenVanA_123456_Integration.txt)
           - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        System.out.println();
        testListPolynomial();
    }

    public static void testArrayPolynomial() {
        /*
           - Tạo ra các đa thức MyArrayPolynomial, trong đó bậc của đa thức là số tự nhiên được sinh ngẫu nhiên trong đoạn [1, 10],
             và các hệ số của đa thức được sinh ngẫu nhiên trong đoạn [1, 10].
           - Viết chương trình test các chức năng của MyArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
             sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
             giá trị của x).
         */
        MyArrayPolynomial myArrayPolynomial = new MyArrayPolynomial();
        for (int i = 0; i < 5; i++) {
            double coeff = rand.nextInt((10 - 1) + 1) + 1;
            myArrayPolynomial.append(coeff);
        }
        System.out.println(myArrayPolynomial.toString());
        myArrayPolynomial.append(3);
        System.out.println(myArrayPolynomial.toString());
        MyArrayPolynomial myArrayPolynomial1 = new MyArrayPolynomial();
        for (int i = 0; i < 5; i++) {
            double coeff = rand.nextInt((10 - 1) + 1) + 1;
            myArrayPolynomial1.append(coeff);
        }
        System.out.println(myArrayPolynomial.plus(myArrayPolynomial1).toString());
        System.out.println(myArrayPolynomial.minus(myArrayPolynomial1).toString());
        System.out.println(myArrayPolynomial.multiply(myArrayPolynomial1).toString());
    }

    public static void testListPolynomial() {
        /*
           - Tạo ra các đa thức MyListPolynomial, trong đó bậc của đa thức là số tự nhiên được sinh ngẫu nhiên trong đoạn [1, 10],
             và các hệ số của đa thức được sinh ngẫu nhiên trong đoạn [1, 10].
           - Viết chương trình test các chức năng của MyListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
             sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
             giá trị của x).
         */
        MyArrayPolynomial myArrayPolynomial = new MyArrayPolynomial();
        for (int i = 0; i <= 4; i++) {
            double coeff = rand.nextInt((10-1)+1)+1;
            myArrayPolynomial.append(coeff);
        }
        System.out.println(myArrayPolynomial.toString());
        myArrayPolynomial.append(3);
        System.out.println(myArrayPolynomial.toString());
        MyArrayPolynomial myArrayPolynomial2 = new MyArrayPolynomial();
        for (int i = 0; i <= 4; i++) {
            int coeff = rand.nextInt((10-1)+1)+1;
            myArrayPolynomial2.append(coeff);
        }
        System.out.println(myArrayPolynomial2.toString());
        System.out.println(myArrayPolynomial.plus(myArrayPolynomial2).toString());
        System.out.println(myArrayPolynomial.minus(myArrayPolynomial2).toString());
        System.out.println(myArrayPolynomial.multiply(myArrayPolynomial2).toString());
    }

    public static void testIntegrationCalculator() {
        /*
           - Tạo ra các đa thức MyArrayPolynomial và MyListPolynomial, trong đó bậc của đa thức là số tự nhiên được sinh
             ngẫu nhiên trong đoạn [1, 10], và các hệ số của đa thức được sinh ngẫu nhiên trong đoạn [1, 10].
           - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho
             (MidpointMethod, TrapezoidMethod, SimpsonMethod) sử dụng IntegrationCalculator. Các phương pháp tính tích phân
             có thể thay đổi ở thời gian chạy chương trình.
           - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
    }
}
