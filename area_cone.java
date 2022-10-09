package block;

import java.util.Scanner;
import java.lang.Math;

public class area_cone {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int height , radius  ;
		float  p = 3.14f, a;
		double area;
		System.out.println("enter length of radius: ");		
		radius = scan.nextInt();
		System.out.println("enter length of height : ");
		height = scan.nextInt();

		Double squareroot = Math.pow(radius*radius + height*height, 0.5);
		
		area = p*radius*radius + p*radius*squareroot;
				
		System.out.println("area of cone = " +area);
		
	}
}
