package x09LogicalOperators;

public class LogicalOperator {
    public static void main(String[] args) {
            String Team = "AFC";
            int place = 1;

            if(Team== "AFC" && place == 1){ // && = combine two boolean expressions and return true only if both expressions are true.
                System.out.println("AND - Both are true");
            }else if (Team== "AFC" || place == 1){ // || = logical OR operator - returns true if either one or both of the criteria is true, false if both are false
                System.out.println("OR - At least one is true");
            }
        extension();
        }




    /*
    Task

    Write an algorithm using the 2 variables already there.
    - If they have 2 legs and they breathe oxygen, they are human.
    - If they have 4 legs and they breath oxygen, they are a dog.
    - If they have don't breathe Oxygen or have 2/4 legs,
      they are not a mammal


     */









    private static void extension(){

    }

}
