package homework;

public class CalculateSum {
    // доступный статический метод, который ничего не возвращает (void), называется main,
    // принимает какие-то аргументы (узнаем позже)
    public static void main(String[] args) {

        int a = 15; // объявили переменную a
        int b = 20; // объявили переменную b
        int sum = summa(a, b); // вызываем метод, который посчитает нужное значение

    }

    // доступный статический метод, который вернет целое число, называется summa,
    // принимает на вход два целых числа
    public static int summa(int x, int y) {
        return x + y;
    }
}
