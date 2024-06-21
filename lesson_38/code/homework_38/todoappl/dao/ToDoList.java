package homework_38.todoappl.dao;

import homework_38.todoappl.model.Task;

import java.time.LocalDateTime;

public interface ToDoList {

/* Использовать enum для организации меню (номер пункта, действие) приложения:
   добавить запись
   посмотреть все записи
   удалить запись (по номеру)
   отредактировать задачу
   указать дату и время создания задачи  */

    boolean addTask(Task task);

    void printTask();

    int quantity();

    Task removeTask(int id);

    Task findTask(int id);

    Task updateTask(int id, String task);

    Task[] getTaskDate(LocalDateTime localDateTime);

}

