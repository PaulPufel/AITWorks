package homework18.autoparkleo.model;

public class Vehicle {
    private double a;
    private double b;

    public Vehicle(double a, double b) {
        this.a = a;
        this.b = b;
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

    public double getArea(){
        return a * b;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}