package x04VariablesEx;
import java.util.Scanner;
/*
 Task
You are making a till for a hot dog stand.
Ask the user how many hot dogs they would
like, then display a receipt for the total
price

  */
public class VariablesExercise {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many hot dogs would you like? ");
    int num = input.nextInt();
    System.out.println("That will cost £"+num*2.95);
    }

}
