package classwork27.final_example;

public class Main3 {
    public static void main(String[] args) {
        final double PI = 3.14;
        // при попытке переопределения будет ошибка
        System.out.println("Площадь окружности с радиусом 2: " + PI * 4);
    }
}
