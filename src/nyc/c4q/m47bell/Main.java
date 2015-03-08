package nyc.c4q.m47bell;

/* Marbella Vidals
* Access Code 2.1
* March 8 , 2015
* Conditional Statements
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("What's your score?: ");


        int score = Scanner.nextInt();
        if (score == 100)
            System.out.println("Perfect score!");
        else if (score >= 90)
            System.out.println("Great!");
        else if (score >= 75)
            System.out.println("Not bad!");
        else if (score >= 60)
            System.out.println("You passed.");
        else
            System.out.println("You failed. :(");

        System.out.println("We are done, Good bye.");

    }
}
