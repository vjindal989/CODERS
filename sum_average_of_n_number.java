package block;
import java.util.Scanner;  
public class sum_average_of_n_number {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	         double mark_avg;
	         int result;
	         int i;
	         int s;
	         int j , temp = 0, sum = 0;
	      //define size of array
	       s = input.nextInt();
	     //The array is defined  arr and inserted marks into it.
	       
	      int[] arr = new int[s];   
	      for(i=0;i<arr.length;i++)
		  {
		arr[i]=input.nextInt();
	        }
	        for (i = 0; i < arr.length; i++) {     
	            for (j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	                  
	               }    
	            }
	        }result = arr[0]; 
            System.out.println(result);
	              
	              
	            
	
	for ( i = 0 ; i< arr.length ; i++){
        sum =sum +  arr[i];
        
       
	              
	              
	        }     mark_avg = sum/arr.length;
	        	System.out.print(mark_avg);


	}
	
}