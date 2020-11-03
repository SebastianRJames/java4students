package x22IntroToArrays;

public class IntroArrays {
    public static void main(String[] args) {
    int[]ray = new int[5]; // create an array with 5 slots, ray is the name of the array
    ray[0] = 19; // setting the first slot in the array to be 19
    System.out.println(ray[0]); // printing the first slot
    int [] array = {24,48,96,198}; // array
    System.out.println(array[2]); // print third slot
    array[3] = 76; // change 4th slot to be 76 instead of 198
    System.out.println(array[3]); // print third slot

    extension();
    }
    /*
    Task
        Create an Array of football teams below containing Chelsea,
        Liverpool, AFC and Man City.
        Then replace Man Utd with Man City
     */
    private static void extension(){
    String[]ray2 = new String[4];
    ray2[0] = "Chelsea"; // inputting things not really nessiccary when it is listed already below, only when changing variables or entering them for the first time.
    System.out.println(ray2[0]);
    ray2[1] = "Liverpool";
    System.out.println(ray2[1]);
    ray2[2] = "AFC";
    System.out.println(ray2[2]);
    String [] array2 = {"Chelsea","Liverpool","AFC","Man Utd"}; // the array
    ray2[3] = "Man City"; // replaces Man Utd with Man City
    System.out.println(ray2[3]);
    }
}
