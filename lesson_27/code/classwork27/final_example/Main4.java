package classwork27.final_example;

public class Main4 {
    public static void main(String[] args) {
        // так делать не надо: final переменные обычно должны быть неизменяемыми
        final double[] values = {3.14};
        // values = {}; // вызовет ошибку
        // нельзя переопределить переменную values
        values[0] = 0;  // меняем данные в уже существующем массиве, но не переопределяем переменную
        System.out.println("Площаль окружности с радиусом 2: " + values[0] * 4);
    }
}