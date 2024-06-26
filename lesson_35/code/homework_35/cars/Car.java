package homework_35.cars;

// Сделать пример класса c интерфейсом Comparable по двум полям.
// Например: автомобили одной марки, но с разным пробегом (или ценой)

import java.util.Objects;

public class Car implements Comparable<Car> {

    public String model;
    private String color;
    private int mileage;
    public int builtYear;

    public Car(String model, String color, int mileage, int builtYear) {
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.builtYear = builtYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", builtYear=" + builtYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return mileage == car.mileage && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, mileage);
    }

    @Override
    public int compareTo(Car o) {
        int res = this.model.compareTo(o.model); // сортировка по model (по алфавиту)
        if (res != 0) { // если model НЕ совпали
            return res; // вернули результат сравнения
        } else {
            res = (this.mileage - o.mileage);  // иначе сортируем по пробегу
        }
        return res;
    }
}