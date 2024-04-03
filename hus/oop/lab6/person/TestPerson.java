package hus.oop.hus.oop.lab6.person;

public class TestPerson {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", "123 Main Street");
        System.out.println("Person: " + person);

        // Creating a Student object
        Student student = new Student("Alice Smith", "456 Elm Street", "Computer Science", 2023, 1500.00);
        System.out.println("Student: " + student);

        // Creating a Staff object
        Staff staff = new Staff("Bob Johnson", "789 Oak Street", "XYZ High School", 2500.00);
        System.out.println("Staff: " + staff);

        // Testing setters
        student.setProgram("Electrical Engineering");
        student.setYear(2022);
        student.setFee(1800.00);
        staff.setSchool("ABC Middle School");
        staff.setPay(3000.00);

        // Printing updated objects
        System.out.println("Updated Student: " + student);
        System.out.println("Updated Staff: " + staff);
    }
}
