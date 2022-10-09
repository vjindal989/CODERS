package block;

import java.util.Scanner;

public class area_of_rectangle {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a , b ,area ;
		
		System.out.println("enter 1st side: ");		
		a = scan.nextInt();
		System.out.println("enter 1st side : ");
		b = scan.nextInt();
		
		area = a*b;
		System.out.println("area of rectangle = " +area);
		
	}
}
