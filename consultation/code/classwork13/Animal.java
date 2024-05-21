package classwork13;

public class Animal {

    static String kind;
    String name;

}

class Cat extends Animal {
    static String kind = "cat";
    static final String TYPE = "cat";


    public Cat(String name) {
        this.name = name;
        String TYPE = "cat";
    }
}

class Dog extends Animal {
    static String kind = "dog";

    public Dog(String name) {
        this.name = name;
    }
}