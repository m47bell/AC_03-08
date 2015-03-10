package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/8/15.
 * code that takes the day of the week
 * and figures out if it is a weekday or weekend.
 *
 */

/*

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date for the month of March: ");
        int date = input.nextInt();

        int[] dateArray= new int [] {1,8,15,22,29};


        //if(date == 1,8,15,22,29)
         System.out.println("");
*/


public class dayofweek {
    public static void main(String[] args){

Scanner input = new Scanner(System.in);
        System.out.print("What day is it?: ");
        String day = input.next();

        if ((day.equalsIgnoreCase("Monday"))
            ||(day.equalsIgnoreCase("Tuesday"))
            ||(day.equalsIgnoreCase("Wednesday"))
            ||(day.equalsIgnoreCase("Thursday"))
            ||(day.equalsIgnoreCase("Friday")))

           System.out.println("Its a Weekday");

           else {
            if ((day.equalsIgnoreCase("Sunday")
                    || (day.equalsIgnoreCase("Saturday"))))

            System.out.println("Its a Weekend");
        }






    }

}
