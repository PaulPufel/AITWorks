package homework20.computershop20.model;

// Задание 2.
// ComputerShop по аналогии с Book-Library.
// Сделать класс Computer,
// стандартные поля и методы,
// уникальный серийный номер 15 цифр.

import java.util.Objects;

public class Computer {
    private static final int SERIALNUMBER_LENGTH = 15;

    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private long serialNumber;



    public Computer(String cpu, int ram, int ssd, String brand, long serialNumber) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.serialNumber = checkSerialNumber(serialNumber);
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

    private long checkSerialNumber(long serialNumber) {
        if (countDigits(serialNumber) == SERIALNUMBER_LENGTH) {
            return serialNumber;
        }
        return -1;
    }

    private int countDigits(long serialNumber) {
        int count = 0;
        do {
            count++;
            serialNumber = serialNumber / 10;
        } while (serialNumber != 0);

        return count;
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
        return ram == computer.ram && ssd == computer.ssd && serialNumber == computer.serialNumber &&
                Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, serialNumber);
    }

}
