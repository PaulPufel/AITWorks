package homework_34.homeWorkListe.dao;

/* Использовать enum для организации меню (номер пункта, действие) приложения:

   добавить запись
   посмотреть все записи
   удалить запись (по номеру)
   отредактировать задачу
   выйти */

import homework_34.homeWorkListe.model.Task;

public interface HomeWorkList {

    boolean addTask(Task task);

    void printTask();

    int quantity();

    Task removeTask(int id);

    Task findTask(int id);

    Task updateTask(int id, String task);

}
