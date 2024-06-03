package homework_32.company.model;

import java.util.Objects;

// Сделать класс Computer
public abstract class ComputersData {
    // стандартные поля и методы,
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private long serialNumber;

    // создаём конструктор

    public ComputersData(String cpu, int ram, int ssd, String brand, long serialNumber) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public long getSerialNumber() {
        return serialNumber;
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Computer");
        sb.append(", ram: ").append(ram);
        sb.append(", ssd: ").append(ssd);
        sb.append(", brand: ").append(brand);
        sb.append("cpu = ").append(serialNumber);
        sb.append(", price: ").append(calcPrice());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputersData computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && serialNumber == computer.serialNumber && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, serialNumber);
    }

    // переопределить
    public abstract boolean calcPrice(); // abstract method

}

