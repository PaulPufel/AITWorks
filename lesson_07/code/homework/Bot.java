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

public class Bot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();

        if (name.length() > 2) {
            System.out.println("Очень приятно, меня зовут Anna. Буду рада вам помочь!");
        }else{
            System.out.println("Вы не верно внесли ваше имя! Повторите снова");
        }

        System.out.println("Как оплатить товар в вашем онлайн магазине?");
        System.out.println("Внесите стоимость вашей покупки.");

        int productPay = scanner.nextInt();

        if (productPay <= 50) {
            System.out.println("Способ оплаты PayPal!");
        } else {
            System.out.println("Способ оплаты VisaCard!");
        }

        System.out.println("Сколько стоит доставка?");
        System.out.println("Стоимость доставки зависит от суммы покупок." +
                " Внесите общую сумму ваших покупок.");

        int deliveryPrice = scanner.nextInt();

        if (deliveryPrice >= 100) {
            System.out.println("Бесплатная доставка!");
        } else {
            System.out.println("Стоимость доставки 10 USD!");
        }

        System.out.println("Какие сроки доставки?.");
        System.out.println("Введите срок оплаты от 1 до 14 дней.");

        int deliveryTimeDay = scanner.nextInt();

        if (deliveryTimeDay <= 3) {
            System.out.println("Доставка в течении 5-ти календарных дней.");
            System.out.println("Благодарим за покупку!");
        }else{
            System.out.println("Доставка в течении 14-ти календарных дней.");
            System.out.println("Благодарим за покупку!");

        }
    }//end of main
}//end of class

