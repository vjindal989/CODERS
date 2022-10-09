package block;
import java.util.Scanner;


public class area_of_circle {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int r;
		float p = 3.14f, area;
		
		System.out.println("enter radius of circle: ");		
		r = scan.nextInt();
		
		area = p*r*2;
		
		System.out.println(area);
		
	}
	
}
