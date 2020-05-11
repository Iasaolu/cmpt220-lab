package hwVPartOne;

import java.util.*;
public class practice {
	
	public static void main(String[] args) {
		int i =25;
	
			double[] myList = {1,2,3,4,5,6,7,8,9};
			for ( i = 0; i < myList.length - 1; i++) { 
				// Generate an index j randomly
				int j = (int)(Math.random()
				* myList.length);
				  // Swap myList[i] with myList[j]
				double temp = myList[i];
				myList[i] = myList[j]; 
				myList[j] = temp;
				}
			for(i =0; i<myList.length;i++) {
	
					System.out.println(myList[i]+" ");
		
	}
		System.out.println(i);
	

}
	}
