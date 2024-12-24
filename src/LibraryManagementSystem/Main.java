package LibraryManagementSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        String fileName = "C:\\Users\\pc\\Desktop\\LibraryManagement";

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Check Out Book");
            System.out.println("3. Save Library State");
            System.out.println("4. Restore Library State");
            System.out.println("5. Display Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ID: ");
                    String id = scanner.nextLine();
                    library.addBook(title, author, id);
                    break;
                case 2:
                    System.out.print("Enter book ID to check out: ");
                    String checkOutId = scanner.nextLine();
                    library.checkOutBook(checkOutId);
                    break;
                case 3:
                    library.saveLibraryState(fileName);
                    break;
                case 4:
                    library.restoreLibraryState(fileName);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
