package restart_2024;

public class Abstraction2 extends Abstraction1{
	

	@Override
	void eat() {
System.out.println("Abstract method");		
	}

	public static void main(String[] args) {
		Abstraction2 a2 = new Abstraction2();
		a2.eat();
		a2.a();
	}
}
