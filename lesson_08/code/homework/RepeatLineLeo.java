package homework;
/*
Программа получает на вход строку и число повторений этой строки.
Программа должна вывести эту строку нужное количество раз.
*/
import java.util.Scanner;

public class RepeatLineLeo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input string: ");
            String str = scanner.nextLine();
            System.out.println("input number of repetition: ");
            int rep = scanner.nextInt();

            while (rep > 0){
                System.out.println(str);
                rep--;
            }
            System.out.println("Done!");
        }
    }