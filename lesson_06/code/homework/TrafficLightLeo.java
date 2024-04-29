package homework;

import java.util.Scanner;

public class TrafficLightLeo {
    public static void main(String[] args) {

        // Как будем кодировать цвет светофора?
        // Либо цифрами 1, 2, 3, либо пользователь вводит строку, либо задаем в программе строкой (переменная типа String)

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the color? (Red, Yellow, Green): ");
        String color = scanner.next(); // задаем переменную строкового типа String

        switch (color) {
            case "Red" -> System.out.println("Stop, wait!");
            case "Yellow" -> System.out.println("Be ready to go.");
            case "Green" -> System.out.println("You can go!");
            default -> System.out.println("Wrong input!");
        }
    }
}