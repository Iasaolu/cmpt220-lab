package Assignment_II;
import java.lang.*;
import java.util.*;

public class problem_2 {

	public static void main(String[] args) {
		// Generating four random numbers
		int one = (int) Math.floor(Math.random()*10);
		int two = (int) Math.floor(Math.random()*10);
		int three = (int) Math.floor(Math.random()*10);
		int four = (int) Math.floor(Math.random()*10);
		
		// Generating three random uppercase letters using ASCII
		int first = 65 + (int)(Math.random() * (90 - 65));
		int second = 65 + (int)(Math.random() * (90 - 65));
		int third = 65 + (int)(Math.random() * (90 - 65));
		
		//Printing out Plate Numbers
		System.out.println((char)(first)+""+(char)(second)+"" + (char)(third)+"-"+one+""+two+""+three+""+four);
		
	}

}
