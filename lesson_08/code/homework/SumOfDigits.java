package homework;

// Задача 2. Вводится положительное целое число, найдите сумму его цифр.
// Пример: 1725, сумма цифр = 15

public class SumOfDigits {
    public static void main(String[] args) {

        int d = 96;
        System.out.println("Sum of digits " + d + " = " + sumOfDigits(d));
    }
    public static int sumOfDigits(int d){

        int digit1FromRight = d % 10;
        int digit2 = d / 10;
        return digit1FromRight + digit2;
    }
}

