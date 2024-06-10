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
        books[0] = new Book("Ревизор", "Гоголь", 1868, 100000000);
        books[1] = new Book("Война и мир", "Толстой", 1836, 200000000);
        books[2] = new Book("Ревизор", "Гоголь", 1930, 300000000);
        books[3] = new Book("Мастер и Маргарита", "Булгаков", 1934, 400000000);

    }

    @Test
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
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("=========================" + reportTitle + "=========================================");

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
        printArray(books, " After sorting by year of publishing ");
        Arrays.sort(books, comparator1);
        printArray(books, " After sorting by author ");

    }

}

