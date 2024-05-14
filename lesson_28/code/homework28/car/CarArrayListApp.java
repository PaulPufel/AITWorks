package homework28.car;

public class CarArrayListApp {
    public static void main(String[] args) {
        CarArrayList myArray = new CarArrayList();

        myArray.add(new Car("Toyota", "Gray", 2016));
        myArray.add(new Car("Mercedes", "White", 2000));
        myArray.add(new Car("VW", "Silver", 2002));
        System.out.println(myArray);

        Car removedValue = myArray.remove(1);
        System.out.println("Removed value: " + removedValue);
        System.out.println(myArray);

        myArray.add(new Car("Honda", "Black", 2022));
        System.out.println(myArray);

        System.out.println("First value:" + myArray.get(0));
    }
}
