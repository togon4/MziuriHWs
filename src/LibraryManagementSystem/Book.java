package LibraryManagementSystem;
import java.io.*;

class Book implements Serializable {
    private String title;
    private String author;
    private String id;
    private boolean isCheckedOut;

    public Book(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isCheckedOut = false;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getId() {
        return id;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void checkOut() {
        isCheckedOut = true;
    }
    public void returnBook() {
        isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }
}