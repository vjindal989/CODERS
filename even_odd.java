package block;
import java.util.Scanner;

public class even_odd {
	
public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		 
		a = scan.nextInt();
		
		if (a%2 == 0) 
		{
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
}
}
