package homework_34.todoappl.dao;

import homework_34.todoappl.model.Task;

public interface ToDoList {
        // add Task
        boolean addTask(Task task);

        // remove Task
        Task removeTask(int taskNumber);

        // print list of Tasks
        void viewTasks();
        // TODO - задачи из списка
        // подумать над Task[] viewTasks();

        // quantity of tasks
        int quantity();

        // TODO - нужен ли в интерфейсе метод для выхода из меню?

    }

