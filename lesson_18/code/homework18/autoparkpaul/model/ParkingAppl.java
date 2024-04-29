package homework18.autoparkpaul.model;

import homework18.autoparkpaul.model.Vehicle;

public class ParkingAppl {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Vehicle(8, 3.5);
        vehicles[1] = new Vehicle(10, 3.7);
        vehicles[2] = new Vehicle(12, 4);
        vehicles[3] = new Vehicle(20, 4.5);
        vehicles[4] = new Vehicle(30, 5);

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