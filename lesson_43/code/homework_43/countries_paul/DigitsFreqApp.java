package homework_43.countries_paul;

// Задача 3(*).
// В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000
// и подсчитать частоту встречаемости цифр в этих числах.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {
    public static void main(String[] args) {
        // Генерируем один миллион положительных целых чисел в интервале от 100 до 1000
        int numberOfNumbers = 1000000;
        int lowerNumber = 100;
        int upperNumber = 1000;

        Random random = new Random();
        int[] numbers = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = random.nextInt(upperNumber - lowerNumber) + lowerNumber;
        }

        // Подсчет частоты встречаемости цифр
        Map<Character, Integer> digitFrequency = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            digitFrequency.put((char) (i + '0'), 0);
        }

        for (int number : numbers) {
            char[] digits = String.valueOf(number).toCharArray();
            for (char digit : digits) {
                digitFrequency.put(digit, digitFrequency.get(digit) + 1);
            }
        }

        // Вывод результатов
        for (Map.Entry<Character, Integer> entry : digitFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

