package x23ArrayMethods;
public class ArrayMethods {
    public static void main(String[] args) {
        int []Methods = {24,48,96,188}; // defining the array
        System.out.println(Methods.length); // print the length of methods
        for (int y = 0;y<Methods.length;y++){ // checks every number in the list until length(in human numbers=4). y goes up by 1 until the length of the array is fulfilled
            System.out.println(Methods[y]); // prints the whole array, y, which is all of the numbers in the array
        }
        extension();
    }
    /*
    Task
        Loop through the List of teams from the last exercise.
        Have the position number next to the team
        e.g.    1.Chelsea,
                2. Liverpool
                3. .....
    */
    private static void extension(){
        String[]ray2 = new String[4];
        ray2[0] = "1.Chelsea"; // inputting things not really nessiccary when it is listed already below(this overrides the displayed list), only when changing variables or entering them for the first time.
        System.out.println(ray2[0]);
        ray2[1] = "2.Liverpool";
        System.out.println(ray2[1]);
        ray2[2] = "3.AFC";
        System.out.println(ray2[2]);
        String [] array2 = {"1.Chelsea","2.Liverpool","3.AFC","4.Man Utd"}; // the array
        ray2[3] = "4.Man City"; // replaces Man Utd with Man City
        System.out.println(ray2[3]);
        System.out.println(array2);
    }
}
