package homework_34.homeWorkListe;

import homework_34.homeWorkListe.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TaskTest {

        Task[] tasks;

        @BeforeEach
        void setUp() {

            tasks = new Task[4];
            tasks[0] = new Task(1, "Заправить автомобиль", 1);
            tasks[1] = new Task(2, "Купить молоко", 2);
            tasks[2] = new Task(3, "Позвонить другу", 4);
            tasks[3] = new Task(4, "Полить огород", 3);
          // tasks[4] = new Task(5, "Сделать домашнее задание", 5);

        }

        @Test
        void testTaskSort() {
            System.out.println("===========Test task sorting===========");
            printArray(tasks);
            Arrays.sort(tasks); // производим сортировку в соответствии с тем полем, которое указано в методе compareTo
            System.out.println("--------After sorting by task number------------");
            printArray(tasks);
        }

        public void printArray(Object[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
}