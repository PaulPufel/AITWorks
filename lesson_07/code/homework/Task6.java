package homework;

// Задача 6. Напишите программу, которая запрашивает у пользователя длины трех сторон треугольника
// и определяет его тип (равносторонний, равнобедренный, разносторонний).
public class Task6 {
    public static void main(String[] args) {
        double a = 11;
        double h = 3;
        double s = sTriangle(a, h);
        System.out.println("S triangle = " + s);
    }

    public static double sTriangle(double a, double h){
        return a * h / 2.0;
    }
}
