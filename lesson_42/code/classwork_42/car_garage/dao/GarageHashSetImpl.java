package classwork_42.car_garage.dao;

import classwork_42.car_garage.model.Car;

import java.util.*;

public class GarageHashSetImpl implements Garage {

    // Comparator<Car>...
    // TODO

    private Set<Car> cars;
    private int capacity;

    // constructor
    public GarageHashSetImpl(int capacity) {
        cars = new HashSet<>();
        this.capacity = capacity;
    }

    // O(1)
    @Override
    public boolean addCar(Car car) {
        if (car == null || cars.size() == capacity) {
            return false;
        }
        if(cars.add(car)) {
            return true;
        } else {
            return false;
        }
    }

    // O(1)
    @Override
    public Car removeCar(String regNumber) {
        // find by regNumber
        Car car = findCarByRegNumber(regNumber);
        // remove
        cars.remove(car);
        return car;
    }

    // O(1)
    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (Car car : cars) {
            if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
        return null;
    }

    // O(n)
    @Override
    public Car[] findCarsByModel(String model) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if(car.getModel().equals(model)) {
                tempList.add(car);
            }
        }
        // TODO sort ArrayList
        Collections.sort(tempList);

        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

    // O(n)
    @Override
    public Car[] findCarsByCompany(String company) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if(car.getCompany().equals(company)) {
                tempList.add(car);
            }
        }

        Collections.sort(tempList);

        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

    // O(n)
    @Override
    public Car[] findCarsByColor(String color) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(color)) {
                tempList.add(car);
            }
        }

        Collections.sort(tempList);

        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

    // O(n)
    @Override
    public Car[] findCarsByEngine(double min, double max) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if(car.getEngine() > min && car.getEngine() < max) {
                tempList.add(car);
            }
        }

        Collections.sort(tempList);

        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;
    }

}
