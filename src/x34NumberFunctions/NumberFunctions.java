package x34NumberFunctions;
import java.util.Random;
public class NumberFunctions {
        static Random rand = new Random(); // create random object
    public static void main(String[] args) {
        int int1 = rand.nextInt(100); // generate random integer up to 100
        double dbl1 = rand.nextDouble(); // generate random double called dbl1
        System.out.println("Random Integers "+int1); // integers
        System.out.println("Random Doubles "+(dbl1)); // decimal = double

        extension();
    }
/*  Can you generate a random double between 1-20,
    rounded to 2dp
*/
    private static void extension(){
        int int2 = rand.nextInt(20); // generate integer 0-20
        double double2 = rand.nextDouble(); // generate double 0-1
        double x = int2 + double2;
        System.out.println(x);
        double roundOff = Math.round(x * 100)/100.0; // x*100 which rounds to 2dp, then / 100 agian to get back to number, which now is rounded
        System.out.println(roundOff);



    }
}
