package classwork05;
  /* Задание 1. В программе задаются два целых числа.
     Найдите минимальное из них с помощью тернарного оператора.
    Дополните программу возможностью ввода чисел пользователем.*/

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 0;
        int b = -85;

        Scanner scanner = new Scanner(System.in); // включили сканер

        System.out.println("Input 1st number: "); // приглашение пользователю
        a = scanner.nextInt(); // получаем значение с клавиатуры

        System.out.println("Input 2sd number: "); // приглашение пользователю
        b = scanner.nextInt(); // получаем значение с клавиатуры

         int min = (a < b) ? a : b; // это тернарный оператор

        System.out.println("Minimum: " + min);
    }
}
