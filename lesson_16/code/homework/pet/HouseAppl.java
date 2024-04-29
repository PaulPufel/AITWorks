package homework.pet;

/* Задача 1.
Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес.
Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
Создайте HouseAppl, в котором есть метод main.
Поселите в доме 2 собаки и 3 кошки.
Смоделируйте жизнь в этом доме в течение дня. */

import homework.pet.Cat;
import homework.pet.Dog;

public class HouseAppl {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1, "Cat", 5, "Palli", "Siamese", 3.5, 22.5);
        Cat cat2 = new Cat(2, "Cat", 3, "Murka", "Persian", 4.5, 25.5);
        Cat cat3 = new Cat(3, "Cat", 12, "Barsik", "Russian", 4.0, 20.5);
        Dog dog1 = new Dog(1, "Dog", 2, "Rubbi", "Labrador", 30.5, 50.5);
        Dog dog2 = new Dog(2, "Dog", 2, "Zhuchka", "Mongrel", 12.5, 30.5);

        cat1.display();
        cat1.voice();
        cat2.display();
        cat2.voice();
        cat3.display();
        cat3.voice();

        dog1.display();
        dog1.voice();
        dog2.display();
        dog2.voice();

        cat1.isSleep();
        cat2.isEating();
        cat3.makeSound();
        dog1.isPlay();
        dog2.isWalk();

    }

}


