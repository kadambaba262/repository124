package array;

import java.util.Arrays;

public class Array2_char {
	
	public static void main(String[] args) {
		

		//char ch1[] = new char [-5]; //NegativeArraySizeException
		
		char ch[] = new char [5];
		ch[0]  =  'A';
		ch[1]  =  '2';
		ch[2]  =  '@';
		ch[3]  =  'Z';
		ch[4]  =  'j';
		
		
		System.out.println(ch[2]);
		
		System.out.println(ch.length);
		
		Arrays.sort(ch);
		
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(ch[i]);
		}
 	}

}
	
	


