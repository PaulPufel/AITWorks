package homework.book.model;

/* Создать класс BookAppl в пакете ait.book с методом main.
В методе main создать несколько экземпляров Book
и вывести для каждого из них результат работы метода display.
 */

import homework.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(1352968735, "Anna Karenina", "Lev Tolstoy", 1878);
        Book book2 = new Book(1275426637, "Master and Margarita", "Mikhail Bulgakov", 1966);
        Book book3 = new Book(2134750965, "Revizor", "Nikolay Gogol", 1836);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book3.displayBook1();

    }
}
