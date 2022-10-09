package block;

import java.util.Scanner;

public class table {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int num,i, product ;
		
		System.out.print("enter the number: ");
		num = scan.nextInt();
		
		for ( i = 1; i<= 10 ; i++) {
			
			product = num*i;
			System.out.println(num + "*" + i + " = " + product);
		}
		
	}
}
