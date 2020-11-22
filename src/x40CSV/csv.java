package x40CSV;

import java.io.FileWriter;
import java.io.IOException;

public class csv {
    String fName = "Giraffe.csv"; // name of csv
    String[] houses = {"Park","Gosden","Haygate"}; // string of houses
    int[] points = {15,13,19}; // string of integers

    public csv() throws IOException {
        writeCSV(); // calls function below to write to csv
    }
    private void writeCSV() throws IOException {
        FileWriter write = new FileWriter(fName); // Write to new file called Giraffe.csv
        for (int i = 0; i<4;i++){ //
            write.append(houses + "," + points + "\n"); // formatting contents of file
        }
    }
}

/*
Define a constructor

a subroutine used to create an object

Define the term throws in Java

is used to create a custom error?
 */
