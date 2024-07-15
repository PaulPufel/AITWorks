package homework_47.librarypaul;

import homework_47.librarypaul.dao.Library;
import homework_47.librarypaul.dao.LibraryImpl;
import homework_47.librarypaul.model.Author;
import homework_47.librarypaul.model.Book;
import homework_47.librarypaul.model.Menu;

import java.util.Scanner;

public class LibraryAppl {

    private static final Library library = new LibraryImpl();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            Menu.printMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    findBookByAuthor();
                    break;
                case 3:
                    listBooks();
                    break;
                case 4:
                    rentBook();
                    break;
                case 5:
                    getBackBook();
                    break;
                case 6:
                    startDay();
                    break;
                case 7:
                    exit = true;
                    endDay();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void addBook() {
        scanner.nextLine(); // consume the newline

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String lastName = scanner.nextLine();

        Author author = new Author(lastName);

        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        Book book = new Book(isbn, title, lastName);
        if (library.addBook(book)) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Book already exists.");
        }
    }

    private static void findBookByAuthor() {
        scanner.nextLine(); // consume the newline
        System.out.print("Enter author name: ");
        String lastName = scanner.nextLine();
        Author author = new Author(lastName);

        Book book = library.findBookByAuthor(author);
        if (book != null) {
            book.printBook();
        } else {
            System.out.println("No book found by this author.");
        }
    }

    private static void listBooks() {
        if (library.quantity() == 0) {
            System.out.println("No books in the library.");
        } else {
            library.printAllBooks(null);
        }
    }

    private static void rentBook() {
        scanner.nextLine(); // consume the newline
        System.out.print("Enter book ISBN to rent: ");
        String isbn = scanner.nextLine();

        if (library.rentBook(isbn)) {
            System.out.println("Book rented successfully.");
        } else {
            System.out.println("Book is not available for rent.");
        }
    }

    private static void getBackBook() {
        scanner.nextLine(); // consume the newline
        System.out.print("Enter book ISBN to return: ");
        String isbn = scanner.nextLine();

        if (library.getBackBook(isbn)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not rented.");
        }
    }

    private static void startDay() {
        System.out.println("Library is now open.");
    }

    private static void endDay() {
        System.out.println("Library is now closed.");
    }
}
