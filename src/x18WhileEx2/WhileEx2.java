package x18WhileEx2;
/*
    Task
    Print a counting sequence with every 3rd
    number squared. Continue while the output is under 100

     */
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 100, x = 0;
        while(x<=100){ // while x is less than 100 do...
            //System.out.println(x+=3); // x+=3 will go up in the 3 x table
            double num2 = x+=3; // double = data type used with "Math" - defining num2 with same equation x+=3 as an increment to then be used in pow.
            double squared = Math.pow(num2,2); // Math.pow() takes 2 parameters- the number being modified and the POWER you are raising it by (squared = power of 2), so it does num2(x+=2) * itself, defined as squared
            System.out.println(squared); // prints squared output of x+=3
        }
    }

}