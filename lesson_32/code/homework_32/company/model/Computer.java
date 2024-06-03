package homework_32.company.model;

import java.util.Objects;

public class Computer extends ComputersData {

    private double price;
    private boolean discount;

    public Computer(String cpu, int ram, int ssd, String brand, long serialNumber, double price, boolean discount) {
        super(cpu, ram, ssd, brand, serialNumber);
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(price, computer.price) == 0 && discount == computer.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, discount);
    }

    @Override
    public boolean calcPrice() {
        return true;
    }

}
