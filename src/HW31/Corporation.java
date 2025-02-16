package HW31;
import java.util.*;

public class Corporation {
    private String name;
    private Address address;
    private HashMap<String, String> contactInformation;
    private ArrayList<Employee> employees;

    public Corporation(String name, Address address) {
        this.name = name;
        this.address = address;
        this.contactInformation = new HashMap<>();
        this.employees = new ArrayList<>();
    }

    public void addContact(String type, String phoneNumber) {
        contactInformation.put(type, phoneNumber);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String aboutUs() {
        StringBuilder info = new StringBuilder();
        info.append("Company: ").append(name).append("\n");
        info.append("Address: ").append(address).append("\n");
        info.append("Contact Information: \n");
        for (Map.Entry<String, String> entry : contactInformation.entrySet()) {
            info.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return info.toString();
    }

    public String contactNumber(String type) {
        return contactInformation.getOrDefault(type, "Contact type not found.");
    }

    public double totalSalary() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total;
    }

    public void listEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
