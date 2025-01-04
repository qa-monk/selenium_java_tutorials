package restart_2024;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		
		double b = 5.9;
		
		int a = (int) b; //manual casting double to integer
		
		System.out.println(b);
		System.out.println(a);
		
		//String to integer conversion
		String string = "1000";
		
		int i = Integer.parseInt(string);
		System.out.println(i); //1000
		
		//integer to string conversion
		
		int c = 5;
		String tString = String.valueOf(c);
		System.out.println(tString);

		
		
	}

}
