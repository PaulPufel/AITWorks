package homework_46.hospital;

// Задание 2.
// Имеется класс Doctor, в котором инкапсулированы поля: String name — имя врача. String[] specialties — специализации,
// в которых он работает (хирургия, кардиология и т.д.).

// Необходимо ответить на вопросы:
// Какие специализации есть у каждого врача?
// Какие специализации наиболее популярны среди врачей в клинике?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DoctorAppl {
    public static void main(String[] args) {

        List<Doctor> doctors = getDoctors(); // заполняем список doctors

        System.out.println("============ Print all Doctors =========");
        printMostSkilledDoctors(doctors);

        printMostPopularSpecialties(doctors);


    } // end of main

    private static void printMostPopularSpecialties(List<Doctor> doctors) {
        Iterable<String> specialties = doctors.stream()
                .map(p -> p.getSpecialties())
                .flatMap(t -> Arrays.stream(t))
                .collect(Collectors.toList());

        System.out.println("============== List of specialties ============");
        StreamSupport.stream(specialties.spliterator(), false)
                .distinct()
                .forEach(System.out::println);

        System.out.println("========== Grouping by number of specialties ===========");
        Map<String, Long> techFrequency = doctors.stream()
                .map(Doctor::getSpecialties)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));

        System.out.println(techFrequency);

        System.out.println("========== Grouping by max number of specialties ===========");
        Long max = techFrequency.values().stream()
                .max(Long::compare).orElse(0L);

        techFrequency.entrySet().stream()
                .filter(e -> max.equals(e.getValue())) // взяли только тех, у кого = max
                .forEach(e -> System.out.println(e.getKey()));

    }

    private static void printMostSkilledDoctors(List<Doctor> doctors) {
        Map<Integer, List<Doctor>> skilledDoctors = doctors.stream()
                .collect(Collectors.groupingBy(p -> p.getSpecialties().length));

        Integer max = skilledDoctors.keySet().stream()
                .max(Integer::compareTo).orElse(0);

        max = 0;
        for (Doctor doctor : doctors) {
            int key = doctor.getSpecialties().length;
            max = key > max ? key : max;
            skilledDoctors.putIfAbsent(key, new ArrayList<>());
            List<Doctor> doctorList = skilledDoctors.get(key);
            doctorList.add(doctor);
        }
        System.out.println(skilledDoctors);

    }

    private static List<Doctor> getDoctors() {
        return List.of(
                new Doctor("Peter", "Surgery", "Cardiology", "Therapist", "Oncologist"),
                new Doctor("John", "Neurologist", "Ophthalmologist"),
                new Doctor("Helen", "Gynecologist", "Dermatologist", "Cosmetologist", "Therapist", "Allergist"),
                new Doctor("Jacob", "Therapist", "Allergist"),
                new Doctor("Mikhail", "Therapist", "Physiotherapist", "Pediatrician"),
                new Doctor("Otto", "Psychiatrist", "Allergist")
        );
    }

}  // end of class





