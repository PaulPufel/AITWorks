package homework_34.homeWorkListe.model;

public enum Menu {
    SCHELL(1, "Заправить автомобиль"), LIDL(2, "Купить молоко"), HOUSE(3, "Полить огород"), PHONE(4, "Позвонить другу");
    // fields
    private  int id;
    private String task;

    Menu(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }
}
