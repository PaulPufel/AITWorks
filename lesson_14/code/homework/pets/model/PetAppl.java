package homework.pets.model;

import homework.pets.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet(1, "Cat", "Palli", 12);
        Pet pet2 = new Pet(2, "Dog", "Rubbi", 2);
        Pet pet3 = new Pet(3, "Rabbit", "Jora", 3);

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        pet1.walk();
        pet2.sleep();
        pet3.eat();

        System.out.print(pet2.getNickname());
        pet2.wakeup();
    }
}
