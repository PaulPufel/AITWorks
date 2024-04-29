package homework.cube.modelleo;

public class CubeLeoAppl {
    public static void main(String[] args) {

            CubeLeo cube1 = new CubeLeo(10);
            CubeLeo cube2 = new CubeLeo(20);
            CubeLeo cube3 = new CubeLeo(100);

            System.out.println(cube1.perimeter());
            System.out.println(cube2.perimeter());
            System.out.println(cube3.perimeter());
            System.out.println("------------------------");
            System.out.println(cube1.square());
            System.out.println(cube2.square());
            System.out.println(cube3.square());
            System.out.println("------------------------");
            System.out.println(cube1.volume());
            System.out.println(cube2.volume());
            System.out.println(cube3.volume());

        }
    }
