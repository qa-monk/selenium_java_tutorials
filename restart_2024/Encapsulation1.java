package restart_2024;

public class Encapsulation1 {
	
	String name; //gobal var
	int b; //global var
	final int  c = 22; //final variable
	final static int d= 33;
	
	public void a() {
		// c= 22; final variable can't change the value

	}
	
	final void b() {
		
		System.out.println("final method");
		
	}
	
	public void setName(String s) {
		
		this.name = s;
		this.b = 311;
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public Object getName() {
		
		return name;
		
	}

}
