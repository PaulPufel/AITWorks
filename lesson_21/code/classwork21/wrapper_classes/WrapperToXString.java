package classwork21.wrapper_classes;

// Методы toHexString(), toOctalString(), toBinaryString()
// Integer и Long позволяют преобразовывать числа из десятичной системы исчисления
// к шестнадцатеричной, восьмеричной и двоичной системе.
// Например:

public class WrapperToXString {
    public static void main(String[] args) {
        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);
        // В классы Double и Float добавлен только метод toHexString().


        // Пример приведения типов

        Integer iOb = new Integer(1000); // создаем объект

        System.out.println(iOb.byteValue());    // byte
        System.out.println(iOb.shortValue());   // short
        System.out.println(iOb.intValue());     // int
        System.out.println(iOb.longValue());    // long
        System.out.println(iOb.floatValue());   // float
        System.out.println(iOb.doubleValue());  //double

        /* Статические константы классов оболочек
Каждый класс оболочка содержит статические константы,
содержащие максимальное и минимальное значения для данного типа.
Например:
в классе Integer есть константы Integer.MIN_VALUE – минимальное int значение
и Integer.MAX_VALUE – максимальное int значение.
Аналогичные константы есть в классе BigInteger */
    }
}
