package homework_47.librarypaul.test;

import homework_47.librarypaul.dao.Library;
import homework_47.librarypaul.dao.LibraryImpl;
import homework_47.librarypaul.model.Author;
import homework_47.librarypaul.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryImplTest {

    @Test
    public void testAddBook() {
        Library library = new LibraryImpl();
        Author author1 = new Author("Aleksandr");
        Author author2 = new Author("Lev");

        Book book1 = new Book("12345", "Eugene Onegin", author1, 1873, false);
        Book book2 = new Book("12346", "War and Peace", author2, 1901, true);


        assertTrue(library.addBook(book1));
        assertTrue(library.addBook(book2)); // Adding the same book again should return false
    }

    @Test
    public void testFindBookByAuthor() {
        Library library = new LibraryImpl();

        Author author1 = new Author("Aleksandr");
        Book book1 = new Book("12345", "Eugene Onegin", author1, 1873, false);

        library.addBook(book1);
        assertEquals(book1, library.findBookByAuthor(author1));
    }

    @Test
    public void testFindBookByIsbn() {
        Library library = new LibraryImpl();

        Author author1 = new Author("Aleksandr");
        Book book1 = new Book("12345", "Eugene Onegin", author1, 1873, false);

        library.addBook(book1);
        assertEquals(book1, library.findBookByIsbn("12345"));
    }

    @Test
    public void testRentBook() {
        Library library = new LibraryImpl();

        Author author1 = new Author("Aleksandr");
        Book book1 = new Book("12345", "Eugene Onegin", author1, 1873, false);

        library.addBook(book1);
        assertTrue(library.rentBook("12345"));
        assertFalse(library.rentBook("12345")); // Renting the same book again should return false
    }

    @Test
    public void testGetBackBook() {
        Library library = new LibraryImpl();

        Author author1 = new Author("Aleksandr");
        Book book1 = new Book("12345", "Eugene Onegin", author1, 1873, true);

        library.addBook(book1);
        library.rentBook("12345");
        assertTrue(library.getBackBook("12345"));
        assertFalse(library.getBackBook("12345")); // Returning the same book again should return false
    }

    @Test
    public void testQuantity() {
        Library library = new LibraryImpl();

        Author author1 = new Author("Aleksandr");
        Book book1 = new Book("12345", "Eugene Onegin", author1, 1873, true);

        Author author2 = new Author("Lev");
        Book book2 = new Book("12346", "War and Peace", author2, 1901, true);

        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.quantity());
    }

    @Test
    void printBook() {
    }

}
