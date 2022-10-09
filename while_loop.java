package block;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int i,j = 0, n = 1, sum = 0;
		
		i = scan.nextInt();
		
		while ( n <= i) {
			
			sum = n + j;
			j = sum ;
			n++;
			
		}System.out.print(sum);
		
	}
}
