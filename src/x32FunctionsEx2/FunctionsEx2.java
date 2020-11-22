package x32FunctionsEx2;

import java.util.Scanner;

public class FunctionsEx2 {

    /*
    Using input to get the values, write functions
    for add, multiply subtract and divide.
    Write a program to let the users select
    what they want to do,

    Ext. let the user perform multiple steps on the result
     */
    public static void main(String[] args) {
        // ASKING FIRST NUMBER
        Scanner ask1 = new Scanner(System.in); // creating scanner object ask
        System.out.println("Enter your first number"); // asking question
        int num1 = ask1.nextInt(); // reads integer input
        System.out.println("Your first number is " + num1);

        // ASKING SECOND NUMBER
        Scanner ask2 = new Scanner(System.in); // new scanner object
        System.out.println("Enter your second number"); // asking question
        int num2 = ask2.nextInt();
        System.out.println("Your second number is " + num2);

        // ASKING WHICH METHOD
        Scanner ask3 = new Scanner(System.in); // third scanner object
        System.out.println("Which method would you like to use? type: add, subtract, multiply or divide"); // Method question
        String methodType = ask3.nextLine(); // reading string classified as methodType
        System.out.println("You have chosen method: " + methodType);


        // IF ADD METHOD CHOSEN
        if (methodType .equals("add")){
            add(num1,num2);
        }
        // IF SUBTRACT METHOD CHOSEN
        if (methodType.equals("subtract")){
            subtract(num1,num2);
        }
        // IF MULTIPLY METHOD CHOSEN
        if (methodType.equals("multiply")){
            multiply(num1,num2);
        }
        // IF DIVIDE METHOD CHOSEN
        if (methodType.equals("divide")){
            divide(num1,num2);
        }
    }

    // ADD METHOD
    private static void add(int num_1, int num_2) {
        System.out.println(num_1+num_2);
    }
    // SUBTRACT METHOD
    private static void subtract(int num_1, int num_2) {
        System.out.println(num_1-num_2);
    }
    // MULTIPLY METHOD
    private static void multiply(int num_1, int num_2) {
        System.out.println(num_1*num_2);
    }
    // DIVIDE METHOD
    private static void divide(int num_1, int num_2) {
        System.out.println(num_1/num_2);
    }
}
