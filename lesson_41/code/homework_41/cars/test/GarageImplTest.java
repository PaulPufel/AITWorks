package homework_41.cars.test;

import homework_41.cars.dao.Garage;
import homework_41.cars.dao.GarageImpl;
import homework_41.cars.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("DH 121", "Cadet", "Opel", 1.4, "Black");
        cars[1] = new Car("DH 122", "Benz", "Mercedes", 2.2, "With");
        cars[2] = new Car("DH 123", "Lupo", "VW", 1.0, "Silver");
        cars[3] = new Car("DH 124", "Yaris", "Toyota", 1.2, "Red");

        // необходимо добавить элементы массива в company
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCar() {
        // нельзя добавить null
        assertFalse(garage.addCar(null));
        // нельзя добавить второй раз уже имеющийся car
        assertFalse(garage.addCar(cars[1]));
        // добавляем car
        Car car = new Car("DH 125", "Sport", "Honda", 2.4, "Blue");
        assertTrue(garage.addCar(car));
        // проверяем кол-во после добавления
        assertEquals(5, garage.quantity());
        // нельзя превысить capacity
        Car car1 = new Car("DH 127", "Golf", "VW", 1.6, "Green");
        assertFalse(garage.addCar(car1));
        garage.printCar();
    }

    @Test
    void removeCar() {
        assertEquals(cars[1], garage.removeCar("DH 122"));
        assertEquals(3, garage.quantity());
        garage.printCar();
    }

    @Test
    void findCarByRegNumber() {
        // find car with regNumber DH 123
        assertEquals(cars[2], garage.findCarByRegNumber("DH 123"));
        // find car with regNumber DH 127
        assertNull(garage.findCarByRegNumber("DH 127"));
    }

    @Test
    void findCarsByModel() {
        // find car by model
        Car[] actual = garage.findCarsByModel("Benz");
        Car[] expected = {cars[1]};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompany() {
        // find car by company
        Car[] actual = garage.findCarsByCompany("VW");
        Car[] expected = {cars[2]};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
        // find car by min engine and max engine
        garage.printCar();
        Car[] actual = garage.findCarsByEngine(1.0, 2.2);
        Car[] expected = {cars[3], cars[1]};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColor() {
        // find car by color
        Car[] actual = garage.findCarsByColor("Red");
        Car[] expected = {cars[3]};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

}