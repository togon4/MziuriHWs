package HW35;

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary); // Ascending order of salary
    }

    @Override
    public String toString() {
        return name + " - $" + salary;
    }
}


