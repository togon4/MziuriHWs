package HW27;

class Student {
    String firstName;
    String lastName;
    String personalNumber;
    double averageScore;

    public Student(String firstName, String lastName, String personalNumber, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
        this.averageScore = averageScore;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + personalNumber + ") - Average Score: " + averageScore;
    }
}
