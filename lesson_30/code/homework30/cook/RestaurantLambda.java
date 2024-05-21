package homework30.cook;

public class RestaurantLambda {
    public static void main(String[] args) {
        Cook cookingProcess = () -> {
            System.out.println("Начали готовку");
            System.out.println("Закончили готовку");
        };
        Kitchen kitchen = new Kitchen();
        kitchen.makeOrder(cookingProcess);
    }
}
// https://github.com/SunnyCapt/java-core-lectures
// Karlen lessons