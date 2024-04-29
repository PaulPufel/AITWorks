package classwork08;

// Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power3 {
    public static void main(String[] args) {

        int count = 1; // parameter
        int res = 1;

        while (count < 11){ // condition
            res = res * 3; // 3 * 1 * 3,...
            System.out.println(res + " 3 in power " + count);
            count++; // increment parameter
        }
    }
}
