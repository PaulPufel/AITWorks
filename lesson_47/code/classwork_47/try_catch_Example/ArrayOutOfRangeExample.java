package classwork_47.try_catch_Example;

import java.util.Scanner;

public class ArrayOutOfRangeExample {
    public static void main(String[] args) {

        // массив целых чисел на 5 элементов, пробуем обратиться к 6-му и более элементу
        int[] array = {-14, 28, -141, 122, 1054};
        System.out.println(array[2]); // -141

        try {
            System.out.println(array[6]);
        } catch (IndexOutOfBoundsException error){
            System.out.println("Can't asses to such index: " + error.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue?");
        String str = scanner.nextLine();

    }
}
// Хорошая статья с примерами: https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/
//
//Алгоритм применения try ... catch