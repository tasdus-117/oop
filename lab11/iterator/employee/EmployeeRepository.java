package hus.oop.lab11.iterator.employee;

public class EmployeeRepository implements EmployeeIterable {
    public String[] employees;
    public EmployeeRepository() {
        employees = new String[]{"Tu", "Kien", "Viet", "Nam", "Duong"};
    }
    public Iterator getIterator() {
        return new EmployeeIterator();
    }
    private class EmployeeIterator implements Iterator {
        int position;
        public EmployeeIterator( ) {
            position = 0;
        }
        public boolean hasNext() {
            return position < employees.length;
        }
        public Object next() {
            if (this.hasNext()) {
                return employees[position++];
            }
            return null;
        }
    }
}
