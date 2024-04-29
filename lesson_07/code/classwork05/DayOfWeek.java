package classwork05;

// Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
// Замените ввод цифры на первую букву(2 буквы) дня недели.

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first letter of day week: ");

        //int number = scanner.nextInt();

        String firstLetter = scanner.next();

        switch (firstLetter){
        case "mo" -> System.out.println("Monday");
        case "tu" -> System.out.println("Tuesday");
        case "we" -> System.out.println("Wednesday");
        case "th" -> System.out.println("Thursday");
        case "fr" -> System.out.println("Friday");
        case "sa" -> System.out.println("Saturday");
        case "su" -> System.out.println("Sunday");
        }
    }
}
