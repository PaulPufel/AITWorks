package homework;

/* Задача 1. Задайте массив из 10 случайных целых чисел в интервале от -20 до 20.
   Запросите у пользователя какое-то целое число.
   Определите, есть ли это число в массиве.
   Создайте и используйте метод searchInArray,
   который получает на вход массив и искомое число,
   а возвращает ответ - нашлось ли это число в массиве.
 */

//import java.util.Random;

public class SearchInArray {
    public static void main(String[] args) {
        int[] randomNum = new int[10];

        int a = -20;
        int b = 20;


        int res = searchInArray(randomNum, 3);
        System.out.println("Index = " + res);

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(randomNum[i] + " | ");
        }
        System.out.println();
        System.out.print("Natural number = " + randomNum[3]);
        }


        public static int searchInArray ( int[] arr, int value){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1;
        }
    }







