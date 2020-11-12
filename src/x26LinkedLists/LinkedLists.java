package x26LinkedLists;

import java.util.LinkedList;
public class LinkedLists {
    static LinkedList<String> houses = new LinkedList<>(); // defining houses as the list
    public static void main(String[] args) {
            houses.add ("hazelvere"); // adding houses to list
            houses.add ("summerfield");
            houses.add ("school");
            System.out.println(houses.get(1)); // print specific house in list
            houses.set(0,"HMP Hazelvere"); // setting new value in list place 0
            System.out.println(houses); // print houses

        extension();
    }
    /*
    Using the push command, add Sutton and the
    4 girls houses to the linked list. Then Demonstrate
    you know how pop works
     */
    private static void extension(){
        houses.push("Sutton");
        houses.push("Gosden");
        houses.push("Haygate");
        houses.push("Park"); // adds to the list
        System.out.println(houses);
        houses.pop();
        System.out.println(houses); // pop removes the first thing in the list









    }
}
