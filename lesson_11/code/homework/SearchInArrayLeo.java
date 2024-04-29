package homework;

/* Задайте массив из 10 случайных целых чисел в интервале от -20 до 20.
Запросите у пользователя какое-то целое число.
Определите, есть ли это число в массиве. Создайте и используйте метод
searchInArray, который получает на вход массив и искомое число, а возвращает
ответ - нашлось ли это число в массиве.*/

import java.util.Scanner;

public class SearchInArrayLeo {
    public static void main(String[] args) {

        int[] arr = new int[10];
        fillArray(arr, -20, 20);
        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int num = scanner.nextInt();

        boolean isPresents = searchInArray(arr, num);
        System.out.println("Number " + num + " presents in array = " + isPresents);

    }

    // search num in array method
    // ищем число в методе массива
    private static boolean searchInArray(int[] arr, int num) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                res = true;
            }
        }
        return res;
    }

    // print array
    // распечатываем массив
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    // fill array with random numbers
    // заполняем массив случайными числами
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }
}
