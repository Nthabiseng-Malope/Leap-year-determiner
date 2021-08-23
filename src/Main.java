import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner bye = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = bye.nextInt();
		
		//Check if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
		
		//Display the result
		System.out.println(year + " is a leap year? " + isLeapYear);
		
		/*
		 * enter 2008
		 * answer = 2008 is a leap year? true
		 */
		
		/*
		 * enter 1900
		 * answer = 1900 is a leap year? false
		 */
		

	}

}
