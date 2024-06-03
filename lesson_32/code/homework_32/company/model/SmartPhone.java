package homework_32.company.model;

public class SmartPhone extends Computer {

    private String operationSystem;

    public SmartPhone(String cpu, int ram, int ssd, String brand, long serialNumber, double price, boolean discount, String operationSystem) {
        super(cpu, ram, ssd, brand, serialNumber, price, discount);
        this.operationSystem = operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override  // переопределить
    public boolean calcPrice() {
        return true;
    }
}


