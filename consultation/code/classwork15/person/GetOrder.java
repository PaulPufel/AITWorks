package classwork15.person;

public abstract class GetOrder {
    abstract void takeOrder();
}

class Main2 {
    public static void main(String[] args) {
        GetOrder getOrder = new GetOrder() {
            @Override
            void takeOrder() {
                System.out.println("I got the food");
            }
        };
        getOrder.takeOrder();
    }
}