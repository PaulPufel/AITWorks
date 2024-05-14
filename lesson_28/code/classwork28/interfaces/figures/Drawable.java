package classwork28.interfaces.figures;

public interface Drawable {
    // Метод, который должен быть реализован
    void draw();

    default void resize() {
        System.out.println("Изменяем размер");

        // Метод resize не обязательно переопределять
    }
}

