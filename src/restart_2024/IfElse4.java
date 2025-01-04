package restart_2024;

public class IfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age  = 25;
		int weight = 70;
		
		
		//outer if block
		if(age > 18) {
			
			//inner if block
			if(weight > 60) {
				
				System.out.println("Eligible");
			}else {
				System.out.println("Not eligible");
			}
			
		}else {
			System.out.println("age is not greaterthan 18");
		}

	}

}
