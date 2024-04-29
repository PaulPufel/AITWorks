package homework24.shape;

// создайте иерархию классов для представления различных 5 геометрических фигур,
// используя абстрактные классы и методы.

public abstract class Shape {
    protected String figure;
    protected String color;

    public Shape(String figure, String color) {
        this.figure = figure;
        this.color = color;

    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    // общий метод для вывода информации о фигуре
    public void printInfo() {
        System.out.println("Геометрическая фигура: " + figure);
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}

class Square extends Shape {
    private double side;

    public Square(String figure, String color, double side) {
        super(figure, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

class Rectangle extends Shape {
    private double side1;
    private double side2;

    public Rectangle(String figure, String color, double side1, double side2) {
        super(figure, color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}

class Cube extends Shape {
    private double side3;

    public Cube(String figure, String color, double side3) {
        super(figure, color);
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return side3 * side3 * 6;
    }

    @Override
    public double getPerimeter() {
        return 12 * side3;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double h;

    public Triangle(String figure, String color, double side1, double side2, double side3, double h) {
        super(figure, color);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.h = h;
    }

    @Override
    public double getArea() {
        return side1 * h / 2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

class Circle extends Shape {
    private double radius;
    private double pi;

    public Circle(String figure, String color, double radius, double pi) {
        super(figure, color);
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * pi;
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square("Square", "black", 11),
                new Rectangle("Rectangle", "blue", 5, 8),
                new Cube("Cube", "green", 10),
                new Triangle("Triangle", "yellow", 7, 5, 4, 3),
                new Circle("Circle", "white", 5.5, 3.14)
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}
