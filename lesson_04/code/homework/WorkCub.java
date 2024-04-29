package homework;

public class WorkCub {
    public static void main(String[] args) {

    double sideLength = 5.0;
    double volume = calculateVolume(sideLength);
    double surfaceArea = surfaceArea(sideLength);

        System.out.println("Объём куба " + volume);
        System.out.println("Площадь поверхности куба " + surfaceArea);

    }//end of vain

    public static double calculateVolume(double side) {
       return Math.pow(side, 3);
    }
    public static double surfaceArea(double sideLegth){
        return 6 * Math.pow(sideLegth, 2);
    }

}//end of class
