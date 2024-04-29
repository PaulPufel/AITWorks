package homework18.autoparkpaul.model;

// Задача 3.
// Создайте класс Vehicle с полями: длина, ширина.
// В автопарке 5 транспортных средств, каждое имеет свою длину и ширину.
// Рассчитайте необходимую площадь под стоянку автопарка.
public class Vehicle {
    private double length;
    private double width;

    public Vehicle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getArea() {
        return length * width;
    }
}
