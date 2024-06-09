package homework_34.homeWorkListe;

import homework_34.homeWorkListe.model.Menu;

import java.util.Scanner;

public class TaskAppl {
    public static void main(String[] args) {

        System.out.println("Good morning Paul!");

        Menu[] menu = Menu.values();

        // print menu
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + " - " + menu[i].getTask());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input your choice: "); // user invitation
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Here you read: " + menu[choice - 1].getTask());
                case 2 -> System.out.println("Here you read: " + menu[choice - 1].getTask());
                case 3 -> System.out.println("Here you read: " + menu[choice - 1].getTask());
                case 4 -> System.out.println("Here you read: " + menu[choice - 1].getTask());
                default -> System.out.println("Wrong choice!");
            }
        }
    }
}

