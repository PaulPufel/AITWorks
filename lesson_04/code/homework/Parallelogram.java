package homework;

// 2. Написать приложение, которое вычисляет площадь параллелограмма по его основанию и высоте с помощью метода.
// S = a * h = b * h1

public class Parallelogram {

    public static void main(String[] args) {
        double a = 10;
        double h = 7;

        double s = sParallelogram(a, h);
        System.out.println("S parallelogram = " + s);
    }
    public static double sParallelogram(double a, double h){
        return a * h;
    }
}
