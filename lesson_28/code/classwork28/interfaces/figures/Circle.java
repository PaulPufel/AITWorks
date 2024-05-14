package classwork28.interfaces.figures;

// Класс Circle теперь реализует два интерфейса:
// Drawable и Fillable

public class Circle implements Drawable, Fillable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

    @Override
    public void fill() {
        System.out.println("Закрашиваем круг");
    }
}

