package homework;

// Задача 1. Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class TemperaturesOfDay {
    public static void main(String[] args) {
        int[] temperaturesWeek = {11, 9, 7, 10, 8, 9, 13};

        int tuesday = temperaturesWeek[1];
        int thursday = temperaturesWeek[3];
        int sumOfMeasurements = 0;

        for (int i = 0; i < temperaturesWeek.length; i++) {
            sumOfMeasurements += temperaturesWeek[i];

        }
        System.out.println("Temperature on Tuesday: = " + tuesday);
        System.out.println("Temperature on Thursday: = " + thursday);

        double averageTemperatures = (double) sumOfMeasurements / temperaturesWeek.length;
        System.out.printf("Average temperature: %.2f", averageTemperatures);
    }
}


