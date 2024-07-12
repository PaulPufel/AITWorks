package homework_47.librarypaul.dao;

import homework_47.librarypaul.model.Author;
import homework_47.librarypaul.model.Book;

public interface Library {

    boolean addBook(Book book);
    Book findBookByAuthor(Author author);
    Book findBookByIsbn (String isbn);
    boolean rentBook(String isbn);
    boolean getBackBook(String isbn);
    int quantity();
    Book printBook(Book book);
    int printAllBooks(Book book);

}
