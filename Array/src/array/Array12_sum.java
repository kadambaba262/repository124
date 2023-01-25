package array;

public class Array12_sum {

	public static void main(String[] args) {
		
		int name[]= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for (int i = 0; i<name.length; i++) {
			sum=sum+name[i];
		}
		System.out.println(sum);
	
		String str[]= {"Babasaheb","Bhaginath","Kadam"};
		
		String add ="";
		for(int k=0; k<str.length;k++) {
			System.out.print(" ");
			add=add+str[k];
		}
			
		System.out.println(add);
		System.out.print(" ");
}
	}


