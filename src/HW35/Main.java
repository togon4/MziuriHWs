package HW35;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 55000));
        employees.add(new Employee("David", 65000));

        Collections.sort(employees);
        System.out.println("Sorted by Salary (Ascending): " + employees);

        employees.sort(new NameDescendingComparator());
        System.out.println("Sorted by Name (Descending): " + employees);

        Employee maxSalaryEmployee = Collections.max(employees);
        Employee minSalaryEmployee = Collections.min(employees);
        System.out.println("Employee with Max Salary: " + maxSalaryEmployee);
        System.out.println("Employee with Min Salary: " + minSalaryEmployee);
        Collections.reverse(employees);
        System.out.println("Reversed List: " + employees);
    }
}
