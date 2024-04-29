package homework.book;

import homework.book.Book;
import homework.book.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
       Dictionary dictionary1 = new Dictionary("Uzbek dictionary", "Bobur Ergashev", 1930, 1342678675,"Uzbek", 75000);
       Dictionary dictionary2 = new Dictionary("Russian dictionary", "A.N.Zuev", 2000, 1543876598,"Russian", 95000);

        System.out.println("Dictionary1: ");
        dictionary1.displayBook();
        dictionary1.voice();
        System.out.println("Dictionary2: ");
        dictionary2.displayBook();
        dictionary2.voice();
    }
}
