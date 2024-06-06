package homework_32.company.computer_shop.model;

public class SmartPhone extends Computer {

    private String operationSystem;

    public SmartPhone(String cpu, int ram, int ssd, String brand, long serialNumber, double price, double discount, String operationSystem) {
        super(cpu, ram, ssd, brand, serialNumber, price, discount);
        this.operationSystem = operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


    @Override
    public boolean priceWithDiscount() {
        double calcPrice = getPrice() - getPrice() * getDiscount();
        return true;
    }
}

