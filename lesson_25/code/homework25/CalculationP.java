package homework25;

// 1. Создайте проект
// 2. Напишите программу которая считает сумму чисел от 1 до числа X
// (где значение X равняется произведению дня вашего рождения на год)
// 3. Инициализируйте локальный репозиторий
// 4. Сделайте первый коммит содержащий папку src, файл .gitignore, папку .idea и файл с расширением .iml
// 5. Поменяйте число X на число Y (где значение Y равняется произведению месяца вашего рождения на год)
// 6. Сделайте второй коммит с этим изменением

public class CalculationP {
    public static void main(String[] args) {
        // Задаём переменные: день, год рождения, "х".
        int birtMonth = 1;
        int birthDay = 18;
        int birthYear = 1964;
        // Значение переменной "х" равняется произведению дня вашего рождения на год
        int x = birthDay * birthYear;
        int y = birtMonth * birthYear;

        // Вызываем метод для вычисления суммы чисел от 1 до "х"
        int sum = calculateSum(x);
        int sum1 = calculateSum(y);

        // Выводим результат
        System.out.println("Сумма чисел от 1 до " + x + " = " + sum);
        System.out.println("Сумма чисел от 1 до " + y + " = " + sum1);
    }

    public static int calculateSum(int num) {
        // Переменная для хранения суммы
        int sum = 0;

        // Считаем сумму чисел от 1 до "num"
        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        // Возвращаем результат
        return sum;

    }
}
