package nyc.c4q.m47bell;

/**Access Code 2-1
 * Marbella, Janneisy
 * Created by c4q-marbella on 3/8/15.
 * Conditional Statements
 */

import java.util.Scanner;

public class emoticon {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("How are you feeling? ");

    String face = input.next();

    String emotion = null;
    if (face.equals(":)"))
        emotion = "happy";
    else if (face.equals(":("))
            emotion = "sad";
    else if (face.equals(":|"))
            emotion = "indifferent";
    else {
        System.out.println("I don't know that one.");
    }

    System.out.println("You're " + emotion + ".");


}

}
