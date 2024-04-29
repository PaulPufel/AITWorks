package homework;

// Задача 1. Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.

public class WorkTriangle2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 9;
        int c = 5;

        if (a + b < c | a + c < b | b + c < a){
            System.out.println("Треугольник не существует!");
        }else{
            System.out.println("Треугольник существует!");
        }

    }//end of main
}//end of class
