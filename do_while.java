package block;

import java.util.Scanner;

public class do_while {
public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int i,j = 0, n = 1, sum = 0;
		
		i = scan.nextInt();
		
		do {
			sum = n + j;
			j = sum ;
			n++;
		}
			
		
		while ( n <= i) ;
			
			
		
		System.out.print(sum);
		
	}
}
