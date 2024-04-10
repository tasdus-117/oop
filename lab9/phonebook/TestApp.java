package hus.oop.lab9.phonebook;

public class TestApp {
    public static void main(String[] args) {
        // Creating a PhoneBook object using a specific implementation
        PhoneBook pb = new PhoneBookMap(); // You're using a PhoneBookMap implementation

        // Adding some persons to the phone book
        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        // Searching for a person by name and printing the result
        System.out.println(pb.searchByName("Marco"));
        // Searching for a person by last name and printing the result
        System.out.println(pb.searchByLastname("Poppi"));

        // Trying to search for a person by number that doesn't exist and printing the result
        System.out.println(pb.searchByNumber("1111")); // This should print "null"

        // Deleting a person by their phone number
        pb.deleteByNumber("24564");

        // Searching again for a person by last name to verify deletion
        System.out.println(pb.searchByLastname("Poppi")); // This should print "null" as the person was deleted
    }

}
