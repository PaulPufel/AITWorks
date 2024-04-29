package classwork21.wrapper_classes;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {

        int k = 1234567890;
        System.out.println(k);
        System.out.println("----------------------------");

        Integer myInt = new Integer("1234567890");
        System.out.println(myInt);
        System.out.println("----------------------------");

        BigInteger myBigInt = new BigInteger("123456789012345");
        System.out.println(myBigInt);
        System.out.println("----------------------------");

        // кол-во цифр в числе, версия 2 (ранее мы делали число в цикле на 10, цикл while)
        Integer x = 1_234_567_89; // автоупаковка, объект типа Integer
        String str = x.toString();
        int l = str.length();
        System.out.println(x + " contains " + l + " symbols.");
        System.out.println("----------------------------");

        System.out.println("Max value of Integer : " + x.MAX_VALUE);
        System.out.println("Min value of Integer : " + x.MIN_VALUE);
        System.out.println("----------------------------");

        // присвоение и умножение
        int n = 20;
        Integer m = 10;
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        m = m + n;
        System.out.println("m + n = " + m);
        System.out.println("----------------------------");

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);

        System.out.printf("Length = %.2f \n", circleLength);
        System.out.println("----------------------------");

        // обработка деления на 0
        double a = 20.0 / 0;
        System.out.println(a);

        if (Double.isFinite(a) || Double.isNaN(a)) {
            System.out.println("Wrong operation or incorrect result.");
        } else {
            System.out.println(a);
        }

        // перевод String в число
        System.out.println("Parsing String to number");
        String str1 = "0987654321";
        int num = Integer.parseInt(str1);
        System.out.println(num);

        String str2 = "2.7118281828";
        double exp = Double.parseDouble(str2);
        System.out.println("Exp = " + exp);
    }
}