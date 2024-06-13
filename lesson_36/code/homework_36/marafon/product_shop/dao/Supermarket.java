package homework_36.marafon.product_shop.dao;

// Марафон:
// Во всех класcах должен быть некий id (штрих-код, isbn, barCode и т.д.)
// По методам - должны быть CRUD-операции: С - create R - read, find U - update (не обязательно), D - delete, remove
// Product (Food, MeatFood, MilkFood) - Supermarket
// искать продукты по сроку годности (алфавитный порядок)

import homework_36.marafon.product_shop.model.Food;

/*       В class interface:
    - добавить продукт addFood
    - удалить продукт removeFood
    - найти продукт findFood
    - кол-во продуктов quantity
    - объем продаж totalCostOfFoods
    - обновить продукт updateFood
    - напечатать список продуктов printFood */

public interface Supermarket {

    boolean addFood(Food food);

    Food removeFood(long barCode);

    Food findFood(long barCode);

    int quantity();

    double totalCostOfFoods();

    void printFood();

    Food updateFood(long barCode, String secondName);

}
