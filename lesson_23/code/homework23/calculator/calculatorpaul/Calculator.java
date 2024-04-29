package homework23.calculator.calculatorpaul;

// Задача 1.
// В классе Calculator реализовать 5 методов для калькулятора
// (сложение, вычитание, умножение, деление с остатком, целая часть от деления),
// который работает с целыми числами.
// Создать CalculatorTest, покрыть все методы тестами.

import org.junit.jupiter.api.BeforeEach;

public class Calculator {


    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide_remainder(int x, int y) {
        return x % y;
    }

    public int integer_division(int x, int y) {
        return x / y;
    }
}