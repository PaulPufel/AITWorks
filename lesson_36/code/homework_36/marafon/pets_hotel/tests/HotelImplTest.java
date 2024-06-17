package homework_36.marafon.pets_hotel.tests;

import homework_36.marafon.pets_hotel.dao.Hotel;
import homework_36.marafon.pets_hotel.dao.HotelImpl;
import homework_36.marafon.pets_hotel.model.Pet;
import homework_36.marafon.pets_hotel.model.Cat;
import homework_36.marafon.pets_hotel.model.Dog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HotelImplTest {
    Hotel hotel;
    Pet[] pets;

    @BeforeEach
    void setUp() {
        hotel = new HotelImpl(5);
        pets = new Pet[4];
        pets[0] = new Cat(1, "Siamese", "Palli", 12, 17, "calm");
        pets[1] = new Dog(2, "Labrador", "Rubbi", 8, 20, "morning");
        pets[2] = new Pet(3, "Rabbit", "Jora", 3, 10);
        pets[3] = new Cat(4, "Persian", "Murka", 5, 17, "aggressive");

        // необходимо добавить элементы массива в Hotel
        for (int i = 0; i < pets.length; i++) {
            hotel.addPet(pets[i]);
        }
    }

    @Test
    void addPet() {
        // нельзя добавить null
        assertFalse(hotel.addPet(null));

        // нельзя добавить второй раз уже имеющийся pet
        assertFalse(hotel.addPet(pets[1]));

        // добавляем pet
        Pet pet = new Pet(5, "Hamster", "Gabbi", 2, 18);
        assertTrue(hotel.addPet(pet));

        // проверяем кол-во после добавления
        assertEquals(5, hotel.quantity());
        System.out.println("-----------------------------------------------------");

        // нельзя превысить capacity
        Pet pet1 = new Pet(7, "Labrador", "Bars", 5, 20);
        assertFalse(hotel.addPet(pet1));
        hotel.printPet();
        System.out.println("----------------------------------------------------");
    }

    @Test
    void removePet() {
        assertEquals(pets[1], hotel.removePet(2));
        assertEquals(3, hotel.quantity());
        hotel.printPet();
        System.out.println("-----------------------------------------------------");
    }

    @Test
    void findPet() {
        // find pet with id = 2
        assertEquals(pets[2], hotel.findPet(3));
        // find pet with id = 7
        assertNull(hotel.findPet(7));
        System.out.println("-----------------------------------------------------");
    }

    @Test
    void quantity() {
        assertEquals(4, hotel.quantity());
    }

    @Test
    void totalCostOfHotel() {
        assertEquals(64, hotel.totalCostOfHotel());
    }

    @Test
    void printPet() {
        hotel.printPet();

    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("===================" + reportTitle + "=====================");

        // foreach
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testPrint() {
        printArray(pets, " list of pets ");
    }

    @Test
    void testNativeSorting() {
        printArray(pets, " list of pets as is ");
        Arrays.sort(pets); // sort native
        printArray(pets, " list of pets sorted by species "); // сравнение объектов по полю species
    }

}