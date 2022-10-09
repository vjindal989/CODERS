package block;

import java.util.Scanner;

public class fibonacci_series {

public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, i, j = 0, k = 1, sum;
		 
		a = scan.nextInt();
		
			for (i=1; i<=a; i++) {
				
				
				
				System.out.print(j + " ");
				sum = j+ k;
				
				j = k;
				k = sum;
				
			}

			
		
}
}
