package x12OnlyPositiveEx;

import java.util.Scanner;
// making an actually positive script
public class actuallyPositive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        if (num >0) {// if num is bigger than 0 it is positive
            System.out.println(num+" is a positive number");
        }
        if (num == 0){
            System.out.println(num+ " is neither positive or negative");
        }
        else {
            System.out.println(num+" is a negative number");
        }
    }

}
