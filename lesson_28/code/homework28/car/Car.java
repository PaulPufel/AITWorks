package homework28.car;
 /*
 1. Создайте интерфейс ArrayList с методами `void add(Car value)`, `Car get(int index)` и `Car remove(int index)`
 2. Создать класс CarArrayList для хранения объектов типа Car (класс указан снизу).
    Класс CarArrayList должен реализовывать интерфейс ArrayList
 3. Создать класс Main и в его методе main создать объекты машин и заполнить ими список используя CarArrayList
 4. Загрузить на гитхаб (желательно) все в том же репозитории AITWorks (но можно и в другой репозиторий на гитхабе)
 5. Отправить ссылку в личку в слаке
 */

public class Car {
    public String vendor;
    private String color;
    public int builtYear;

    public Car(String vendor, String color, int builtYear) {
        this.vendor = vendor;
        this.color = color;
        this.builtYear = builtYear;

    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }
}