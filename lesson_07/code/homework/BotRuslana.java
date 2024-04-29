package homework;

// Задача 1. Написать бот, который задает не менее 3-х вопросов (последовательно),
// принимает ответы от пользователя и реагирует на эти ответы по-разному, в зависимости от полученного ответа.
// Пример:
// Как вас зовут? Очень приятно, меня зовут Бот1.
// Какой у вас вес? 106 кг.
// А какой рост? 187
// А какой возраст? 60
// Для вашего возраста и роста такой вес избыточен, я вам рекомендую похудеть на 5-10 кг.

import java.util.Scanner;

public class BotRuslana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        scanner.nextLine();
        System.out.println("You have a beautiful name!");
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 18 ) {
            System.out.println("You are so young, you are probably still a student!");
        } else if  (age >= 18 && age < 30) {
            System.out.println("My sister is the same age as you!");
        } else if ( age > 45 && age < 55) {
            System.out.println("My mother is the same age!");
        } else {
            System.out.println("You are the same age as my grandmother!");
        }
        System.out.println("How tall are u in sm? ");
        int height = scanner.nextInt();

        if (height < 160) {
            System.out.println("You are not so tall, I thought you are taller ");
        } else if (height >= 160 && height <= 180) {
            System.out.println("WOW, you are the same height as me!");
        } else {
            System.out.println("Ouu my GOD , you are so tall, you could be a basketball player!");
        }

        System.out.println("It was nice to meet you, but I have to go mow! I will call u tomorrow");
    }


}