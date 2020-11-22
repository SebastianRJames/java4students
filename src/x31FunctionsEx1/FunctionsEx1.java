package x31FunctionsEx1;

// Using only the Function below, can you
// multiply any value input by 7

import java.util.Scanner;

public class FunctionsEx1 {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in); // creating scanner object ask
        System.out.println("Enter a number to be x by 7 "); // asking question
        int num = ask.nextInt(); // reads integer input
        System.out.println(num * 7); // times input number; num by 7
    }
  }
