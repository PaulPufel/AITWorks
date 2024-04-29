package homework.cube.modelleo;

public class CubeLeo {
    // поля класса
    int a;

    // конструктор
    public CubeLeo(int a) {
        this.a = a;
    }

    // геттеры и сеттеры
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // методы класса
    public int perimeter() {
        return 12 * a;
    }

    public int square() {
        return 6 * a * a;
    }

    public int volume() {
        return a * a * a;
    }

}
