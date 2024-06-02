package hus.oop.finalexam.studentmanager;

import java.util.*;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        studentList = new LinkedList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     *
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     *
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.add(index, student);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     *
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     *
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     *
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự năm sinh tăng dần.
     *
     * @return
     */
    public List<Student> sortYearOfBirthIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return left.getYearOfBirth() - right.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sinh viên theo thứ tự năm sinh giảm dần.
     *
     * @return
     */
    public List<Student> sortYearOfBirthDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return right.getYearOfBirth() - left.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     *
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getMathsGrade() > right.getMathsGrade()) {
                    return 1;
                } else if (left.getMathsGrade() < right.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     *
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getMathsGrade() > left.getMathsGrade()) {
                    return 1;
                } else if (right.getMathsGrade() < left.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     *
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student right, Student left) {
                if (left.getPhysicsGrade() > right.getPhysicsGrade()) {
                    return 1;
                } else if (left.getPhysicsGrade() < right.getPhysicsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     *
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            public int compare(Student right, Student left) {
                if (right.getPhysicsGrade() > left.getPhysicsGrade()) {
                    return 1;
                } else if (right.getPhysicsGrade() < left.getPhysicsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     *
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student right, Student left) {
                if (left.getChemistryGrade() > right.getChemistryGrade()) {
                    return 1;
                } else if (left.getChemistryGrade() < right.getChemistryGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     *
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student right, Student left) {
                if (right.getChemistryGrade() > left.getChemistryGrade()) {
                    return 1;
                } else if (right.getChemistryGrade() < left.getChemistryGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     *
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student right, Student left) {
                if (left.getAverageGrade() > right.getAverageGrade()) {
                    return 1;
                } else if (left.getAverageGrade() < right.getAverageGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     *
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student right, Student left) {
                if (right.getAverageGrade() > left.getAverageGrade()) {
                    return 1;
                } else if (right.getAverageGrade() < left.getAverageGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý cao nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> sorted = new LinkedList<>(studentList);
        List<Student> res = new LinkedList<>();
        List<Student> studentList1 = sortPhysicsGradeDecreasing();
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra những sinh viên có điểm lý cao hơn lowerBoundGrade.
     *
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanPhysicsGrade(double lowerBoundGrade) {
        /* TODO */
        List<Student> newList = new LinkedList<>();
        for (Student student : studentList) {
            if (student.getPhysicsGrade() > lowerBoundGrade) {
                newList.add(student);
            }
        }
        return newList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> sorted = new LinkedList<>(studentList);
        List<Student> res = new LinkedList<>();
        Collections.sort(sorted, Comparator.comparingDouble(Student::getPhysicsGrade));
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp hơn upperBoundGrade.
     *
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanPhysicsGrade(double upperBoundGrade) {
        /* TODO */
        List<Student> newList = new LinkedList<>();
        for (Student student : studentList) {
            if (student.getPhysicsGrade() < upperBoundGrade) {
                newList.add(student);
            }
        }
        return newList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        List<Student> sorted = sortMathsGradeDecreasing();
        List<Student> res = new LinkedList<>();
        for (int i = 0; i < howMany; i++) {
            res.add(sorted.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao thấp hơn lowerBoundGrade.
     *
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanMathsGrade(int lowerBoundGrade) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        for (Student student : studentList ) {
            if (student.getMathsGrade() > lowerBoundGrade) {
                res.add(student);
            }
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestMathsGrade(int howMany) {
        /* TODO */
        List<Student> sorted = new LinkedList<>(studentList);
        List<Student> res = new LinkedList<>();
        Collections.sort(sorted, Comparator.comparingDouble(Student::getPhysicsGrade));
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp hơn upperBoundGrade.
     *
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanMathsGrade(double upperBoundGrade) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        for (Student student : studentList ) {
            if (student.getMathsGrade() < upperBoundGrade) {
                res.add(student);
            }
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        List<Student> sorted = new LinkedList<>(studentList);
        Collections.sort(sorted, Comparator.comparingDouble(Student::getChemistryGrade).reversed());
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao hơn lowerBoundGrade.
     *
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanChemistryGrade(int lowerBoundGrade) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        for (Student student : studentList ) {
            if (student.getChemistryGrade() > lowerBoundGrade) {
                res.add(student);
            }
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        List<Student> sorted = new LinkedList<>(studentList);
        Collections.sort(sorted, Comparator.comparingDouble(Student::getChemistryGrade));
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp hơn upperBoundGrade.
     *
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanChemistryGrade(int upperBoundGrade) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        for (Student student : studentList ) {
            if (student.getChemistryGrade() < upperBoundGrade) {}
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        List<Student> sorted = new LinkedList<>(studentList);
        Collections.sort(sorted, Comparator.comparingDouble(Student::getAverageGrade).reversed());
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm bình cao hơn lowerBoundGrade.
     *
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanAverageGrade(int lowerBoundGrade) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        for (Student student : studentList ) {
            if (student.getAverageGrade() > lowerBoundGrade) {
                res.add(student);
            }
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        List<Student> sorted = new LinkedList<>(studentList);
        Collections.sort(sorted, Comparator.comparingDouble(Student::getAverageGrade));
        for (int i = 0; i < howMany; i++) {
            res.add(studentList.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp hơn upperBoundGrade.
     *
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanAverageGrade(int upperBoundGrade) {
        /* TODO */
        List<Student> res = new LinkedList<>();
        for (Student student : studentList ) {
            if (student.getAverageGrade() < upperBoundGrade) {
                res.add(student);
            }
        }
        return res;
    }

    public static String idOfStudentsToString(List<Student> studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student student : studentList) {
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
