package homework_35.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car[] cars;

    @BeforeEach
    void setUp() {

        cars = new Car[5];
        cars[0] = new Car("VW", "Black", 55000, 2020);
        cars[1] = new Car("Mercedes", "White", 192000, 2000);
        cars[2] = new Car("VW", "Silver", 157000, 2009);
        cars[3] = new Car("Toyota", "Gray", 130000, 2018);
        cars[4] = new Car("VW", "Blue", 110000, 2015);

    }

    @Test
    void testCarSort() {
        System.out.println("========================== Test car sorting =================================");
        // напечатать массив
        printArray(cars);
        // производим сортировку в соответствии с тем полем, которое указано в методе compareTo
        Arrays.sort(cars);
        // напечатать отсортированный массив
        System.out.println("--------------------- After sorting by year of built -------------------------");
        printArray(cars);
    }

    @Test
    void testCarComparator() {
        // Comparator - это абстрактный класс
        Comparator<Car> carComparator = new Comparator<Car>() {

            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel()); // сортируем по model (по алфавиту)
            }
        };
        System.out.println("=================== Test car sorting by Comparator ========================");
        printArray(cars); // печатаем как есть

        System.out.println("----------------------- After sorting by model ------------------------------");
        Arrays.sort(cars, carComparator); // сортируем
        printArray(cars); // печатаем после сортировки

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("================ " + reportTitle + " =====================");

        // foreach
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testPrint() {
        printArray(cars, " list of cars ");
    }

    @Test
    void testNativeSorting() {
        printArray(cars, " list of cars as is ");
        Arrays.sort(cars); // sort native
        printArray(cars, " list of cars sorted by year of built ");
    }

    @Test
    void testComparator() {
        Comparator<Car> comparator1 = (c1, c2) -> Double.compare(c1.getMileage(), c2.getMileage());
        printArray(cars, " Before sorting ");
        Arrays.sort(cars); // native
        printArray(cars, " After sorting by year of built ");
        Arrays.sort(cars, comparator1);
        printArray(cars, " After sorting by color ");

    }

}

