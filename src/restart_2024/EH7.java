package restart_2024;

public class EH7 {
	
	public static void age(int age) {
		
		try {
			if(age<18) {
				
				throw new ArithmeticException("Not Applicable");
				
			}else {
				System.out.println("Applicable");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		EH7 eh7 = new EH7();
		age(16);
		age(19);
		
	}

}
