package classwork28;

import java.util.Arrays;

public class IntArrayList {
    private static final int INIT_ARRAY_SIZE = 5;
    private int[] data;
    private int count;

    public IntArrayList() {
        // инициализация изначального состояния
        this.data = new int[IntArrayList.INIT_ARRAY_SIZE];
        this.count = 0;
    }

    public void add(int value) {
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
        int[] newArray = new int[(int) sizeOfNewArray];

        for (int i = 0; i < this.data.length; i++) {
            // копируем значения из старого массива в новый
            newArray[i] = this.data[i];
        }

        // замешаем старый масив новым
        this.data = newArray;
    }

    public int get(int index) {
        if (index >= this.count) {
            // тригерим ошибку если пытаются получить элемент выходящий за рамки известного количества элементов списка
            return this.data[-1];
        }
        return this.data[index];
    }

    public int remove(int index) {
        int value = this.get(index);

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
        return "IntArrayList{data=" + Arrays.toString(this.data) + ", count=" + this.count + "}";
    }
}