package homework_36.city_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Oldenburg", 800_000, "Germany", 5.0);
        cities[1] = new City("Kassel", 670_000, "Germany", 7.5);
        cities[2] = new City("Dresden", 2_700_000, "Germany", 6.0);
        cities[3] = new City("Achim", 470_000, "Germany", 8.0);
        cities[4] = new City("Hamburg", 8_500_000, "Germany", 6.5);
        cities[5] = new City("Bremen", 1_300_000, "Germany", 4.0);
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("===================" + reportTitle + "=====================");

        // foreach
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testPrint() {
        printArray(cities, " list of cities ");
    }

    @Test
    void testNativeSorting() {
        printArray(cities, " list of cities as is ");
        Arrays.sort(cities); // sort native
        printArray(cities, " list of cities sorted by name "); // сравнение объектов по полю name
    }

}

