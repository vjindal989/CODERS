package block;

import java.util.Scanner;

public class prime_number {
public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int num,i, product ;
		boolean check = false; 
		System.out.print("enter the number: ");
		num = scan.nextInt();

		for(i = 2; i< num; i++) {
			
			if(num/i == 0 ) {
				
				check = true ;
				break;
			}
		}
			if (!check) {
			System.out.print("number is not prime");
			}
			else {
				
				System.out.print("number is  prime");
			}
			
		
		
		
}
}
