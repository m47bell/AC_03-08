package nyc.c4q.m47bell;

/**
 * **Access Code 2-1
 * Created by c4q-marbella on 3/8/15.
 * Marbella
 * Conditional Statements
 * Asks for the month and date of the month and reports if the day
 * is New Years Day (January 1), Cinco de Mayo (May 5),
 * the Fourth of July (July 4), or Christmas (December 25).
 *
 */

import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("What month and date is it?:");


        String month = input.next();
        int date = input.nextInt();

        if (month.equalsIgnoreCase("January") && (date==1))
            System.out.println("It's a New Year!! Happy New Year! ");
        else if (month.equalsIgnoreCase("Mayo")&&(date==5))
            System.out.println("It's Cinco de Mayo. Viva Puebla!");
        else if (month.equalsIgnoreCase("July")&&(date==4))
            System.out.println("Happy Birthday to Me..Its 4th of July!!!");
        else if (month.equalsIgnoreCase("December")&&(date==25))
            System.out.println("Merry Christmas!!!");
        else {
            System.out.println("Just another ordinary day...");
        }



    }

}
