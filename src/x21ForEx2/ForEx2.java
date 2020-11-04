package x21ForEx2;
 /*   Task
   Print a counting sequence with every 3rd
   number squared. Continue while the output is under 100
*/
public class ForEx2 {
    public static void main(String[] args) {
        int num = 100; // end condition
        // int x = 0; // start condition
        for(int x = 0; x >=100; x+=3){ // defining x as start position , finish condition x<100, increments
            double num2 = x+=3;
            double squared = Math.pow(num2,2); // squaring the number
            System.out.println(squared);
        }

    }
}
// nothing is output idk why there are no errors? while loop works though?