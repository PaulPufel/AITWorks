package homework_45.institute;

//  Задача 1. Создать класс Student с полями:

// id,
// firstName,
// lastName,
// birtDay,
// course,
// groupNum (номер группы),
// country,
// gender(пол).
// В приложении DekanatAppl создать студентов из разных стран, которые учатся на разных курсах, в разных группах.
// Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
// Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?

// Дополнительное задание (*): добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.

import java.util.Objects;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String birtDay;
    private String course;
    private int groupNum;   // (номер группы),
    private String country;
    private String gender;  // (пол).


    public Student(int id, String firstName, String lastName, String birtDay, String course, int groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && groupNum == student.groupNum && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, groupNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDay='" + birtDay + '\'' +
                ", course='" + course + '\'' +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
