package homework;

/* Для задач далее (3 и 4) задайте массив из 10 случайных чисел в интервале от -10 до 10.
   Протестируйте работу методов на созданном массиве.

   Задача 3. Написать метод, принимающий массив целых чисел,
   и возвращающий сумму всех его нечетных элементов

   Задача 4. Написать метод, принимающий массив целых чисел,
   и возвращающий произведение всех его элементов с четными индексами.
   */


public class ArrayMethods {
    public static void main(String[] args) {
        int[] randomNum = new int[10];

        int a = -10;
        int b = 10;

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(randomNum[i] + " | ");
        }
        // int sum = randomNum[10];
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] % 2 == 1) {
                System.out.println("Summa = " + randomNum);
                //return i;
            }
           /*  for (int i = 0; i < randomNum.length; i++) {
                randomNum[i] = (int) (Math.random() * (b - a + 1) + a);
                System.out.print(randomNum[i] + " | ");
            }
            // задать переменную для хранения суммы, инициализировав её 1
            for (int i = 1; i < randomNum.length && i % 2 == 0; ) {
                System.out.println("Summa = " + randomNum);
// if (i % 2 == 0) {
            }
            return;
        }
        // for int i = 0; i < array.length && i % 2 == 0;){
        // if (i % 2 == 0){
        // умножить значение результующее на array[i] */
        }
    }
}


