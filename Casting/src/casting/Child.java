package casting;

public class Child extends Parent{

	
	public void m3 () {
		
		System.out.println("Method - 3rd");
		
	}
	public static void main(String[] args) {

		
		Child P = new Child(); // Normal.
		P.m1();
		P.m2();
		P.m3();
		
	
		Parent A = new Child(); // Upcasting.
		
		A.m1();
		A.m2();
	
		
		Child R = (Child) new Parent(); // Downcasting.
		R.m1();
		R.m2();
		R.m3();
		
		// At the time of compilation it will be compile but at can not execute it.
		// It gives ClassCastException - Error
		

	}
	

}
