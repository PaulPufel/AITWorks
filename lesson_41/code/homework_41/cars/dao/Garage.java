package homework_41.cars.dao;

// Задание 1.
// Реализовать приложение Garage согласно UML-схеме.

import homework_41.cars.model.Car;

public interface Garage {

    boolean addCar(Car car);

    Car removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Car[] findCarsByModel(String model);

    Car[] findCarsByCompany(String company);

    Car[] findCarsByEngine(double min, double max);

    Car[] findCarsByColor(String color);

    void printCar();

    int quantity();
}
