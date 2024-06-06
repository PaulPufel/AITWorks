package homework_33.computer_shop.computers;

import java.util.Objects;

public class Computer implements Comparable<Computer> {
    // стандартные поля и методы,
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private long serialNumber;

    // создаём конструктор
    public Computer(String cpu, int ram, int ssd, String brand, long serialNumber) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ssd == computer.ssd;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ssd);
    }

    // этот метод сравнивает текущий объект и Computer o
    @Override
    public int compareTo(Computer o) {
        int res = this.ssd - o.ssd; // сравнение объектов по полю ssd
        return res;
    }

}

