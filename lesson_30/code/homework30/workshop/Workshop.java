package homework30.workshop;

public class Workshop {
    public static void main(String[] args) {
        CarMechanic repairProcess = new CarMechanic() {
            @Override
            public void startRepair() {
                System.out.println("The car mechanic started repairing a car.");
                System.out.println("Changed the engine oil.");
                System.out.println("The brake pads were replaced.");
            }
        };
        CarRepair repair = new CarRepair();
        repair.makeOrder(repairProcess);
    }
}

