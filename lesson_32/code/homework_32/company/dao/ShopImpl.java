package homework_32.company.dao;

import homework_32.company.model.Computer;
import homework_32.company.model.ComputersData;

public class ShopImpl implements Shop {
    // fields
    private ComputersData[] computers;
    private int size;

    // конструктор
    public ShopImpl(int capacity) {
        computers = new ComputersData[capacity];
    }

    @Override
    public boolean addComputer(ComputersData computer) {
        if (computer == null || size == computers.length || findComputer(computer.getSerialNumber()) != null) {
            return false;
        }
        computers[size++] = computer;
        return true;
    }

    @Override
    public ComputersData removeComputer(long serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                ComputersData victim = computers[i];
                computers[i] = computers[--size];
                computers[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public ComputersData findComputer(long serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public ComputersData[] findComputerWithDiscount() {
        //count quantity of computers
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (computers[i].calcPrice()) {
                count++;
            }
        }
        //fill array
        ComputersData[] res = new ComputersData[count];
        for (int i = 0, j = 0; i < res.length; i++) {
            if (computers[i].calcPrice()) {
                res[j++] = computers[i];
            }
        }
        return res;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (computers[i] instanceof Computer) {
                Computer computer = (Computer) computers[i];
                res += computer.getPrice();
            }
        }
        return res;
    }

    private double calcPrice() {
        return 0;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
    }
}
