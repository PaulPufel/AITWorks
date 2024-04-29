package homework25;

// Напишите программу которая считает сумму чисел от 1 до числа X
// (где значение X равняется произведению дня вашего рождения на год)

public class CalculationP {
    public static void main(String[] args) {
        // Задаём переменные: день, год рождения, "х".
        int birthDay = 18;
        int birtYear = 1964;
        // Значение переменной "х" равняется произведению дня вашего рождения на год
        int x = birthDay * birtYear;

        // Вызываем метод для вычисления суммы чисел от 1 до "х"
        int sum = calculateSum(x);

        // Выводим результат
        System.out.println("Сумма чисел от 1 до " + x + " = " + sum);
    }

    public static int calculateSum(int num) {
        // Переменная для хранения суммы
        int sum = 0;

        // Считаем сумму чисел от 1 до "num"
        for (int i = 0; i <= num ; i++) {
            sum += i;
        }

        // Возвращаем результат
        return sum;
    }
}
