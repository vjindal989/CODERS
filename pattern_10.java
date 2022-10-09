package block;

public class pattern_10 {
public static void main(String[] arg) {
		
		int i , j ;
		
		for (i = 1; i<= 5; i++)
		{for(j = 2 ; j<=i ;j++) {
			System.out.print(" ");
			
		}
		
			
			
			
			for (j = 5; j>= i; j--) {
			System.out.print("*");
			
		}
			for (j =4 ; j >= i; j-- )
			{
				System.out.print("*");
			}
			
		System.out.println();
		
	}

}
	
}
