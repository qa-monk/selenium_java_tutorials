package restart_2024;

public class Static3 {

	int roll;
	String name;
	static String collage = "IIT Bombay";
	
	public Static3(int r, String s) {
		roll = r;
		name = s;
		
	}
	
	public void getMethod() {
		
		System.out.println(roll + " " + name +" " + collage);
	}
	
}
