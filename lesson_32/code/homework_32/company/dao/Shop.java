package homework_32.company.dao;

import homework_32.company.model.ComputersData;

public interface Shop {

/*  - добавить компьютер addComputer
    - удалить компьютер removeComputer
    - найти компьютер findComputer
    - найти компьютер со скидкой findComputerWithDiscount
    - кол-во компьютеров quantity
    - объем продаж totalSales
    - напечатать список компьютеров printComputers */

    // define abstract methods

    boolean addComputer(ComputersData computer);

    ComputersData removeComputer(long serialNumber);

    ComputersData findComputer(long serialNumber);

    ComputersData[] findComputerWithDiscount();

    int quantity();

    double totalSales();

    void printComputers();

}
