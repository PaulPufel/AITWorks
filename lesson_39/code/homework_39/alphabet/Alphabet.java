package homework_39.alphabet;

// Задача 3.
// Заполните структуру типа ArrayList символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения символов
        ArrayList<Character> alphabet = new ArrayList<>();

        // Заполняем ArrayList символами от 'A' до 'Z'
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }

        // Выводим содержимое ArrayList
        System.out.println("Alphabet: " + alphabet);
    }
}
