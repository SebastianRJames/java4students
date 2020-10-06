package x14HowSquare;

import java.util.Scanner;

/*
    Task
    Ask the user to enter a number. can be divided by 4 without
    any remainder, say that it would make a great square
     */
public class HowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        if (num % 4 == 0) {// if num div by 4 then == even - witout remainder = return number
            System.out.println(num+" would make a great square");
        }else {
            System.out.println(num+" would not make a good square");
        }
    }

}
