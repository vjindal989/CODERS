package block;

import java.util.Scanner;

public class area_of_sphere {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int radius  ;
		float area, p = 3.14f;
		
		System.out.println("enter length of radius: ");		
		radius = scan.nextInt();
		
		
		area = 4*p*radius*radius;
				
		System.out.println("area of sphere = " +area);
		
	}
}
