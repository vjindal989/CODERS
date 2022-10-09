package block;

import java.util.Scanner;

public class add {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a , b ,c,d , e, f ;
		
		System.out.println("enter 1st number: ");		
		a = scan.nextInt();
		System.out.println("enter 1st no : ");
		b = scan.nextInt();
		
		c = a + b;
		d = a - b;
		e = a*b;
		f = a%b;
		System.out.println("result= " +c);
		System.out.println("result= " +d);
		System.out.println("result= " +e);
		System.out.println("result= " +f);
		
	}
	
}
