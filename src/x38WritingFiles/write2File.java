package x38WritingFiles;
import java.io.*;
import java.util.*;
public class write2File {
static private Formatter frm; // making frm  format.
    public static void main(String[] args) {
        try{ // do this unless it doesn't work, then do catch
            FileWriter fw = new FileWriter("dugong.txt",true); // fw is short for FileWriter = new FileWriter (name of file, append)
            frm = new Formatter(fw); // format(make) the new file fw (line above)
        }
        catch (Exception e){ // do this if doesn't work
            System.out.println("Aaargh"); // if try code makes an error then print
        }
        frm.format(" %s %d \n","Taylor",22); // format file like this. %s means string here, %d means decimal here, \n means then go to next line
        frm.close(); // closes the file

        extension();
    }
/* Write a program to record the name and phone
number ( cov-vid style )for all the diners
at McDonalds  */

    private static void extension(){
        try{
            FileWriter fw1 = new FileWriter("McDonaldsCustomers2.txt",true); // creates fw1 new file called so.
            frm = new Formatter(fw1); // make the file fw1 McDonaldsCustomers with formatter
        }
        catch(Exception f){
            System.out.println(f);
        }
        //frm.format("%s %d \n","seb",17); // string, number, newline.
        //frm.close(); // closes the file

        // creating name question
        Scanner askQ1 = new Scanner(System.in); // creating new scanner object
        System.out.println("Enter your name"); // asks question
        String name = askQ1.nextLine(); // reads input
        System.out.println(name + " has been added to file");

        // creating age question
        Scanner askQ2 = new Scanner(System.in);
        System.out.println("Enter your age");
        String age = askQ2.nextLine();
        System.out.println(age + " has been added to the file");

        frm.format(name + " " + age + "\n"); // formatting name and age to file
        frm.close(); // close the file
    }
}