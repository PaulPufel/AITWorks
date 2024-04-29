package homework;

//Задача 4. Напишите программу, которая запрашивает у пользователя два числа и выводит наибольшее из них.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int a = 7;
        int b = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        a = scanner.nextInt();

        System.out.println("Input 2nd number: ");
        b = scanner.nextInt();

        int max = (a > b) ? a : b; // это тернарный оператор

        System.out.println("Maximum: " + max);

    }
}

