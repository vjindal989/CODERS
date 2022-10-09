package block;

import java.util.Scanner;

public class area_of_hemisphere {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int radius  ;
		float area, p = 3.14f;
		
		System.out.println("enter length of radius: ");		
		radius = scan.nextInt();
		
		
		area = 3*p*radius*radius;
				
		System.out.println("area of hemisphere = " +area);
		
	}
}
