package hwVPartOne;
import java.lang.*;

public class hwVpart_One {

	public static void main(String[] args) {
		//create a 6X6 matrix
		int[][] matrix = new int[6][6];
		int number_of_ones_in_row = 0;
		int number_of_ones_in_column = 0;
		
		//auto-generate numbers for matrix
		for (int i =0; i<matrix.length; i++) {
			for(int j = 0; j< matrix[i].length; j++) {
				// randomly generate number, round it then change into integer
				matrix[i][j] = (int) Math.round((Math.random())); 
			}
		}
		
		
		
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		//loop through each row
		for (int i = 0; i < matrix.length; i++) {
			
			////reset number of ones in row to zero after looping through each row
			number_of_ones_in_row = 0;
		    for (int j = 0; j < matrix[i].length; j++) {
		    	
		        //count number of ones in each row
		    	if(matrix[i][j] == 1) {
		    		number_of_ones_in_row +=1;
		    	}
		    }
		   //print out if number of ones is even or odd
		    if (number_of_ones_in_row %2==0) {
		    	System.out.println("Row "+ i+" has "+number_of_ones_in_row +" ones in it which is an even number");
		    }
		    else {
		    	System.out.println("Row "+ i+" has "+number_of_ones_in_row +" ones in it which is not an even number");
		    }
		    System.out.println();
		}
		
		
		
		//loop through each column
		for (int i = 0; i < matrix.length; i++) {
			
			//reset number of ones in column to zero after looping through each column
			number_of_ones_in_column = 0;
		    for (int j = 0; j < matrix[i].length; j++) {
		    	
		        //count number of ones in each column
		    	if(matrix[j][i] == 1) {
		    		number_of_ones_in_column +=1;
		    	}
		    	
		    }
		  
		  //print out if number of ones is even or odd
		    if (number_of_ones_in_column %2==0) {
		    	System.out.println("Column "+ i+" has "+number_of_ones_in_column +" ones in it which is an even number");
		    }
		    else {
		    	System.out.println("Column "+ i+" has "+number_of_ones_in_column +" ones in it which is not an even number");
		    }
		    System.out.println();
		}

	}

}
