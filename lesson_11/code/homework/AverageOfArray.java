package homework;

// Задача 2. Написать метод, принимающий массив целых чисел,
// и возвращающий среднее арифметическое всех его элементов.

import java.util.Random;

public class AverageOfArray {

    public static void main(String[] args) {

        int[] arr = new int[13];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }// end of main

        double arithmeticMean = (double) sum / arr.length;
        System.out.printf("The arithmetic mean is: %.2f ", arithmeticMean);
    }
}  // end of class
