package classwork22.string_exercise;

import java.util.Arrays;

public class StringAppl {
    public static void main(String[] args) {

        String str = "Hello world";
        System.out.println(str);
        System.out.println("---------------------------------------");

        String str1 = "Hello";
        char[] str2 = {32, 'w', 'o', 'r', 'l', 'd'}; // array of char, 32 - ASCII-code of space (код пробела)
        String str3 = new String(str2);
        String str4 = str1 + str3;
        System.out.println(str4);
        System.out.println("----------------------------------------");

        // объединяем строки
        str = str1.concat(str3); // аналогичная операция, добавил ещё раз слово world
        System.out.println(str);
        System.out.println("----------------------------------------");

        // length
        int l = str.length(); // выясняем длину строки
        System.out.println("Length of string: " + l);
        System.out.println("-----------------------------------------");

        // charAt
        char c = str.charAt(str.length() - 1); // last symbol (определяем последний символ в строке)
        System.out.println(c);
        System.out.println("-----------------------------------------");


        // print every letter of string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            System.out.println("-------------------------------------");
        }

        String w1 = "World";
        String w2 = "world";
        boolean check = w1.equals(w2);
        System.out.println(check); //  expect false

        check = w1.equalsIgnoreCase(w2);
        System.out.println(check); // expect true
        System.out.println("-----------------------------------------");

        // toLowerCase, toUpperCase
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase); // hello world
        String upperCase = str.toUpperCase();
        System.out.println(upperCase); // HELLO WORLD
        System.out.println("-----------------------------------------");

        // index
        int index = str.indexOf('l');
        System.out.println(index); // 2
        System.out.println("-----------------------------------------");

        index = str.lastIndexOf('l');
        System.out.println(index); // 9
        System.out.println("-----------------------------------------");

        index = str.indexOf("world"); // с какого индекса начинается слово
        System.out.println(index); // 6
        System.out.println("-----------------------------------------");

        index = str.indexOf('l', 4);
        System.out.println(index); // 9
        System.out.println("-----------------------------------------");

        // subString
        System.out.println(str.substring(5)); // from begin
        System.out.println(str.substring(2, 7)); // from to
        System.out.println("-----------------------------------------");

        System.out.println(str.replace('o', 'a')); // вместо буквы о появится буква а
        System.out.println(str);
        System.out.println(str.replace("o", "o-o-o"));
        System.out.println("-----------------------------------------");

        // trim - убираем пробелы
        String string = "     Bill Smith   ";
        System.out.println(string.trim());
        System.out.println("-----------------------------------------");

        // number of worlds
        String string1 = "One two, three fore five, six seven";
        String[] words = string1.split(" ");
        System.out.println("Number of words = " + words.length);
        System.out.println("-----------------------------------------");

        // number of letters
        String[] letters = str.split("");
        System.out.println("Number of letters = " + letters.length);
        System.out.println("-----------------------------------------");

        // print with for loop
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("-----------------------------------------");

        // print with Arrays.toString
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));
        System.out.println("-----------------------------------------");

        System.out.println(letters.length);
        System.out.println(Arrays.toString(letters));
        System.out.println("----------------------------------");
    }
}

