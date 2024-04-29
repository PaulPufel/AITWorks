package classwork09.homework19;

class Main {
    public static void main(String[] args) {
        Computer[] computers = {
                new Computer("ASUS", 2000),
                new Computer("Apple", 3000),
                new Computer("Samsung", 4000),
        };
        ComputerShop computerShop = new ComputerShop(computers, "Karl's techno shop");

        System.out.println(computerShop);
        computerShop.showAllComputers();
        Computer boughtComputer = computerShop.buy(5000, "123456789012345678902");
        System.out.println("Bought computer: " + boughtComputer);
    }
}
