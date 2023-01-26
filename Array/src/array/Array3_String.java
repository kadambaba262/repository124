package array;

import java.util.Arrays;

public class Array3_String  {

	public static void main(String[] args) {

		String str[] = new String[4];
		
		str[0] = "Rushi";
		str[1] = "Raj";
		str[2] = "Kajal";
		str[3] = "Prachi";
		
		System.out.println(str[2]);
		System.out.println(str.length);
		System.out.println(str[0]);
		System.out.println();
		Arrays.sort(str);
		
		for(int i=0; i<(str.length); i++) {
			System.out.println(str[i]);
		}
		
	}

}
