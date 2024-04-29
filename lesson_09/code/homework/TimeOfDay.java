package homework;

// Задача 3. Определение времени суток. Напишите программу,
// которая принимает на вход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a time between 0 and 23:: ");
        int time = scanner.nextInt();

        switch (time) {
            case 0 -> System.out.println("Good Night");
            case 1 -> System.out.println("Good Night");
            case 2 -> System.out.println("Good Night");
            case 3 -> System.out.println("Good Night");
            case 4 -> System.out.println("Good Night");
            case 5 -> System.out.println("Good Night");
            case 6 -> System.out.println("Good Morning");
            case 7 -> System.out.println("Good Morning");
            case 8 -> System.out.println("Good Morning");
            case 9 -> System.out.println("Good Morning");
            case 10 -> System.out.println("Good Morning");
            case 11 -> System.out.println("Good Morning");
            case 12 -> System.out.println("Good Day");
            case 13 -> System.out.println("Good Day");
            case 14 -> System.out.println("Good Day");
            case 15 -> System.out.println("Good Day");
            case 16 -> System.out.println("Good Day");
            case 17 -> System.out.println("Good Day");
            case 18 -> System.out.println("Good Evening");
            case 19 -> System.out.println("Good Evening");
            case 20 -> System.out.println("Good Evening");
            case 21 -> System.out.println("Good Evening");
            case 22 -> System.out.println("Good Evening");
            case 23 -> System.out.println("Good Night");
            default -> System.out.println("Wront input!");
            }
        }
    }
