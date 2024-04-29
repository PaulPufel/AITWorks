package homework.product.model;

//   В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
//   Создать метод печатающий все продукты из массива,
//   и метод возвращающий сумму цен всех продуктов.

import homework.product.model.Meat;
import homework.product.model.Milk;
import homework.product.model.Product;

public class ProductsAppl {
    public static void main(String[] args) {

        Product[] prod = new Product[2];
        prod[0] = new Meat(9.90, ", Meat", 1364876595, ", 15.05.2024", ", Beef");
        prod[1] = new Milk(1.15, ", Milk", 158254678, ", 26.04.2024", ", Weide Milch", 3.5);

        double totalPrice = getTotalPrice(prod);
        System.out.println("Total price: " + totalPrice);


        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i]);
            prod[i].displayProduct();
        }
    } // end of main

    private static double getTotalPrice(Product[] prod) {
        double res = 0;
        for (int i = 0; i < prod.length; i++) {
            res += prod[i].getPrice();
        }
        return res;
    }
} // end of class