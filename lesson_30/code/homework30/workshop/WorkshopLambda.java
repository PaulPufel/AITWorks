package homework30.workshop;

public class WorkshopLambda {
    public static void main(String[] args) {
        CarMechanic repairProcess = () -> {
            System.out.println("The car mechanic started repairing a car.");
            System.out.println("Changed the engine oil.");
            System.out.println("The brake pads were replaced.");
        };
        CarRepair carRepair = new CarRepair();
        carRepair.makeOrder(repairProcess);
    }
}
