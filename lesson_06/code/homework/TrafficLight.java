package homework;
// Задание 3. Напишите программу для машины на светофоре.
// Что делать, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the traffic light color number: ");
        int ligth = scanner.nextInt();

        switch (ligth){
            case 1 -> System.out.println("RED");
            case 2 -> System.out.println("YELLOW");
            case 3 -> System.out.println("GREEN");
        }
        switch (ligth) {
            case 1 -> System.out.println("The car stops!");
            case 2 -> System.out.println("Get ready to move.");
            case 3 -> System.out.println("The car starts moving.");
        }
    }


}
