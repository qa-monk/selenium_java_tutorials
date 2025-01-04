package restart_2024;

public class UnaryOperator1 {

	public static void main(String[] args) {

		int a =1; //Definition of local variable
		int b = a++;
		System.out.println(a++); //1 2
		System.out.println(a); //2
		System.out.println(a++); //2 3
		System.out.println(++a); //4 4
		System.out.println(a); //4
		System.out.println(b);
		System.out.println(b);
	}

}
