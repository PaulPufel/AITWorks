package homework_32.company.tests;

import homework_32.company.dao.Shop;
import homework_32.company.dao.ShopImpl;
import homework_32.company.model.Computer;
import homework_32.company.model.ComputersData;
import homework_32.company.model.Laptop;
import homework_32.company.model.SmartPhone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopImplTest {
    Shop shop;
    ComputersData[] comp;

    @BeforeEach
    void setUp() {
        shop = new ShopImpl(5);
        comp = new ComputersData[4];
        comp[0] = new Computer("i5", 12, 256, "HP", 100_000_000_000_000_000L, 350, false);
        comp[1] = new Computer("i7", 16, 512, "Samsung", 200_000_000_000_000_000L, 500, false);
        comp[2] = new Laptop("i5", 12, 256, "Lenovo", 300_000_000_000_000_000L, 400, false, 23, 2.2, 5);
        comp[3] = new SmartPhone("i6", 14, 128, "Apple", 400_000_000_000_000_000L, 600, true, "iOS8");

        // необходимо добавить элементы массива в company
        for (int i = 0; i < comp.length; i++) {
            shop.addComputer(comp[i]);
        }
    }

    @Test
    void addComputer() {
        // нельзя добавить null
        assertFalse(shop.addComputer(null));

        // нельзя добавить второй раз уже имеющегося
        assertFalse(shop.addComputer(comp[1]));

        // добавляем компьютер
        ComputersData computersData = new Computer("i9", 64, 512, "Apple", 500_000_000_000_000_000L, 450, true);
        assertTrue(shop.addComputer(computersData));

        // проверяем кол-во после добавления
        assertEquals(5, shop.quantity());

        // нельзя превысить capacity
        ComputersData computer1 = new Laptop("Ryzen5", 32, 128, "Hurican", 600_000_000_000_000_000L, 550,false,27, 1.7, 6);
        assertFalse(shop.addComputer(computer1));
        shop.printComputers();
    }

    @Test
    void removeComputer() {
        assertEquals(comp[1], shop.removeComputer(200_000_000_000_000_000L));
        assertEquals(3, shop.quantity());
        shop.printComputers();
    }

    @Test
    void findComputer() {
        // find computer with serialNumber = 200_000_000_000_000_000L
        assertEquals(comp[1], shop.findComputer(200_000_000_000_000_000L));

        // find computer with serialNumber = 700_000_000_000_000_000L
        assertNull(shop.findComputer(700_000_000_000_000_000L));
    }

    @Test
    void findComputerWithDiscount() {
        assertEquals (comp[3], shop.findComputerWithDiscount()[3]);

    }

    @Test
    void totalSales() {
        assertEquals(1850, shop.totalSales());
    }

    @Test
    void quantity() {
        assertEquals(4, shop.quantity());
    }


    @Test
    void printComputer() {
        shop.printComputers();
    }
}




