package hus.oop.de3.bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    public static void main(String[] args) {
        init();
        testOriginalData();

        /*
        TODO

        Viết code để test cho tất cả các hàm bên dưới.
        Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
        nộp lên classroom.
         */
        System.out.println("Test Highest Price");
        testFilterBooksHighestPrice();
        System.out.println("Test Lowest Price");
        testFilterBooksLowestPrice();
        System.out.println("Test Author");
        testFilterBooksOfAuthor();
        System.out.println("Test Genre");
        testFilterBooksOfGenre();
        System.out.println("Test Publisher");
        testFilterBooksOfPublisher();
        System.out.println("Test Price Decreasing");
        testPriceOfBooksDecreasing();
        System.out.println("Test Price Increasing");
        testPriceOfBooksIncreasing();
        System.out.println("Test Page Decreasing");
        testSortPagesOfBookDecreasing();
        System.out.println("Test Page Increasing");
        testSortPagesOfBookIncreasing();
    }

    public static void init() {
        String filePath = "C:\\Users\\DELL\\OneDrive\\Desktop\\Java\\On thi cuoi ki\\On thi cuoi ki\\De 4\\OOP_HK2_2223_FinalExam_De3\\data\\books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để quản lý.
                */
                String title = dataList.get(0);
                String author = dataList.get(1);
                String genre = dataList.get(2);
                int pages = Integer.parseInt(dataList.get(3));
                double price = Double.parseDouble(dataList.get(4));
                String publisher = dataList.get(5);
                Book newBook = new Book.BookBuilder(title)
                        .withAuthor(author)
                        .withGenre(genre)
                        .withPages(pages)
                        .withPrice(price)
                        .withPublisher(publisher)
                        .build();
                BookManager.getInstance().append(newBook);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        String studentIds = BookManager.getInstance().titleOfBooksToString(BookManager.getInstance().getBookList());
        System.out.print(studentIds);
    }

    public static void testSortPagesOfBookIncreasing() {
        List<Book> books = BookManager.getInstance().sortPagesIncreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testSortPagesOfBookDecreasing() {
        /* TODO */
        List<Book> books = BookManager.getInstance().sortPagesDecreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testPriceOfBooksIncreasing() {
        /* TODO */
        List<Book> books = BookManager.getInstance().sortPriceIncreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testPriceOfBooksDecreasing() {
        /* TODO */
        List<Book> books = BookManager.getInstance().sortPriceDecreasing();
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testFilterBooksLowestPrice() {
        List<Book> books = BookManager.getInstance().filterBooksLowestPrice(6);
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);

    }

    public static void testFilterBooksHighestPrice() {
        /* TODO */
        List<Book> books = BookManager.getInstance().filterBooksHighestPrice(6);
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testFilterBooksOfAuthor() {
        /* TODO */
        List<Book> books = BookManager.getInstance().filterBooksOfAuthor("Goswami Jaideva");
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testFilterBooksOfPublisher() {
        /* TODO */
        List<Book> books = BookManager.getInstance().filterBooksOfPublisher("Wiley");
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }

    public static void testFilterBooksOfGenre() {
        /* TODO */
        List<Book> books = BookManager.getInstance().filterBooksOfGenre("data_science");
        String bookTitlesString = BookManager.getInstance().titleOfBooksToString(books);
        System.out.print(bookTitlesString);
    }
}
