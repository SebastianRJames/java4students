package x30Functions;

public class Functions {
    public static void main(String[] args) {
        System.out.println(funk(17,19)); // printing parameters called funk
        extension(); // calling extension through main
    }
    private static int funk(int x,int y){ // defining funk parameters as integers and x and y
        return x+y; // adding them
    }
    /*
    Write a Program with an add function and a multiply function.
    Use these functions to add 2 numbers together, then multiply
    them by 0.5
    */
    private static void extension(){
        System.out.println(param(7,5));
    }
    private static int param(int a, int b){
        int x; // define x as integer
        x = a+b; // integer x = 7+5
        return (int) (x * 0.5); // return an integer, 12 x 0.5 = 6
    }
}
// put the add function inside the times function??