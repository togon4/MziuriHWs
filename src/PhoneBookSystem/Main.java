package PhoneBookSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    phonebook.addContact(new PhoneContact(firstName, lastName, phoneNumber, email));
                    break;
                case 2:
                    System.out.print("Enter First Name of the contact to delete: ");
                    String delFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name of the contact to delete: ");
                    String delLastName = scanner.nextLine();
                    phonebook.deleteContact(delFirstName, delLastName);
                    break;
                case 3:
                    System.out.print("Enter First Name of the contact to edit: ");
                    String editFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name of the contact to edit: ");
                    String editLastName = scanner.nextLine();
                    System.out.print("Enter New First Name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.nextLine();
                    System.out.print("Enter New Phone Number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();
                    phonebook.editContact(editFirstName, editLastName, new PhoneContact(newFirstName, newLastName, newPhoneNumber, newEmail));
                    break;
                case 4:
                    phonebook.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting Phonebook. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
