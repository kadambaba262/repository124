package array;

public class Array6_Multi_dataType {
	
public static void main(String[] args) {

		
		Object obj[]  = new Object[6];    // Heterogeneous 
		
		obj[0]  = 10;  //Integer
		obj[1]  = 10.5; //double
		obj[2]  = "Welcome";  // String
		obj[3]  = 'A';
		obj[4]  = true;
		obj[5]  = null;
		
		System.out.println(obj[4]);
		
	     for(int i=0 ;i<obj.length;i++) {
			
			System.out.println(obj[i]);
		}
		
	}

}


