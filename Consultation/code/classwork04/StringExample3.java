package classwork04;

public class StringExample3 {
    public static void main(String[] args) {
        String firstName = "Paul";
        String lastName = "Pufel";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String arg1 = "Hello my age is ";
        int arg2 = 12;
        String result = arg1 + arg2;
        System.out.println(result);


        String str1 = "Paul";
        String str2 = "Pufel";

        // для сравнения на равенство в случае строк
        // вместо == надо использовать метод .equals()

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Paul"));

        int countOfWorkers = 18281928;

        System.out.println("The count of the workers: " + countOfWorkers);

    }
}
