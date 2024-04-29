package homework18.library.model;

/* В классе BookAppl в методе main создайте массив типа Book и в нем 4 книги и 3 словаря.
  Выведите информацию о них в консоль.

  Реализуйте методы, которые выдают:
  общее количество страниц во всех книгах;
  среднее значение количества слов в словарях;
  средний возраст всех изданий. */

import classwork.supermarket.model.parent.Product;
import homework18.library.model.Book18;
import homework18.library.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {

        Book18 book18s[] = new Book18[7];

        book18s[0] = new Book18("Anna Karenina", "Lev Tolstoy", 1878, 1783452875, 1200);
        book18s[1] = new Book18("Master and Margarita", "Mikhail Bulgakov", 1966, 1638654327, 520);
        book18s[2] = new Book18("Revizor", "Nikolay Gogol", 1836, 1564384397, 250);
        book18s[3] = new Book18("Nose", "Nikolay Gogol", 1832, 1358493523, 120);
        book18s[4] = new Dictionary("Uzbek dictionary", "Bobur Ergashev", 1930, 1342678675, 500, "Uzbek", 32000);
        book18s[5] = new Dictionary("Russian dictionary", "A.N.Zuev", 2000, 1543876598, 1000, "Russian", 180000);
        book18s[6] = new Dictionary("German dictionary", "Frank Gofmann", 1980, 1543876598, 800, "Deutsch", 150000);

        System.out.println("==========All Books============");
        printBook18(book18s);

        System.out.println("==========Total number of pages============");
        int totalPageQuantity = getPageQuantity(book18s);
        System.out.println("Page quantity = " + totalPageQuantity);

        System.out.println("==========Total number of words============");
        int totalWordQuantity = getWordQuantity(book18s);
        System.out.println("Word quantity = " + totalWordQuantity);

        System.out.println("==========Average years of publishing============");
        double avgEge = getYear(book18s);
        System.out.println("Average years of publishing = " + avgEge);

    }

    private static double getYear(Book18[] book18s) {
        double avgEge = 0;
        for (int i = 0; i < book18s.length; i++) {
            avgEge += book18s[i].getYear();
        }
        return avgEge / book18s.length;
    }

    private static int getWordQuantity(Book18[] book18s) {
        int res = 0;
        for (int i = 0; i < book18s.length; i++) {
            if (book18s[i] instanceof Dictionary) {
                Dictionary dictionary = (Dictionary) book18s[i];
                res += dictionary.getWordQuantity();
            }
        }
        return res;
    }

    private static int getPageQuantity(Book18[] book18s) {
        int res = 0;
        for (int i = 0; i < book18s.length; i++) {
            res += book18s[i].getPageQuantity();
        }
        return res;
    }

    private static void printBook18(Book18[] book18s) {
        for (int i = 0; i < book18s.length; i++) {
            System.out.println(book18s[i]);
        }
    }
}