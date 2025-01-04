package restart_2024;

public class LogicalOperator2 {

	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Logical Operator
		System.out.println(a < b && a++ < c); //false
		System.out.println(a);
		
		//Bitwise Operator
		System.out.println(a < b & a++ < c); //false
		System.out.println(a);
	}
}
