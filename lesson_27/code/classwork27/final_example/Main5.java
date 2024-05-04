package classwork27.final_example;

public class Main5 {
    public static void main(String[] args) {
        // Так делать не надо: final переменные обычно должны быть неизменяемые
        final Car car = new Car("bmw",2008);
        // car = new Car("audi",1990); // Ошибка
        car.builtYear = 2050;
        System.out.println(car);

    }
}
