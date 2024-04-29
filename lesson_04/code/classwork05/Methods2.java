package classwork05;

/*
        4. Создайте метод, который принимает целое число и возвращает целую часть от деления его на 5.
     Пример: число 83, метод возвращает 16.
        5. Создайте метод, который находит сумму цифр двузначного целого числа.
     Пример: число 23, сумма цифр 5.
        6. Деление чисел типа double, вычисление среднего арифметического.
     Давайте вычислим средний возраст нашей группы.
        7. Создайте метод, который вычисляет квадрат гипотенузы по двум катетам (теорема Пифагора).
*/

public class Methods2 {
    public static void main(String[] args) {

        int p = 83;
        int newPrice = restDivBy5(p);
        System.out.println("New price / 5 = " + newPrice);

        int d = 23;
        System.out.println("Sum of digits " + d + " = " + sumOfDigits(d));

        int sumOfAges = 39 + 18 + 44 + 28 + 31 + 34 + 44 + 26 + 52 + 60 + 59 + 35 + 61;
        double numberOfStudents = 13;
        double a = averageAge(sumOfAges, numberOfStudents);
        System.out.println("Average age of students = " + a);

    } //end of main
    public static double averageAge (int a, double b){
        return a / b;
    }
    public static int sumOfDigits(int d){
        int digit1FromRight = d % 10; // это деление с остатком дает нам 1-ю справа цифру
        int digit2 = d / 10; // это деление дает нам 2-ю цифру двузначного числа
        return  digit1FromRight + digit2;
    }
    public static int restDivBy5(int price){
        return price / 5;
    }
}// end of class