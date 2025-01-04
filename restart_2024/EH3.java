package restart_2024;

public class EH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String xString = "Selenium";
		
		try {
			int i = Integer.parseInt(xString);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception handled");
	}

}
