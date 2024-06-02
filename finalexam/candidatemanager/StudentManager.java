package hus.oop.finalexam.candidatemanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private MyList studentList;

    private StudentManager() {
        studentList = new MyLinkedList();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public MyList getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        studentList.append(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.insert(student,index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return (Student) studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public MyList sortMathsGradeIncreasing() {
        /* TODO */
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size()-1-i; j++) {
                if (studentAt(i).getMathsGrade() > studentAt(j).getMathsGrade()) {
                    Student temp = studentAt(i);
                    studentList.set(temp, j);
                    studentList.set(studentAt(j), i);
                }
            }
        }
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public MyList sortMathsGradeDecreasing() {
        /* TODO */
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size()-1-i; j++) {
                if (studentAt(i).getMathsGrade() < studentAt(j).getMathsGrade()) {
                    Student temp = studentAt(i);
                    studentList.set(temp, j);
                    studentList.set(studentAt(j), i);
                }
            }
        }
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public MyList sortAverageGradeIncreasing() {
        /* TODO */
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size()-1-i; j++) {
                if (studentAt(i).getAverageGrade() > studentAt(j).getAverageGrade()) {
                    Student temp = studentAt(i);
                    studentList.set(temp, j);
                    studentList.set(studentAt(j), i);
                }
            }
        }
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public MyList sortAverageGradeDecreasing() {
        /* TODO */
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size()-1-i; j++) {
                if (studentAt(i).getAverageGrade() < studentAt(j).getAverageGrade()) {
                    Student temp = studentAt(i);
                    studentList.set(temp, j);
                    studentList.set(studentAt(j), i);
                }
            }
        }
        return studentList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        MyList temp = sortAverageGradeDecreasing();
        MyList res = new MyLinkedList();
        for (int i = 0; i < howMany; i++) {
            res.append(temp.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsLowestMathsGrade(int howMany) {
        /* TODO */
        MyList temp = sortMathsGradeIncreasing();
        MyList res = new MyLinkedList();
        for (int i = 0; i < howMany; i++) {
            res.append(temp.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        MyList temp = sortAverageGradeDecreasing();
        MyList res = new MyLinkedList();
        for (int i = 0; i < howMany; i++) {
            res.append(temp.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        MyList temp = sortMathsGradeIncreasing();
        MyList res = new MyLinkedList();
        for (int i = 0; i < howMany; i++) {
            res.append(temp.get(i));
        }
        return res;
    }

    public static String idOfStudentsToString(MyList studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        MyIterator it = studentList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(MyList studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        MyIterator it = studentList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
