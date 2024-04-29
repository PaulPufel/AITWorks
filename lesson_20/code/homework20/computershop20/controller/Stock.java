package homework20.computershop20.controller;

import homework20.computershop20.model.Computer;
/*
Реализовать класс Stock (склад магазина) с методами:
добавить компьютер;
найти компьютер по его бар-коду;
удалить компьютер;
сколько компьютеров на складе.
*/
public class Stock {
    // fields
    // array for computers
    private Computer[] computers;
    // number of comps in stock
    private int size;

    // constructor
    public Stock(int capacity) {
        this.computers = new Computer[capacity];
        this.size = 0;
    }

    // methods
    // addComputer
    public boolean addComputer(Computer computer) {
        // неоходимо в массив добавить элемент,
        // но предусмотреть, что не добавляется null, не добавляется дубликат, нельзя превысить вместимость библиотеки
        if (computer == null || size == computers.length || findComputer(computer.getSerialNumber()) != null) {
            return false;
        }
        computers[size] = computer; // size - это индекс компьютера, которого еще нет в массиве
        size++;             // size -1 - это индекс последнего компьютера, который есть в массиве
        return true;

    }

    public Computer findComputer(long serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                return computers[i];
            }
        }
        return null;
    }

    // print comps
    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("==========================================");
    }

    // получение кол-ва компьютеров на складе
    public int getSize() {
        return size;
    }

    public Computer removeComputer(long serialNumber) {
        // найдем жертву(удаляемый компьютер)
        Computer victim = null;
        // ищем компьютер по serial number
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                victim = computers[i];

                // на его место поставим последний компьютер из имеющихся в массиве
                computers[i] = computers[size - 1]; // на место i-го компьютера поставим последний
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        // return удаляемый компьютер
        return victim;
    }

}