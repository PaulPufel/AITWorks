package homework.equation.model;

/* Задача 3.(*)
Создать класс QuadraticEquation в пакете equation.model.
В этом классе определить поля private double a; private double b; private double c;.
Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.
Создать геттеры и сеттеры. Создать метод public void display() для печати в консоль квадратного уравнения.
Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта
и количества решений уравнения соответственно.
Создать клас EquationAppl в пакете equation с методом main.
В методе main создать несколько экземпляров QuadraticEquation
и вывести для каждого из них результаты работы методов display, delta, quantityRoots. */

public class EquationAppl {
        public static void main(String[] args) {
            double a = -2.5;
            double b = 1.3;
            double c = -7.0;

            QuadraticEquationLeo quadraticEquation = new QuadraticEquationLeo(a, b, c);

            quadraticEquation.display();
            double d = quadraticEquation.delta();
            System.out.println("Discriminant = " + d);
            int n = quadraticEquation.quantityRoots();
            System.out.println("Numbers of roots = " + n);
        }
    }
