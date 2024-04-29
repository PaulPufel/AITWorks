package homework;

// Задача 5. Напишите программу, которая запрашивает у пользователя его доход
// и вычисляет сумму налога согласно прогрессивной шкале налогообложения
// (например, 10% на доход до 10 000, 20% на доход от 10 001 до 20 000 и т.д.).


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("State your salary: ");
        String currency = scanner.nextLine();

        double summa = scanner.nextDouble();

        double result = 0;
        double rate1 = 0.1;
        double rate2 = 0.2;

        switch (currency) {
            case " 1 " -> result = exchange(summa, rate1);
            case " 2 " -> result = exchange(summa, rate2);
            default -> System.out.println("Incorrect!");
        }
        System.out.println("This is your monthly salary no tax: " + result);
        }
        private static double exchange(double salaryMonthly, double rate) {
        return salaryMonthly / rate;
    }
}

