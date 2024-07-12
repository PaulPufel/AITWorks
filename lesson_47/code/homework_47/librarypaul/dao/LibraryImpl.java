package homework_47.librarypaul.dao;

import homework_47.librarypaul.model.Author;
import homework_47.librarypaul.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {
    private final List<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (books.contains(book)) {
            return false;
        }
        return books.add(book);
    }

    @Override
    public Book findBookByAuthor(Author author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).findFirst().orElse(null);
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst().orElse(null);
    }

    @Override
    public boolean rentBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null && !book.isRented()) {
            book.setRented(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean getBackBook(String isbn) {
        Book book = findBookByIsbn(isbn);
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
        books.forEach(Book::printBook);
        return books.size();
    }
}
