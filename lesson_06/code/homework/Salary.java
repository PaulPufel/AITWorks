package homework;
/* Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
      если базовая зарплата 500$.
      За 3 года работы надбавка 10%,
      за 5 лет работы надбавка 50%,
      за 10 лет работы надбавка 100%,
      за 15 лет работы надбавка 150%.
   Сколько лет проработал работник вводится с клавиатуры.
*/
 import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of years worked:");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Beginning of work: basic salary 500$");
            case 3 -> System.out.println("Worked for 3 years: basic salary 500$ plus bonus 10%");
            case 5 -> System.out.println("Worked for 5 years: basic salary 500$ plus bonus 50%");
            case 10 -> System.out.println("Worked for 10 years: basic salary 500$ plus bonus 100%");
            case 15 -> System.out.println("Worked for 15 years: basic salary 500$ plus bonus 150%");
        }
    }
}
