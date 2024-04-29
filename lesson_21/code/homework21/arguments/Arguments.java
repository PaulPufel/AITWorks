package homework21.arguments;

/* Задача 4.(*)
Напишите приложение, которое выводит минимальные/максимальные числовые значения
примитивных типов: byte, short, char, int, long, float, double
Типы как объекты String должны браться из аргументов основной функции main.
Если в аргументах нет какого-либо типа (не указан тип), приложение должно
вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип. */

import java.math.BigInteger;

public class Arguments {
    public static void main(String[] args) {
        Byte a = 0;
        Short b = 0;
        Integer c = 0;
        Long d = 0L;
        Float f = 0.0f;
        Double g = 0.00;
        Character h = 'A';

        System.out.println("Max value of Byte : " + a.MAX_VALUE);
        System.out.println("Min value of Byte : " + a.MIN_VALUE);
        System.out.println("----------------------------");

        System.out.println("Max value of Short : " + b.MAX_VALUE);
        System.out.println("Min value of Short : " + b.MIN_VALUE);
        System.out.println("----------------------------");

        System.out.println("Max value of Integer : " + c.MAX_VALUE);
        System.out.println("Min value of Integer : " + c.MIN_VALUE);
        System.out.println("----------------------------");

        System.out.println("Max value of Long : " + d.MAX_VALUE);
        System.out.println("Min value of Long : " + d.MIN_VALUE);
        System.out.println("----------------------------");

        System.out.println("Max value of Float : " + f.MAX_VALUE);
        System.out.println("Min value of Float : " + f.MIN_VALUE);
        System.out.println("----------------------------");

        System.out.println("Max value of Double : " + g.MAX_VALUE);
        System.out.println("Min value of Double : " + g.MIN_VALUE);
        System.out.println("----------------------------");

        System.out.println("Max value of Character : " + h.MAX_VALUE);
        System.out.println("Min value of Character : " + h.MIN_VALUE);
        System.out.println("Wrong type.");
    }
}
