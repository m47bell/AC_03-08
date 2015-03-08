package nyc.c4q.m47bell;

/**Access Code 2-1
 * Created by c4q-marbella on 3/8/15.
 * Marbella
 * Conditional Statements
 */

import java.util.Scanner;
public class fruit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter fruit: ");
        String fruit = input.next();
        String color = input.nextLine();
        String flavor = input.nextLine();



        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        } else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        } else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        } else if (fruit.equals("mango")) {
            color = "yellow";
            flavor = "sweet";

        } else {
            System.out.println("I don't know that fruit.");
        }
        System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);

    }
}