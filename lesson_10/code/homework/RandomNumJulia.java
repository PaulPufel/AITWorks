package homework;

// Задача 2. Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.


public class RandomNumJulia {
    public static void main(String[] args) {
        int[] randomNum = new int[20];

        int a = 10;
        int b = 20;

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random() * (b - a + 1) + a);
            // Генерирует случайное целое число в интервале [a, b]
            // a - может быть, b - может быть
        }
        for (int i = 0; i < randomNum.length; i++) {
            System.out.print(randomNum[i] + " | ");
        }
        int x = randomNum[0]; // Сохраняем значение первого элемента в переменной х
        randomNum[0] = randomNum[randomNum.length - 1]; // Поменяем местами первый и последний элементы
        randomNum[randomNum.length - 1] = x;

        System.out.println(); // Новая линия (new line)
        for (int i = 0; i < randomNum.length; i++) {
            System.out.print(randomNum[i] + " | ");
        }
    }
}
