package homework;

/*Определение времени суток. Напишите программу, которая принимает на вход текущий час
(от 0 до 23) и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).*/

import java.util.Scanner;

public class TimeOfDayLeo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input current time in hours: ");
            int hour = scanner.nextInt();

            switch (hour){
                case 6, 7, 8, 9, 10, 11 -> System.out.println("Good morning!");
                case 12, 13, 14, 15, 16, 17 -> System.out.println("Good afternoon!");
                case 18, 19, 20, 21, 22, 23 -> System.out.println("Good evening!");
                case 0, 1, 2, 3, 4, 5 -> System.out.println("Good night!");
                default -> System.out.println("Wrong input.");
            }
        }
    }

