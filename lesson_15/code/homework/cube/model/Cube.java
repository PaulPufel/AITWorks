package homework.cube.model;

/* Задача 1.
Создать класс Cube, описывающий куб cо стороной a.
Реализовать в нем методы определения периметра p (сумма длин всех ребер),
площади s (сумма площадей всех граней) и объема v.
Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v. */

public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }

    public void perimeter() {
        System.out.println("Perimeter = " + (a * 12));
    }

    public void sumOfAreasAllSides() {
        System.out.println("Sum of the areas of all sides of a cube = " + ((a * a) * 6));
    }

    public void volume() {
        System.out.println("Volume cube = " + (a * a * a));
    }
}




