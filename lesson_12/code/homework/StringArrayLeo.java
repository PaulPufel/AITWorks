package homework;

/*
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
состоящий из самой короткой и самой длинной строки изначального массива.
*/

import classwork.ArraysMethods;

public class StringArrayLeo {
    public static void main(String[] args) {
        String[] arrOfStr = {"a", "ab", "abc", "abcd", "abcde"};
        String[] arrOfStr1 = fillArrayMinAndMaxString(arrOfStr);
        ArraysMethods.printArray(arrOfStr1);
    }

    private static String[] fillArrayMinAndMaxString(String[] arrOfStr) {
        int[] arrOfStrLength = new int[arrOfStr.length];
        // transfer in new array length of every string
        for (int i = 0; i < arrOfStrLength.length; i++) {
            arrOfStrLength[i] = arrOfStr[i].length();
        }
        // find indexes of min and max length of strings
        int maxIndex = ArraysMethods.indexMaxOfArray(arrOfStrLength);
        int minIndex = ArraysMethods.indexMinOfArray(arrOfStrLength);
        // create and fill new array
        String[] resArray = new String[2];
        resArray[0] = arrOfStr[minIndex];
        resArray[1] = arrOfStr[maxIndex];
        return resArray;
    }
}