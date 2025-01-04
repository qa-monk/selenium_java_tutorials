package restart_2024;

import java.time.LocalDate;

public class Static6 {
	
	int x = 10; //global var
	static int y = 5; //static var

	
	public void aMethod() {
		int z  = 10; //local var
		System.out.println(z);
		
	}
	
	static int b = 6; // static var
	
	//static method
	public static void bMethod() {
		int a = 5; //Local var
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static6 static6 = new Static6();
		static6.aMethod();
		
		System.out.println(static6.b); // static variable calling with object ref is not appropriate way
		System.out.println(Static6.b); //static variable calling with class name is valid but not appropriate way
		System.out.println(b); // static variable calling directly is correct way
		
	}

}
