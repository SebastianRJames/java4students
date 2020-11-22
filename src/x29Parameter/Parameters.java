package x29Parameter;
public class Parameters {
    public static void main(String[] args) {
        para(47, " Ginger Headed Sailors"); // defining parameters
    }

    private static void para(int num, String sentence) { // function with parameters - para(num,sentence)
        System.out.println(num + sentence); // prints the variables of the parameters
        // nums();
        nums2();
        nums3();
        nums4();
    }
    /*
    Task
    Write a Program with 2 variables, x and y . Write methods to
    add, multiply and subtract x and y
     */
//---
    // test
    //public static void nums(){
      //  para2(3, 5);  // parameters 2
    //}
//---


    // defining parameters for add method
    public static void nums2(){
        add(3, 5);
    }

    // defining parameters for subtract method
    public static void nums3(){
        subtract(3, 5);
    }

    // defining parameters for multiplying method
    public static void nums4(){
        multiply(3, 5);
    }

//---
    // test
    //private static void para2(int x, int y) {//{add();}// defining x and y as 3 and 5
    //System.out.println(x+y); // add
    //System.out.println(x-y); // subtract
    //System.out.println(x*y); // multiply
    //}
//---

    // adding add parameters
    private  static void add(int x, int y){ // calling add parameters
        System.out.println(x+y); // adding them
    }
    // subtracting subtract parameters
    private  static void subtract(int x, int y){ // calling subtract parameters
        System.out.println(x-y); // subtracting them
    }
    // multiplying multiply parameters
    private  static void multiply(int x, int y){ // calling multiply parameters
        System.out.println(x*y); // multiplying them
    }
}