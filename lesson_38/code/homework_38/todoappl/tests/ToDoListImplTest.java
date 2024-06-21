package homework_38.todoappl.tests;

import homework_38.todoappl.model.Task;
import homework_38.todoappl.dao.ToDoList;
import homework_38.todoappl.dao.ToDoListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoListImplTest {

    ToDoList toDoList;
    Task[] t;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(5);
        t = new Task[4];
        t[0] = new Task(1, "Заправить автомобиль", 1, now.minusDays(5));

        t[1] = new Task(2, "Купить молоко", 2, now.minusDays(3));

        t[2] = new Task(3, "Позвонить другу", 3, now.minusDays(1));

        t[3] = new Task(4, "Полить огород", 4, now.minusDays(1));

        // необходимо добавить элементы массива в ToDoList
        for (int i = 0; i < t.length; i++) {
            toDoList.addTask(t[i]);
        }
    }

    @Test
    void addTask() {
        // нельзя добавить null
        assertFalse(toDoList.addTask(null));
        // нельзя добавить второй раз уже имеющийся Task
        assertFalse(toDoList.addTask(t[1]));
        // добавляем Task
        Task task = new Task(5, "Сделать домашнее задание", 5, now.minusDays(4));
        assertTrue(toDoList.addTask(task));
        // проверяем кол-во после добавления
        assertEquals(5, toDoList.quantity());
        // нельзя превысить capacity
        Task taskOneMore = new Task(6, "Прочитать книгу", 6, now.minusDays(5));
        assertFalse(toDoList.addTask(taskOneMore));
        System.out.println("____________________________________________________");
        toDoList.printTask();

    }

    @Test
    void removeTask() {
        assertEquals(t[1], toDoList.removeTask(2));
        assertEquals(3, toDoList.quantity());
        System.out.println("_____________________________________________________");
        toDoList.printTask();

    }

    @Test
    void updateTask() {
        assertEquals(t[2], toDoList.removeTask(3));
        assertEquals(3, toDoList.quantity());
        toDoList.printTask();

    }

    @Test
    void findTask() {
        // find task with id = 2
        assertEquals(t[1], toDoList.findTask(2));
        // find task with id = 7
        assertNull(toDoList.findTask(7));
        System.out.println("_____________________________________________________");
    }

    @Test
    void quantity() {
        assertEquals(4, toDoList.quantity());
    }

    @Test
    void printTask() {
        toDoList.printTask();
    }

}

