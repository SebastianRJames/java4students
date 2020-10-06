package x08Else;

import x07ElseIf.ElseIf;

public class Else {
    public static void main(String[] args) {
        int dog = 5;
        if (dog > 6) System.out.println("It's big enough");
        else if (dog == 6) {
            System.out.println("It's jsut right");
        } else {
            System.out.println("Could be my slippers");


        }
        String breed = "labrador thing";
        if (breed == "labrador") {
            System.out.println("Sweet :)");

        } else if (breed != "labrador") {
            System.out.println("I'm sure it's cool too :)");
        }
    }


    //extension();
//}
    /*
    Task
    If the breed is anything else, say "I'm sure its cool too"


     */









    private static void extension(){

    }
}
