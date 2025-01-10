import main.java.lms.Book.Book;
import main.java.lms.Book.LibraryInventory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book b1 = new Book("Wings of Fire","APJ Abdul Kalam and Arun Tiwari","9788184022308",1999);
        Book b2 = new Book("Wings of Fire","APJ Abdul Kalam and Arun Tiwari","9788184022308",1999);
        LibraryInventory l1 = new LibraryInventory();
        l1.addBook(b1);
        l1.addBook(b2);
        l1.searchABookByISBN("9788184022308");

    }
}