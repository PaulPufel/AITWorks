package classwork_45.stream_string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cities {

    // Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
    // преобразуйте их в верхний регистр и выведите в алфавитном порядке.

    public static void main(String[] args) {

        List<String> cityList = Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bon", "Braunschweig");
        char firstLetter = 'b';

        List<String> result = filerCity(cityList, firstLetter);

        result.forEach(System.out::println);
    }

    private static List<String> filerCity(List<String> cityList, char firstLetter) {
      return cityList.stream()
              .filter(city->city.toLowerCase().startsWith(String.valueOf(firstLetter)))
              .map(String::toUpperCase)
              .sorted()
              .collect(Collectors.toList());

    }
}
