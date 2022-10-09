package block;

import java.util.Scanner;

public class leap_year {
	
public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int year;
		 
		year = scan.nextInt();
		
		if (year%4 == 0) 
		{
		
			if (year%100 != 0) {
				System.out.println("year is a leap year");
			}
			
			else if ((year%100 == 0 ) && (year%400 == 0 )) {
			System.out.println("year is a leap year");
			}
			else if ((year%100 == 0 ) && (year%400 != 0 ))
			{
			System.out.println("year is not a leap year");
			}
			
			
		}
		else {
			System.out.println("year is not a leap year");
		}
		}
}
