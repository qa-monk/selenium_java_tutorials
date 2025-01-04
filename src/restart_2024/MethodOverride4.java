package restart_2024;

public class MethodOverride4 extends MethodOverride3{
	public void run() {
		System.out.println("you are running");
		
	}

	public static void main(String[] args) {
		MethodOverride4 mo4 = new MethodOverride4();
		
		MethodOverride3 mo3 = new MethodOverride3();
		
		MethodOverride3 mo01 = new MethodOverride4();
		
		mo4.run();
		mo3.run();
		mo01.run();
	}
}
