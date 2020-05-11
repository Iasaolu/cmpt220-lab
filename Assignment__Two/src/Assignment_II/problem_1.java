package Assignment_II;
import java.util.*;

public class problem_1 {

	public static void main(String[] args) {
		// create Scanner
		Scanner scan = new Scanner(System.in);
		
		//Take in user's month 
		System.out.println("Type in the month in numeric form: ");
		int month = scan.nextInt();
		
		//Take in user's day of week
		System.out.println("Type in the day of week in numeric form: ");
		int day = scan.nextInt();
		
		//Take in user's year
		System.out.println("Type in the year in numeric form: ");
		int year = scan.nextInt();
		
		// Calculate day of the week in numeric form
		int y_0 = year - ((14-month)/12);
		int x =(y_0 + y_0 / 4) - (y_0/100) + (y_0/400);
		int m_0 = (month+12) * ((14-month)/12) - 2;
		int d_0 = (day + x +(31*m_0)/12) %7;
		
		if(d_0 == 1) {
			System.out.println("Monday");
		}
		else if(d_0 ==2) {
			System.out.println("Tuesday");
		}
		else if(d_0 ==3) {
			System.out.println("Wednesday");
		}
		else if(d_0 ==4) {
			System.out.println("Thursday");
		}
		else if(d_0 ==5) {
			System.out.println("Friday");
		}
		else if(d_0 ==6) {
			System.out.println("Saturday");
		}
		else if(d_0 ==0) {
			System.out.println("Sunday");
		}
		
				
		scan.close();
		

	}

}
