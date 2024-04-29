package homework20.computershop20.model;

// Реализовать ComputerShop, в котором создать несколько компьютеров.
// Затем пробуете все методы, которые разработаны

import homework20.computershop20.controller.Stock;
import homework20.computershop20.model.Computer;

public class StockAppl {
    public static void main(String[] args) {

        Stock stock = new Stock(1000);

        stock.addComputer(new Computer("i5", 12, 256, "HP", 100000000000000L));
        stock.addComputer(new Computer("i7", 16, 512, "Samsung", 200000000000000L));
        stock.addComputer(new Computer("i5", 12, 512, "Acer", 300000000000000L));
        stock.addComputer(new Computer("i5", 12, 256, "Lenovo", 400000000000000L));

        System.out.println(stock.getSize());
        stock.addComputer(new Computer("i5", 12, 256, "Lenovo", 400000000000000L));

        System.out.println(stock.getSize());
        stock.printComputers();


        stock.addComputer(new Computer("i9", 16, 512, "Apl", 500000000000000L));
        System.out.println(stock.getSize());
        stock.printComputers();


        stock.removeComputer(500000000000000L);
        System.out.println(stock.getSize());
        stock.printComputers();

        stock.removeComputer(200000000000000L);
        System.out.println(stock.getSize());
        stock.printComputers();
    }
}