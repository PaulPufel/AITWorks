package homework;

//Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class SumOfDigitsLeo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");

        int num = scanner.nextInt();

        while (num <= 0) {
          //  System.out.println("Wrong input! Try again.");
          num = scanner.nextInt();
        }

        int sumOfDigits = 0;
        int inputNum = num;

        while (num > 0) { // Проверяем условие цикла
            sumOfDigits += num % 10; // = sumOfDigits + num % 10; Вычисляем цифру числа и сразу же её добавляем
            num = num/10; // Само число уменьшаем в 10 раз, чтобы отколоть следующую значашую цифру
        }
        System.out.println("Sum of digits of " + inputNum + " = " + sumOfDigits);
    }
}
