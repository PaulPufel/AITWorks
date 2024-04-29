package homework;

// Задача 1. Чему равно значение выражения x-- + --x при x = 5?
// Проверьте свое предположение с помощью кода.

public class Expression {
    public static void main(String[] args) {

        int c = 5;
        System.out.println(c--);
        System.out.println(--c);

        int x = 5;
        int y = x-- + --x;
        System.out.println(y);

        int a = 5;
        int b = a++ + ++a;
        System.out.println(b);
    }

}
