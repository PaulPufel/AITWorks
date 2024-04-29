package homework;


/*Написать программу для вычисления средней стоимости поездки по транспортному проездному.
В программе задать стоимость проездного на месяц и количество рабочих дней в месяце.
Считая, что в рабочий день в среднем две поездки, и 1.5 поездки в выходной, посчитать и
округлить общее число поездок в месяц и затем рассчитать среднюю стоимость одной поездки по
проездному билету.
Рассчитать для января 2024 года.*/

// Jan 2024 = 23 working days * 2 journeys + 4 days off * 1,5 journeys = 52 journeys
// to calculate and round up the total number of journeys per month, average value of one journey.

public class CostOfTicketLeo {
    public static void main(String[] args) {
        double ticketPrice = 49;
        int workingDaysInMonth = 23;
        int totalDaysInMonth = 31;

        int journeys = quantityOfJourneys (workingDaysInMonth, totalDaysInMonth);
        System.out.println("Quantity of journeys in January: " + journeys);

        System.out.printf("Average price per journey = %.2f", averagePrice(ticketPrice, totalDaysInMonth));
        System.out.println(" euros. ");

    } //end of main

    // метод рассчитывает среднюю стоимость поездки
    public static double averagePrice (double a, int b){
        return a / b;
    }

    // метод рассчитывает количество поездок в месяце Январь
    public static int quantityOfJourneys (int a, int b){
        return (int) (a * 2 + (b - a) * 1.5); // округляем количество дней до целого числа
    }
}