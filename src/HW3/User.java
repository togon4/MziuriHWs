package HW3;

class User {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private String username;
    private String password;
    private String personalNumber;

    // Constructor with validation
    public User(String firstName, String lastName, int birthYear, int birthMonth, int birthDate,
                String username, String password, String personalNumber)
            throws IncorrectFirstNameException, IncorrectLastNameException,
            IncorrectBirthYearException, IncorrectBirthMonthException,
            IncorrectBirthDateException, IncorrectUsernameException,
            IncorrectPasswordException, IncorrectPersonalNumberException {

        validateFirstName(firstName);
        validateLastName(lastName);
        validateBirthYear(birthYear);
        validateBirthMonth(birthMonth);
        validateBirthDate(birthDate);
        validateUsername(username);
        validatePassword(password);
        validatePersonalNumber(personalNumber);

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        this.personalNumber = personalNumber;
    }

    // Validation methods
    private void validateFirstName(String firstName) throws IncorrectFirstNameException {
        if (firstName.length() < 2) {
            throw new IncorrectFirstNameException("invalid information.");
        }
    }

    private void validateLastName(String lastName) throws IncorrectLastNameException {
        if (lastName.length() < 3) {
            throw new IncorrectLastNameException("invalid information.");
        }
    }

    private void validateBirthYear(int birthYear) throws IncorrectBirthYearException {
        int currentYear = java.time.Year.now().getValue();
        if (birthYear > currentYear) {
            throw new IncorrectBirthYearException("invalid information.");
        }
    }

    private void validateBirthMonth(int birthMonth) throws IncorrectBirthMonthException {
        if (birthMonth < 1 || birthMonth > 12) {
            throw new IncorrectBirthMonthException("invalid information.");
        }
    }

    private void validateBirthDate(int birthDate) throws IncorrectBirthDateException {
        if (birthDate < 1 || birthDate > 31) {
            throw new IncorrectBirthDateException("invalid information.");
        }
    }

    private void validateUsername(String username) throws IncorrectUsernameException {
        if (username.length() < 4) {
            throw new IncorrectUsernameException("invalid information.");
        }
    }

    private void validatePassword(String password) throws IncorrectPasswordException {
        if (password.length() < 8 || password.length() > 15) {
            throw new IncorrectPasswordException("invalid information.");
        }
    }

    private void validatePersonalNumber(String personalNumber) throws IncorrectPersonalNumberException {
        if (personalNumber.length() < 11 || !personalNumber.matches("\\d+")) {
            throw new IncorrectPersonalNumberException("invalid information.");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDate=" + birthDate +
                ", username='" + username + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                '}';
    }
}
