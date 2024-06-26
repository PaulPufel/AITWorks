package homework_40.bank;

// Создайте приложение, в которое оператор банка вносит международные наименования валют (USD, EUR, ...).
// Приложение не должно допускать существования двух одинаковых валют.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyManager {

    // Используем HashSet для хранения уникальных наименований валют
    Set<String> currencies = new HashSet<>();

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
        System.out.println("Current currencies: ");
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
