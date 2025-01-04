package restart_2024;

public abstract class Abstraction1 {
	
	static int a = 5; //static  var
	int b = 5; //global var
	final int c  = 10; //final var
	
	//Abstract method
	abstract void eat();
	
	//non abstract method
	public void a() {
		
		System.out.println("non abstract methond");
		
	}

}
