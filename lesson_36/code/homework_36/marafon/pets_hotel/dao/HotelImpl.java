package homework_36.marafon.pets_hotel.dao;

import homework_36.marafon.pets_hotel.model.Pet;
import homework_36.marafon.product_shop.model.Food;

public class HotelImpl implements Hotel {
    // fields
    private Pet[] pets;
    private int size;

    // конструктор
    public HotelImpl(int size) {
        this.pets = new Pet[size];
        this.size = 0;
    }

    @Override
    public boolean addPet(Pet pet) {
        if (pet == null || size == pets.length || findPet(pet.getId()) != null) {
            return false;
        }
        pets[size++] = pet;
        return true;
    }

    @Override
    public Pet removePet(int id) {
        for (int i = 0; i < size; i++) {
            if (pets[i].getId() == id) {
                Pet victim = pets[i];
                pets[i] = pets[--size];
                pets[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Pet findPet(int id) {
        for (int i = 0; i < size; i++) {
            if (pets[i].getId() == id) {
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalCostOfHotel() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (pets[i] instanceof Pet) {
                Pet pet = (Pet) pets[i];
                res += pet.getCostOfHotel();
            }
        }
        return res;
    }


    @Override
    public void printPet() {
        for (int i = 0; i < size; i++) {
            System.out.println(pets[i]);
        }
    }
}




