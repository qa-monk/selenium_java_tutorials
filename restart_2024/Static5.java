package restart_2024;

public class Static5 {
	
	static int z = 5;
	 int y = 1;
	
	public static void a() {
		z= 10;
		System.out.println(z); //10
	}
	
	public void b() {
		
		z = 15;
		System.out.println(z); //15
		a();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a();
		Static5 s5 = new Static5();
		s5.b();
	}

}
