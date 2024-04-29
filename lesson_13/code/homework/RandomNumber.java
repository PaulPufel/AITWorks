package homework;

// Nicht fertig

// Задача 1.
// Заполните массив целыми числами от 1 до 100.
// Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Найдите наиболее коротким способом, какое число было добавлено в массив.


import classwork.ArraysMethods;

import java.util.Scanner;

public class RandomNumber {    public static void main(String[] args) {
    // create array
    //создаём массив

    int[] array = new int[100];
    int a = 1;
    int b = 100;
    ArraysMethods.fillArray(array, a, b);
    ArraysMethods.printArray(array);
    System.out.println(array[5]);

    // binary search
    // бинарный поиск
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int index = ArraysMethods.binarySearch(array, num);
    System.out.println("Number = " + index);
}

} // end of class


