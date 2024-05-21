package classwork15.person;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


    public void sayHello() {
        System.out.println("Hi!");
    }
}

class PersonMain {
    public static void main(String[] args) {
        Person karl = new Person("Karl") {

            @Override
            public void sayHello() {
                System.out.println("Hello!");

            }
        };
        karl.sayHello();

        Person max = new Person("Max");
        max.sayHello();
    }
}