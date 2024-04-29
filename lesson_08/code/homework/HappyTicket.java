package homework;

// Задача 4. (*) Вводится шестизначное число (номер автобусного билета).
// Определите, является ли этот билет "счастливым"
// (сумма первых трех цифр равна сумме трех последних цифр).

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input six positive digits: ");
        int num = scanner.nextInt();
        int sumOfDigits = 0;
        int inputNum = num;
        while (num > 0) {
            sumOfDigits += num % 10;
            num = num / 10;
            System.out.println("Sum of digits of " + inputNum + " = " + sumOfDigits);
        }
        while (num <= 0) {
            System.out.println("Wrong input! Try again.");
            num = scanner.nextInt();
        }
        System.out.println("Input first three of six positive digits: ");
        int num1 = scanner.nextInt();
        int sumOfDigits1 = 0;
        int inputNum1 = num1;
        while (num1 > 0) {
            sumOfDigits1 += num1 % 10;
            num1 = num1 / 10;
            System.out.println("Sum of digits of " + inputNum1 + " = " + sumOfDigits1);
        }
        while (num1 <= 0) {
            System.out.println("Wrong input! Try again.");
            num1 = scanner.nextInt();
        }
        System.out.println("Input second three of six positive digits: ");
        int num2 = scanner.nextInt();
        int sumOfDigits2 = 0;
        int inputNum2 = num2;
        while (num2 > 0) {
            sumOfDigits2 += num2 % 10;
            num2 = num2 / 10;
            System.out.println("Sum of digits of " + inputNum2 + " = " + sumOfDigits2);
        }
        while (num2 <= 0) {
            System.out.println("Wrong input! Try again.");
            num2 = scanner.nextInt();
        }
        System.out.println("Compare the first two numbers you get. ");
        int num3 = scanner.nextInt();
        int sumOfDigits3 = 0;
        int inputNum3 = num3;
        while (num3 > 0) {
            sumOfDigits3 += num3 % 10;
            num3 = num3 / 10;
            System.out.println("Sum of digits of " + inputNum3 + " = " + sumOfDigits3);
        }
        while (num3 <= 0) {
            System.out.println("Wrong input! Try again.");
            num3 = scanner.nextInt();
        }
        System.out.println("Compare the second two numbers you get. ");
        int num4 = scanner.nextInt();
        int sumOfDigits4 = 0;
        int inputNum4 = num4;
        while (num4 > 0) {
            sumOfDigits4 += num4 % 10;
            num4 = num4 / 10;
            System.out.println("Sum of digits of " + inputNum4 + " = " + sumOfDigits4);
        }

        while (num3 == num2) {
            System.out.println("Ticket is happy!");
        }
        while (num3 != num2) {
            System.out.println("Ticket is unhappy!");
        }
    }
}







