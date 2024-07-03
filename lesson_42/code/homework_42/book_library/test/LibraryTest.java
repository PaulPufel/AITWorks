package homework_42.book_library.test;

import homework_42.book_library.dao.Library;
import homework_42.book_library.dao.LibraryArrayListImpl;
import homework_42.book_library.dao.LibraryHashSetImpl;
import homework_42.book_library.dao.LibraryImpl;
import homework_42.book_library.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;

    Book[] books;

    @BeforeEach
    public void setUp() {

        library = new LibraryArrayListImpl(5);  // switch implementation

        library = new LibraryHashSetImpl(5);

        library = new LibraryImpl(5);

        // Задаём массив книг и заполняем его значениями
        books = new Book[4];
        books[0] = new Book("Нос", "Гоголь", "1868", 100000000);
        books[1] = new Book("Война и мир", "Толстой", "1836", 200000000);
        books[2] = new Book("Ревизор", "Гоголь", "1866", 300000000);
        books[3] = new Book("Мастер и Маргарита", "Булгаков", "1934", 400000000);


        for (Book book : books) {
            library.addBook(book);
        }
    }

 /*   @Test
    void testBookSort() {
        System.out.println("=============================== Test Book sorting =================================");
        // напечатать массив
        printArray(books);
        // производим сортировку в соответствии с тем полем, которое указано в методе compareTo
        Arrays.sort(books);
        // напечатать отсортированный массив
        System.out.println("--------------------- After sorting by year of publishing ---------------------------");
        printArray(books);
    }


    @Test
    void testBookComparator() {
        // Comparator - это абстрактный класс
        Comparator<Book> bookComparator = new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor()); // сортируем по автору (по алфавиту)
            }
        };
        System.out.println("============================ Test Book sorting by Comparator ========================");
        printArray(books); // печатаем как есть

        System.out.println("------------------------------- After sorting by author ------------------------------");
        Arrays.sort(books, bookComparator); // сортируем
        printArray(books); // печатаем после сортировки

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }  */

    @Test
    void addBook() {
        // can't add existed element
        assertFalse(library.addBook(books[0]));
        // add one book
        Book book = new Book("Onegin", "Puschkin", "1862", 500000000);
        assertTrue(library.addBook(book));
        // add more than capacity
        book = new Book("Zelina", "Brezhnev", "1970", 700000000);
        assertFalse(library.addBook(book));
    }

    @Test
    void removeBook() {
            // remove book
            assertEquals(books[1], library.removeBook("1836"));
            // remove absent book, try to remove already removed book
        // Assertions.assertNull(library.removeBook("1836"));
        assertNull(library.removeBook("1836"));
        }


        @Test
    void findBookByYearOfPublishing() {
        // find book by YearOfPublishing
                Book book = library.findBookByYearOfPublishing("1868");
                assertEquals(books[0], book);
                // check fields
             //   assertEquals(books[0].getTitle(), book.getTitle());
             //   assertEquals(books[0].getAuthor(), book.getAuthor());
                // ???
                assertEquals(books[0], library.findBookByYearOfPublishing("1868"));
                // find absent book
                assertNull(library.findBookByYearOfPublishing("1980"));
            }

    @Test
    void findBookByTitle() {
        Book[] expecteds = {books[2]};
        Book[] actuals = library.findBookByTitle("Ревизор");
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    void findBookByAuthor() {
        Book[] expecteds = {books[3]};
        Book[] actuals = library.findBookByAuthor("Булгаков");
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    void findBookByIsbn() {
        Book[] expecteds = {books[1], books[3]};
        Book[] actuals = library.findBookByIsbn(100000000, 400000000);
        assertArrayEquals(expecteds, actuals);
    }

}