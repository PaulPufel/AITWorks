package homework_36.marafon.product_shop.model;

//  Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat,
//   которые хранят тип молока и жирность продукта соответственно.

public class MilkFood extends Food {
        private String milkType;
        private double fat;

    public MilkFood(String name, double price, long barCode, String expDate, String milkType, double fat) {
        super(name, price, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

}
