package homework;

// Задача 1.
// Заполните массив целыми числами от 1 до 100.
// Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Найдите наиболее коротким способом, какое число было добавлено в массив.

import java.util.Arrays;

public class AddedRandomNumLeo {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for (int i = 1; i <= 100; i++) {
            arr[i] = i;
        }
        int randomNum = (int) (Math.random() * 100) + 1;
        int randomIndex = (int) (Math.random() * 100);
        arr[randomIndex] = randomNum;

        Arrays.sort(arr);
        int addedNum = arr[100];
        System.out.println("Добавленное число: " + addedNum);
    }
}
