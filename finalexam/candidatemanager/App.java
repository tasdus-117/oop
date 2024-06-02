package hus.oop.finalexam.candidatemanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final StudentManager studentManager = StudentManager.getInstance();
    public static void main(String[] args) {
        init();
        testOriginalData();
        System.out.println();
        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_CandidateManager>.txt (Ví dụ, NguyenVanA_123456_CandidateManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_CandidateManager>.zip (Ví dụ, NguyenVanA_123456_CandidateManager.zip),
        nộp lên classroom.
         */
        testFilterStudentsHighestAverageGrade();
        System.out.println();
        testFilterStudentsHighestMathsGrade();
        System.out.println();
        testFilterStudentsLowestAverageGrade();
        System.out.println();
        testFilterStudentsLowestAverageGrade();
        System.out.println();
        testSortAverageGradeDecreasing();
        System.out.println();
        testSortMathsGradeDecreasing();
        System.out.println();
        testSortAverageGradeIncreasing();
        System.out.println();
        testSortMathsGradeIncreasing();
    }

    public static void init() {
        String filePath = "C:\\Users\\DELL\\OneDrive\\Desktop\\Java\\OOP_HK2_2223_FinalExam_De2\\data\\students.csv";
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
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
                String id = dataList.get(0);
                String lastName = dataList.get(1);
                String firstName = dataList.get(2);
                int yearOfBirth = Integer.parseInt(dataList.get(3));
                double mathsGrade = Double.parseDouble(dataList.get(4));
                double physicsGrade = Double.parseDouble(dataList.get(5));
                double chemistryGrade = Double.parseDouble(dataList.get(6));
                Student newStudent = new Student.StudentBuilder(id)
                        .withLastname(lastName)
                        .withFirstname(firstName)
                        .withYearOfBirth(yearOfBirth)
                        .withMathsGrade(mathsGrade)
                        .withPhysicsGrade(physicsGrade)
                        .withChemistryGrade(chemistryGrade)
                        .build();
                studentManager.append(newStudent);
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
        String sId = StudentManager.getInstance().idOfStudentsToString(studentManager.getInstance().getStudentList());
        System.out.println(sId);
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        studentManager.sortMathsGradeIncreasing();
        String sId = StudentManager.getInstance().idOfStudentsToString(studentManager.getInstance().getStudentList());
        System.out.println(sId);
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        studentManager.sortMathsGradeDecreasing();
        String sId = StudentManager.getInstance().idOfStudentsToString(studentManager.getInstance().getStudentList());
        System.out.println(sId);
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        studentManager.sortAverageGradeIncreasing();
        String sId = StudentManager.getInstance().idOfStudentsToString(studentManager.getInstance().getStudentList());
        System.out.println(sId);
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        studentManager.sortAverageGradeDecreasing();
        String sId = StudentManager.getInstance().idOfStudentsToString(studentManager.getInstance().getStudentList());
        System.out.println(sId);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        /* TODO */
        MyList res = studentManager.filterStudentsHighestMathsGrade(5);
        String sid = studentManager.getInstance().idOfStudentsToString(res);
        System.out.println(res);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        /* TODO */
        MyList res = studentManager.filterStudentsLowestAverageGrade(5);
        String sid = studentManager.getInstance().idOfStudentsToString(res);
        System.out.println(res);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        MyList res = studentManager.filterStudentsHighestAverageGrade(5);
        String sid = studentManager.getInstance().idOfStudentsToString(res);
        System.out.println(res);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        MyList res = studentManager.filterStudentsLowestAverageGrade(5);
        String sid = studentManager.getInstance().idOfStudentsToString(res);
        System.out.println(res);
    }
}
