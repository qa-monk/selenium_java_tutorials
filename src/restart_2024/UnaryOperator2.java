package restart_2024;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 10; //local variable
		int b = 10;//local variable
		System.out.println(a++); //10 11
		System.out.println(a++ + ++a); //11 12 13 13
		System.out.println(a + a++); //13 13 14
		System.out.println(b++ + b--); //10 11 11 10
		System.out.println(b++ + b--); //10 11 11 10
		System.out.println(b);
	}
}
