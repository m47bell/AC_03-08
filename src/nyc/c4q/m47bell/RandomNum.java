package nyc.c4q.m47bell;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/8/15.
 */
public class RandomNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1;


        while(true){
           System.out.println("guess? ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 10)

                System.out.println("please between 1-10");

            else if (guess > number)
                System.out.println("too high");
            else if (guess < number)
                System.out.println("too low");
            else {
                System.out.println("that's right");
                break;
            }



        }





    }


}
