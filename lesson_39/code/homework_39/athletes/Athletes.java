package homework_39.athletes;

// Задача 4.
// Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров, в котором зафиксированы:
// клуб,
// регистрационный номер спортсмена,
// фамилия,
// имя,
// результат в секундах.
// Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.

import java.util.Objects;

public class Athletes implements Comparable<Athletes> {

    private String sportClub;
    private int id;
    private String lastname;
    private String firstname;
    private double result;

    public Athletes(String sportClub, int id, String lastname, String firstname, double result) {
        this.sportClub = sportClub;
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.result = result;
    }

    public String getSportClub() {
        return sportClub;
    }

    public void setSportClub(String sportClub) {
        this.sportClub = sportClub;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Athletes{" +
                "sportClub='" + sportClub + '\'' +
                ", id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athletes athletes)) return false;
        return id == athletes.id && Double.compare(result, athletes.result) == 0 && Objects.equals(sportClub, athletes.sportClub) && Objects.equals(lastname, athletes.lastname) && Objects.equals(firstname, athletes.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sportClub, id, lastname, firstname, result);
    }

    @Override
    public int compareTo(Athletes o) {
        int res = Double.compare(result, o.result); // сортировка по result
        return res;
    }
}
