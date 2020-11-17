package x39ReadingFiles;
import java.io.*;
import java.util.*;
public class readingFiles {
    static Scanner x; // READ FILE
    public static void main(String[] args) {
        try{
            x = new Scanner(new File("avaMax.txt")); // using x as scanner, read file ava
        }
        catch (Exception e){
            System.out.println("welp"); // if doesn't work then do this
        }
        while(x.hasNextLine()){ // while reader has another line in the file...
            System.out.println(x.nextLine()); // print the line the reader is on
        }
        x.close(); // close the file
    }
}
