package arrayListsEasterTerm;

import java.util.ArrayList;
import java.util.Random;

public class arrayLists {
    public static void main (String[] args){
        // making an array list
        ArrayList<Integer> inter = new ArrayList<Integer>();
        inter.add(17); // calls the list, add, value
        inter.add(7);
        inter.add(99);
        inter.add(67);
        inter.add(14);
        //inter.remove(2); // removes the second item in the list
        //System.out.println(inter);


        // loop to add 5 more numbers
        for (int y = 0;y <= 10; y ++){
            Random random = new Random();
            int randomInt = random.nextInt(100); // generates a random number from 0 to 100.
            inter.add(randomInt);
        }

        // loop to print every other number
        for (int x = 0; x<inter.size();x +=2){
            System.out.println(inter.get(x));
        }
        System.out.println();
        // new list

        ArrayList<String> Queen = new ArrayList<String>();
        Queen.add("Rock");
        Queen.add("you");
        Queen.add("we");
        Queen.add("will");
        System.out.println(Queen.get(2)); // .get will fetch the item from the list
        System.out.println(Queen.get(3));
        System.out.println(Queen.get(0));
        System.out.println(Queen.get(1));
    }
}
// if you want integers and strings in 1 list then you can create objects