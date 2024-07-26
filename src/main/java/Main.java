package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Add Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Search Book by Title");
            System.out.println("8. Search Book by Author");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    library.addUser(new User(userId, userName));
                    break;
                case 2:
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextLine();
                    library.removeUser(userId);
                    break;
                case 3:
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(isbn, title, author));
                    break;
                case 4:
                    System.out.print("Enter book ISBN: ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;
                case 5:
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    isbn = scanner.nextLine();
                    library.borrowBook(userId, isbn);
                    break;
                case 6:
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    isbn = scanner.nextLine();
                    library.returnBook(userId, isbn);
                    break;
                case 7:
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    library.searchBookByTitle(title);
                    break;
                case 8:
                    System.out.print("Enter book author: ");
                    author = scanner.nextLine();
                    library.searchBookByAuthor(author);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
