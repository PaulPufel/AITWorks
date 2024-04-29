package homework.book.modellleo;

import homework.book.modellleo.Book;

public class BookAppl {
    public static void main(String[] args) {

        Book book = new Book("War and peace", "Tolstoy", 1980, 1000L);
        book.display();
        System.out.println("----------------------------------------");

    }
}
