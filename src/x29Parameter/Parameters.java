package x29Parameter;
public class Parameters {
    public static void main(String[] args) {
        para(47," Ginger Headed Sailors"); // defining parameters
    }

    private static void para(int num, String sentence) { // function with parameters - para(num,sentence)
        System.out.println(num+sentence); // prints the variables of the parameters
    }
    /*
    Task
    Write a Program with 2 variables, x and y . Write methods to
    add, multiply and subtract x and y
     */

    public static void nums() {
        para(3,5);  // parameters
    }
    private static void para(int x,int y){ // defining x and y as 3 and 5
    add();
    //subtract();
    //multiply();
    }

    private static void add(){
        System.out.print("add runs");
    }





}