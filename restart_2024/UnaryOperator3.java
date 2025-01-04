package restart_2024;

public class UnaryOperator3 {
	
	public static void main(String[] args) {
		int a = 10; //local var
		int b = 10; //local var
		
		System.out.println(a++); //10 11
		System.out.println(a++ + ++a); //11 12 13 13
		System.out.println(b++ + ++b); //10 11 13 13
		
	}

}
