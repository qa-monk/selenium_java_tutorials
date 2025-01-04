package restart_2024;

public class Variable4 {

	public static void main(String[] args) {

		int [] a = {1,2,3,5,5,100};
		
		String [] bStrings = {"Hello", "Restart"};
		System.out.println(a[1]); //2
		System.out.println(bStrings[0]); //Hello
		System.out.println(a[5]);  //100
		System.out.println(bStrings[1]); //Restart
		
		Object[] obj = {1, 2, 3, "RCB", "RCB", 3>4, 4, 6.7, 'B'};
		
		System.out.println(obj[3]); //rcb
		System.out.println(obj[5]); //false
		System.out.println(obj[4]); //rcb
		
	
		System.out.println(a[6]); //Array index out of bound
	}

}
