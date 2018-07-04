package src;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by hoganw on 5/15/2018.
 */
public class Test {
    public static void main(String[] args)
    {

        int year;
        boolean leapyear;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = scan.nextInt();

        while (year != 0) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println("The year " + year + " is not a leap year.");
            }
            System.out.print("Enter year: ");
            year = scan.nextInt();
        }
    }
}
