package classwork07;

// Задача 1.
// Заполните массив целыми числами от 1 до 100.
// Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Найдите наиболее коротким способом, какое число было добавлено в массив.


import java.util.Random;

public class Task01 {

            // 0. Создать массив длинной 101.
            // 1. Заполните массив целыми числами от 1 до 100.
            // 2. Выбрать некоторое случайное число в интервале от 1 до 100.
            // 3. Добавить на случайное место это число.
            // 4. Найти какое число было добавленно.

            public static void main(String[] args) {
                int[] array = new int[101]; // Создаем массив на 101 элемент
                Random random = new Random();

                // Заполняем массив числами от 1 до 100
                for (int i = 0; i < 100; i++) {
                    array[i] = i + 1;
                }

                // Генерируем случайное число от 1 до 100
                int randomNum = random.nextInt(101);

                // Генерируем случайное место, куда добавить случайное число
                int randomIndex = random.nextInt(102) - 1; // 0-100 включительно

                // Добавляем случайное число в случайное место в массиве
                array[randomIndex] = randomNum;

                System.out.println("Случайное число: " + randomNum);
                System.out.println("Случайный индекс: " + randomIndex);

                // мы забыли про randomNum, ищем его значение (а также забыли про randomIndex)

                // case 1
                // предположим что randomNum = 4, randomIndex = 7
                // 8 -> 4
                // 1,2,3,4,5,6,7,4,9,10,11.... // отсортировать массив
                // 1,2,3,4,4,5,6,7,9,10,11.... // найти дублирование
                // дублирование найдено, значит продублированное число и было добавленно

                // case 2
                // предположим что randomNum = 4, randomIndex = 3
                // 4 -> 4
                // 1,2,3,4,5,6,7,8,9,10,11 // отсортировать массив
                // 1,2,3,4,5,6,7,8,9,10,11 // найти дублирование
                // дублирование не найдено, значит замена была эквивалентной и ответ нельзя найти

                // case 3
                // предположим что randomNum = 4, randomIndex = 100
                // 0 -> 4
                // 1,2,3,4,5,6,7,8,9,10,11,...,99,100,4
                // сортировка и поиск дублирования не нужно, если поселднее значение массив не 0


                // case3:
                if (array[100] != 0) {
                    System.out.println("Найденное число: " + array[100]);
                    return;
                }

                // case1:

                // отсортировать задание
                bubbleSort(array);

                int prev = -1;
                int found = -1;

                for(int value : array) {
                    if (prev == value) {
                        found = value;
                        break;
                    }
                    prev = value;
                }

                if (found != -1) {
                    System.out.println("Найденное число: " + found);
                    return;
                }

                System.out.println("Число не удалось найти");
            }

            // bubble sort
            // comparing two elements of array: array[i] ? array[i + 1]
            // if left array[i] > right array[i + 1] , swap
            public static void bubbleSort(int[] array){
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) { // правый конец будет двигаться к началу массива
                        if (array[j] > array[j + 1]) {
                            // swap elements
                            int tmp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = tmp;
                        }
                    }
                }
            }
        }


