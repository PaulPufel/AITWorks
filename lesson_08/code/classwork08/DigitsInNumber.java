package classwork08;

// Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.
// 356712 - это ввёл пользователь, программа должна выдать: 6 цифр
// 1234567890987654321 - 19 цифр

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

        // Алгоритм:
        // Числа записываются в 10-тичной системе счисления, каждый знак отвечает за разряд числа
        // Будем на каждом шагу делить число на 10 с остатком.

        // Взаимодействие с пользователем:
        // Запросить у него число
        // напечатать число = кол-вву цифр

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        int number = scanner.nextInt();
        int count = 0;

        while (number > 0){

            number = number / 10; // Деление даёт нам сколько цифр
            count++; // увеличиваем счётчик
        }
        System.out.println("Number of digits are: " + count);
    }
}
