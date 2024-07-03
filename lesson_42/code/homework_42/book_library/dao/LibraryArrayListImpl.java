package homework_42.book_library.dao;

import homework_42.book_library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryArrayListImpl implements Library {
    // fields
    private List<Book> books;
    private int capacity;

    // constructor
    public LibraryArrayListImpl(int capacity) {
        books = new ArrayList<>();
        this.capacity = capacity;
    }

    // O(1), O(n)
    @Override
    public boolean addBook(Book book) {
        if (book == null || books.size() == capacity || books.contains(book)) {
            return false;
        }
        books.add(book);
        return true;
    }

    // O(1), O(n)
    @Override
    public Book removeBook(String yearOfPublishing) {
        // find by yearOfPublishing
        Book book = findBookByYearOfPublishing(yearOfPublishing);
        // remove
        books.remove(book);
        return book;
    }

    // O(n)
    @Override
    public Book findBookByYearOfPublishing(String yearOfPublishing) {
        for (Book book : books) {
            if (book.getYearOfPublishing().equals(yearOfPublishing)) {
                return book;
            }
        }
        return null;
    }

    // O(n)
    @Override
    public Book[] findBookByTitle(String title) {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                count++;
            }
        }
        Book[] temp = new Book[count];
        int j = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                temp[j] = books.get(i);
                j++;
            }
        }
        return temp;
    }

    @Override
    public Book[] findBookByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                count++;
            }
        }
        Book[] temp = new Book[count];
        int j = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                temp[j] = books.get(i);
                j++;
            }
        }
        return temp;
    }

    // O(n)
    @Override
    public Book[] findBookByIsbn(int min, int max) {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() > min && books.get(i).getIsbn() < max) {
                count++;
            }
        }
        Book[] temp = new Book[count];
        int j = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() > min && books.get(i).getIsbn() < max) {
                temp[j] = books.get(i);
                j++;
            }
        }
        return temp;
    }
}

