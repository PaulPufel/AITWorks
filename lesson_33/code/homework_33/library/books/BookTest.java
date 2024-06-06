package homework_33.library.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book[] book;

    @BeforeEach
    void setUp() {

        book = new Book[4];
        book[0] = new Book("Нос", "Гоголь", 1868, 100000000);
        book[1] = new Book("Война и мир", "Толстой", 1836, 200000000);
        book[2] = new Book("Ревизор", "Гоголь", 1866, 300000000);
        book[3] = new Book("Мастер и Маргарита", "Булгаков", 1934, 400000000);

    }

    @Test
    void testBookSort() {
        System.out.println("=============================== Test Book sorting =================================");
        printArray(book);
        Arrays.sort(book); // производим сортировку в соответствии с тем полем, которое указано в методе compareTo

        System.out.println("--------------------- After sorting by year of publishing ---------------------------");
        printArray(book);
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
        printArray(book); // печатаем как есть

        System.out.println("------------------------------- After sorting by author ------------------------------");
        Arrays.sort(book, bookComparator); // сортируем
        printArray(book); // печатаем после сортировки

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}