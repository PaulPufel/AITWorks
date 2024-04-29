package homework;


// Задача 5. Напишите программу, которая запрашивает у пользователя его доход
// и вычисляет сумму налога согласно прогрессивной шкале налогообложения
// (например, 10% на доход до 10 000, 20% на доход от 10 001 до 20 000 и т.д.).

import java.util.Scanner;

public class TaxesLeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your month income: ");
        double income = scanner.nextDouble();

        if (income <= 10000) {
            System.out.println("Taxes = " + income * 0.1);
        } else if (income >= 10001 && income <= 20000) {
            System.out.println("Taxes = " + income * 0.2);
        }else {
            System.out.println("Taxes = " + income * 0.3);
        }
    }
}
