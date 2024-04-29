package homework;

// Задача 4(*). Написать программу для вычисления средней стоимости поездки по транспортному проездному.
// В программе задать стоимость проездного на месяц и количество рабочих дней в месяце.
// Считая, что в рабочий день в среднем две поездки, и 1.5 поездки в выходной,
// посчитать и округлить общее число поездок в месяц и затем рассчитать среднюю стоимость одной поездки по проездному билету.
// Рассчитать для января 2024 года.

import java.io.PrintStream;

public class Drive {

    public static void main(String[] args) {

        double ticket = 49;
        double workDaysJan = 22;
        double driveWorkDay = 2;
        double driveOffDay = 1.5;
        double offDay = 9;

        double totalDays = (int) (workDaysJan * driveWorkDay + driveOffDay * offDay);


            System.out.println ("Total number of trips = " + totalDays);

            double averageTrip = ticket / totalDays;

            System.out.println("Average trip cost = " + (float)averageTrip);
        }


    private static double convertToAverageTrip(double ticket, double totalDay){
        return ticket / totalDay;
    }
}
