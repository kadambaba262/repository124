package array;

import java.util.Arrays;

public class Array9_Reverse{
	
	public static void main(String[] args) {

		
//		int arr [] = {2,4,5,7,3,45,66};
//		
//		System.out.println("Original Array");
//		
//		
//		for(int i= 0 ;i<arr.length;i++) {
//			
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println("Reverse Array");
//		
//		for(int j=arr.length-1;j>=0;j--) {
//			
//			System.out.print(arr[j]+" ");
//		}
		
		String arr[] = {"Baba","Kajal","Rushikesh","Prachi"};
		
		System.out.println("Original Array");
		System.out.println();
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("Reverse Array");
		
		System.out.println();
		
	for (int j=arr.length-1; j>=0;j--) {
		System.out.println(arr[j]);
	}
		
		System.out.println();
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	}
	


