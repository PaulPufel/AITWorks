package homework_40.sentence1;

// Задача 1.
// Дано предложение Ф.М.Достоевского:
// Сколько в нем уникальных слов?
// А сколько в нем уникальных символов?

import java.util.HashSet;
import java.util.Set;

public class Sentence1 {
    public static void main(String[] args) {

        String sentence = "Он был человек, безусловно, больной, потому что в мире, видимо, " +
                "есть две категории людей, - одни, способные видеть божество, и другие, " +
                "не способные видеть божество, - и первая категория, хотя и содержит в себе много людей " +
                "с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, " +
                "к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, " +
                "ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, " +
                "уже не может отказаться от этого видения и опять стать обыкновенным человеком.";

        System.out.println("================================================================================");

        String[] words = sentence.split(" ");
        int l = words.length;
        System.out.println("Words in sentence = " + l);
        System.out.println("--------------------------------------------------------------------------------");

        Set<String> uniqueWords = new HashSet<>();
        for (String s : words) {
            uniqueWords.add(s);
        }

        System.out.println(uniqueWords);
        System.out.println();
        System.out.println("Quantity of unique words in sentence: " + uniqueWords.size());


        System.out.println("================================================================================");
        String[] symbols = sentence.split("");
        int d = symbols.length;
        System.out.println("Symbols in sentence = " + d);
        System.out.println("---------------------------------------------------------------------------------");

        Set<String> uniqueSymbols = new HashSet<>();
        for (String c : symbols) {
            uniqueSymbols.add(c);
        }

        System.out.println(uniqueSymbols);
        System.out.println();
        System.out.println("Quantity of unique symbols in sentence: " + uniqueSymbols.size());
        System.out.println("================================================================================");

    }
}




