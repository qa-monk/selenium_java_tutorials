package restart_2024;

public class EH1 {
	
	
	public static void main(String[] args) {
		
		try {
		
			int a = 5/0;  //Arithmetic exception
			
		} catch (ArithmeticException e) {
			e.printStackTrace();  //GIve a complete exception details
			System.out.println(e); //only exception info
			
		}catch (NullPointerException n) {
			System.out.println(n);
		}catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		
		
		System.out.println("Exception Handled");
	}

}
