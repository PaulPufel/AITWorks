package homework_36.marafon.product_shop.dao;

import homework_36.marafon.product_shop.model.Food;

public class SupermarketImpl implements Supermarket {
    // fields
    private Food[] foods;
    private int size;

    // конструктор
    public SupermarketImpl(int size) {
        this.foods = new Food[size];
        this.size = 0;
    }

    @Override
    public boolean addFood(Food food) {
        if (food == null || size == foods.length || findFood(food.getBarCode()) != null) {
            return false;
        }
        foods[size++] = food;
        return true;
    }


    @Override
    public Food removeFood(long barCode) {
        for (int i = 0; i < size; i++) {
            if (foods[i].getBarCode() == barCode) {
                Food victim = foods[i];
                foods[i] = foods[--size];
                foods[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Food findFood(long barCode) {
        for (int i = 0; i < size; i++) {
            if (foods[i].getBarCode() == barCode) {
                return foods[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }


    @Override
    public double totalCostOfFoods() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (foods[i] instanceof Food) {
                Food food = (Food) foods[i];
                res += food.getPrice();
            }
        }
        return res;
    }

    @Override
    public void printFood() {
        for (int i = 0; i < size; i++) {
            System.out.println(foods[i]);
        }
    }

    @Override
    public Food updateFood(long barCode, String secondName) {
        // перебираем всех employee
        for (Food food : foods) {
            // найти по barCode
            if (food.getBarCode() == barCode) {
                // использовать setter secondName
                return food;  // object type Product
            }
        }
        return null;
    }
}



