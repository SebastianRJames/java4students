package x25ArraysEx2;

public class ArraysEx2 {
    /*Task
    Put your name in an array ( arr[] = { "M","r","M","i","l","l"} )
    Produce a right angle triangle of the letters in your name

    i.e.
        M
        rM
        ill
        MrMi
     */
    public static void main(String[] args) {
        String[] nameArray = {"s", "e", "b", "a", "s", "t", "i", "a", "n"};
        int lengthVar = nameArray.length; // aka size of array = 9, lengthVar
        int countingVar = 0; // aka x

            for (int y = 0; y < 10; y++) { // is 10 so there are 9 lines, enough for the full name
                for (int x = 0; x < y; x++) { // change 15 to y so it makes the maximum number of characters the same as the line count
                    System.out.print(nameArray[countingVar]);// print character of array-countingvar
                    //System.out.print(nameArray[x]);
                    countingVar = (countingVar + 1) % lengthVar; //mod increments countingVar, prevents going above length var
                }
                System.out.println(); // new line
            }

    }
}
