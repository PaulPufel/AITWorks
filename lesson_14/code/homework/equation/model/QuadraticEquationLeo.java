package homework.equation.model;

public class QuadraticEquationLeo {
    private double a;
    private double b;
    private double c;

    public QuadraticEquationLeo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    //    Создать метод ``public void display()`` для печати в консоль квадратного уравнения.
//    Создать методы ``public double delta()`` и ``public int quantityRoots()``
    public void display() {
        System.out.println("(" + a + ")*X^2 + (" + b + ")*X " + " + (" + c + ") = 0 ");
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public int quantityRoots() {
        if (delta() > 0) {
            return 2;
        } else if (delta() == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
