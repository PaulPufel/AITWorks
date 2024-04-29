package homework22;

/*  Задача 1.
1.Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
   Выполнить практикум с этой строкой:
2. Распечатать последний символ строки.
3. Найти позицию подстроки “Java” в строке.
4. Проверить, содержит ли заданная строка подстроку “Java”.
5. Заменить все символы “o” на “a”.
6. Преобразуйте строку к верхнему регистру.
7. Преобразуйте строку к нижнему регистру.
8. Вырезать подстроку Java c помощью метода substring().
9. Проверить, заканчивается ли строка подстрокой “!!!”.
10.Проверить, начинается ли строка подстрокой “I'm proud”.
 */

public class StringsPractice {
    public static void main(String[] args) {
        // 1.Дана строка
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);
        System.out.println("---------------------------------------");

        // 2.Распечатать последний символ строки.
        // charAt
        char c = str.charAt(str.length() - 1); // last symbol
        System.out.println("Последний символ строки: " + c);
        System.out.println("-----------------------------------------");

        // 3.Найти позицию подстроки “Java” в строке.
        int index = str.indexOf("Java"); // с какого индекса начинается слово
        System.out.println("Позиция подстроки “Java” в строке: " + index);
        System.out.println("-----------------------------------------");

        // 4.Проверить, содержит ли заданная строка подстроку “Java”
        // number of word Java
        String[] words = str.split("Java");
        System.out.println("Number of word “Java” = " + words.length);
        System.out.println("-----------------------------------------");

        // 4.Проверить, содержит ли заданная строка подстроку “Java”
        String substring = "Java";
        if (str.contains(substring)) {
            System.out.println("The string contains the substring 'Java'");
        } else {
            System.out.println("The string does not contains the 'Java' substring");
        }
        System.out.println("-----------------------------------------");

        // 5.Заменить все символы “o” на “a”.
        System.out.println(str.replace('o', 'a'));
        System.out.println(str);
        System.out.println("-----------------------------------------");

        // 6.Преобразуйте строку к верхнему регистру.
        // toUpperCase
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        // 7.Преобразуйте строку к нижнему регистру.
        // toLowerCase
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);
        System.out.println("-----------------------------------------");

        // 8.Вырезать подстроку Java c помощью метода substring().
        // subString
        System.out.println(str.substring(19, 29));
        System.out.println("-----------------------------------------");

        // 9.Проверить, заканчивается ли строка подстрокой “!!!”.
        index = str.indexOf("!!!");
        System.out.println("Строка заканчивается подстрокой “!!!” на " + index + " индексе.");
        System.out.println("-----------------------------------------");

        // 10.Проверить, начинается ли строка подстрокой “I'm proud”.
        index = str.indexOf("I'm proud");
        String s = "а н";
        System.out.println("Строка начинается подстрокой “I'm proud” на " + index + " индексе.");
        System.out.println("-----------------------------------------");
    }
}


