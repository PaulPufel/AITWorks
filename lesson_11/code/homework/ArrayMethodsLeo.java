package homework;

/* Для задач далее (3 и 4) задайте массив из 10 случайных чисел в интервале от -10 до 10.
Протестируйте работу методов на созданном массиве.

Задача 3.
Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его
нечетных элементов.

Задача 4.
Написать метод, принимающий массив целых чисел, и возвращающий произведение
всех его элементов с четными индексами. */


public class ArrayMethodsLeo {

        public static void main(String[] args) {

            int[] array = new int[10];
            int a = -10;
            int b = 10;

            fillArray(array, a, b);

            printArray(array);

            System.out.println("Sum of odd elements: " + sumOfOddElementsOfArray(array));

            System.out.println("Multiply of elements with even index: " + multiplyElementsWithEvenIndex(array));

        }

        // multiply elements with even indexes
        // заполняем массив случайными числами
        public static int multiplyElementsWithEvenIndex(int[] arr){
            int res = 1;
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    res *= arr[i];
                }
            }
            return res;
        }

        // sum of odd elements
        // сумма нечётных элементов
        public static int sumOfOddElementsOfArray(int[] arr){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 != 0){
                    sum += arr[i];
                }
            }
            return sum;
        }

        // print array
        // распечатать массив
        public static void printArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }

        // fill array with random numbers
        // заполняем массив случайными числами
        public static void fillArray(int[] arr, int a, int b){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * (b - a + 1) + a);
            }
        }
    }