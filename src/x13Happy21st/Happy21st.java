package x13Happy21st;

import java.util.Scanner;

/*
Task
Ask the user their age. If they are 21,
tell them they 'Happy Birthday'. If they
are 22 tell them they are a Taylor Swift song
 */
public class Happy21st {
    public static void main(String[] args) {
        extension();
    }


    private static void extension(){
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = input.nextInt();
        if (age <0) {// if num is bigger than 0 it is positive
            System.out.println("You cannot be "+age+"years old");
        }
        if (age==21){
            System.out.println("Happy Birthday! :)");
        }
        if (age==22){
            System.out.println("You are a Taylor Swift song xd");
        }
        else{
            System.out.println("Cool");
        }
    }
}
