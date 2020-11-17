package x37CreatingFiles;


import java.util.Formatter;

public class createFiles {
	public static void main(String[] args) {
		Formatter x; // format x
		try{ // will try this code and
			x = new Formatter("Geronimo.txt"); // format x a new txt file with name geronimo
		}
		catch(Exception e){ // and if there is an error, catch and do this instead
			System.out.println(e);
		}
	}
}
