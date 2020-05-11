package hWIV;
import java.util.*;
import java.lang.*;

public class computeDeviation {
	public static double deviation(Double[] x) {
		double deviation = 0;
		double sum = 0.0;
		double mean = 0.0;
		double denominator = x.length -1;
		double sum_of_difference = 0.0;
		double difference = 0;
		
		// calculate sum of array
		for(int i =0; i<x.length; i++) {
			sum+= x[i];		
		}
		
		//calculate mean
		mean = sum/x.length;
		
		//calculate deviation
		for (int j =0; j<x.length;j++) {
			difference = x[j] - mean;
			sum_of_difference += difference*difference;
		}
		deviation = Math.sqrt(sum_of_difference/denominator);
		
		return deviation; 
	}
	
	public static double mean(Double[] x) {
		double mean = 0;
		//sum of array
		double sum =0.0;
		
		// calculate sum of array
		for (int i =0; i < x.length; i++) {
			sum += x[i];}
		//calculate mean
		mean = sum/x.length;
		return mean;
		
		
		
	}
	
	public static void main(String[] args) {
		//Create scanner
		Scanner scan = new Scanner(System.in);
		
		//create array
		Double[] mylist = new Double [10];
		
		System.out.println("Type in 10 Numbers ");
		
		for (int i = 0; i< 10; i++) {
			mylist[i] = scan.nextDouble();
		}
		System.out.println(mean(mylist));
		System.out.println(deviation(mylist));
		
		
		
	}
}
