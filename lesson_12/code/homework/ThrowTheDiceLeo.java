package homework;

/*Бросьте кубик с 6-ю гранями 20 раз.
Подсчитайте, сколько раз выпала каждая цифра. Посчитайте вероятность выпадения каждой грани.
 */

import java.util.Random;

public class ThrowTheDiceLeo {
        public static void main(String[] args) {
            int[] results = new int[6]; // Массив для подсчета количества выпадений каждой грани
            int totalThrows = 20; // Общее количество бросков
            Random random = new Random();

            // Бросаем кубик 20 раз
            for (int i = 0; i < totalThrows; i++) {
                int roll = random.nextInt(6) + 1; // Генерируем случайное число от 1 до 6
                results[roll - 1]++; // Увеличиваем счетчик для соответствующей грани
            }

            // Выводим результаты
            for (int i = 0; i < results.length; i++) {
                int number = i + 1;
                int count = results[i];
                double probability = (double) count / totalThrows * 100; // Вычисляем вероятность в процентах
                System.out.println(" Грань " + number + " : " + count + " раз (вероятность " + probability + " %) ");
            }
        }
    }