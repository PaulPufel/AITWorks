package homework;

/*    Задача 2. Сделайте расчет покупки товаров со скидками.
Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
Вычислите итоговую стоимость покупки и величину полученной скидки.
 */

public class WorkShop2 {
    public static void main(String[] args) {
        double priceA = 47.0;
        double discountA = 10.0;
        double priceB = 46.0;
        double discountB = 5.0;

        int n = 2;
        int m = 3;

        double totalAmount = (priceA * n * (1 - discountA / 100)) + (priceB * m * (1 - discountB / 100));

        System.out.println("Total Amount " + totalAmount);

        if (totalAmount > 100.0){
            totalAmount *= 0.95;

            double totalDiscount = (priceA * discountA * n / 100) + (priceB * discountB * m /100);
        }

        System.out.println("Итоговая стоимость покупки: " + totalAmount + " Euro");
        //System.out.println("Полученная скидка: " + totalDiscount + " Euro");

       }
    }

