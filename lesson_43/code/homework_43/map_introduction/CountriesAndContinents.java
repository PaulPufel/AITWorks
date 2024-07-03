package homework_43.map_introduction;

// Задание 1.
// Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли.
// Подсчитайте количество стран на континентах из полученного списка.

import java.util.*;

public class CountriesAndContinents {
    public static void main(String[] args) {

// Создадим Map, которая содержит наименование стран и континента

        // key - это continents, тип String
        // value - это countries, тип String

        System.out.println("List of continents:");

        Map<String, String> continents = new TreeMap<>(); // create object, type of object - TreeMap

        continents.put("Africa", "Angola");
        continents.put("Africa", "Botswana");
        continents.put("Africa", "Cameroon");
        continents.put("Africa", "Kenya");

        continents.put("Europe", "Germany");
        continents.put("Europe", "Belgium");
        continents.put("Europe", "France");
        continents.put("Europe", "Poland");
        continents.put("Europe", "Italy");

        continents.put("Asia", "Uzbekistan");
        continents.put("Asia", "China");
        continents.put("Asia", "Afghanistan");
        continents.put("Asia", "Kazakhstan");
        continents.put("Asia", "Mongolia");

        continents.put("Australia", "Kiribati");
        continents.put("Australia", "Samoa");
        continents.put("Australia", "Tonga");

        continents.put("America", "Canada");
        continents.put("America", "Mexico");
        continents.put("America", "United States");


        System.out.println(continents.size());

        // 1st approach
        int countries = 0;
        for (String countrie : continents.keySet() ) {
                 if(continents.get(countries).equals("Countries")){
                countries++;
            }
        }
        System.out.println("Countries = " + countries);

        // print map
        System.out.println("============= Print Map ==================");
        Set<String> keys = continents.keySet();
        for (String str : keys) {
            System.out.println(str + " name of continents");
        }

        // print map using Entry
      Set<Map.Entry<String, String>> entries = continents.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

