package block;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int input ;
		float  a, b,  division, sum, difference, product ;
		System.out.println("enter the type of operation you want to do : ");		
		System.out.println("1. sum");
		System.out.println("2. difference");		
		System.out.println("3. product ");
		System.out.println("4. division ");
		System.out.println("5. press 5 to exit: ");
		input = scan.nextInt();
		
		
		if (input == 5 ) {
			
			System.out.println("Thanks for using this calculator");
			
		}
		else {
			System.out.println("enter 1st number: ");		
			a = scan.nextFloat();
			System.out.println("enter 2nd number : ");
			b = scan.nextFloat();
		
		if (input == 1 ){
			 
			sum = a + b;
			System.out.println("sum of two numers is :"+sum);
			
			}
			else if (input == 2){
				
				difference = a - b;
				System.out.println("difference of two numers is :"+difference);
				
			}
			else if (input == 3) {
				
				product = a*b;
				System.out.println("product of two numers is :"+product);
			}
			
			else if(input == 4) {
				
				division = a/b;
				System.out.println("division of two numers is :"+division);
			}
	}
	}
}
