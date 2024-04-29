package classwork05;

/* **Задание 1:**
 Проверка положительное или отрицательное число.
 Проверка четное или нечетное целое число.
 Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надоприйти вместе с вашим опекуном",
 иначе сообщить "Вам разрешено действовать самостоятельно.*/

public class Conditions {
    public static void main(String[] args) {
        int x = 30;
        int y = 5;

        if(x + y > 0) {
            System.out.println(x + y + " : this is POSITIVE number");
        } else {
            System.out.println(x + y + " : this is NEGATIVE number");
        }

        int daten = -123; //

        if( (daten % 2) == 1 || (daten % 2) == -1 ) {
            System.out.println(daten + " : is odd number.");
        } else {
            System.out.println(daten + " : is even number");
        }

        int age = 16;

        if(age >= 18) {
            System.out.println("Вам разрешено действовать самостоятельно.");
        } else {
            System.out.println("Вам надо прийти вместе с вашим опекуном.");
        }
    }
}

