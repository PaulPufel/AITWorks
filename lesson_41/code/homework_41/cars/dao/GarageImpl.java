package homework_41.cars.dao;

import homework_41.cars.model.Car;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;

    // constructor
    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber() == regNumber) {
                Car victim = cars[i];
                cars[i] = cars[--size];
                cars[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber() == regNumber) {
                return cars[i];
            }
        }

        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getModel() == model) {
                return new Car[]{cars[i]};
            }
        }
        return cars;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getCompany() == company) {
                return new Car[]{cars[i]};
            }
        }

        return cars;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getEngine() > min && cars[i].getEngine() < max) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (cars[i].getEngine() > min && cars[i].getEngine() < max) {
                res[j++] = cars[i];
            }
        }
        return res;
    }


    @Override
    public Car[] findCarsByColor(String color) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor() == color) {
                return new Car[]{cars[i]};
            }
        }

        return cars;
    }


    @Override
    public void printCar() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }

    @Override
    public int quantity() {
        return size;
    }

}
