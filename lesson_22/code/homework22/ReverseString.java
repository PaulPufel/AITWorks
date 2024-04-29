package homework22;

// Напишите программу(код) на Java,  которая печатает строку задом наперед, начиная с последнего слова.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Разбиваем строку на слова, используя пробел в качестве разделителя
        String[] words = input.split(" ");

        // Печатаем слова в обратном порядке, начиная с последнего
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

// Программа сначала запрашивает строку у пользователя, затем разбивает её на слова, используя пробел
// в качестве разделителя, и наконец, печатает слова в обратном порядке, начиная с последнего.

