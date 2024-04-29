package homework;

// Написать метод, принимающий массив целых чисел,
// и возвращающий среднее арифметическое всех его элементов.

public class AverageOfArrayLeo {
    public static void main(String[] args) {
        int[] array = {19, 11, 10, 25, 30};

        double average = averageOfArray(array);
        System.out.println("Average of array = " + average);

    }

    private static double averageOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}

