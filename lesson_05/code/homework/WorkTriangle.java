package homework;

// Задача 1. Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.

public class WorkTriangle {


    public static void main(String[] args) {

        int a = 13;
        int b = 5;
        int c = 9;

        if(a < (b + c)){
            System.out.println("Side a is small");
        }
        if (b < (a + c)){
            System.out.println("Side b is small");
        }
        if (c < (a + b)){
            System.out.println("Side c is small");
        }

    }//end of main


}//end of class

