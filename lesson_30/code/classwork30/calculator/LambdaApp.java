package classwork30.calculator;

public class LambdaApp {
    public static void main(String[] args) {
        // Синтаксический сахар, то же что и plus в классе classwork30.calculator.App
        Calculator plus = (a, b) -> a + b;

        // Синтаксический сахар, то же что и minus в классе classwork30.calculator.App
        Calculator minus = (a, b) -> a - b;

        int resultSum = plus.operate(5, 6);
        System.out.println("Sum: " + resultSum);

        // System.out.println(plus.operate(5, 7));

        int resultDiff = minus.operate(2, 9);
        System.out.println("Diff: " + resultDiff);
    }
}
