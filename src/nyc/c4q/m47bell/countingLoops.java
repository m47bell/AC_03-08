package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/8/15.
 */
public class countingLoops {
    public static void main(String [] args){
        int counter = 100;
        while (counter >= 1) {
            System.out.println(counter);
            if (counter > 10)
                counter = counter - 5;
            else
                counter -= 1;
        }
           System.out.println("blastoff");
    }

}
