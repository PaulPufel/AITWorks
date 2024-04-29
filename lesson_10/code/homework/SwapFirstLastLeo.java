package homework;

/* Создайте массив из 20 случайных целых чисел
   в интервале от 10 до 20. Выведите массив на печать.
   Поменяйте местами первый и последний элементы массива
   и снова выведите массив на печать.*/

import java.util.Random;

public class SwapFirstLastLeo {
    public static void main(String[] args) {
        int[] arr = new int[20];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11) + 10;
            System.out.print(arr[i] + " ");
        }

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}