package homework_39.planets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

@Nested
class PlanetApplTest {
    Planet[] planets;

    @BeforeEach
    void setUp() {

        planets = new Planet[8];
        planets[0] = new Planet(1, "Mercury", 3.6E16, 3.3E23, 0);
        planets[1] = new Planet(2, "Venus", 2.5E12, 4.87E24, 0);
        planets[2] = new Planet(3, "Earth", 1.7E11, 5.97E24, 1);
        planets[3] = new Planet(4, "Mars", 3.6E19, 6.42E23, 2);
        planets[4] = new Planet(5, "Jupiter", 5.8E18, 1.90E27, 95);
        planets[5] = new Planet(6, "Saturn", 4.4E14, 5.68E26, 83);
        planets[6] = new Planet(7, "Uranus", 5.8E18, 8.68E25, 27);
        planets[7] = new Planet(8, "Neptune", 5.8E18, 1.02E26, 14);

    }

    @Test
    void testPlanetSort() {
        System.out.println("================================= Test planets sorting ================================");
        printArray(planets);
        Arrays.sort(planets); // производим сортировку в соответствии с тем полем, которое указано в методе compareTo
        System.out.println("------------------------- After sorting by quantity of satellites ---------------------");
        printArray(planets);
    }

    @Test
    void testPlanetComparator() {
        // Comparator - это абстрактный класс
        Comparator<Planet> planetComparator = new Comparator<Planet>() {

            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName()); // сортируем по названию планет (по алфавиту)
            }
        };

        System.out.println("============================== Test planet sorting by Comparator ========================");
        printArray(planets); // печатаем как есть

        System.out.println("--------------------------------- After sorting by name ----------------------------------");
        Arrays.sort(planets, planetComparator); // сортируем
        printArray(planets); // печатаем после сортировки

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
