package array;

public class Array4_double {

	public static void main(String[] args) {

     double d []  = new double[4];     // double - Datatype 
		
		d[0]  = 10.5d;
		d[1]  = 30;
		d[2]  = 50;
		d[3]  = 33;
		
		System.out.println(d[2]);
		System.out.println(d.length);
		          //   4<4 - false
		for(int i=0 ;i<d.length;i++) {
			
			System.out.println(d[i]);
		}
		
		// Boolean  Array
		
		boolean b[]  =new boolean[2];
		
		b[0]  = true;
		b[1]  = false;
		
		System.out.println(b.length);
		System.out.println(b[1]);
		System.out.println(b[0]);
	
	}

}
