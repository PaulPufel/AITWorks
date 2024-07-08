package homework_45.institute;

// В приложении DekanatAppl создать студентов из разных стран, которые учатся на разных курсах, в разных группах.
// Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
// Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?

// Дополнительное задание (*): добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.

import classwork_44.users.User;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DekanatAppl {
    public static void main(String[] args) {

        //  создать список студентов

        System.out.println("================================== Список студентов =====================================");

        List<Student> studentList = Arrays.asList(
                new Student(1, "Alex", "Müller", "19.12.2000", "Mathematics", 1, "Germany", "male"),
                new Student(2, "Anna", "Mayer", "21.11.1999", "Physics", 2, "Germany", "female"),
                new Student(3, "Julia", "Andreeva", "02.04.2001", "Biology", 3, "Russia", "female"),
                new Student(4, "Max", "Schneider", "13.11.2002", "Mathematics", 1, "Austria", "male"),
                new Student(5, "Yaroslav", "Petrenko", "09.12.1998", "Physics", 2, "Ukraine", "male"),
                new Student(6, "Olesia", "Petrenko", "04.10.2002", "Mathematics", 1, "Ukraine", "female"),
                new Student(7, "John", "Smith", "09.06.2003", "Economy", 4, "USA", "male"),
                new Student(8, "Eva", "Johnson", "07.01.2004", "Economy", 4, "USA", "female"),
                new Student(9, "Andrey", "Volkov", "29.11.2002", "Physics", 2, "Russia", "male"),
                new Student(10, "Sophie", "Wagner", "04.02.2001", "Biology", 3, "Austria", "female")

        );

        for (Student student : studentList) {
            System.out.println(student);
        }

        // Список студентов по курсам
        System.out.println("============================= Список студентов по курсам ================================");
        Map<String, List<Student>> studentsByCourse = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse));

        studentsByCourse.forEach((course, students) -> {
            System.out.println("Students of the course: " + course);
            students.forEach(System.out::println);
            System.out.println("-------------------------------------------------------------------------------------");
        });

        // Список студентов по группам
        System.out.println("=========================== Список студентов по группам =================================");
        Map<Integer, List<Student>> studentsByGroup = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroupNum));

        studentsByGroup.forEach((group, students) -> {
            System.out.println("Students in the group: " + group);
            students.forEach(System.out::println);
            System.out.println("-------------------------------------------------------------------------------------");
        });

        // Сортировка студентов по фамилии
        System.out.println("============================= Сортировка студентов по фамилии ===========================");
        List<Student> sortedByLastName = studentList.stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .collect(Collectors.toList());
        sortedByLastName.forEach(System.out::println);


        // Сортировка студентов по дате рождения
        System.out.println("======================== Сортировка студентов по дате рождения ==========================");
        List<Student> sortedByBirtDate = studentList.stream()
                .sorted(Comparator.comparing(Student::getBirtDay))
                .collect(Collectors.toList());
        sortedByBirtDate.forEach(System.out::println);

        // Средний возраст студентов
//        System.out.println("=============================== Средний возраст студентов ===============================");
//        double averageAgeStudents = studentList.stream().mapToDouble(Student::getAge).average().orElse(0.0);
//        System.out.println("Average age of students: " + averageAgeStudents);

        // Средний возраст студентов по курсу
//        System.out.println("======================== Средний возраст студентов по курсу =============================");
//        Map<String, Double> averageAgeStudentsByCourse = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(Student::getAge)));
//        System.out.println("Average age of students by course: " + averageAgeStudentsByCourse);
//

        // Сортировка студентов по фамилии и возрасту
        System.out.println("======================= Сортировка студентов по фамилии и возрасту ======================");
        List<Student> sortedByLastNameAndAge = studentList.stream()
                .sorted(
                        Comparator.comparing(Student::getLastName)
                                .thenComparing(Student::getBirtDay))
                .collect(Collectors.toList());
        System.out.println("Students sorted by last name and age: ");
        sortedByLastNameAndAge.forEach(System.out::println);


        // Сортировка студентов по количеству мужчин и женщин
        System.out.println("=================== Сортировка студентов по количеству мужчин и женщин ==================");
        countGender(studentList);

    }

    private static void countGender(List<Student> students) {
        long maleCount = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("male"))
                .count();
        System.out.println("Number of males: " + maleCount);

        long femaleCount = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .count();
        System.out.println("Number of females: " + femaleCount);

    }
}