package restart_2024;

public class Loop3 {

	public static void main(String[] args) {

		int i = 10; //local var
		
		while(i < 20 & i < 15) {
			
			System.out.println(i);
			
			//if we forget pass increment or decrement program will execute infinite times
			i++;
		}
	}

}
