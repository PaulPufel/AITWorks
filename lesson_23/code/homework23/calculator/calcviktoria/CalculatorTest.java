package homework23.calculator.calcviktoria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

        private Calculator calculator;

        @BeforeEach
        public void setUp() {
            calculator = new Calculator();
        }

        @Test
        public void testAdd() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(-1, calculator.add(-2, 1));
        }

        @Test
        public void testSubtract() {
            assertEquals(1, calculator.subtract(3, 2));
            assertEquals(-3, calculator.subtract(-1, 2));
        }

        @Test
        public void testMultiply() {
            assertEquals(6, calculator.multiply(2, 3));
            assertEquals(-6, calculator.multiply(-2, 3));
        }

        @Test
        public void testDivide() {
            assertEquals(2, calculator.divide(6, 3));
            assertEquals(-2, calculator.divide(-6, 3));
            assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
        }

        @Test
        public void testModulo() {
            assertEquals(1, calculator.modulo(6, 5));
            assertEquals(0, calculator.modulo(6, 2));
            assertThrows(ArithmeticException.class, () -> calculator.modulo(6, 0));
        }
    }