package homework;

/*    Задача 2. Сделайте расчет покупки товаров со скидками.
Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
Вычислите итоговую стоимость покупки и величину полученной скидки.
 */
public class WorkShop {
    public static void main(String[] args) {
        double dressEuro = 25.85;
        double dressDiscount = 10;
        double shoesEuro = 39.45;
        double shoesDiscount = 15;
        int consnant = 100;
        int dressEuroSt = 3;
        int shoesEuroSt = 2;
        int endDiscount = 5;

        double dressEuroEnd = (dressEuro / (int)consnant) * (int)dressDiscount;
        double dressPriceEnd = dressEuro - dressEuroEnd;
        System.out.println("Dress price with 10 % discount = " + dressPriceEnd + "Euro");

        double shoesEuroEnd = (shoesEuro / (int)consnant) * (int)shoesDiscount;
        double shoesPriceEnd = shoesEuro - shoesEuroEnd;
        System.out.println("Shoes price with 15 % discount = " + shoesPriceEnd + " Euro");

        double sumDress = dressPriceEnd * (int)dressEuroSt;
        System.out.println("Price of total number of dress = " + sumDress + " pieces.");

        double sumShoes = shoesPriceEnd * (int)shoesEuroSt;
        System.out.println("Price of total number of shoes = " + sumShoes + " pairs");

        double endSum = sumDress + sumShoes;
        System.out.println("Dress and shoes sum price = " + endSum + " Euro");

        // endSum > 100 Euro == 5% sale

        double endSumWith5 = (endSum / (int)consnant) * (int)endDiscount;
        System.out.println("End sum of products with 5% = " + endSumWith5);

        float finalPrice = (float) endSum - (float) endSumWith5;
        System.out.println("Final purchase price = " + finalPrice + " Euro");

    }//end of mail

}//end 0f class
