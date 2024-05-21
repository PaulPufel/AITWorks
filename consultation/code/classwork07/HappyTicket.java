package classwork07;

// Задача 4. (*) Вводится шестизначное число (номер автобусного билета).
// Определите, является ли этот билет "счастливым"
// (сумма первых трех цифр равна сумме трех последних цифр).

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        // первый вариант разбиения изначального числа
        // (123456 / 1) % 10 = 6
        // (123456 / 10) % 10 = 5
        // (123456 / 100) % 10 = 4
        // (123456 / 1000) % 10 = 3
        // (123456 / 10000) % 10 = 2
        // (123456 / 100000) % 10 = 1
        // А почему так?
        // Рассмотрим на отдельном примере:
        // (123456 / 1000) % 10 = 3
        // 123456 / 1000 % 10
        // 123.456 % 10
        // 123 % 10
        // 3

        // второй вариант разбиения изначального числа
        // "123456" -> {"1", "2", "3", "4", "5", "6"}

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int ticketNumber = scanner.nextInt();

        // реализация первого варианта
        if (ticketNumber > 999999) {
            System.out.print("Значение некорректное");
            return;
        }

        boolean isLucky = isLuckyNumber(ticketNumber);

        if (isLucky) {
            System.out.println("У вас счастливый билет!");
        } else {
            System.out.println("Повезет в любви!");
        }
    }

    public static boolean isLuckyNumber(int value) {
        // сумма младших трех разрядов
        int sum1 = 0;
        // сумма старших трех разрядов
        int sum2 = 0;

        // делитель
        int divider = 1;

        // цикл для младших трех разрядов
        while (divider <= 100000) {
            int digit = value / divider % 10;

            if (divider <= 100) {
                sum1 = sum1 + digit;
            } else {
                sum2 = sum2 + digit;

            }

            divider = divider * 10;
        }

        return sum1 == sum2;
    }
}


