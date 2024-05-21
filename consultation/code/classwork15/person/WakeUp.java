package classwork15.person;

interface WakeUp {
    void wakeup();
}

class Main {
    public static void main(String[] args) {
        WakeUp wakeUp = new WakeUp() {
            @Override
            public void wakeup() {
                System.out.println("It's time to wake up");

            }
        };
        wakeUp.wakeup();
    }
}
