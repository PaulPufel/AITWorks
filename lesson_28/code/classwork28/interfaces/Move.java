package classwork28.interfaces;


interface Move {
    void move();
}

abstract class Animal2 implements Move { }

abstract class Transport implements Move { }

class Car extends Transport {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class People extends Animal2 {
    @Override
    public void move() {
        System.out.println("The person is moving");
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        People person1 = new People();

        Move[] animals = {person1, car1};

        for (Move thing: animals) {
            thing.move();
        }
    }
}