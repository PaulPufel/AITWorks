package classwork05;

public class Introduction {
    public static void main(String[] args) {

        // трое бандитов представляются полиции, сообщают как их зовут
        introduce();
        System.out.println("Juliko Bandito");
        introduce();
        System.out.println("De La Vorro Gangsterito");
        introduce();
        System.out.println("Tuz Pik");

    } // end of main

    // DRY - don't repeat yourself
    public static void introduce(){
        System.out.println("Let me introduce myself");
    }

} // end of class
