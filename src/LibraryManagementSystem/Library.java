package LibraryManagementSystem;
import java.io.*;
import java.util.*;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String id) {
        books.add(new Book(title, author, id));
        System.out.println("Book added successfully!");
    }

    public void checkOutBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                if (!book.isCheckedOut()) {
                    book.checkOut();
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Book is already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void saveLibraryState(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(books);
            System.out.println("Library state saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving library state: " + e.getMessage());
        }
    }

    public void restoreLibraryState(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            books = (List<Book>) ois.readObject();
            System.out.println("Library state restored successfully!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error restoring library state: " + e.getMessage());
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}