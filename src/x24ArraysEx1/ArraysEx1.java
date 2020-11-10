package x24ArraysEx1;

public class ArraysEx1 {
    /*
    Task
    Put your name in an array ( arr[] = { "M","r","M","i","l","l"} )
    Using a loops, have your computer generate a square of 15 characters
    by 15 of the letters of your name
     */
    public static void main(String[] args) {
            //int[]array = new int[9];
            //String [] arrName = {"s","e","b","a","s","t","i","a","n"};
            //System.out.println(arrName.length); // .length uses human numbers 1-9, not 0-8
            // System.out.print(arrName[0]); System.out.print(arrName[1]);System.out.print(arrName[2]); // this works but doesn't use loops

//            for(int y=0;y<15;y++){ // limit to 15 characters, y is the length of the array
//                System.out.println(y); // test for numbered letters
//                int x = y; //
//                if (x>=arrName.length) // if x is bigger or equal to arrayName's length
//                    x=0; // reset x at 0
//                System.out.print(arrName[x]);
//
//            }
        //attempt 3
        String [] nameArray = {"s","e","b","a","s","t","i","a","n"};
        int lengthVar = nameArray.length; // aka size of array
        int countingVar = 0; // aka x
        // int i = 0;

        for(int y = 0; y<lengthVar;lengthVar++){
            for(countingVar = 0; countingVar<9; countingVar++){
                if(countingVar>lengthVar){
                    countingVar = countingVar-lengthVar;
                    System.out.print(countingVar);
                }
                System.out.print(nameArray.charAt(countingVar));
            }
            System.out.println(""); // returns line
        }









    }

}

// us printf to make a box with the characters = for next q
//seb
//ast
//ian