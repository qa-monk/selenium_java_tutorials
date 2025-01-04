package restart_2024;

public class Static7 {
	
	String aString; //global var
	int b = 10; // global var
	
	static int c = 10; //static var
	
	public static void aMethod() {
		System.out.println("Hello Static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static7 static7  = new Static7();
		static7.aString = "Selenium";
		static7.b = 1;
		c=2;
		aMethod();
		System.out.println(static7.aString + " " + static7.b + " " + static7.c);

	}

}
