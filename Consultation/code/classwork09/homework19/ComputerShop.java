package classwork09.homework19;

public class ComputerShop {
    private Computer[] stock;
    private String shopName;

    public ComputerShop(Computer[] stock, String shopName) {
        this.stock = stock;
        this.shopName = shopName;
    }

    public Computer buy(int cash, String serialNumber) {
        Computer computer = null;

        for (int i = 0; i < this.stock.length; i++) {
            if (this.stock[i].getSerialNumber().equals(serialNumber)) {
                computer = this.stock[i];
                break;
            }
        }

        if (computer == null) {
            System.out.println("Компьютер не найден");
            return null;
        }

        if (computer.getPrice() > cash) {
            System.out.println("Денег не хватает");
            return null;
        }

        return computer;
    }

    public void showAllComputers() {
        for (Computer computer : this.stock) {
            System.out.println(computer);
        }
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "shopName='" + shopName + '\'' +
                '}';
    }
}


