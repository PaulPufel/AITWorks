package classwork04;

// Задача 1. Написать бот, который задает не менее 3-х вопросов (последовательно),
// принимает ответы от пользователя и реагирует на эти ответы по-разному, в зависимости от полученного ответа.
// Пример:
// Как вас зовут? Очень приятно, меня зовут Бот1.
// Какой у вас вес? 106 кг.
// А какой рост? 187
// А какой возраст? 60
// Для вашего возраста и роста такой вес избыточен, я вам рекомендую похудеть на 5-10 кг.

import java.util.Scanner;

public class BotKa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        askQuestionFirst(scanner);
        askQuestionSecond(scanner);
        askQuestionThird(scanner);


    }//end of main

    static void askQuestionFirst(Scanner scanner){
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();

        if (name.length() > 5){
            System.out.println("Очень сложное имя! Рад познакомиться");
        }else{
            System.out.println("Ваше имя благозвучное! Рад познакомиться");
        }
    }
    static void askQuestionSecond(Scanner scanner){

        System.out.println("Какой у вас вес? (кг)");
        int weigth = scanner.nextInt();

        if (weigth > 120){
            System.out.println("Хорошего человека должно быть много!");
        }else{
            System.out.println("Вы в хорошей форме!");
        }
    }
    static void askQuestionThird(Scanner scanner){

        System.out.println("А какой рост? (см)");
        int height = scanner.nextInt();

        if (height > 150){
            System.out.println("Вы в числе большинства!");
        }else{
            System.out.println("Вы в числе меньшинства!");
        }
    }
    
}//end of class

