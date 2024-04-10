package hus.oop.lab9.phonebook;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;
    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }
    public void addPerson(Student s){
        phoneBook.put(s.phone, s);
    }
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.lastname.equals(lastname)) {
                return student;
            }
        }
        return null;
    }
    public Student searchByNumber(String phone) {
        for (Map.Entry<String, Student> entry: phoneBook.entrySet()) {
            if (entry.getKey().equals(phone)) {
                return entry.getValue();
            }
        }
        return null;
    }
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
