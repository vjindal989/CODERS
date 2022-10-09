package block;

import java.util.Scanner;

public class voulme_of_cube {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a, volume  ;
		
		System.out.println("enter length of side: ");		
		a = scan.nextInt();
		
		
		volume = a*a*a;
				
		System.out.println("volume of cube = " +volume);
		
	}
}
