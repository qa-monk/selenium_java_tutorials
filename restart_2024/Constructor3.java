package restart_2024;

public class Constructor3 {
	
	//COnstructor overloading
	
	
	public Constructor3() {
	
		System.out.println("No arg Constructor");
	}
	
	public Constructor3(int a) {
		
		System.out.println("Int arg Constructor");
	}
	
	public Constructor3(String g) {
		System.out.println("String arg Constructor");
	}
	
	public static void main(String[] args) {
		
		Constructor3 c3 = new Constructor3();
		
		Constructor3 c4 = new Constructor3(111);
		
		Constructor3 c5 = new Constructor3("KKKKKKKK");
	}

}
