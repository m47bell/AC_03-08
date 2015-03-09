package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/8/15.
 */
public class mm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 100; //running a total of numbers of mms

        while(count > 0){
            System.out.println("you have " + count + " M&Ms left");

            System.out.println("eat how many? ");
            int eat = scanner.nextInt();
            while (eat > count) {
                System.out.println("you don't have that many");
                eat = scanner.nextInt();
            }

            count = count - eat;// java shortcut count -= eat
        }

        System.out.println("all the M&Ms are gone");

}
        }