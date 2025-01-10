package main.java.lms.Book;

public class Book  {

    //SRP - Book class has only one responsibility
    String bookTitle;
    String bookAuthor;
    String ISBN; // International Standard Book Number
    int publicationYear;

    public Book(String bookTitle, String bookAuthor, String ISBN, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle!=null)
        {
            this.bookTitle = bookTitle;
        } else
            return;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }




}
