package homework;

/*Напечатайте на экране шахматную доску размером 8х8.
0 - белая клеточка, 1 - черная.
Левая верхняя клеточка должна быть 0, левая нижняя - 1.*/

public class ChessDeckLeo {
    public static void main(String[] args) {
        int k = 0;
        int l = 0;

        while (k < 8) {
            while (l < 8) {
                System.out.print((k + l) % 2 + " | ");
                l++;
            }
            System.out.println();
            l = 0;
            k++;
        }

        // решение от Инги
        char white = '◻'; // символ
        char black = '◼'; // символ
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(white + "  ");
                } else {
                    System.out.print(black + "  ");
                }
            }
            System.out.println();
        }
    }
}
