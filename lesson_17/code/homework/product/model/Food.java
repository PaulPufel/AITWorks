package homework.product.model;

// Создать класс Food расширяющий класс Product с полем private String expDate,
// которое хранит дату истечения срока годности.
// Во всех классах переопределить метод toString.

public class Food extends Product {
    private String expDate;

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                '}';
    }

    public void display() {
        System.out.println();
    }
}