package restart_2024;

import java.time.LocalDate;

public class Static1 {
	
	int x = 100;// global var
	String string = "Hello"; //gobal var
	static int y = 100; //static var

	//static method
	public static void method1() {
		String x = "hi"; //local var
		System.out.println(x); //calling x variable
		
	}
	
	//non-static method
	public void method2() {
		int i = 10; // local var
	}
	public static void main(String[] args) {

		
	}

}
