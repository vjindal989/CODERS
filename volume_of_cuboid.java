package block;

import java.util.Scanner;

public class volume_of_cuboid {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int l,b,h, volume  ;
		
		System.out.println("enter length of cuboid: ");		
		l = scan.nextInt();
		System.out.println("enter length of cuboid: ");		
		b = scan.nextInt();
		System.out.println("enter length of cuboid: ");		
		h = scan.nextInt();
		
		
		volume = l*b*h;
				
		System.out.println("volume of cuboid = " +volume);
		
	}
}
