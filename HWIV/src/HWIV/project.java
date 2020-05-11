package HWIV;

public class project {

	public static void main(String[] args) {
		//total number in array
		int n= 50;
		
		//create boolean array 
		boolean prime_numbers[] = new boolean[n+1];
		
		//make every item after index 1 in array true
		for(int i = 2; i<n;i++) {
			prime_numbers[i] = true;
		}
		
		//check through loop and set multiples to false
		for(int j=2; j*j<n;j++) {
			if(prime_numbers[j]==true) {
				for(int p = j*j; p<n; p+=j ) {
					prime_numbers[p]= false;
				}
			}
		}
		//loop through prime numbers array and print out prime numbers 
		for(int h = 2; h<n;h++ ) {
			if(prime_numbers[h]) {
				System.out.print(h+" ");
			}
		}
}
}