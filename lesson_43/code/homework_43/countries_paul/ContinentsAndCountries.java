package homework_43.countries_paul;

// Задание 1.
// Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли.
// Подсчитайте количество стран на континентах из полученного списка.

import java.util.*;

public class ContinentsAndCountries {
    public static void main(String[] args) {

// Создадим Map, которая содержит наименование стран и континентов

        // key - это countries, тип String
        // value - это continents, тип String

        System.out.println("List of countries: ");

        Map<String, String> countriesMap = new TreeMap<>(); // create object, type of object - TreeMap

        countriesMap.put("Angola", "Africa");
        countriesMap.put("Botswana", "Africa");
        countriesMap.put("Cameroon", "Africa");
        countriesMap.put("Kenya", "Africa");

        countriesMap.put("Germany", "Europe");
        countriesMap.put("Belgium", "Europe");
        countriesMap.put("France", "Europe");
        countriesMap.put("Poland", "Europe");
        countriesMap.put("Italy", "Europe");

        countriesMap.put("Uzbekistan", "Asia");
        countriesMap.put("China", "Asia");
        countriesMap.put("Afghanistan", "Asia");
        countriesMap.put("Kazakhstan", "Asia");
        countriesMap.put("Mongolia", "Asia");

        countriesMap.put("Kiribati", "Australia");
        countriesMap.put("Samoa", "Australia");
        countriesMap.put("Tonga", "Australia");

        countriesMap.put("Canada", "North America");
        countriesMap.put("Mexico", "North America");
        countriesMap.put("United States", "North America");


        System.out.println(countriesMap.size());

        // print map
        System.out.println("========= Print Map (keys) - countries ===========");
        Set<String> keys = countriesMap.keySet();
        for (String str : keys) {
            System.out.println("Name of countries: " + str);
        }

        System.out.println("======== Print Map (values) - continents ==========");
        Collection<String> countries = countriesMap.values();
        for (String str : countries) {
            System.out.println("Name of continents: " + str);
        }

        // Calculate frequency - let's do next Map<String, Integer>

        Map<String, Integer> continentAndCountries = new HashMap<>();
        for (String continent : countriesMap.values()) { // проходим по всем значениям

            if (!continentAndCountries.containsKey(continent)) { // такое слово еще не встречалось
                continentAndCountries.put(continent, 1); // пишем в Map континент и 1
            } else {
                continentAndCountries.put(continent, continentAndCountries.get(continent) + 1);
            }
        }

        // распечатаем содержимое полученной Map
        System.out.println("======= Print Map Continent -> Number of Countries ========");
        Set<String> keySet = continentAndCountries.keySet();
        for (String key : keySet) {
            System.out.println(key + " -> " + continentAndCountries.get(key));
        }
    }
}


