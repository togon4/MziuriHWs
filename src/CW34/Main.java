package CW34;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));
        // 1
        Collections.sort(students);
        System.out.println("Sorted Students by Age:");
        for (Student s : students) {
            System.out.println(s);
        }
        // 2
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.getAge(), s1.getAge());
            }
        });
        System.out.println("Sorted Students by Age (Descending): " + students);
    }
}
