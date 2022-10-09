package block;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ar[] = new int[5];
		
		int i, sum = 0 ;
		
		System.out.println("enter array :");
		for(i = 0 ; i< 5 ; i++) {
			
			ar[i] =  sc.nextInt();
			
		
			
		}
		
		System.out.println("array :");
		for(i = 0; i<5; i++)
			
		{
			System.out.println(ar[i]);
			
			sum = sum + ar[i];
		}
		System.out.println("sum");
		System.out.println(sum);
		
	}
}
