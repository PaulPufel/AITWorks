package homework_34.homeWorkListe.tests;

import homework_34.homeWorkListe.model.Task;
import homework_34.homeWorkListe.dao.HomeWorkList;
import homework_34.homeWorkListe.dao.HomeWorkImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeWorkListImplTest {

    HomeWorkList homeWorkList;
    Task[] t;

    @BeforeEach
    void setUp() {
        homeWorkList = new HomeWorkImpl(5);
        t = new Task[4];
        t[0] = new Task(1, "Заправить автомобиль", 1);
        t[1] = new Task(2, "Купить молоко", 2);
        t[2] = new Task(3, "Позвонить другу", 3);
        t[3] = new Task(4, "Полить огород", 4);

        // необходимо добавить элементы массива в homeWork
        for (int i = 0; i < t.length; i++) {
            homeWorkList.addTask(t[i]);
        }
    }

    @Test
    void addTask() {
        // нельзя добавить null
        assertFalse(homeWorkList.addTask(null));
        // нельзя добавить второй раз уже имеющийся Task
        assertFalse(homeWorkList.addTask(t[1]));
        // добавляем Task
        Task task = new Task(5, "Сделать домашнее задание", 5);
        assertTrue(homeWorkList.addTask(task));
        // проверяем кол-во после добавления
        assertEquals(5, homeWorkList.quantity());
        // нельзя превысить capacity
        Task taskOneMore = new Task(6, "Прочитать книгу", 6);
        assertFalse(homeWorkList.addTask(taskOneMore));
        System.out.println("____________________________________________________");
        homeWorkList.printTask();

    }

    @Test
    void removeTask() {
        assertEquals(t[1], homeWorkList.removeTask(2));
        assertEquals(3, homeWorkList.quantity());
        System.out.println("_____________________________________________________");
        homeWorkList.printTask();

    }

    @Test
    void updateTask() {
        assertEquals(t[2], homeWorkList.removeTask(3));
        assertEquals(3, homeWorkList.quantity());
        homeWorkList.printTask();

    }

    @Test
    void findTask() {
        // find task with id = 2
        assertEquals(t[1], homeWorkList.findTask(2));
        // find task with id = 7
        assertNull(homeWorkList.findTask(7));
        System.out.println("_____________________________________________________");
    }

    @Test
    void quantity() {
        assertEquals(4, homeWorkList.quantity());
    }

    @Test
    void printTask() {
        homeWorkList.printTask();
    }
}
