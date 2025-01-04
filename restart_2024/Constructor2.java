package restart_2024;

public class Constructor2 {
	
	int id;
	String name;
	String address;
	
	//Default COnstructor
	public Constructor2() {
		System.out.println("Defualt Constructor");
	}
	
	//Parameterized Constructor
	Constructor2(int a, String b, String c){
		this.id = a;
		name = b;
		address = c;
				
	}

	public void displayInfo() {
		System.out.println(id +" "+ name + " " +address);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor2 constructor2 = new Constructor2();
		
		//parameteized Constructor
		
		Constructor2 c3 = new Constructor2(1, "KETAN", "JAVA");
		c3.displayInfo();
		
		Constructor2 c4 = new Constructor2(2, "Deshpande", "SELENIUM");
		
		c4.displayInfo();
		
		
	}

}
