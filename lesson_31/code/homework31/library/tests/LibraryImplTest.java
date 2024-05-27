package homework31.library.tests;

import homework31.library.dao.Library;
import homework31.library.dao.LibraryImpl;
import homework31.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryImplTest {
    Library library;
    Book[] b;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        b = new Book[4];
        b[0] = new Book("Война и мир", "Толстой", 1836, 1000000000);
        b[1] = new Book("Ревизор", "Гоголь", 1866, 2000000000);
        b[2] = new Book("Мастер и Маргарита", "Булгаков", 1934, 300000000);
        b[3] = new Book("Нос", "Гоголь", 1868, 400000000);

        // необходимо добавить элементы массива в library
        for (int i = 0; i < b.length; i++) {
            library.addBook(b[i]);
        }
    }

    @Test
    void addBook() {
        // нельзя добавить null
        assertFalse(library.addBook(null));
        // нельзя добавить второй раз уже имеющуюся книгу
        assertFalse(library.addBook(b[1]));
        // добавляем книгу
        Book book = new Book("Три товарища", "Ремарк", 1924, 500000000);
        assertTrue(library.addBook(book));
        // проверяем кол-во книг после добавления
        assertEquals(5, library.quantity());
        // нельзя превысить capacity
        Book bookOneMore = new Book("Евгений Онегин", "Пушкин", 1895, 600000000);
        assertFalse(library.addBook(bookOneMore));
        library.printBook();
    }

    @Test
    void removeBook() {
    }

    @Test
    void findBook() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printBook() {
    }
}


