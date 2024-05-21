package classwork05;

// Задача 1. Чему равно значение выражения x-- + --x при x = 5?
// Проверьте свое предположение с помощью кода.

public class ValueX {
    public static void main(String[] args) {
        int x = 5;
        int y = x-- + --x;
        System.out.println(y);
    }
}
/*
x = 5
y = x-- + --x

изначально [ x=5, y=x-- + --x]
read x [ x=5, y=5 + --x]
decrement x [x=4,y=5 + --x]
decrement x [x=3,y=5 + --x]
read x [x=3,y=5 + 3]
sum 5 3 [x=4,y=8]

*/