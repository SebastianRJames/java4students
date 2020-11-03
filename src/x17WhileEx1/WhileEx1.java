package x17WhileEx1;
/*
  Task
  Write a Loop to display the 12 times table
  e.g.
      1 x 12 = 12
      2 x 12 = 24
      3 x .....
   */
public class WhileEx1 {
    public static void main(String[] args) {
//            int num = 12;
//            for(int x = 1; x<=12;x++){
//                System.out.printf("%d * %d = %d \n", num,x,num*x); // printf prints a formatted string
//            }
        //above is a for loop - working
        //below is a while loop - working
            int num = 12, x =1; // defining two values
            while(x<=12){ // while x is less than 12 (will run until has completed 12 times)
                System.out.printf("%d * %d = %d \n",num,x,num*x); // this formats the output- first * second = ans, then +1 to x.   |   num replaces first, x replaces second, = 12*x replaces third
                x++;
            }
        }
    }
