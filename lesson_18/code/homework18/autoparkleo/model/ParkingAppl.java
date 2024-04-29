package homework18.autoparkleo.model;

import homework18.autoparkleo.model.Vehicle;

public class ParkingAppl {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Vehicle(3, 12);
        vehicles[1] = new Vehicle(3, 6);
        vehicles[2] = new Vehicle(3, 24);
        vehicles[3] = new Vehicle(3, 30);
        vehicles[4] = new Vehicle(3, 20);

        double totalAreaForParking = getArea(vehicles);
        System.out.println("Area for parking = " + totalAreaForParking);

    }

    private static double getArea(Vehicle[] vehicles) {
        double totalAreaForParking = 0;
        for (int i = 0; i < vehicles.length; i++) {
            totalAreaForParking += vehicles[i].getArea();
        }
        return totalAreaForParking;
    }
}