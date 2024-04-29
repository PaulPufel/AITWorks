package homework;

// Задача 1. Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз 3 молоко молоко молоко

import java.util.Scanner;

public class RepeatLine {
    public static void main(String[] args) {
        String text = " Good morning!";
        int repeat = 0;
        System.out.println(repeat + text);

        while (repeat < 4) {
            repeat++;
            System.out.println(repeat + text);
        }
        System.out.println("Happy day!");

        String s = "Hello!";

        String s1 = s;
        String s2 = s;
        String s3 = s;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


