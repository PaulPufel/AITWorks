package classwork24.stringexample24;

import java.util.Objects;

class StringBuilderExample {
    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder shoppingList = new StringBuilder();

        // Добавляем пункты в список покупок
        shoppingList.append("Молоко");
        shoppingList.append(", Яйца");
        shoppingList.append(", Хлеб");
        shoppingList.append(", Шоколад");

        // Выведем итоговый список покупок
        System.out.println(
                "Список покупок: " + shoppingList.toString()
        );
    }
}


class StringExample {
    public static void main(String[] args) {
        // Создаем пустую строку
        String shoppingList = "";

        // Добавляем пункты в список покупок
        shoppingList = shoppingList + "Молоко";
        shoppingList = shoppingList + ", Яйца";
        shoppingList = shoppingList + ", Хлеб";
        shoppingList = shoppingList + ", Шоколад";

        // Выводим итоновый список покупок
        System.out.println(
                "Список покупок: " + shoppingList
        );
    }
}


class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();  // ""

        str.append("a");  // "a"
        str.append(" cat");  // "a cat"
        str.insert(0, "I have ");  // "I have a cat"

        str.delete(7, 9);  // "I have cat"

        int i = str.indexOf("cat");
        str.delete(i, i + 3);  // "I have "

        int haveIndex = str.indexOf("have");
        str.replace(haveIndex, haveIndex + 4, "had");  // "I had "

        str.append("headache");  // "I had headache"

        System.out.println(str.toString());  // Выводим str

        // создаем новый объект StringBuilder содержащий
        // те же символы но в обратном порядке и выводим его
        System.out.println(str.reverse().toString());
    }
}


















