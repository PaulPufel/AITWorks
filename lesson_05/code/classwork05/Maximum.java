package classwork05;

/*
     Задание 3. Написать метод, возвращающий максимальное из двух целых чисел.
    Реализовать метод, который возвращает максимальное из трех целых чисел.
    Числа задаются в программе.
*/

public class Maximum {
    public static void main(String[] args) {

        int a = 19250;
        int b = 18730;
        int c = 22137;

        int max = maximum(a, b);

        int max3 = maximum3(a, b, c);
        System.out.println(max3);

    } // end of main

    public static int maximum3(int a, int b, int c) {
        int max3 = 0;

        if(a > b & a > c) {
            max3 = a;
        }
        if(b > a & b > c){
            max3 = b;
        }
        if(c >b & c > a){
            max3 = c;
        }
        return max3;
    }

    public static int maximum(int x, int y){
        int ma;

        if( x <= y ) {
            System.out.println( y + " is maximum.");
            ma = y;
        } else {
            System.out.println( x + " is maximum.");
            ma = x;
        }
        return ma;
    }

}// end of class
