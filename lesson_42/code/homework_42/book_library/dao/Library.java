package homework_42.book_library.dao;

import homework_42.book_library.model.Book;

public interface Library {

    boolean addBook(Book book);

    Book removeBook(String yearOfPublishing);

    Book findBookByYearOfPublishing(String yearOfPublishing);

    Book[] findBookByTitle(String title);

    Book[] findBookByAuthor(String author);

    Book[] findBookByIsbn(int min, int max);

}

