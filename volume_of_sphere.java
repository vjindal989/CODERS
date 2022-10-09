package block;

import java.util.Scanner;

public class volume_of_sphere {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int radius  ;
		float volume, p = 3.14f;
		
		System.out.println("enter length of radius: ");		
		radius = scan.nextInt();
		
		
		volume = (4*p*radius*radius*radius)/3f;
				
		System.out.println("area of sphere = " +volume);
		
	}
}
