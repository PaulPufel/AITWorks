package classwork05;

public class Circus {
    public static void main(String[] args) {
        // проверить, можно ли из одного метода вызвать другой, а из того дальше следующий...
        lightOn();
        entrtainer();
        lightOff();
    } // end of main

    private static void lightOff() {
        System.out.println("Light OFF");
    }
    private static void entrtainer() {
        jogger();
        cloun();
        singer();
    }
    private static void singer() {
        System.out.println("Im singing in the rain...");
    }
    private static void cloun() {
        System.out.println("I'm jocking!");
    }
    private static void jogger() {
        System.out.println("I'm jogger, i'm jogging!");
    }
    private static void lightOn() {
        System.out.println("Light is ON");
    }
}// end of class

