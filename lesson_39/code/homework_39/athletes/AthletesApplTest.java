package homework_39.athletes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AthletesApplTest {

    public static void main(String[] args) {

        List<Athletes> athletesList = new ArrayList<>();

        Athletes athletes = new Athletes("Parus", 1, "Wagner", "Alex", 7.43);

        athletesList.add(athletes);

        athletesList.add(new Athletes("Kosmos", 2, "Schmidt", "Otto", 8.01));
        athletesList.add(new Athletes("Werder", 3, "Meier", "Frank", 7.11));
        athletesList.add(new Athletes("Mercedes", 4, "Sommer", "Peter", 8.10));
        athletesList.add(new Athletes("Nord", 5, "Knol", "Sergej", 7.55));
        athletesList.add(new Athletes("Bosch", 6, "Gottre", "Michael", 7.05));
        athletesList.add(new Athletes("Tokio", 7, "Fuchs", "Sebastian", 8.24));
        athletesList.add(new Athletes("Gold", 8, "Albert", "Johan", 8.08));
        athletesList.add(new Athletes("Dortmund", 9, "Zander", "Waldemar", 6.59));
        athletesList.add(new Athletes("Adler", 10, "Ertel", "Claus", 8.35));

        int size = athletesList.size();
        System.out.println("Number of athletes = " + size);

        System.out.println(" ------------------------ List of athletes' names ----------------------------");
        for (Athletes a : athletesList) {
            System.out.println(a);
        }

        athletesList.sort(Athletes::compareTo);
        System.out.println(" -------------------------- Sorted by result list   ---------------------------");
        for (Athletes a : athletesList) {
            System.out.println(a);
        }

        Comparator<Athletes> athletesComparator = new Comparator<Athletes>() {
            @Override
            public int compare(Athletes o1, Athletes o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        };

        System.out.println("------------------------------ Sorting by name ----------------------------------");
        athletesList.sort(athletesComparator);
        for (Athletes a : athletesList) {
            System.out.println(a);
        }
    }
}

