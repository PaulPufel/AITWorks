package homework.pet;

public class Dog extends House {
    private String breed;
    private double weight;
    private double height;

    public Dog(int id, String typ, int age, String nickname, String breed, double weight, double height) {
        super(id, typ, age, nickname);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }
    public void voice() {
    System.out.println("The dog barks: " + "Гав-гав!");
    }
}
