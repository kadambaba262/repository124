package array;

import java.util.Arrays;

public class Array11_Duplicate_String {

	public static void main(String[] args) {
		
		String  str[] = {"Raj","Kajal","Ankita","Prachi ","Rushi","Kajal","Raj","Ankita"};
		
		
		System.out.println("Reverse Array");
		for (int j= str.length-1; j>=0; j--) {
			System.out.println(str[j]);
		}
		System.out.println();
		
		for(int i=0; i<str.length; i++)	{
			for (int j=i+1; j<str.length;j++) {
				
					
				if (str[i]==str[j]) {
					System.out.println("Duplicate no. are "+str[j]);
			}
       }
		}
		System.out.println();
		System.out.println("Alphabetically");
		
		Arrays.sort(str);
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
	
	}
}
