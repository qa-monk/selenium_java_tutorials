package restart_2024;

public class BreakStatement3 {

	public static void main(String[] args) {

		int i = 1; //Local variable
		
		while(i<=5) {
			if(i==3) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
