package array;

public class Array10_Duplicate_int {

	public static void main(String[] args) {

		
		int arr []= {12,5,45,63,3,56,8,98,12,56};
		for(int r=arr.length-1; r>=0; r--) {
			System.out.print(arr[r]+",");
		}
		System.out.println();
		System.out.println("Duplicate no.");	
		for(int i=0; i<arr.length; i++)	{
		for (int j=i+1; j<arr.length;j++) {
			
				
			if (arr[i]==arr[j]) {
				System.out.println(arr[j]);
		}
			
		}
	}
}
}