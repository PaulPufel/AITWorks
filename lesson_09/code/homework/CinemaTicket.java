package homework;

import java.util.Scanner;

/* Задача 4. В кинотеатре есть разные типы билетов:
стандартный, студенческий (-10%) и для пенсионеров(-25%).
Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
что увеличит стоимость билета на 25%. Создайте метод calculateTicketPrice,
который принимает возраст клиента, статус студента и флаг VIP-места,
а возвращает итоговую стоимость билета. Реализуйте приложение-бот,
которое задает необходимые вопросы и объявляет стоимость билета.
 public class CinemaTicket 
 */
public class CinemaTicket {
    public static void main(String[] args) {

        double ticket = 20;
        double action1 = 0.1;
        double action2 = 0.25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the client's age: ");
        double c = scanner.nextDouble();

        if (14 <= c & c <= 25) {
            System.out.println("A student ticket costs" + " = " + (ticket - ticket * action1));
        } else if (67 <= c & c <= 110) {
            System.out.println("A ticket for pensioners costs" + " = " + (ticket - ticket * action2));
        } else if (c == 0) {
            System.out.println("A VIP ticket costs" + " = " + (ticket + ticket * action2));
        } else {
            System.out.println("No ticket!");
        }
    }
}

