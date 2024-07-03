package homework_42.book_library.dao;

import homework_42.book_library.model.Book;

public class LibraryImpl implements Library {
    private Book[] books;
    private int size;

    public LibraryImpl(int capacity) {
        books = new Book[capacity];
        this.size = 0;
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBookByYearOfPublishing(book.getYearOfPublishing()) != null) {
            return false;
        }
        books[size++] = book;
        return true;
    }

    @Override
    public Book removeBook(String yearOfPublishing) {
        for (int i = 0; i < size; i++) {
            if (yearOfPublishing.equals(books[i].getYearOfPublishing())) {
                Book temp = books[i];
                books[i] = books[--size];
                books[size] = null;
                return temp;
            }

        }
        return null;
    }

    @Override
    public Book findBookByYearOfPublishing(String yearOfPublishing) {
            for (int i = 0; i < size; i++) {
                if (books[i].getYearOfPublishing().equals(yearOfPublishing)) {
                    return books[i];
                }
            }
            return null;
        }

    @Override
    public Book[] findBookByTitle(String title) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                count++;
            }
        }
        Book[] temp = new Book[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                temp[j] = books[i];
                j++;
            }
        }
        return temp;
    }

    @Override
    public Book[] findBookByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                count++;
            }
        }
        Book[] temp = new Book[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                temp[j] = books[i];
                j++;
            }
        }
        return temp;
    }

    @Override
    public Book[] findBookByIsbn(int min, int max) {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (books[i].getIsbn() > min && books[i].getIsbn() < max) {
                count++;
            }
        Book[] temp = new Book[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() > min && books[i].getIsbn() < max) {
                temp[j] = books[i];
                j++;
            }
        }
        return temp;
    }

}

