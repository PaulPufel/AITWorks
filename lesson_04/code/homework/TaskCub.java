package homework;

// 1. Написать приложение, которое вычисляет объем куба по длине его ребра и площадь его поверхности с помощью метода.

// Cube face square(Sf) = a2,
// Cube surface square(Sfs)= a2 * 6,
// Cube volume(V) = a3

public class TaskCub {

    // Это мой первый простой метод вычисления:
    // 1.площадь стороны куба
    // 2.площадь поверхности куба
    // 3.обьём куба

    public static void main(String[] args) {
        int f = 100;
        int sf = f * f;
        int cfs = f * f * 6;
        int cv = sf * f;

        System.out.println("Cube face square = " + sf);
        System.out.println("Cube face square = " + cfs);
        System.out.println("Cube square = " + cv);

        // Это мой второй исправленный метод вычисления, с применением метода:
        // 1.площадь стороны куба
        // 2.площадь поверхности куба
        // 3.обьём куба

        double a = 100;
        double fs = facesquare(a);

        System.out.println("Cube face square = " + fs);

        double sfs = surfacesquare(a);

        System.out.println("Cube square = " + sfs);

        double v = volume(a);

        System.out.println("Cube volume = " + v);

    }//end of main

    public static double facesquare(double a){
        return a * a;
    }
    public static double surfacesquare(double a){
        return a * a * 6;
    }
    public static double volume(double a){

        return a * a * a;
    }

}//end of class

