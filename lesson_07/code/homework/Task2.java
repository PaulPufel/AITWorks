package homework;

// Задача 2. Напишите программу, которая запрашивает у пользователя число и проверяет,
// принадлежит ли оно заданному интервалу [a, b].

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int a = 65;
        int b = 98;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int c = scanner.nextInt();

        if (a < c & c < b) {
            System.out.println("Число" + " " + "принадлежит интервалу между буквами А и В");
        } else if (a >= c & c <= b) {
            System.out.println("Число" + " " + "не принадлежит интервалу между буквами А и В");
        } else if (a <= c & c >= b) {
            System.out.println("Число" + " " + "не принадлежит интервалу между буквами А и В");
        }
    }
}


