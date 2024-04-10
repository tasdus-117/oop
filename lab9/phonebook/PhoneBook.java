package hus.oop.lab9.phonebook;

public interface PhoneBook {
    Student searchByLastname(String lastname);
     Student searchByNumber(String number);
     void addPerson(Student p);
     Student searchByName(String name);
     void deleteByNumber(String number);
}
