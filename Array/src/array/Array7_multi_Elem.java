package array;

import java.util.Arrays;

public class Array7_multi_Elem{
	
public static void main(String[] args) {

		
		//Dec & initi
		
		int arr [] =new int [4];
		arr[0] =5;
		
		
		int arr1[]  = {10,30,50,22,55,99,3,35,65,26,23,5,66}; // We can store multiple elements in a array.
		
		System.out.println(arr1.length);
		System.out.println(arr1[7]);
		System.out.println(arr1[9]);
		Arrays.sort(arr1);
		
	    for(int i=0 ;i<arr1.length;i++) {
			
			System.out.print(arr1[i]+" ");
		}
		
	}

}
