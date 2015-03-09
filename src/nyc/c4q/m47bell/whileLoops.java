package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/8/15.
 */
public class whileLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x=10;

        while (true) {
            System.out.println("the number is " + x);
            System.out.println("what's another number? ");
            x = scanner.nextInt();
        }

//break ends loop
        //return will get you out of a function and loop



    }


}
