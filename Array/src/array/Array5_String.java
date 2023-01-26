package array;

import java.util.Arrays;

public class Array5_String {
	
	public static void main(String [] args) {

		
		//String array
		
		String [] args1 = new String[5];
		
		args1[0]  = "Rohit";
		args1[1]  = "Virat";
		args1[2]  = "Dhonz";
		args1[3]  = "Dhoni";
		args1[4]  = "12345#$%^&";
		
		System.out.println(args1[3]);
		
		Arrays.sort(args1);
		
		//System.out.println(args1);
		
		for(int i=0 ;i<args1.length;i++) {
			
			System.out.println(args1[i]);
		}

}
}
