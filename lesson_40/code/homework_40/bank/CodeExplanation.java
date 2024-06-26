package homework_40.bank;

/*
Создание Java-приложения для ввода и хранения уникальных международных наименований валют можно осуществить
следующим образом. Мы будем использовать Set для хранения наименований валют, поскольку эта коллекция
автоматически гарантирует уникальность элементов.
 */

// Вот пример кода:

public class CodeExplanation {

/*
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class CurrencyManager {
        // Используем HashSet для хранения уникальных наименований валют
        private Set<String> currencies = new HashSet<>();

        // Метод для добавления новой валюты
        public boolean addCurrency(String currency) {
            // Проверяем, существует ли уже такая валюта
            if (currencies.contains(currency)) {
                return false; // В случае, если валюта уже есть в списке, возвращаем false
            } else {
                currencies.add(currency);
                return true; // Если добавление прошло успешно, возвращаем true
            }
        }

        // Метод для отображения всех валют
        public void displayCurrencies() {
            System.out.println("Current currencies:");
            for (String currency : currencies) {
                System.out.println(currency);
            }
        }

        public static void main(String[] args) {
            CurrencyManager currencyManager = new CurrencyManager();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter a currency code (or type 'exit' to quit):");
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals("EXIT")) {
                    break;
                }

                if (currencyManager.addCurrency(input)) {
                    System.out.println("Currency added successfully.");
                } else {
                    System.out.println("Currency already exists.");
                }

                currencyManager.displayCurrencies();
            }

            scanner.close();
        }
    }

    Объяснение кода:
Set для хранения валют: Мы используем HashSet для хранения валют, так как Set гарантирует уникальность элементов.
Метод addCurrency: Этот метод принимает наименование валюты в качестве параметра и добавляет его в Set, если оно там еще не содержится.
Возвращает true, если добавление прошло успешно, и false, если валюта уже существует.
Метод displayCurrencies: Этот метод выводит все текущие валюты, хранящиеся в Set.
Метод main: Основной метод, который позволяет оператору вводить наименования валют. Программа работает в цикле, пока пользователь не введет "exit".
Использование:
Запустите программу.
Введите международное наименование валюты (например, USD, EUR).
Программа проверит, есть ли уже такая валюта в списке, и либо добавит ее, либо сообщит, что такая валюта уже существует.
Для выхода из программы введите "exit".
Этот пример демонстрирует простое консольное приложение для управления списком уникальных международных наименований валют.
 */

}