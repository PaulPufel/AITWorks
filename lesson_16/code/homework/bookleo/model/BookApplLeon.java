package homework.bookleo.model;

import homework.book.modellleo.Book;
import homework.bookleo.model.DistionaryLeon;

public class BookApplLeon {
    public static void main(String[] args) {

        Book book = new Book("War and peace", "Tolstoy", 1980, 1000L);
        book.display();
        System.out.println("----------------------------------------");
        DistionaryLeon dictionaryEng = new DistionaryLeon("English Dictionary", "Bonk", 1985, 2000L, "english", 20000, "language");
        dictionaryEng.display();
        System.out.println("----------------------------------------");
        DistionaryLeon dictionaryWords = new DistionaryLeon("Words Dictionary", "Ojegov", 1990, 3000L, "russian", 30000, "words");
        dictionaryWords.display();
        System.out.println("----------------------------------------");

    }
}

