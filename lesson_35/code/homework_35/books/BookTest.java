package homework_35.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book[] books;

    @BeforeEach
    void setUp() {
        // Задаём массив книг и заполняем его значениями
        books = new Book[4];
        books[0] = new Book("Ревизор", "Гоголь", 1930, 100000000);
        books[1] = new Book("Война и мир", "Толстой", 1836, 200000000);
        books[2] = new Book("Нос", "Гоголь", 1868, 300000000);
        books[3] = new Book("Мастер и Маргарита", "Булгаков", 1934, 400000000);

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("=========================" + reportTitle + "==================================");

        // foreach
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testPrint() {
        printArray(books, " list of books ");
    }

    @Test
    void testNativeSorting() {
        printArray(books, " list of books as is ");
        Arrays.sort(books); // sort native
        printArray(books, " list of books sorted by author ");
    }

    @Test
    void testComparator() {
        Comparator<Book> comparator1 = (c1, c2) -> Double.compare(c1.getYearOfPublishing(), c2.getYearOfPublishing());
        printArray(books, " Before sorting ");
        Arrays.sort(books); // native
        printArray(books, " After sorting by author AND THEN by year of publishing ");
        Arrays.sort(books, comparator1);
        printArray(books, " After sorting by year of publishing ");

    }

}

