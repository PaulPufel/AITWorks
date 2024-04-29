package additionwork;

// Задача 2.
// Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
// Через сколько лет его долг превысит s тысяч рублей,
// если за это время он не будет отдавать долг.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sum loaned of money : ");
        double sum = scanner.nextDouble();
        System.out.println("Input new loaned sum of money: ");
        double target = scanner.nextDouble();

        int year = 0;
        while (sum < target) {
            sum += sum * 0.1;
            year++;
        }
        System.out.println("After " + year + " years sum loaned of money will be: " + (float) sum);
    }
}
