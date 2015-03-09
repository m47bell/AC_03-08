package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/8/15.
 */
public class truthTable {
    public static void main(String[] args){
        System.out.println("\n\n--AND---\n\n");
        //and

        System.out.println("true  && true  = " + (true && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println("\n\n---OR--\n\n");
        //or

        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));

        System.out.println("\n\n---exclude case--\n\n");
        //excluded the case

        System.out.println("true  ^ true  = " + (true ^ true));
        System.out.println("true  ^ false = " + (true ^ false));
        System.out.println("false ^ true  = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));

        System.out.println("\n\n--Not---\n\n");
        //not
        System.out.println(!true);
        System.out.println(!false);
        int x=12;
        System.out.println(x != 12);
        System.out.println(x != 10);


        System.out.println("\n\n--strings---\n\n");
        //strings
        String s = "grapefriut";
        System.out.println(!s.equals("pineapple"));



/*

        System.out.print("do you carry a sword?");
        String response = scanner.next();
        boolean sword= response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.print("do you wear a helmet?");
        response = scanner.next();
        boolean sword= response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");


        System.out.print("do you carry a shovel?");
        response = scanner.next();
        boolean sword= response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");


        String profession;
        if (sword && helmet && ! shovel)
            profession= "samuari";
        else if (sword && ! helmet && !shovel)
            profession= "construction worker";
        else if (sword &&)

            */
    }
}
