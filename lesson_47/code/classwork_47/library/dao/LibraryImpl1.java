package classwork_47.library.dao;

import homework_47.librarypaul.dao.Library;
import homework_47.librarypaul.model.Author;
import homework_47.librarypaul.model.Book;

import java.util.HashMap;
import java.util.Map;

public class LibraryImpl1 implements Library {
    private Map<String, Book> books;

    public LibraryImpl1() {
        this.books = new HashMap<>();
    }

    @Override
    public boolean addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            return false;
        }
        books.put(book.getIsbn(), book);
        return true;
    }

    @Override
    public Book findBookByAuthor(Author author) {
        for (Book book : books.values()) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    @Override
    public boolean rentBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && !book.isRented()) {
            book.setRented(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean getBackBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && book.isRented()) {
            book.setRented(false);
            return true;
        }
        return false;
    }

    @Override
    public int quantity() {

        return books.size();
    }

    @Override
    public Book printBook(Book book) {
        book.printBook();
        return book;
    }

    @Override
    public int printAllBooks(Book book) {
        return 0;
    }

//    @Override
//    public int printAllBooks(Book book) {
//        books.forEach(Book::printBook);
//        return books.size();
//        // System.out.println("==========================================");
//    }
}
// Additional methods for saving, loading and printing books can be added here.
