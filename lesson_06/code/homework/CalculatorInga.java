package homework;

/* Задача 4.(*) Написать приложение - калькулятор для работы с целыми числами:
   oper == 1 => +,
   oper == 2 => -,
   oper == 3 => *,
   oper == 4 => /,
   oper == 5 => % ,
   other print "Wrong operation".*/

import java.util.Scanner;

public class CalculatorInga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Write the number:");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Specify operatop (+, -, *, /): ");
        String oper = scanner.nextLine();
        double result = 0;
        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                ;
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
            }else{
                System.out.println("You are trying to divide by zero!");
                return;
                }
                break;
        }
        System.out.println("Result: " + result);
    }
}
