package classwork28.interfaces;

public class AbstractExample1 {

}
// абстрактрый класс
abstract class Animal {
    abstract  void makeSound(); // абстрактрый метод
}

abstract class Creature {
    abstract void walk();
}

// множественное наследование в java запрещено
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("meow");
    }
}