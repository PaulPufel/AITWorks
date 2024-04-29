package homework.pets.model;

import homework.pets.model.CatLeon;
import homework.pets.model.DogLeon;

public class PetApplLeon {
    public static void main(String[] args) {

        CatLeon cat = new CatLeon(1, "cat ", 2, "Murka", "brit", 5, 30);
        DogLeon dog = new DogLeon(2, "dog ", 3, "Redy", "pudel", 6, 40);

        cat.display();
        cat.voice();
        dog.display();
        dog.voice();

    }
}

