package classwork29;

public class CarApp {
    public static void main(String[] args) {
        Transport bmw = new Transport("bmw", "personal", 6);
        Transport kia = new Transport("KIA", "Taxi", 3);
        System.out.println(bmw);
        System.out.println(kia);

        bmw.go();
        bmw.handleAnimalOnWay();
    }
}
