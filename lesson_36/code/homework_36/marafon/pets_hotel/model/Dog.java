package homework_36.marafon.pets_hotel.model;

public class Dog extends Pet {

    private String walks;

    public Dog(int id, String species, String nickname, int age, int hotelCost, String walks) {
        super(id, species, nickname, age, hotelCost);
        this.walks = walks;
    }

    public String getWalks() {
        return walks;
    }

    public void setWalks(String walks) {
        this.walks = walks;
    }
}
