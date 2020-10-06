package x12OnlyPositiveEx;


import java.util.Scanner;

public class OnlyPositive {
    /*
Task
Enter the code to reject a number if it is negative
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {// if num div by 2 then == even = return number
            System.out.println(num+" is an even number");
        }else {
            System.out.println(num+" is an odd number");
        }
    }

}
// sorry i did it for even / odd instead of positive/negative