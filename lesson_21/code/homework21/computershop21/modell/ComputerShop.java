package homework21.computershop21.modell;

import homework21.computershop21.controller.Stock;
import homework21.computershop21.modell.Computer;

public class ComputerShop {
    public static void main(String[] args) {

        Stock stock = new Stock(10);

        stock.addComputer(new Computer("i5", 12, 256, "HP", 100_000_000_000_000_000L));
        stock.addComputer(new Computer("i7", 16, 512, "Samsung", 200_000_000_000_000_000L));
        stock.addComputer(new Computer("i5", 12, 256, "Lenovo", 300_000_000_000_000_000L));

        System.out.println(stock.getSize());
        stock.printComputers();

        stock.addComputer(new Computer("i9", 64, 512, "Apple", 400_000_000_000_000_000L));

        System.out.println(stock.getSize());
        stock.printComputers();
    }
}
