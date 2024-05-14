package classwork14.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new KiaRio();
        Car car2 = new BMWM5();

        car1.go();
        car2.lightOn();
        car2.startEngine();
        car1.stopEngine();
        car2.go();
        car1.stop();

        Car[] cars = {car1, car2};

        for (Car car: cars) {
            car.startEngine();
            car.lightOn();
            car.go();
            car.stopEngine();
            car.stop();

            if (car instanceof BMWM5) {
                BMWM5 bmw = (BMWM5) car;
                bmw.helloWorld();
            }
        }
    }
}
