package one_lab;
import java.util.*;
import java.lang.Math;

public class problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the coordinates for two points: ");
		System.out.println("What is x1? ");
		Double x1 = scan.nextDouble();
		System.out.println("What is y1? ");
		Double y1 = scan.nextDouble();
		System.out.println("What is x2? ");
		Double x2 = scan.nextDouble();
		System.out.println("What is y2? ");
		Double y2 = scan.nextDouble();
		
		Double slope = (y2 - y1)/(x2-x1);
		
		System.out.println("The line that connects two points (" + x1 +"," + y1+ ") and ("+ x2+ "," + y2 +") is "+slope);
		

	}
	
}
