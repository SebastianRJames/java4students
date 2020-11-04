package x20forEx1;
/*
Task
Write a Loop to display the 12 times table
e.g.
    1 x 12 = 12
    2 x 12 = 24
    3 x .....
    Attempt to use printf as opposed to println to
    improve output
 */
public class ForEx1 {
    public static void main(String[] args) {
//         int x = 3; // defining x as 3
//        System.out.printf("I took my hat off %d times",x); // you can use %d to insert a number into the "" %s does the same but for strings
// %d references x in the printf function, x references 3 so it will replace %d with 3.
//    } // practicing print f
        int num = 12;
        for(int y = 1; y <= 12; y++){ // y = 0, run until y <= 12, until then add +1
            System.out.printf("%d * %d = %d \n",num,y,num*y); // first %d = num, second %d = y, third %d = num*y
        }
    }


}
