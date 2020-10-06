package x03Input;
import java.util.Scanner;
public class Inputtingnumbers {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number :");
        int num = input.nextInt();
        System.out.println("Input second number :");
        int num2 = input.nextInt();
        System.out.println(num+num2+" is your number");
    }
}
