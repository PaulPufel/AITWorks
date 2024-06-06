package homework_33.computer_shop.computers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class ComputerTest {

    Computer[] computer;

    @BeforeEach
    void setUp() {
        computer = new Computer[4];
        computer[0] = new Computer("i5", 12, 128, "HP", 100_000_000_000_000_000L);
        computer[1] = new Computer("i7", 14, 512, "Samsung", 200_000_000_000_000_000L);
        computer[2] = new Computer("i5", 12, 256, "Lenovo", 300_000_000_000_000_000L);
        computer[3] = new Computer("i9", 16, 1024, "Apple", 400_000_000_000_000_000L);

    }

    @Test
    void testComputerSort() {
        System.out.println("============================== Test Computer sorting ================================");
        printArray(computer);
       Arrays.sort(computer); // производим сортировку в соответствии с тем полем, которое указано в методе compareTo

        System.out.println("------------------------------ After sorting by ssd ---------------------------------");
        printArray(computer);
    }


    @Test
    void testComputerComparator() {
        // Comparator - это абстрактный класс
        Comparator<Computer> computerComparator = new Comparator<Computer>() {

            @Override
            public int compare(Computer o1, Computer o2) {
                return o1.getBrand().compareTo(o2.getBrand()); // сортируем по автору (по алфавиту)
            }
        };
        System.out.println("============================ Test Computer sorting by Comparator ========================");
        printArray(computer); // печатаем как есть

        System.out.println("------------------------------- After sorting by brand ------------------------------");
        Arrays.sort(computer, computerComparator); // сортируем
        printArray(computer); // печатаем после сортировки

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
