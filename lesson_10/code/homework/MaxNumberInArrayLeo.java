package homework;

// Задача 3. Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.

public class MaxNumberInArrayLeo {
    public static void main(String[] args) {

        int[] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int maxNum = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max number in array = " + maxNum);
        System.out.println("Index of max is = " + maxIndex);
    }
}
