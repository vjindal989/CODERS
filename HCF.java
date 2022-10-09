package block;

import java.util.Scanner;

public class HCF {


	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, remainder;
		
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		
		
		while ( b > 0) {
			
		
		remainder = b;
		b = a % b;
		a = remainder;
		
		}
		
		System.out.print(a);
		
		{
		
		}
		
	}
}
