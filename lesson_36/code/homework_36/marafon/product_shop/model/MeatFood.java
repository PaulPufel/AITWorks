package homework_36.marafon.product_shop.model;

// Создать класс MeatFood расширяющий класс Food с полем private String meatType,
// которое хранит тип мяса из которого изготовлен продукт.

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(String name, double price, long barCode, String expDate, String meatType) {
        super(name, price, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

}
