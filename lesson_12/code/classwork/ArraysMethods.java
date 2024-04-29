package classwork;

public class ArraysMethods {

    // fill array with random numbers
    // заполняет массив случайными целыми числами
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }

    // binary search
    // метод будет возвращать индекс найденного элемента,
    // или некоторое отрицательное число, если его не нашлось
    // передаём в метод массив и число
    // метод должен ответить на вопрос о наличии числа в массиве
    public static int binarySearch(int[] arr, int element) {
        int left = 0;
        int rigth = arr.length - 1;
        while (left <= rigth) {
            int mid = (left + rigth) / 2;
            if (arr[mid] == element) {
                return mid; // index of element
            } else if (element < arr[mid]) {
                rigth = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -left - 1; // when element not found
    }


    // bubble sort
    // comparing two elements of array: array[i] ? array[i + 1]
    // if left array[i] > right array[i + 1], swap

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // правый конец будет двигаться к началу массива
                if (array[j] > array[j + 1]) {
                    // swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // print array int[]
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print current element of array
            // распечатываем текущий элемент массива
        }
        System.out.println();
    }

    // print array String[]
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print current element of array
                                              // распечатываем текущий элемент массива
        }
        System.out.println();
    }

    // max element of int[]
    public static int maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // min element of int[]
    public static int indexMinOfArray(int[] arrOfStrLength) {

   // public static int minOfArray(int[] array) {
        int min = arrOfStrLength[0];
        for (int i = arrOfStrLength.length - 1; i > arrOfStrLength.length; i--) {
            if (arrOfStrLength[i] > min) {
                min = arrOfStrLength[i];
            }
        }
        return min;
    }

    // index of max element
    public static int indexMaxOfArray(int[] array) {
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }


    public static void printArray(String[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " "); // print current element of array
                                                  // распечатываем текущий элемент массива
            }
            System.out.println();
        }
    }


