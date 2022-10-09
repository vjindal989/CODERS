package block;

import java.util.Scanner;

public class input_date {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int date, month, year , choice ;
		
		System.out.println("1. Enter Date");		
		System.out.println("2. Show date");
		System.out.println("3. Exit");		
		
		choice = scan.nextInt();
		
		if (choice == 3) {
			
			System.out.println("Thanks for Visisting");
			
		}
		
		else if (choice == 2) {
			
			System.out.println("22/04/2022");
			
		}
		else if (choice == 1) {
			
			System.out.println("enter date");
			
		
		
		date = scan.nextInt();
	
		if ( date >= 1 && date <= 31 ) {	
			
			
			System.out.println("enter month");
		 
			month = scan.nextInt();
		
		
				if (month  >= 1 && month <= 12) {
				
					System.out.println("enter year");
				
				
				
			    year = scan.nextInt();
				if (year  >= 2000 && month <= 2074) {
				
				System.out.print("Entered date is : "+date + "/" + month + "/" + year);
				
			}else {
				System.out.println("invalid year");
	
	}}
		else {
			System.out.println("invalid month");
		}}
		else {
			System.out.println("invalid date");
		}}}
}

