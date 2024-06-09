package homework_34.homeWorkListe.dao;

import homework_34.homeWorkListe.model.Task;

public class HomeWorkImpl implements HomeWorkList {
    // fields
    private Task[] tasks;
    private int size;

    // конструктор
    public HomeWorkImpl(int size) {
        this.tasks = new Task[size];
        this.size = 0;
    }


    @Override
    public boolean addTask(Task task) {
        if (task == null || size == tasks.length || findTask(task.getId()) != null){ //
            return false;
        }
        tasks[size++] = task;
        return true;
    }


    @Override
    public void printTask() {
        for (int i = 0; i < size; i++) {
            System.out.println(tasks[i]);
        }
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Task removeTask(int id) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                Task victim = tasks[i];
                tasks[i] = tasks[--size];
                tasks[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Task findTask(int id) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public Task updateTask(int id, String task) {
        for (Task task1 : tasks) {
            if (task.length() == id) {
                return task1;
            }
        }
        return null;
    }

}
