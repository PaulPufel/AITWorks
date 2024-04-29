package homework23.calculator.calculatorpaul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(5, 2));
        assertEquals(-2, calculator.add(-7, 5));
    }

    @Test
    void subtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-6, calculator.subtract(-5, 1));
    }

    @Test
    void multiply() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(-14, calculator.multiply(-2, 7));
    }

    @Test
    void divide_remainder() {
        assertEquals(4, calculator.divide_remainder(9, 5));
        assertEquals(-1, calculator.divide_remainder(-9, 2));
    }

    @Test
    void integer_division() {
        assertEquals(2, calculator.integer_division(8, 4));
        assertEquals(-5, calculator.integer_division(-10, 2));
    }
}