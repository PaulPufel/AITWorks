package homework28.car;

import java.util.Arrays;

public class CarArrayList implements ArrayList{

    private static final int INIT_ARRAY_SIZE = 3;
    private Car[] data;
    private int count;

    public CarArrayList() {
        // инициализация изначального состояния
        this.data = new Car[CarArrayList.INIT_ARRAY_SIZE];
        this.count = 0;
    }

    public void add(Car value) {
        // добавление нового элемента
        int index = this.count;
        if (index >= this.data.length) {
            // если свободных мест в this.data больше нет - расщиряем массив
            increaseArray();
        }

        this.data[index] = value;
        this.count += 1;
    }

    private void increaseArray() {
        // расширение массива

        // увеличиваем размер в 1.5 раза
        double sizeOfNewArray = this.data.length * 1.5;
        // с округлением вниз
        Car[] newArray = new Car[(int) sizeOfNewArray];

        for (int i = 0; i < this.data.length; i++) {
            // копируем значения из старого массива в новый
            newArray[i] = this.data[i];
        }

        // замещаем старый масив новым
        this.data = newArray;
    }

    public Car get(int index) {
        if (index >= this.count) {
            // тригерим ошибку если пытаются получить элемент выходящий за рамки известного количества элементов списка
            return this.data[-1];
        }
        return this.data[index];
    }

    public Car remove(int index) {
        Car value = this.get(index);

        for (int i = index + 1; i < this.count; i++) {
            // смещаем элементы стоящие справа от удаляемого на одну позицию влево
            this.data[i - 1] = this.data[i];
        }

        this.count -= 1;

        return value;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "CarArrayList{data=" + Arrays.toString(this.data) + ", count=" + this.count + "}";
    }
}
