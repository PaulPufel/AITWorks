package additionwork;

// Найти произведение всех двузначных нечетных чисел кратных 17.

public class TwoDigitsOddNumbers {
    public static void main(String[] args) {
        int i = 17;

        int number = 0;
        for (i = 17; i < 100; i += 17) {
            if (i % 2 != 0) { // Проверяем, что число нечетное
                number = i;

            }
        }
        System.out.println("Произведение всех двузначных нечетных чисел, кратных 17, равно: " + number);
    }
}
