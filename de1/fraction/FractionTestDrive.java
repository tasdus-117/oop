package hus.oop.de1.fraction;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
public class FractionTestDrive {
    public static void main(String[] args) {
        /*
        TODO:
        1. Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu giá trị vào biến numbers.
        2. Tạo ra numbers phân số, trong đó tử số và mẫu số được sinh ngẫu nhiên là các số tự nhiên nằm trong đoạn [1, 100].
           Lưu các phân số vào trong một tập dữ liệu DataSet, được gọi là dataSet.

        3. Sắp xếp và in ra tập dữ liệu đã tạo ra theo các tiêu chí sau:
             - In ra các phân số theo thứ tự có giá trị tăng dần, nếu phân số bằng nhau thì được sắp xếp theo thứ tự
               có giá trị tăng dần của mẫu số.
             - In ra các phân số theo thứ tự có giá trị giảm dần, nếu phân số bằng nhau thì được sắp xếp theo thứ tự
               có giá trị giảm dần của mẫu số.

         4. In ra các dữ liệu sau:
             - In ra các phân số tối giản của các phân số đã tạo ra theo thứ tự trong dữ liệu gốc.
             - In ra các phân số tối giản theo thứ tự tăng dần.
             - In ra các phân số tối giản theo thứ tự giảm dần.

         5. - Chạy chương trình và lưu kết quả chạy chương trình và file text được đặt tên
              là <TenSinhVien_MaSinhVien_Fraction>.txt (Ví dụ, NguyenVanA_123456_Fraction.txt).
            - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
              <TenSinhVien_MaSinhVien_Fraction>.zip (Ví dụ, NguyenVanA_123456_Fraction.zip),
              nộp lên classroom.
         */
        System.out.println("1.");
        Random random = new Random();
        int numbers = random.nextInt((50-30)+1) + 30;
        System.out.println("The numbers is: " + numbers);
        System.out.println("2.");
        Fraction[] result = new Fraction[5];
        for (int i = 0; i < result.length; i++) {
            int numerator = random.nextInt((100-1)+1) + 1;
            int denominator = random.nextInt((100-1)+1) + 1;
            Fraction fraction = new Fraction(numerator, denominator);
            result[i] = fraction;
        }
        DataSet dataSet = new DataSet(result);
        System.out.println(dataSet.toString());
        System.out.println("3.");
        DataSet dataSet1 = new DataSet(dataSet.sortIncreasing());
        System.out.println(dataSet1.toString());
        DataSet dataSet2 = new DataSet(dataSet1.sortDecreasing());
        System.out.println(dataSet2.toString());
        System.out.println("4.");
        dataSet.toSimplify();
        System.out.println(dataSet.toString());
        DataSet dataSet3 = new DataSet(dataSet.sortIncreasing());
        System.out.println(dataSet3.toString());
        DataSet dataSet4 = new DataSet(dataSet.sortDecreasing());
        System.out.println(dataSet4.toString());
        Fraction frac = new Fraction(1, 2);
        System.out.println(dataSet1.insert(frac, 2));
        System.out.println(dataSet1.toString());
    }
}
