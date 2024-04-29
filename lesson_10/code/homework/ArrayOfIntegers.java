package homework;

// Задача 2. Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

public class ArrayOfIntegers {
    public static void main(String[] args) {
        int[] randomIntegers = new int[20];

        int a = 10;
        int b = 20;

        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        for (int i = 0; i < randomIntegers.length; i++) {
            System.out.print(randomIntegers[i] + " | ");
        }
        int x = randomIntegers[0];
        randomIntegers[0] = randomIntegers[randomIntegers.length - 1];
        randomIntegers[randomIntegers.length - 1] = x;

        System.out.println();
        for (int i = 0; i < randomIntegers.length; i++) {
            System.out.print(randomIntegers[i] + " | ");
        }
    }
}
