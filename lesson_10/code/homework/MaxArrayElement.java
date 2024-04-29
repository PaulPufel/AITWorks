package homework;

// Задача 3.
// Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.

public class MaxArrayElement {
    public static void main(String[] args) {

        int[] arrayOfIntegers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        // найдем максимальный элемент массива и его индекс

        int max = arrayOfIntegers[0];
        int indexMax = 0;

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] > max) {
                max = arrayOfIntegers[i];
                indexMax = i;
            }
        }

        System.out.println("Max  = " + max);
        System.out.println("Index of max element: " + indexMax);
    }
}
