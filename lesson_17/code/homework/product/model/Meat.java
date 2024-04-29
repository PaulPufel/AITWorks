package homework.product.model;

import homework.product.model.Food;

public class Meat extends Food {
    private String meatType;

    public Meat(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}