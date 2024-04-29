package homework21.computershop21.controller;

import homework21.computershop21.modell.Computer;

import java.math.BigInteger;

public class Stock {

    private Computer[] computers;
    private int size;

    public Stock(int capacity) {
        this.computers = new Computer[capacity];
        this.size = 0;
    }

    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputer(computer.getSerialNumber()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    public Computer findComputer(BigInteger serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                return computers[i];
            }
        }
        return null;
    }

    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("==========================================");
    }

    public int getSize() {
        return size;
    }

    public Computer removeComputer(long serialNumber) {
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber().longValue() == serialNumber) {
                victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }

}