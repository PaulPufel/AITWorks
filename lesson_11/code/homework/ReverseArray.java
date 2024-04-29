package homework;

// Задача 5. Написать метод, принимающий массив целых чисел, и разворачивающий его.
// Последний элемент становится нулевым, предпоследний,первым, и т. д.
// Подсказка: этот метод должен изменить полученный массив.

import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11) + 10;
            System.out.print(arr[i] + " ");
        }

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println();

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i] + " <-> " + arr[arr.length - i - 1]);
        }
    }
}
