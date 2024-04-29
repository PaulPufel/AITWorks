package homework.pets.model;

public class DogLeon extends PetLeon {

    private String breed;
    private double weight;
    private double height;

    public DogLeon(int id, String kind, int age, String nickname, String breed, double weight, double height) {
        super(id, kind, age, nickname);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }

    public void voice() {
        System.out.println("Gav, gav!");
    }

}
