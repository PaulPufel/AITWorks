package homework;

// Задача 2. Распечатайте все натуральные числа меньшие 200 и кратные 13.

public class NumbersBy13 {

        public static void main(String[] args) {

            int count = 1;

            System.out.print("| ");

            while (count <= 200) {
                if(count % 13 == 0){
                    System.out.print(count + " | ");
                }
                count++;
            }
        }
    }