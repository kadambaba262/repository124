package array;

import java.util.Arrays;

public class Array1_int {

	public static void main(String[] args) {
		// Store 1 to 10 number 
		
				int a = 1;
				int b = 2;
				int c = 3;
			 
			  //  int x = 10;
			    
			   System.out.println(a);
			   System.out.println(b);
			   System.out.println(c);
			   
			   
			   //Array declaration
			   
			  
			   int arr [] = new int[10];  // Single Dimensional
			   
			   //Array initialization
			   arr[7] = 50;
			   arr[0] = 10;
			   arr[1] = 20;
			   arr[2] = 30;
			   arr[3] = 40;
			   arr[4] = 80;
			   arr[5] = 90;
			   arr[6] = 70;
			   arr[9] = 100;
			   arr[8] = 60;
			  	   
			 //  arr[12] =3000;   // ArrayIndexOutOfBoundsException
			   
			   //Array usage
			   
			   System.out.println(arr[3]);
			   System.out.println(arr[7]);
			   System.out.println(arr[9]);
			   
			   
			   System.out.println();
			   
			   System.out.println("Array Length :"+arr.length);
			   
			   System.out.println();
			   
		 	   //Arrays.sort(arr);   // To sort the arrays in ascending order. 
		 	                       //AND Their is no posibility to make the arrays in decending order.
			   
			   for (int i=0; i<arr.length;i++) {
				   System.out.println(arr[i]);
				  
			   }
			   
			   String str[] = new String [8];
			   
			   str[0]="Raj";
			   str[1]="Rushi";
			   str[2]="Prachi";
			   str[3]="Kajal";
			   str[4]="Dipali";
			   str[5]="Mayuri";
			   str[6]="Durgeshwary";
			   str[7]="Kuldip";
			   
			   System.out.println(str[6]);
			   System.out.println();
			   System.out.println(str[5]);
			   System.out.println(str[3]);
			   System.out.println(str[4]);
			   
				   
	}
}
