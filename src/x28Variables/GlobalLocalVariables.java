package x28Variables;

public class GlobalLocalVariables {

    public static void main(String[] args) {var();} // {var();} calls the function to be read immediately
    static int num = 17; // global variable
    private static void var(){ // creating function
        System.out.println(num); // prints 17
        int num = 30; // DIFFERENT PRIVATE VARIABLE w/ same name - (private because in function)
        System.out.println(num); // prints 30
    }


    /*
    Task
    Summarise the difference between local and global variables below

    global can be called anywhere in the script but if there is a private variable in a function with the same name it willuse the private variable.
     */

    private static void extension(){

    }
}
