package x03Input;
import java.util.Scanner;
public class NeedInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = input.nextLine();
        System.out.println("How many of you are there? ");
        int num = input.nextInt();
        System.out.println("Hi " + name + ".There are " +num+" of you");
     extension();
    }

    /*
    Task
    Write a program to ask for 2 numbers, then add them together
     */
// see inputting numbers








    private static void extension(){

    }
}
