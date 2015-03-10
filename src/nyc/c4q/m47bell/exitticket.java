package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/9/15.
 *
 * asks the user "What should I do next?", and exits if the user
 * enters "quit" or "exit."
 * Otherwise, the program keeps asking the same question.
 */


public class exitticket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what should I do, play a game or quit?");

        String response = input.nextLine();

        int count= 0;


        while ((response.equalsIgnoreCase("yes")||(response.equalsIgnoreCase("play a game"))) && count < 5) {

            System.out.println("What should I do next?");
            response= input.nextLine();
            System.out.println(count);
            count++  ;

           if( response.equalsIgnoreCase("tomato")) {

               System.out.print("You typed the magic word, bye!");
               count = 5;
           }

        }

        System.out.println("Okay, good bye");


    }
}
