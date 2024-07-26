package main.java;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private List<Book> borrowedBooks;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
        } else {
            System.out.println("This book is not borrowed by the user.");
        }
    }
}

