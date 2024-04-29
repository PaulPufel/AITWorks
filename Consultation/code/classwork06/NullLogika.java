package classwork06;

public class NullLogika {
    public static void main(String[] args) {
        Cookie[] cookies = null;
        // сложная логика...
        cookies = new Cookie[7];
        //  сложная логика...
        if (cookies == null){
            System.out.println("It's null");
        }else {
            System.out.println("Alright");
        }
    }
}
