package block;

import java.util.Scanner;

public class searching_in_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ar[] = new int[5];
		
		int i, sum = 0, res = 0 , loc = 1, x  ;
		
		System.out.println("enter array :");
		for(i = 0 ; i< 5 ; i++) {
			
			ar[i] =  sc.nextInt();
			
		
			
		}
		
		System.out.println("array :");
		for(i = 0; i<5; i++)
			
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("enter the element to be searched");
		x = sc.nextInt();
				
				for(i = 0 ; i < 5; i++) {
					
					{
						
		if(x == ar[i] ) {
			res = 1;
			loc = i;
			break;
		}
					}
		} 
					if (res == 1) {
						
						System.out.println("element found at position :" +loc);
					}
					
					else
					{
						System.out.print("element not found");
					}
	
}}
