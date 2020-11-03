package x16whileLoops;

public class WhileLoops {
    public static void main(String[] args) {
        int x = 10;
        while(x<=10){
            System.out.println(x);
            x++;
        }
        extension();
        }


    /*
    Task
    Write a program to count down from 5.
    When it gets to zero, display , Here
    I come ready or not
     */

    private static void extension(){
        int y = 5;
        while(y>0){
            System.out.println(y);
            y--;
            if(y==0){
                System.out.println("Here I come ready or not!");
            }
        }
    }
}
