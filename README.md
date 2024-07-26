Got it! Here’s the updated `README.md` file with your GitHub username:

---

# Library Management System

## Overview

The **Library Management System** is a Java-based application designed to manage a library's books and users. It provides functionality for adding, removing, borrowing, and returning books, as well as searching for books by title or author. This project demonstrates fundamental programming concepts in Java, including object-oriented programming, data structures, and user interaction through a console-based interface.

## Features

- **Add User**: Register a new user in the library system.
- **Remove User**: Remove an existing user from the system.
- **Add Book**: Add a new book to the library's collection.
- **Remove Book**: Remove a book from the collection.
- **Borrow Book**: Allow a user to borrow a book if available.
- **Return Book**: Allow a user to return a borrowed book.
- **Search Book by Title**: Search for books by their title.
- **Search Book by Author**: Search for books by their author.

## Getting Started

To get started with the Library Management System, follow these steps:

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed on your machine.

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/udayvelupuri1/LibraryManagementSystem.git
   ```

2. **Navigate to the Project Directory**

   ```bash
   cd LibraryManagementSystem
   ```

3. **Compile the Code**

   Use the following command to compile the Java source files:

   ```bash
   javac -d out src/main/java/*.java
   ```

4. **Run the Application**

   Run the application using the following command:

   ```bash
   java -cp out Main
   ```

## Usage

Once the application is running, you will see a menu with options to manage users and books. Follow the on-screen instructions to interact with the system.

## Project Structure

The project is organized as follows:

```
LibraryManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Main.java
│   │   │   ├── Library.java
│   │   │   ├── User.java
│   │   │   └── Book.java
└── .vscode/
    ├── tasks.json
    └── launch.json
```

- **`Main.java`**: The entry point of the application, providing the user interface.
- **`Library.java`**: Manages the library's users and books.
- **`User.java`**: Represents a user of the library.
- **`Book.java`**: Represents a book in the library.
- **`.vscode/`**: Contains configuration files for Visual Studio Code.

## Configuration

### Build and Run Configuration

- **Build**: Configure a build task in VS Code to compile the Java files.
- **Run**: Configure a launch configuration in VS Code to run the `Main` class.

### Tasks Configuration

Create a `tasks.json` file in the `.vscode` directory:

```json
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "build",
            "type": "shell",
            "command": "javac",
            "args": [
                "-d",
                "out",
                "src/main/java/*.java"
            ],
            "group": {
                "kind": "build",
                "isDefault": true
            },
            "problemMatcher": [
                "$javac"
            ]
        }
    ]
}
```

### Launch Configuration

Create a `launch.json` file in the `.vscode` directory:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Launch Main",
            "request": "launch",
            "mainClass": "Main",
            "projectName": "LibraryManagementSystem"
        }
    ]
}
```

## Contributing

Contributions to this project are welcome. Please fork the repository and create a pull request with your proposed changes.