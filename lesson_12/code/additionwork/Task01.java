package additionwork;

// Задача 1.
// В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет.

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sum of money: ");
        double sum = scanner.nextDouble();
        System.out.println("Input the target sum of money: ");
        double target = scanner.nextDouble();

        int year = 0;
        while (sum < target) {
            sum += sum * 0.03;
            year++;
        }
        System.out.println("After " + year + " years sum of money will be : " + (float)sum);
    }
}
