package HW35;

import java.util.Comparator;

class NameDescendingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name);
    }
}
