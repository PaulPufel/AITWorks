package classwork30;

public class FirstTimeInSchoolApp {
    public static void main(String[] args) {
        System.out.println(
                "Мальчик Петя пришел на урок впервые. " +
                        "Занятие началось и учитель поприветствовал класс"
        );
        System.out.println("И тут он говорит:");

        Greeting spech = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здорово мужики!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Досвидос!");

            }
        };
        spech.sayHello();
        spech.sayGoodBye();

        System.out.println("The end");
    }
}
