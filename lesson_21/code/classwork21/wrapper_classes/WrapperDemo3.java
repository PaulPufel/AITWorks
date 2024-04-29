package classwork21.wrapper_classes;


public class WrapperDemo3 {
    public static void main(String[] args) {
        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);

        // методы toString
        // Все типы оболочки переопределяют toString().
        // Этот метод возвращает читабельную для человека форму значения, содержащегося в оболочке.
        // Это позволяет выводить значение, передавая объект оболочки типа методу println():

        Double double1 = Double.valueOf("4.6");
        System.out.println(double1);

        // Также все числовые оболочки типов предоставляют статический метод toString(),
        // на вход которого передается примитивное значение. Метод возвращает значение String:

        String string1 = Double.toString(3.14);
        System.out.println(string1);


        /* Integer и Long предоставляют третий вариант toString() метода,
        позволяющий представить число в любой системе исчисления.
        Он статический, первый аргумент – примитивный тип,
        второй - основание системы счисления: */

        String string2 = Long.toString(254, 16);
        System.out.println(string2);  // string2 = "fe"
    }
}