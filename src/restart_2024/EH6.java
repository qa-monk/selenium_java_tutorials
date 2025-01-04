package restart_2024;

public class EH6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int i = 20 / 2;
		} finally {

		System.out.println("Finally will execute always");
		
			try {
				int a = 10/0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		System.out.println("Exception Handled");
	}

}
