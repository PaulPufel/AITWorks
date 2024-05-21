package classwork30.lambda_button;

public class App {
    public static void main(String[] args) {
        Action action = () -> {
            System.out.println("Мир делается лучше, подожди немного.....");
            System.out.println("Мир стал лучше.");
        };

        Button button = new Button("Сделать мир лучше", action);
        button.click();
    }
}
