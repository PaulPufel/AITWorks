package homework23.prime;

// Задача 2.(*)
// Создать класс PrimeNumber и в нем метод isPrime,
// который отвечает на вопрос, является ли целое число простым или нет.

// Разработать класс PrimeNumberTest, в котором протестировать указанный метод.
// Использовать методы AssertTrue или AssertFalse.

import java.util.Scanner;

public class PrimeNumber {

// Пользователь вводит натуральное число n.
// Определите, является ли оно простым.
// Простое число - это такое число, которое делится **только** на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
// Обеспечьте защиту от ввода пользователем отрицательных чисел.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System. in);
        System.out.println("Input integer and positive number: ");
        int number = scanner.nextInt();

        while (number <= 0){
            System.out.println("Wrong input, try again.");
            number = scanner.nextInt();
        }
        // Пользователь ввёл какое-то число
        // 65 ввёл пользователь. Будем пробовать разделить 65 на 2, 3, 4, 5, ..., 64,
        // Если хоть на какое-то число разделится, то это будет НЕ простое число,
        // а иначе, это будет ПРОСТОЕ число.

        boolean isPrime = true;

       int div = 2;
        while (div < number){
            if(number % div == 0){
                isPrime = false;
                break; // Уходим из цикла, так как уже всё стало ясно
            }
            div++;
        }
        System.out.println(number + " is prime: " + isPrime);
    }
    private void assertTrue(int i) {

    }

}
