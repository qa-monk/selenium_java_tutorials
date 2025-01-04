package restart_2024;

public class FirstJavaProgram {
	
	int a = 5; //Global variable or class variable
	
	static int b= 10; //static variable 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("restart");
		System.out.println("2024");
		int c= 15; // local variable
		
		aMethod();
		bMethod(); 
	}
	
	public static void aMethod() {
		System.out.println("Hello a method");
		
	}
	
	public static void bMethod() {
		System.out.println("Hello b method");
	}
	

}
