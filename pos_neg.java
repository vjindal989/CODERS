package block;

import java.util.Scanner;

public class pos_neg {
public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		 
		a = scan.nextInt();
		
		if (a< 0) 
		{
			System.out.println("number is negative");
		}
		else if (a > 0) {
			System.out.println("number is postive");
		}
		
		else 
		{
			System.out.println("you entered zero");
		}
}
}
