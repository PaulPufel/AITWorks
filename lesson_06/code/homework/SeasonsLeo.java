package homework;

import java.util.Scanner;

/***Задача 2.**
 Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает,
 какому времени года принадлежит введенный месяц, и какое время года (сезон).*/

public class SeasonsLeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month: ");
        int month = scanner.nextInt();

        switch (month){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }

        switch (month) {
            case 3,4,5 :
                System.out.println("Spring \uD83C\uDF38");
                break;
            case 6,7,8 :
                System.out.println("Summer  ☀\uFE0F");
                break;
            case 9,10,11 :
                System.out.println("Autumn \uD83C\uDF41");
                break;
            case 12,1,2:
                System.out.println("Winter ❄\uFE0F");
                break;
            default:
                System.out.println("Incorrect \uD83D\uDE45\uFE0F");
        }

        // Код символа кленового листа
        String mapleLeaf = "\uD83C\uDF42";

        // Код символа листа клена
        String mapleLeafAlt = "\uD83C\uDF41";

        // Код символа общего листа
        String leaf = "\uD83C\uDF43";

        // Вывод символов
        System.out.println("Кленовый лист: " + mapleLeaf);
        System.out.println("Лист клена: " + mapleLeafAlt);
        System.out.println("Общий лист: " + leaf);
    }
}
