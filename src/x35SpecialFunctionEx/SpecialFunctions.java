package x35SpecialFunctionEx;

import java.util.Scanner;

/*
write a program to use on a telephone banking system.
Users are asked a random digit from their password.
Can you write a program to ask users a random
letter from a preset password. The program should
include at least 4 meaningful functions
 */
public class SpecialFunctions {
    public static void main(String[] args) {

        String password = "epicpassword"; // defining preset password
        // asking for random character
        Scanner ask1 = new Scanner(System.in); // creating scanner object ask
        System.out.println("Enter a random number from your password"); // asking question
        String character = ask1.nextLine(); // reads string input
        System.out.println(character);
        int x =0;
        if(x==0){
            password.indexOf("character"); // .indexOf checks to see if input(character) is inside the string password
            System.out.println("yes");
        }
        else{
            System.out.println("denied");
        }
    }

}
// ???