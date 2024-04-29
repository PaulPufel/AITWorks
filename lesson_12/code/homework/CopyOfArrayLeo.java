package homework;
    /*
Написать метод copyOfArray.
Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
Метод должен создать новый массив длиной newLength.
В новый массив должны быть скопированы элементы из входящего массива:
Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
*/

import classwork.ArraysMethods;

public class CopyOfArrayLeo {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int[] newArray = copyOfArray(array, 20);
        ArraysMethods.printArray(newArray);

    }

    public static int[] copyOfArray(int[] arr, int a) {
        // create new array with needed length
        int[] newArray = new int[a];

        //fill newArray with values from old one
        for (int i = 0; i < newArray.length; i++) {
            if (i < arr.length) { // do it till have elements in array
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
}
