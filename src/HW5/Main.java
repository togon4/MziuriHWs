package HW5;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String[][] sampleData = {
                {"1", "Anano", "85.5"},
                {"2", "Beqa", "78.0"},
                {"3", "Sandro", "92.0"},
                {"4", "Levani", "88.5"},
                {"5", "Andria", "74.3"}
        };
        Student[] students = new Student[sampleData.length];
        for (int i = 0; i < sampleData.length; i++) {
            int id = Integer.parseInt(sampleData[i][0]);
            String name = sampleData[i][1];
            double grade = Double.parseDouble(sampleData[i][2]);
            students[i] = new Student(id, name, grade);
        }
        try (FileOutputStream fos = new FileOutputStream("students.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Student student : students) {
                oos.writeObject(student);
            }
            System.out.println("Students serialized and written to students.txt successfully.");
        } catch (Exception e) {
            System.err.println("Error occurred during serialization: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("students.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student highestGradeStudent = null;
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    if (highestGradeStudent == null || student.getGrade() > highestGradeStudent.getGrade()) {
                        highestGradeStudent = student;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            if (highestGradeStudent != null) {
                System.out.println("Student with the highest grade: " + highestGradeStudent);
            }
        } catch (Exception e) {
            System.err.println("Error occurred during deserialization: " + e.getMessage());
        }
    }
}