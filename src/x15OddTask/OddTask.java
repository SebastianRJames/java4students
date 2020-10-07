package x15OddTask;

import java.util.Random;
import java.util.Scanner;

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
        String oddEven = input.nextLine(); // oddEven = input
        if ("odd".equals(oddEven)){// cannot use == for comparing string types, must use .equals, if picked even
            Random rand = new Random(); // rand is the class
            int upperbound = 7; // creating upperbound
            int randomOdd = rand.nextInt(upperbound); // randomOdd = random number, with upperbound of 7
            System.out.println("You rolled a "+randomOdd); // print random
            // above is pick random, below is check if odd
            if (randomOdd % 2 != 0) {// if num is NOT div by 2 then == Odd = return number
                System.out.println(randomOdd + " is an Odd number!, You win!");
            }
            else {
                System.out.println(randomOdd + " is an Even number, Sorry you loose.");
            }
            }
        if ("even".equals(oddEven)){ // if picked even
            Random rand1 = new Random();
            int upperbound1 = 7;
            int randomEven = rand1.nextInt(upperbound1);
            System.out.println("You rolled a "+randomEven);
            // above is pick random, below is check if even
            if (randomEven % 2 == 0) {// if num IS div by 2 then == even = return number
                System.out.println(randomEven + " is an Even number!, You win!");
            }
            else {
                System.out.println(randomEven + " is an Odd number, Sorry you loose.");
            }
        }
    }

}
