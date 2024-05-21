package classwork30.button;

public class App {
    public static void main(String[] args) {
        // Объявим тип Action и переменную action
        // И воспользуемся интерфейсом new Action
        Action action = new Action() {
            @Override
            public void perform() {
                System.out.println("Мир делается лучше, подожди немного.....");
                System.out.println("Мир стал лучше.");

            }
        };
        // Создаём кнопку, Тип Button, Название переменной button
        // Дальше new и вызываем конструктор Button()
        // В конструктор Button() нужно передать название и объект action
        Button button = new Button("Сделать мир лучше", action);
        // Вызываем у переменной button. метод click()
        button.click();
    }
}

