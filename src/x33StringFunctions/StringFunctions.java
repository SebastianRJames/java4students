package x33StringFunctions;
public class StringFunctions {
    static String team = "AFCWimbledon";
    public static void main(String[] args) {
        System.out.println(team.length()); //  prints length; 12
        System.out.println(team.toLowerCase()); // prints all lowercase
        System.out.println(team.toUpperCase()); // prints all uppercase
        System.out.println(team.charAt(4)); // prints the 5th character
        System.out.println("\n");
        extension();
    }
/*  Task
    Turn AFC Wimbledon into a Cheerleader chant i.e.
    Gimme an A, Gimme an F, Gimme..... All letters
    should be capitalised
*/
    private static void extension(){
        int x = 0;
        while(x<team.length()){
            team.toUpperCase();
            System.out.println("Gimme an " + team.charAt(x));
            x++;
        }



    }
}
