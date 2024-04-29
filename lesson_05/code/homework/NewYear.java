package homework;

/*  Задача 3(*). Написать программу, определяющую, является ли год високосным.
Для того чтобы год был високосным, он должен: делится без остатка на 4 и, либо не должен делится без остатка на 100,
либо если он делится на 100, то он должен делится также на 400. Проверить на годах 1700, 1800, 1900 - не високосные,
а 2000 високосный.
 */

public class NewYear {

    public static void main(String[] args) {
            int year1 = 1700;
            int year2 = 1800;
            int year3 = 1900;
            int year4 = 2000;
            int year5 = 2024;

            if (isLeapYear(year1)) {
                System.out.println(year1 + " - " + " Leap year");
            } else {
                System.out.println(year1 + " - " + " Not leap year ");
            }

            if (isLeapYear(year2)) {
                System.out.println(year2 + "- " + " Leap year ");
            } else {
                System.out.println(year2 + " - " + " Not leap year ");
            }

            if (isLeapYear(year3)) {
                System.out.println(year3 + " - " + "Leap year");
            } else {
                System.out.println(year3 + " - " + " Not leap year ");
            }

            if (isLeapYear(year4)) {
                System.out.println(year4 + " - " + " Leap year ");
            } else {
                System.out.println(year4 + " - " + " Not leap year ");
            }

            if (isLeapYear(year5)) {
                System.out.println(year5 + " - " + " Leap year ");
            } else {
                System.out.println(year5 + " - " + " Not leap year ");
            }
        }

        public static boolean isLeapYear ( int year){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
                return false;
            }

    }


