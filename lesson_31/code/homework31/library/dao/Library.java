package homework31.library.dao;

/* - добавить книгу addBook
   - удалить книгу removeBook
   - найти книгу findBook
   - кол-во книг quantity
   - напечатать список книг printBook */

import homework31.library.model.Book;

public interface Library {
    // define abstract methods
    boolean addBook(Book book);

    Book removeBook(int isbn);

    Book findBook(int isbn);

    int quantity(); // quantity of books

    void printBook();

}
