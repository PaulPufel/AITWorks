package homework21.computershop21.modell;

import homework21.computershop21.controller.StockLeo;
import homework21.computershop21.modell.ComputerLeo;

import java.math.BigInteger;

public class ComputerShopLeo {
    public static void main(String[] args) {
        StockLeo stock = new StockLeo(29);

        stock.addComputerLeo(new ComputerLeo("HP", "AMD Ryzen", 8, new BigInteger("15678952146895789654")));
        stock.addComputerLeo(new ComputerLeo("Hyrican", "Ryzen5", 32, new BigInteger("78998952146895789654")));
        stock.addComputerLeo(new ComputerLeo("Samsung", "i3", 8, new BigInteger("23678952146895789655")));

        System.out.println(stock.getSize());
        stock.printComputerLeo();

        stock.addComputerLeo(new ComputerLeo("Apple", "M1Chip", 8, new BigInteger("86678952146895789111")));
        System.out.println(stock.getSize());
        stock.printComputerLeo();

        stock.removeComputerLeo(new BigInteger("15678952146895789654"));
        stock.removeComputerLeo(new BigInteger("78998952146895789654"));
        System.out.println(stock.getSize());
        stock.printComputerLeo();
    }
}