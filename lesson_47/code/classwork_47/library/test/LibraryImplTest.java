package classwork_47.library.test;

import classwork_47.library.dao.Library;
import classwork_47.library.dao.LibraryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryImplTest {

    Library library;


    @BeforeEach
    void setUp() {
        library = new LibraryImpl();

    }

    @Test
    void addBook() {
     //   library.addBook();
    }

    @Test
    void findBookByAuthor() {
    }

    @Test
    void findBookByIsbn() {
    }

    @Test
    void rentBook() {
    }

    @Test
    void getBackBook() {
    }

    @Test
    void quantity() {
    }
}
