package homework;

// Задача 1.
// Заполните массив целыми числами от 1 до 100.
// Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Найдите наиболее коротким способом, какое число было добавлено в массив.

// import classwork.ArraysMethods;
   import java.util.Random;
// import java.util.Scanner;

public class AddedRandomNumVik {
    public static void main(String[] args) {
        int[] array = new int[100]; // Создаем массив на 101 элемент
        Random random = new Random();

        // Заполняем массив числами от 1 до 100
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        // Генерируем случайное число от 1 до 100
        int randomNum = random.nextInt(100) + 1;

        // Генерируем случайное место, куда добавить случайное число
        int randomIndex = random.nextInt(100);

        // Добавляем случайное число в случайное место в массиве
        array[randomIndex] = randomNum;

        // Находим добавленное число в массиве
        int addedNumber = 0;
        for (int i = 1; i <= 100; i++) {
            if (!contains(array, i)) {
                addedNumber = i;
                break;
            }
        }

        // Выводим результат
        System.out.println("Добавленное число в массив: " + addedNumber);
    }

    // Метод для проверки наличия элемента в массиве
    public static boolean contains(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}