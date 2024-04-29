package classwork21.wrapper_classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //  int x = 7;
        //  Integer y = 111;
        //  x = y; // автораспаковка
        //  y = x * 123; // автоупаковка


        //  ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid (неверный)

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();  // Valid (верный)
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
            System.out.println("==============");
            {
                Integer myInt = 5;
                Double myDouble = 5.99;
                Character myChar = 'A';
                System.out.println(myInt);
                System.out.println(myDouble);
                System.out.println(myChar);
            }
            {
                Integer myInt = 5;
                Double myDouble = 5.99;
                Character myChar = 'A';
                System.out.println(myInt.intValue());
                System.out.println(myDouble.doubleValue());
                System.out.println(myChar.charValue());
            }
            {
                Integer myInt = 100;
                String myString = myInt.toString();
                System.out.println(myString.length());
            }
        }
    }
}

