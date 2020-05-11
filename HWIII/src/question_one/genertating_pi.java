package question_one;


import java.lang.*;


public class genertating_pi {

	public static void main(String[] args) {
		
		// Declaring variables for minimum, maximum and number of hits
		int max = 1;
		int min = -1;
		double numberOfHits = 0;
		
		// for loop to randomly generate points on the x and y coordinates
		for(int i =0; i<1000000; i++) {
			double x = (Math.random() * (max-min))+min;
			double y = (Math.random() * (max-min))+min;
			
			// calculate number of hits
			double sum_of_squares = (x*x) + (y*y);
			double square_root = Math.sqrt(sum_of_squares);
			
			if (square_root <1) {
				numberOfHits ++;
			}
			
		}
		
	
		
	;
		double pie = (4* numberOfHits/1000000);
		System.out.println(pie);
		
		System.out.format("%.2f",pie);
		
		
	}

}
