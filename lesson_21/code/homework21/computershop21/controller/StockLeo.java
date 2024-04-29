package homework21.computershop21.controller;

import homework21.computershop21.modell.ComputerLeo;

import java.math.BigInteger;


public class StockLeo {
    private ComputerLeo[] computers;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public StockLeo(int capacity) {
        this.computers = new ComputerLeo[capacity];
        this.size = 0;
    }

    public boolean addComputerLeo(ComputerLeo computer) {
        if (computer == null || size == computers.length || findComputerLeo(computer.getMsn()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    private ComputerLeo findComputerLeo(BigInteger msn) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getMsn().equals(msn)) {
                return computers[i];
            }
        }
        return null;
    }

    public ComputerLeo removeComputerLeo(BigInteger msn) {
        ComputerLeo victim = null;
        for (int i = 0; i < size; i++) {
            if (computers[i].getMsn().equals(msn)) {
                victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }

    public int getSize() {
        return size;
    }

    public void printComputerLeo() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("______________________________________________ ");
    }

}
