package homework.pets.model;
/* Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
id
вид
возраст
кличка

Стандартные методы:
конструктор на все поля;
геттеры и сеттеры на все поля;
метод toString.

Дополнительные методы:
спать
есть
делать звук
играть
гулять
В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день. */

public class Pet {
    // fields
    // Поля
    private int id;
    private String species;
    private String nickname;
    private int age;


    // constructor
    // конструктор


    public Pet(int id, String species, String nickname, int age) {
        this.id = id;
        this.species = species;
        this.nickname = nickname;
        this.age = age;
    }

    public Pet(int id, String spider, int i, String luna) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", species='" + species + '\'' + ", nickname='" + nickname + '\'' + ", age=" + age + '}';
    }

    public void walk() {
        System.out.println("The cat is walking.");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    public void eat() {
        System.out.println("The rabbit eats.");
    }

    public void wakeup() {
        System.out.println(" wake up, barks and wants walking.");
    }

    }




