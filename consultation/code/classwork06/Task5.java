package classwork06;

public class Task5 {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,6,7,8};
       for (int i = 0; i < array.length / 2; i++){
           System.out.println(array[i] + " <-> " + array[array.length - i - 1]);
       }
    }
}
