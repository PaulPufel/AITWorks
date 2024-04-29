package homework.pet;

import homework.pet.Cat;
import homework.pet.Dog;
import homework.pet.House;

public class HouseApplUmut {
    public static void main(String[] args) {

        House[] house = new House[5];

        house[0] = new Cat(1, "Cat", 5, "Palli", "Siamese", 3.5, 22.5);
        house[1] = new Cat(2, "Cat", 3, "Murka", "Persian", 4.5, 25.5);
        house[2] = new Cat(3, "Cat", 12, "Barsik", "Russian", 4.0, 20.5);
        house[3] = new Dog(1, "Dog", 2, "Rubbi", "Labrador", 30.5, 50.5);
        house[4] = new Dog(2, "Dog", 2, "Zhuchka", "Mongrel", 12.5, 30.5);

        for (int i = 0; i < house.length; i++) {
            System.out.println(house[i]);
            house[i].display();
        }

        for (int i = 0; i < house.length; i++) {
            System.out.println(house[i]);
            house[i].voice();
        }
    }
}
