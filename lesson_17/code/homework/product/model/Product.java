package homework.product.model;

/*  Задача 1.
   Создать класс Product, с полями:
   private double price
   private String name
   private long barCode;

   Создать класс Food расширяющий класс Product с полем private String expDate,
   которое хранит дату истечения срока годности.
   Создать класс MeatFood расширяющий класс Food с полем private String meatType,
   которое хранит тип мяса из которого изготовлен продукт.
   Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat,
   которые хранят тип молока и жирность продукта соответственно.
   Во всех классах переопределить метод toString.
   В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
   Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.*/

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }
    public void displayProduct() {
        System.out.println("Price: " + price + ", name" + name + ", bar code: " + barCode);
    }
}