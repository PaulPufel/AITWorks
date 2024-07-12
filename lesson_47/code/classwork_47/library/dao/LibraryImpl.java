package classwork_47.library.dao;

import classwork_47.library.model.Author;
import classwork_47.library.dao.Library;
import classwork_47.library.model.Book;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class LibraryImpl implements Library {

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public Book findBookByAuthor(Author author) {
        return null;
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public boolean rentBook(String isbn) {
        return false;
    }

    @Override
    public boolean getBackBook(String isbn) {
        return false;
    }

    @Override
    public int quantity() {
        return 0;
    }
}
   /* public static void main(String[] args) throws FileNotFoundException {

        Author author1 = new Author("Николай", "Гоголь", 10.02 .1830, "Россия", 5.7);
        Author author2 = new Author("Лев", "Толстой", 25.06 .1806, "Россия", 7.5);

        Book book1 = new Book("123456789", "Нос", author1, 1856);
        Book book2 = new Book("134526789", "Война и мир", author2, 1864);

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
*/

//        @Override
//        public boolean addBook(Book book1 {
//        if (book == null || size == books.length || findBookByYearOfPublishing(book.getYearOfPublishing()) != null) {
//            return false;
//        }
//        books[size++] = book;
//        return true;
//    }
/*
    @Override
    public homework_42.book_library.model.Book removeBook(String yearOfPublishing) {
        for (int i = 0; i < size; i++) {
            if (yearOfPublishing.equals(books[i].getYearOfPublishing())) {
                homework_42.book_library.model.Book temp = books[i];
                books[i] = books[--size];
                books[size] = null;
                return temp;
            }

        }
        return null;
    }

    @Override
    public homework_42.book_library.model.Book findBookByYearOfPublishing(String yearOfPublishing) {
        for (int i = 0; i < size; i++) {
            if (books[i].getYearOfPublishing().equals(yearOfPublishing)) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public homework_42.book_library.model.Book[] findBookByTitle(String title) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                count++;
            }
        }
        homework_42.book_library.model.Book[] temp = new homework_42.book_library.model.Book[count];
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
    public homework_42.book_library.model.Book[] findBookByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                count++;
            }
        }
        homework_42.book_library.model.Book[] temp = new homework_42.book_library.model.Book[count];
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
    public homework_42.book_library.model.Book[] findBookByIsbn(int min, int max) {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (books[i].getIsbn() > min && books[i].getIsbn() < max) {
                count++;
            }
        homework_42.book_library.model.Book[] temp = new homework_42.book_library.model.Book[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() > min && books[i].getIsbn() < max) {
                temp[j] = books[i];
                j++;
            }
        }
        return temp;
    }
*/