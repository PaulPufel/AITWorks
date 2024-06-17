package homework_36.marafon.pets_hotel.model;

public class Cat extends Pet {

    private String character;

    public Cat(int id, String species, String nickname, int age, int hotelCost, String character) {
        super(id, species, nickname, age, hotelCost);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
