package classwork30;

public class AnonymousExampleApp {
    public static void main(String[] args) {
        // Создание анонимного класса
        // 1.Нельзя будет создать второй объект с тем же поведением
        // 2.Вы получите объект с типом интерфейса
        Greeting myObject = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("Good bye from anonymous class");
            }
        };

        myObject.sayHello();
        myObject.sayGoodBye();
    }
}
