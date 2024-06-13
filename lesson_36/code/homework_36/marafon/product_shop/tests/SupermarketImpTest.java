package homework_36.marafon.product_shop.tests;

import homework_36.marafon.product_shop.dao.Supermarket;
import homework_36.marafon.product_shop.dao.SupermarketImpl;
import homework_36.marafon.product_shop.model.MeatFood;
import homework_36.marafon.product_shop.model.MilkFood;
import homework_36.marafon.product_shop.model.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SupermarketImpTest {

    Supermarket supermarket;
    Food[] foods;

    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl(5);
        foods = new Food[4];

        foods[0] = new Food("Cheese", 50, 1000L, "2024-06-20");
        foods[1] = new Food("Avakado", 30, 1001L, "2024-04-15");
        foods[2] = new MeatFood("Sosages", 20, 1002L, "2024-04-10", "biff");
        foods[3] = new MilkFood("Milk", 15, 1003L, "2024-04-05", "cow", 3.5);

        // необходимо добавить элементы массива в Supermarket
        for (int i = 0; i < foods.length; i++) {
            supermarket.addFood(foods[i]);
        }
    }

    @Test
    void addFood() {
        // нельзя добавить null
        assertFalse(supermarket.addFood(null));

        // нельзя добавить второй раз уже имеющийся food
        assertFalse(supermarket.addFood(foods[1]));

        // добавляем food
        Food food = new Food("Meat", 18.50, 1004L, "2024-06-30");
        assertTrue(supermarket.addFood(food));

        // проверяем кол-во после добавления
        assertEquals(5, supermarket.quantity());
        System.out.println("-----------------------------------------------------");

        // нельзя превысить capacity
        Food food1 = new Food("Yogurt", 1.80, 1007L, "2024-06-05");
        assertFalse(supermarket.addFood(food1));
        supermarket.printFood();
        System.out.println("----------------------------------------------------");
    }

    @Test
    void removeFood() {
        assertEquals(foods[1], supermarket.removeFood(1001L));
        assertEquals(3, supermarket.quantity());
        supermarket.printFood();
        System.out.println("-----------------------------------------------------");
    }

    @Test
    void updateFood() {
        assertEquals(foods[2], supermarket.removeFood(1002L));
        assertEquals(3, supermarket.quantity());
        supermarket.printFood();
        System.out.println("-----------------------------------------------------");
    }

    @Test
    void findFood() {
        // find food with id = 1002L
        assertEquals(foods[2], supermarket.findFood(1002L));
        // find food with id = 1007L
        assertNull(supermarket.findFood(1007L));
        System.out.println("-----------------------------------------------------");
    }

    @Test
    void quantity() {
        assertEquals(4, supermarket.quantity());
    }

    @Test
    void totalCostOfFoods() {
        assertEquals(115, supermarket.totalCostOfFoods());
    }

    @Test
    void printFood() {
        supermarket.printFood();

    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("===================" + reportTitle + "=====================");

        // foreach
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testPrint() {
        printArray(foods, " list of foods ");
    }

    @Test
    void testNativeSorting() {
        printArray(foods, " list of foods as is ");
        Arrays.sort(foods); // sort native
        printArray(foods, " list of foods sorted by expDate "); // сравнение объектов по полю expDate
    }

}

