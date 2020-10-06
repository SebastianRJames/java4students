package x15OddTask;

import java.util.Random;
import java.util.Scanner;
//   ---unfinished cant get random numbers to work but know how to check if odd or even.
/*
 Task
     The user enters if they pick odd or even. A random number,
     between 1 and 6 is then displayed. If they picked odd and
     the number is odd, or even and the number is even, they win
  */
public class OddTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you choose an Odd number or an Even number? odd/even");
        String oddEven = input.nextLine();
        if ("odd".equals(oddEven)){// cannot use == for comparing string types, must use .equals
            System.out.println("works");
            Random randomOdd = new Random();
            int rand1 = 0;
            while (true){
                rand1 = randomOdd.nextInt(7);
                if (rand1 !=0) break;
            System.out.println(rand1);
            }
        }
        if ("even".equals(oddEven)){
            System.out.println("works");
            Random rand = new Random();
            int randomNum = rand.nextInt(7);
        }
    }

}
