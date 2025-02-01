package HW31;

public class Employee {
    private String firstName;
    private String lastName;
    private String id;
    private double salary;

    public Employee(String firstName, String lastName, String id, double salary) throws Exception {
        if (!id.matches("\\d{11}")) {
            throw new Exception("ID must be exactly 11 digits long and contain only numbers.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + id + ", Salary: $" + salary + ")";
    }
}
