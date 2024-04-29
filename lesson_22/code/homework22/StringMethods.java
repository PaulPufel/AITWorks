package homework22;

/* Задание 2.
 Напишите программу, которая запрашивает строку от пользователя и затем:
 сообщает сколько букв (символов) в строке
 сообщает сколько слов в строке
 печатает строку задом наперед, начиная с последнего слова. */

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println("-----------------------------------------");

        // number of letters
        String[] letters = str.split("");
        System.out.println("Number of letters = " + letters.length);
        System.out.println("-----------------------------------------");

        // Разбиваем строку на слова, используя пробел в качестве разделителя
        // number of words
        String[] words = str.split(" ");
        System.out.println("Number of words = " + words.length);
        System.out.println("-----------------------------------------");

        // Печатаем слова в обратном порядке, начиная с последнего
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}




