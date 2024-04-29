package homework;

  // Задача 2.
  // Бросьте кубик с 6-ю гранями 20 раз.
  // Подсчитайте, сколько раз выпала каждая цифра.

import java.util.Random;

public class Cube1Leo {
        public static void main(String[] args) {
            Random random = new Random();
            int[] results = new int[6];

            for (int i = 0; i < 20; i++) {
                int roll = random.nextInt(6) + 1;
                results[roll - 1]++;
            }
            printResults(results);
        }
        public static void printResults(int[] results) {
            String[] diceFaces = {
                    "\u2680 \u279B \u2776",
                    "\u2681 \u279B \u2777",
                    "\u2682 \u279B \u2778",
                    "\u2683 \u279B \u2779",
                    "\u2684 \u279B \u277A",
                    "\u2685 \u279B \u277B"};

            for (int j = 0; j < results.length; j++) {
                System.out.println("Кубик " + diceFaces[j] + " выпал " + results[j] + " раз");
            }
        }
    }
