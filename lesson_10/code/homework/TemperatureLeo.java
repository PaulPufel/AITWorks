package homework;

    /*Задача 1
Собрать в массив данные о дневной температуре
в вашем городе за прошедшую неделю.
Выведите на печать температуру, которая была во вторник
и затем в четверг. Найти среднюю температуру за прошлую неделю.*/

public class TemperatureLeo {
    public static void main(String[] args) {
        int[] temperatures = {10, 5, 6, 7, 9, 10, 14};
        System.out.println("Temperature Tuesday: " + temperatures[1]);
        System.out.println("Temperature Thursday: " + temperatures[3]);
        int sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        double weeklyTemperature = (double) sum / temperatures.length;
        System.out.printf("Temperature for the week: %.2f ", weeklyTemperature);
    }
}
