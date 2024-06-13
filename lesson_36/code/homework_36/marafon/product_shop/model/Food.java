package homework_36.marafon.product_shop.model;

/* Создать класс Food
   с полями:
   private String name
   private double price
   private long barCode
   private String expDate
   искать продукты по сроку годности (алфавитный порядок) */

import java.util.Objects;

public class Food implements Comparable<Food>{

    private String name;
    private double price;
    private long barCode;
    private String expDate;

    public Food(String name, double price, long barCode, String expDate) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
        this.expDate = expDate;
    }
    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Food");
        sb.append(", name: ").append(name);
        sb.append(", price: ").append(price);
        sb.append(" barCode: ").append(barCode);
        sb.append(" expDate: ").append(expDate);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        return barCode == food.barCode && Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, barCode);
    }


    @Override
    public int compareTo(Food o) {
        int res = this.expDate.compareTo(o.expDate);   // сравнение объектов по сроку годности (полю expDate)
        return res;
    }
}
