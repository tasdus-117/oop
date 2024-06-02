package hus.oop.finalexam.studentmanager;

import hus.oop.lab8.countrymanager.countryarraymanager.SouthAmericaCountry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final StudentManager studentManager = StudentManager.getInstance();
    public static void main(String[] args) {
        init();
        testOriginalData();
        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
        nộp lên classroom.
         */
        System.out.println();
        testFilterStudentsHigherThanAverageGrade();
        System.out.println();
        testFilterStudentsHighestMathsGrade();
        System.out.println();
        testFilterStudentsHighestMathsGrade();
        System.out.println();
        testFilterStudentsLowerThanAverageGrade();
        System.out.println();
        testFilterStudentsLowestAverageGrade();
        System.out.println();
        testFilterStudentsLowestMathsGrade();
        System.out.println();
        testSortAverageGradeDecreasing();
        System.out.println();
        testSortAverageGradeDecreasing();
        System.out.println();
        testSortYearOfBirthDecreasing();
        System.out.println();
        testSortYearOfBirthIncreasing();
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
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        List<Student> students = StudentManager.getInstance().filterStudentsHighestMathsGrade(6);
        String sId = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(sId);

    }

    public static void testFilterStudentsLowestMathsGrade() {
        List<Student> students = StudentManager.getInstance().filterStudentsLowestMathsGrade(5);
        String sId = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(sId);

    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> nHighestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestAverageGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestAverageGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nLowestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestAverageGradeStudents.add(students.get(i));
        }
        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestAverageGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHigherThanAverageGrade() {
        /* TODO */
        List<Student> students = StudentManager.getInstance().filterStudentsHigherThanAverageGrade(4);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowerThanAverageGrade() {
        /* TODO */
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nLowerThanAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowerThanAverageGradeStudents.add(students.get(i));
        }
        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowerThanAverageGradeStudents);
        System.out.println(codeString);
    }
}
