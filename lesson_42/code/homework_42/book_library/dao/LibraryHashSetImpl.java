package homework_42.book_library.dao;

import homework_42.book_library.model.Book;

import java.util.*;

public class LibraryHashSetImpl implements Library {
    // Comparator<Book>...
    // TODO

    private Set<Book> books;
    private int capacity;

    // constructor
    public LibraryHashSetImpl(int capacity) {
        books = new HashSet<>();
        this.capacity = capacity;
    }

    // O(1)
    @Override
    public boolean addBook(Book book) {
        if (book == null || books.size() == capacity) {
            return false;
        }
        if (books.add(book)) {
            return true;
        } else {
            return false;
        }
    }

    // O(1)
    @Override
    public Book removeBook(String yearOfPublishing) {
        // find by yearOfPublishing
        Book book = findBookByYearOfPublishing(yearOfPublishing);
        // remove
        books.remove(book);
        return book;
    }

    // O(1)
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
        List<Book> tempList = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                tempList.add(book);
            }
        }
        // TODO sort ArrayList
        Collections.sort(tempList);

        Book[] temp = new Book[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

    // O(n)
    @Override
    public Book[] findBookByAuthor(String author) {
        List<Book> tempList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                tempList.add(book);
            }
        }
        // TODO sort ArrayList
        Collections.sort(tempList);

        Book[] temp = new Book[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

    // O(n)
    @Override
    public Book[] findBookByIsbn(int min, int max) {
        List<Book> tempList = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsbn() > min && book.getIsbn() < max) {
                tempList.add(book);
            }
        }

        Collections.sort(tempList);

        Book[] temp = new Book[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

}

