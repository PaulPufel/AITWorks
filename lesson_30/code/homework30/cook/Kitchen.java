package homework30.cook;

public class Kitchen {
    void makeOrder(Cook cookingProcess) {
        System.out.println("The kitchen got an order");
        // Вызовём процесс начала готовки
        cookingProcess.startCooking();
        System.out.println("The kitchen prepared the order");
    }
}