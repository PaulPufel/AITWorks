package homework30.workshop;

public class CarRepair {
    void makeOrder(CarMechanic repairProcess) {
        System.out.println("The car mechanic got an order.");

        repairProcess.startRepair();
        System.out.println("Car repair completed!");
    }
}
