package main.java;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, User> users;
    private Map<String, Book> books;

    public Library() {
        this.users = new HashMap<>();
        this.books = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void removeUser(String userId) {
        users.remove(userId);
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public void borrowBook(String userId, String isbn) {
        User user = users.get(userId);
        Book book = books.get(isbn);
        if (user != null && book != null) {
            user.borrowBook(book);
        } else {
            System.out.println("User or book not found.");
        }
    }

    public void returnBook(String userId, String isbn) {
        User user = users.get(userId);
        Book book = books.get(isbn);
        if (user != null && book != null) {
            user.returnBook(book);
        } else {
            System.out.println("User or book not found.");
        }
    }

    public void searchBookByTitle(String title) {
        books.values().stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .forEach(book -> System.out.println("Found book: " + book.getTitle() + " by " + book.getAuthor()));
    }

    public void searchBookByAuthor(String author) {
        books.values().stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .forEach(book -> System.out.println("Found book: " + book.getTitle() + " by " + book.getAuthor()));
    }
}

