package homework;

public class ParallelogramLeo {

    public static void main(String[] args) {
        double a = 11;
        double h = 3;
        double s = sParallelogram(a, h);
        System.out.println("S parallelogram = " + s);
    }
    public static double sParallelogram(double a, double h){
        return a * h;
    }
}
