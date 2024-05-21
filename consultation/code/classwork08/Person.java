package classwork08;

// надо написать класс, который будет описывать человека.
// Класс должен содержать следующую информацию: имя, возраст

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;

    public static int count = 0;

    public void sayHello() {
        System.out.println("Hi, my name is " + this.name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        Person.count += 1;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeOlder() {
        this.age += 1;
    }

    public boolean isOld() {
        return this.age > 70;
    }

    public String whoIs() {
        return this.name;
    }

    public String whoIs(String defaultName) {
        if (this.name.length() > 5) {
            return name;
        } else {
            return defaultName;
        }
    }

    public String whoIs(String defaultName, int a) {
        if (this.name.length() > 5) {
            return name;
        } else {
            return defaultName;
        }
    }

    public String whoIs(int a, String defaultName) {
        if (this.name.length() > 5) {
            return name;
        } else {
            return defaultName;
        }
    }
}


class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Karl", 99);
        Person person2 = new Person("Max", 150);
        Person person3 = new Person("Petr", 150);

        person1.sayHello();
        person2.sayHello();
        person3.sayHello();

        System.out.println("Count: " + Person.count);
        System.out.println("Age of person2: " + person2.getAge());
        person2.setAge(75);
        System.out.println("Age of person2: " + person2.getAge());
        person1.makeOlder();
        System.out.println("Age of person1: " + person1.getAge());

        boolean isPerson3Old = person3.isOld();
        System.out.println("is person 3 old: " + isPerson3Old);

        System.out.println(person2.whoIs());
        System.out.println(person2.whoIs("Noname"));
    }
}

