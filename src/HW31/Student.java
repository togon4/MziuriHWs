package HW31;
import java.util.*;

class Student {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private ArrayList<Double> grades;

    public Student(String firstName, String lastName, Date dateOfBirth, ArrayList<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    public double getGPA() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return getFullName() + " - DOB: " + dateOfBirth + " - GPA: " + getGPA();
    }
}
