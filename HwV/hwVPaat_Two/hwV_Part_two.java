package hwVPaat_Two;

import java.util.*;

public class hwV_Part_two {
	
	public static boolean isMarkovMatrix(double[][] m) {
		for(int i=0;i<m.length;i++ ) {
			
			for(int j=0;j<m[i].length;j++ ) {
				
				if(m[i][j]<0) {
					return false;
				}
			}
		}
		double sum_of_column = 0;
		for(int i=0;i<m.length;i++ ) {
			sum_of_column = 0;
			for(int j=0;j<m[i].length;j++ ) {
				
				sum_of_column += m[j][i];
				
				}
			if(sum_of_column!=1) {
				return false;
			}
		
		}
		
		
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[][] matrix = new double[3][3];
		
		for (int i = 0; i<matrix.length; i++) {
			
				System.out.println("Type in the row "+ i);
				matrix[i][0]= scan.nextDouble();
				matrix[i][1]= scan.nextDouble();
				matrix[i][2] = scan.nextDouble();
			
		}
		scan.close();
		
		for(int i=0;i<matrix.length;i++ ) {
			
			for(int j=0;j<matrix[i].length;j++ ) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		if(isMarkovMatrix(matrix)) {
			System.out.println("It is a Markov Matrix");
		}
		else {
			System.out.println("It is not a Markov Matrix");
		}
	}

}
