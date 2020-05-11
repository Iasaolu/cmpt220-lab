package problem2;
import java.util.*;

public class Problem2
{ 

    public static int Sum(int n) 
    { 
        if (n <= 1) 
            return n; 
        return Sum(n - 1)+n; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Type in a number ");
        int n = scan.nextInt(); 
        System.out.println(Sum(n)); 
        scan.close();
    } 
} 
