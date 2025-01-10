package main.java.lms.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryInventory {

    Book book;
    private List<Book> books;

    // Constructor
    public LibraryInventory() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        if(!books.contains(book.ISBN))
        {
            books.add(book);
            System.out.println(book+" Book got added.");
        } else
        {
            System.out.println("Book already exists.");
        }

    }

    public void removeABook(Book book)
    {
        books.remove(book);

        System.out.println(book +"Book got removed.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the inventory.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void totalNumberOfBooks()
    {
        books.size();

        System.out.println("At present there are " +books.size() +" books available.");
    }

    public void searchABookByName(String bookName)
    {
        if(!books.isEmpty())
        {
            for (Book book: books)
            {
                if(book.getBookTitle().equalsIgnoreCase(bookName))
                {
                    System.out.println("Book title is "+bookName);
                }
                else
                {
                    System.out.println(bookName+" this book does not exist.");
                }
            }
        }
    }

    public void searchABookByISBN(String ISBN)
    {
        if(!books.isEmpty())
        {
            for (Book book: books)
            {
                if(book.getISBN().equalsIgnoreCase(ISBN))
                {
                    System.out.println("Book with ISBN is "+ISBN);
                }
                else
                {
                    System.out.println("Book with"+ISBN+" does not exist.");
                }
            }
        }
    }


    public void searchABookByAuthor(String authorname)
    {
        if(!books.isEmpty())
        {
            for (Book book: books)
            {
                if(book.getBookAuthor().equalsIgnoreCase(authorname))
                {
                    System.out.println("Book with ISBN is "+authorname);
                }
                else
                {
                    System.out.println("Book with the author "+authorname+ "does not exist.");
                }
            }
        }
    }
}
