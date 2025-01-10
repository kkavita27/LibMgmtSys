package main.java.lms.Patron;

import main.java.lms.Book.Book;

public class Patron {

    String firstName;
    String lastName;
    String emailId;
    String contactNo;
    String address;
    public static int bookBorrowedCount=0;
    public static int MAX_BOOKS_ALLOTED_TO_A_PERSON = 0;

    Book book;

    public Patron(String firstName, String lastName, String emailId, String contactNo, String address, Book book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.address = address;
        this.book = book;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public static int getBookBorrowedCount() {
        return bookBorrowedCount++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBookBorrowedCount(int bookBorrowedCount) {
        this.bookBorrowedCount = bookBorrowedCount;
    }





}
