package block;

import java.util.Scanner;

public class volume_of_cylinder {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int height , radius  ;
		float  p = 3.14f, a,volume;
		
		System.out.println("enter length of radius: ");		
		radius = scan.nextInt();
		System.out.println("enter length of height : ");
		height = scan.nextInt();
		
		volume = p*radius*radius*height ;
				
		System.out.println("volume of cylinder = " +volume);
		
	}
}
