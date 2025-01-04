package restart_2024;

public class Variable8 {
	
	int c = 10; //global var
	static int b = 100;// static variable
	public static void main(String[] args) {
		int a =50; //local var
		
		System.out.println(a);//
		System.out.println(b);
		
		Variable8 v8 =  new Variable8();
		aMethod();
		Variable8.aMethod();
		v8.bMethod();
		System.out.println(v8.c);
				
	}
	
	public static void aMethod() {
		int d = 500;
		System.out.println(d);
	}
	
	public void bMethod() {
		int f = 250;
		System.out.println(f);
	}

}
