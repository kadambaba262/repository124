package array;
public class Array8_Max_Element{

public static void main(String[] args) {

	
	int arr[]   = {55,2244,300,234};
	
	int Maximum = arr[0];
	   // Maximum = 55		
	          //0<4
	          //1<4   -true
	          //2<4  -true
	          //3<4  -true
          //4<4  - false
	for(int i=0 ;i<arr.length;i++) {
		
	    //55>55   - false
	    //2244>55 - True
		    //300>2244  -false
	    //234>2244   -false
	if(arr[i]>Maximum) {
		
			Maximum = arr[i];
		//Maximun = 2244
		}
}
	System.out.println("Largest number in given array is : "+Maximum);
}

}
//	int raj [] = {12,56,89,75,96,100,41,50};
//	
//	int Maximum = raj[0];
//	
//		for (int i=0 ; i<raj.length; i++) {
//			
//			if (raj[i]> Maximum) {
//				
//				Maximum = raj[i];
//				
//			}
//		}
//		System.out.println(Maximum);
//		
//		Arrays.sort(raj);
//		  for(int i=0 ;i<raj.length;i++) {
//				
//				System.out.print(raj[i]+" ");
//			}
//}
//}


