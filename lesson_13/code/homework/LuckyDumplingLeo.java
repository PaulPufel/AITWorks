package homework;

import java.util.Random;

// Задача 2. Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import java.util.Random;

public class LuckyDumplingLeo {

    public static void main(String[] args) {
        Random random = new Random();
        int luckyDumpling = random.nextInt(30) + 1;
        for (int i = 1; i <= 30; i++) {
            int weight = 50;
            if (i == luckyDumpling) {
                weight += 15;
                System.out.println("Lucky dumpling found! " + i + "\uD83E\uDD5F" + " + " + "\uD83E\uDD49"
                                                                     + ": Weight -- " + weight + "gram.");
            } else {
                System.out.println("Dumpling number " + i + "\uD83E\uDD5F" + ": Weight -- " + weight + " gram.");
            }
        }
    }
}

