package homework;

// Задача 3.
// Бросьте кубик с 6-ю гранями 20 раз.
// Подсчитайте, сколько раз выпала каждая цифра.
// Посчитайте вероятность выпадения каждой грани.

import classwork.ArraysMethods;

public class CubeLeo {
    public static void main(String[] args) {

        int[] dice = new int[20];
        int a = 1;
        int b = 6;

        // fill array
        ArraysMethods.fillArray(dice, a, b);
        System.out.println("Throws: ");
        ArraysMethods.printArray(dice);

        int[] frequency = new int[6];
        for (int i = 0; i < dice.length; i++) {
            switch (dice[i]){
                case 1 -> frequency[0]++;
                case 2 -> frequency[1]++;
                case 3 -> frequency[2]++;
                case 4 -> frequency[3]++;
                case 5 -> frequency[4]++;
                case 6 -> frequency[5]++;
            }
        }
        System.out.println("Frequency: ");
        ArraysMethods.printArray(frequency);

        double[] probability = new double[6];
        for (int i = 0; i < probability.length; i++) {
            probability[i] = (double) dice[i]/ dice.length;
        }

        System.out.println("Probability: ");
        ArraysMethods.printArray(probability);

    }
}