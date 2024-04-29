package homework.pet;

public class Cat extends House {
    private String breed;
    private double weight;
    private double height;

    public Cat(int id, String typ, int age, String nickname, String breed, double weight, double height) {
        super(id, typ, age, nickname);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }

    public void voice() {
        System.out.println("The cat meows: " + "Мяу-мяу!");
    }

}
