package homework;

/*В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
что увеличит стоимость билета на 25%.
Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента
и флаг VIP-места, а возвращает итоговую стоимость билета.
Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.*/

import java.util.Scanner;

public class CinemaTicketLeo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = scanner.nextInt();

        while (age <= 0) {
            System.out.println("Wrong input, tre again, pls.");
            age = scanner.nextInt();
        }

        boolean isStudent = false;
        System.out.println("Are you a student?");
        isStudent = scanner.nextBoolean();

        System.out.println("Do you want VIP seat?");
        boolean isVip = scanner.nextBoolean();

        double ticketPrice = calculateTicketPrice(age, isStudent, isVip);
        System.out.println("Ticket price: " + ticketPrice);

    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        double price = 30;
        // сначала пенсионеры
        if (age >= 60) {
            price = price * 0.75;
        }
        // затем студенты
        if (isStudent) {
            price = price * 0.9;
        }
        // затем VIP-зона
        if (isVip) {
            price = price * 1.25;
        }
        return price;
    }
}
