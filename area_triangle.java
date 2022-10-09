package block;

import java.util.Scanner;

public class area_triangle {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int height , base  ;
		float area;
		System.out.println("enter length of base: ");		
		base = scan.nextInt();
		System.out.println("enter length of height : ");
		height = scan.nextInt();
		
		area = (base*height)/2f;
		System.out.println("area of rectangle = " +area);
		
	}
}
