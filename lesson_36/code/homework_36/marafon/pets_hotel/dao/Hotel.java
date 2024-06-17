package homework_36.marafon.pets_hotel.dao;
// Марафон:
// Во всех класcах должен быть некий id (штрих-код, isbn и т.д.)
// По методам - должны быть CRUD-операции: С - create R - read, find U - update (не обязательно), D - delete, remove
// Pets (Cat, Dog) - Hotel, стоимость пребывания, выручка от отеля, найти по породе

import homework_36.marafon.pets_hotel.model.Pet;

public interface Hotel {
    /*       В class interface:
    - добавить животное addPet
    - удалить животное removePet
    - найти животное findPet
    - кол-во животных quantity
    - выручка от отеля totalCostOfHotel
    - напечатать список животных printPet */

    boolean addPet(Pet pet);

    Pet removePet(int id);

    Pet findPet(int id);

    int quantity();

    double totalCostOfHotel();

    void printPet();

}

