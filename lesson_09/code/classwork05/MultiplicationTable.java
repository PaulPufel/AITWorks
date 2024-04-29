package classwork05;

// Распечатать в консоли таблицу умножения от 1 до 10.

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 1; // first multiplier
        int m = 1; // second multiplier

        while (n <= 10){
            while (m <= 10){
                System.out.print(n + " * " + m + " = " + n * m + " | ");
                m++;
            }
            System.out.println(); // next line
            m = 1; // drop m to again 1
            n++;
        }
    }
}
