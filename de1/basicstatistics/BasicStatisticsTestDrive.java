package hus.oop.de1.basicstatistics;
import hus.oop.lab8.countrymanager.countryarraymanager.SouthAmericaCountry;

import java.util.Random;
public class BasicStatisticsTestDrive {
    public static Random rand = new Random();
    public static void main(String[] args) {
        /*
           - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
             là <TenSinhVien_MaSinhVien_BasicStatistics>.txt (Ví dụ, NguyenVanA_123456_BasicStatistics.txt).
           - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
             <TenSinhVien_MaSinhVien_BasicStatistics>.zip (Ví dụ, NguyenVanA_123456_BasicStatistics.zip),
             nộp lên classroom.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo một danh sách kiểu MyArrayList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra các dữ liệu và các đại lượng thống kê.
         */
        int length = rand.nextInt((50-30)+1) + 30;
        MyList res = new MyArrayList();
        for (int i = 0; i < length; i++) {
            double num = rand.nextDouble((50-30)+1) + 30;
            res.append(num);
        }
        System.out.println(res.toString());
        BasicStatistic bs = new BasicStatistic(res);
        System.out.println(bs.max());
        System.out.println(bs.min());
        System.out.println(bs.mean());
        System.out.println(bs.variance());
        res.insert(3,3);
        System.out.println(res.toString());
        res.remove(3);

    }

    public static void testMyLinkedList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo ra một danh sách kiểu MyLinkedList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        int length = rand.nextInt((50-30)+1) + 30;
        MyList res = new MyLinkedList();
        for (int i = 0; i < length; i++) {
            double num = rand.nextDouble((50-30)+1) + 30;
            res.append(num);
        }
        System.out.println(res.toString());
        BasicStatistic bs = new BasicStatistic(res);
        System.out.println(bs.max());
        System.out.println(bs.min());
        System.out.println(bs.variance());
        System.out.println(bs.mean());
        res.remove(2);
        System.out.println(res.toString());
    }
}
