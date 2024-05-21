package classwork09.homework19;

// import java.util.concurrent.Callable;

public class Computer{
    private String vendor;
    private int price;
    private final String serialNumber;

    private static int count = 0;

    public Computer(String vendor, int price) {
        this.price = price;
        this.vendor = vendor;
        this.serialNumber = "1234567890" + 1234567890 + Computer.count;
        Computer.count += 1;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", price='" + price + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
