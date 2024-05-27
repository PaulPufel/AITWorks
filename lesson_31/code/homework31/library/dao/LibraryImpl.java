package homework31.library.dao;

import homework31.library.model.Book;

public class LibraryImpl implements Library {
    // fields
    private Book[] books;
    private int size;

    // constructor
    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size++] = book;
        return true;

    }

   @Override
    public Book removeBook(int isbn) {
        return null;
    }

    @Override
    public Book findBook(int isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }

        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {

    }
}

