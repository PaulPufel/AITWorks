package classwork;

/*    Написать методы:
  - печатает переданный в метод массив
  - заполняет переданный в метод массив случайными целыми числами в интервале от А до В
  - меняет указанные по индексам два элемента массива местами
  - находит элемент массива
  - находит максимальный элемент массива */

public class ArrayAppl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        printArray(arr);

        fillArray(arr, 1, 10);
        printArray(arr);

        swapElements(arr, 0, arr.length - 1); // first and last (первый и последний)
        printArray(arr);

        swapElements(arr, 2, 8); // второй и восьмой поменяются местами
        printArray(arr);


        int index = maxOfArray(arr);
        System.out.println("Index of max element = " + index);

    } // end of main

    // max element (мах элемент)

    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }


        // search in array by value
        // поиск в массиве по значению
        public static int searchByValue ( int[] arr, int value){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1; // not found (не найдено)
        }

        // swap elements
        // поменять местами элементы
        public static void swapElements ( int[] arr, int m, int n){
            int tmp = arr[m];
            arr[m] = arr[n];
            arr[n] = tmp;
        }

        // fill array with random numbers
        // заполняет массив случайными целыми числами
        public static void fillArray ( int[] arr, int a, int b){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * (b - a + 1) + a);
            }
        }

        // print array
        public static void printArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
} // end of class
