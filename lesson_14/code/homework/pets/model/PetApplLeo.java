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

public class PetApplLeo {
        public static void main(String[] args) {

            PetLeon p1 = new PetLeon(1, "Cat", 5, "Boomer");
            PetLeon p2 = new PetLeon(2, "Dog", 3, "Zinger");
            PetLeon p3 = new PetLeon(3, "Snake", 2, "Eva");
            PetLeon p4 = new PetLeon(4, "Parrot", 6, "Borja");
            PetLeon p5 = new PetLeon(5, "Spider", 2, "Luna");

           /* p1.sleep();
            p2.isEating();
            p3.makeSound();
            p4.isPlay();
            p5.isWalk(); */
        }
    }
