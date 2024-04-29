package homework;

// Задача 2. Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import classwork.ArraysMethods;

public class LuckyDumpling {
    public static void main(String[] args) {
        // create array
        // создаём массив
        int[] array = {30, 33, 31, 32, 35, 29, 34, 33, 34, 30, 32, 31, 30, 45, 35,
                30, 32, 30, 34, 31, 33, 28, 30, 32, 35, 31, 36, 30, 33, 30};

        ArraysMethods.maxOfArray(array);
        ArraysMethods.printArray(array);

        int happy = ArraysMethods.indexMaxOfArray(array);
        System.out.println("Happy dumpling is: " + happy);

    }
}




