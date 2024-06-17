package homework_36.marafon.pets_hotel.model;

import java.util.Objects;

public class Pet implements Comparable<Pet>{
    // fields
    private int id;
    private String species;
    private String nickname;
    private int age;
    private int costOfHotel;

    public Pet(int id, String species, String nickname, int age, int costOfHotel) {
        this.id = id;
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.costOfHotel = costOfHotel;
    }

    public int getId() {
        return id;
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

    public int getCostOfHotel() {
        return costOfHotel;
    }

    public void setCostOfHotel(int costOfHotel) {
        this.costOfHotel = costOfHotel;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", costOfHotel=" + costOfHotel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return id == pet.id && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname);
    }

    @Override
    public int compareTo(Pet o) {
        int res = this.species.compareTo(o.species);   // сравнение объектов по породе
        return res;
    }
}
