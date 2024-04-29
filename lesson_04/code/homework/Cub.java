package homework;

public class Cub {
    public static void main(String[] args) {
        double sideLength = 5.0;

        double volume = calculateVolume(sideLength);
        double surfaceArea = surfaceArea(sideLength);

        System.out.println("Объём куба " + volume);
        System.out.println("Площадь поверхности куба " + surfaceArea);

    }//end of main
    public static double calculateVolume(double side){
        return Math.pow(side, 3);
    }
    public static double surfaceArea(double sideLength){
        return 6 * Math.pow(sideLength, 2);
    }

}//end of class
