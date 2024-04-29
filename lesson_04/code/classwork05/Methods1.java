package classwork05;

//   1. Создайте метод, который возвращает целое число, противоположное по знаку.
//   Пример: число -46, метод возвращает 46.
//
//   2. Создайте метод, который возвращает куб числа.
//   Пример: число 20, метод возвращает 8 000.
//
//  3. Создайте метод, который принимает целое число и возвращает остаток от деления его на 2.
//  Пример: число 41, метод возвращает 1.

public class Methods1 {

    public static void main(String[] args) {

        int x = 56;
        x = absolute(x);
        System.out.println("x = " + x);

        double a = 10.0d; // задаем действительное число

        System.out.println("Cub = " + cubOfNumber(a));

        int z = 58;
        System.out.println( z + " rest of division by 2 = " + restDivisionBy2(z));

    } // end of main

    public static int restDivisionBy2(int z) {

        return z % 2;
    }

    public static double cubOfNumber(double z){
        return z * z * z;
    }

    public static int absolute(int number){ // это сигнатура метода (1-я строчка каждого метода)
        return - number;
    }

} // end of class
