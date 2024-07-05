package homework_43.countries_leo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqStreamLeo {
        public static void main(String[] args) {
            Random random = new Random();

            // define new Map<Integer, Integer> - цифра и частота ее появления в массиве
            Map<Integer, Integer> digitFrequency = new HashMap<>();

            for (int i = 0; i < 1000; i++) {
                int number = 100 + random.nextInt(901); // Генерация числа от 100 до 1000, тип int

                char[] digits = String.valueOf(number).toCharArray(); //полученное number в один массив из цифр тпа Char

                // обегаем весь массив цифр
                for (char digit : digits) {
                    int digitValue = Character.getNumericValue(digit); // переводим все Char в числа
                    digitFrequency.put(digitValue, digitFrequency.getOrDefault(digitValue, 0) + 1); // кладем в map, используя встроенный метод
                }
            }

            // обрабатываем результат с помощью stream
            digitFrequency.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> System.out.println("Цифра " + entry.getKey() + " встречается " + entry.getValue() + " раз"));
        }
    }

