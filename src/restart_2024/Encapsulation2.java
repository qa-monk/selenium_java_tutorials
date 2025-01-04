package restart_2024;

public class Encapsulation2 extends Encapsulation1 {
	
	//final method can't be override
	
	/*
	 * final void a() {
	 * 
	 * System.out.println("final method2"); }
	 */
	
	public static void main(String[] args) {
		
		Encapsulation2  e2 = new Encapsulation2();
		e2.setName("KETAN");
		System.out.println(e2.getName());
	}

}
