package restart_2024;

public class Interface5 extends Inheritance1 implements Interface3, Interface4{
	
	
	

	public static void main(String[] args) {

		Interface5   i5 = new Interface5();
		
		i5.a();
		i5.b();
		System.out.println(i5.roll);
	}

	@Override
	public void b() {

		System.out.println("b method");
	}

	@Override
	public void a() {

		System.out.println("a method");
	}

}
